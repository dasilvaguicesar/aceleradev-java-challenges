package br.com.codenation.repositories;

import br.com.codenation.players.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayersRepositories {

  private List<Player> players = new ArrayList<>();

  public void add(Player player){
    players.add(player);
  }

  public void delete(Player player){
    players.remove(player);
  }

  public Long discoverTeamId(Long playerId){
    for (Player player: players) {
      if (player.getId()==playerId)
        return player.getTeamId();
    }
    System.out.println("Jogador não encontrado");
    return null;
  }

  public String discoverPlayerName(Long playerId) {
    for (Player player : players) {
      if (player.getId() == playerId)
        return player.getName();
    }
    System.out.println("Jogador não encontrado");
    return null;
  }

  public List<Long> discoverTeamPlayers(Long idTime) {
    List<Long> playersTeam = new ArrayList<>();
    for (Player player : players) {
      if (player.getTeamId() == idTime){
        playersTeam.add(player.getId());
      }
    }
    return playersTeam;
  }

  public Long discoverBestPlayer(Long idTime) {
    Integer bestPlayer = 0;
    Long playerId = null;
    for (Player player : players) {
      if (player.getTeamId() == idTime){
        if(bestPlayer < player.getSkillLevel()){
          bestPlayer = player.getSkillLevel();
          playerId = player.getId();
        }
      }
    }
    return playerId;
  }
}
