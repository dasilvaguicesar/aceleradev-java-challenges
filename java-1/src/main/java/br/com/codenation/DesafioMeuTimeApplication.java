package br.com.codenation;

import br.com.codenation.players.Player;
import br.com.codenation.repositories.Repositories;
import br.com.codenation.teams.Team;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class DesafioMeuTimeApplication implements MeuTimeInterface {

	Repositories repository = new Repositories();

	public void incluirTime(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal, String corUniformeSecundario){
		Team team = new Team(id, nome, dataCriacao, corUniformePrincipal, corUniformeSecundario);
		repository.add(team);
	}

	public void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario) {
		Player player = new Player(id, idTime, nome, dataNascimento,nivelHabilidade, salario);
		repository.add(player);
	}

	public void definirCapitao(Long idJogador) {
		long teamId = repository.discoverTeamId(idJogador);
		repository.defineCaptain(idJogador, teamId);
	}

	public Long buscarCapitaoDoTime(Long idTime) {
			return repository.discoverCaptain(idTime);
	}

	public String buscarNomeJogador(Long idJogador) {
		return repository.discoverPlayerName(idJogador);
		}

	public String buscarNomeTime(Long idTime) {
		return repository.TeamName(idTime);
	}

	public List<Long> buscarJogadoresDoTime(Long idTime) {
		return repository.discoverTeamPlayers(idTime);
	}

	public Long buscarMelhorJogadorDoTime(Long idTime) {
		return repository.discoverBestPlayer(idTime);
	}

	public Long buscarJogadorMaisVelho(Long idTime) {
		return  repository.discoverOlderPlayer(idTime);
	}

	public List<Long> buscarTimes() {
		return repository.findAllTeams();
	}

	public Long buscarJogadorMaiorSalario(Long idTime) {
		return repository.discoverPlayerHigherSalary();
	}

	public BigDecimal buscarSalarioDoJogador(Long idJogador) {
		return repository.playerSalary(idJogador);
	}

	public List<Long> buscarTopJogadores(Integer top) {
		return repository.topPlayers(top);
	}

}
