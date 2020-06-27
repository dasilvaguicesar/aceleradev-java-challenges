package br.com.codenation.repositories;

import br.com.codenation.exceptions.CapitaoNaoInformadoException;
import br.com.codenation.exceptions.IdentificadorUtilizadoException;
import br.com.codenation.exceptions.JogadorNaoEncontradoException;
import br.com.codenation.exceptions.TimeNaoEncontradoException;
import br.com.codenation.players.Player;
import br.com.codenation.teams.Team;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Repositories {

  private final List<Team> teams = new ArrayList<>();
  private final List<Player> players = new ArrayList<>();

  public void add(Team team) throws IdentificadorUtilizadoException {
    for (Team checkTeam : teams){
      if(checkTeam.getId() == team.getId()){
        throw new IdentificadorUtilizadoException();
      }
    }
    this.teams.add(team);
  }

  public void delete(Team team){
    this.teams.add(team);
  }


  public void defineCaptain(Long playerId, Long teamId){
    for (Team team: teams) {
      if(team.getId() == teamId){
        team.setCaptain(playerId);
      }
    }
  }

  public Long discoverCaptain(Long idTime) throws TimeNaoEncontradoException, CapitaoNaoInformadoException {
    for (Team team: teams)
      if (team.getId() == idTime) {
        if(team.getCaptain() == 0){
          throw new CapitaoNaoInformadoException();
        }
        return team.getCaptain();
      }
    throw new TimeNaoEncontradoException();
  }

  public String TeamName(Long idTime) throws TimeNaoEncontradoException {
    for (Team team: teams)
      if (team.getId() == idTime) {
        return team.getName();
      }
    throw new TimeNaoEncontradoException();
  }

  public List<Long> findAllTeams() {
    List<Long> allTeams = new ArrayList<>();
    for (Team team : teams){
      allTeams.add(team.getId());
    }
    return allTeams;
  }

  public void add(Player player) throws IdentificadorUtilizadoException {
    for(Player checkPlayer: players){
      if(checkPlayer.getId() == player.getId()){
        throw new IdentificadorUtilizadoException();
      }
    }
    List<Long> allTeams = findAllTeams();
    if(!allTeams.contains(player.getTeamId())){
      throw new TimeNaoEncontradoException();
    }
    players.add(player);
  }

  public void delete(Player player){
    players.remove(player);
  }

  public Long discoverTeamId(Long playerId) throws JogadorNaoEncontradoException {
    for (Player player: players) {
      if (player.getId()==playerId)
        return player.getTeamId();
    }
    throw new JogadorNaoEncontradoException();
  }

  public String discoverPlayerName(Long playerId) throws JogadorNaoEncontradoException {
    for (Player player : players) {
      if (player.getId() == playerId)
        return player.getName();
    }
    throw new JogadorNaoEncontradoException();
  }

  public List<Long> discoverTeamPlayers(Long idTime) {
    List<Long> playersTeam = new ArrayList<>();
    for (Player player : players) {
      if (player.getTeamId() == idTime){
        playersTeam.add(player.getId());
      }
    }
    if(playersTeam.size() == 0){
      throw new TimeNaoEncontradoException();
    }
    return playersTeam;
  }

  public Long discoverBestPlayer(Long idTime) {
    Integer bestPlayer = 0;
    long playerId = 0;
    for (Player player : players) {
      if (player.getTeamId() == idTime){
        if(bestPlayer < player.getSkillLevel()){
          bestPlayer = player.getSkillLevel();
          playerId = player.getId();
        }
      }
    }
    if(playerId == 0){
      throw new TimeNaoEncontradoException();
    }
    return playerId;
  }

  public Long discoverOlderPlayer(Long teamId) {
    LocalDate date = LocalDate.now();
    long olderPlayer = 0;
    for (Player player : players){
      if(player.getCreationDate().isBefore(date)){
        if(player.getTeamId()==teamId)
        date = player.getCreationDate();
        olderPlayer = player.getId();
      }
    }
    if(olderPlayer == 0){
      throw new TimeNaoEncontradoException();
    }
    return olderPlayer;
  }

  public Long discoverPlayerHigherSalary() throws TimeNaoEncontradoException {
    BigDecimal playerSalary = BigDecimal.valueOf(0);
    long idPlayerWithHigherSalary = 0;
    for (Player player : players){
      if(playerSalary.compareTo(player.getSalary()) < 0){
        idPlayerWithHigherSalary = player.getId();
      }
    }
    if(idPlayerWithHigherSalary == 0){
      throw new TimeNaoEncontradoException();
    }
    return idPlayerWithHigherSalary;
  }

  public BigDecimal playerSalary(Long idJogador) throws JogadorNaoEncontradoException {
    for(Player player : players){
      if(player.getId() == idJogador){
        return player.getSalary();
      }
    }
    throw new JogadorNaoEncontradoException();
  }

  public List<Long> topPlayers(Integer top) {
    List<Long> topPlayers = new ArrayList<>();
    for(int i=0; i < top; i++){
      BigDecimal playerSalary = BigDecimal.valueOf(0);
      long playerId = 0;
      for (Player player : players){
        if(!topPlayers.contains(player.getId()) && player.getSalary().compareTo(playerSalary) >= 0 ){
          playerSalary = player.getSalary();
          playerId = player.getId();
        }
      }
      if(playerId != 0){
        topPlayers.add(playerId);
      }
    }
    return topPlayers;
  }
}
