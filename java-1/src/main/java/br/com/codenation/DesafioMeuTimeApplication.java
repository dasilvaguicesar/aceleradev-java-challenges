package br.com.codenation;

import br.com.codenation.players.Player;
import br.com.codenation.repositories.PlayersRepositories;
import br.com.codenation.repositories.TeamsRepositories;
import br.com.codenation.teams.Team;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class DesafioMeuTimeApplication implements MeuTimeInterface {

	TeamsRepositories teamRepositorie = new TeamsRepositories();
	PlayersRepositories playersRepositorie = new PlayersRepositories();


	public void incluirTime(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal, String corUniformeSecundario) {
		Team team = new Team(id, nome, dataCriacao, corUniformePrincipal, corUniformeSecundario);
		teamRepositorie.add(team);
		System.out.println("Id do time é " + team.getId() + " e o nome do time é " + team.getName());
		//throw new UnsupportedOperationException();
	}

	public void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario) {
		Player player = new Player(id, idTime, nome, dataNascimento,nivelHabilidade, salario);
		playersRepositorie.add(player);
		System.out.println("Id do jogador é " + player.getId() + " e o nome do jogador é " + player.getName());
		//throw new UnsupportedOperationException();
	}

	public void definirCapitao(Long idJogador) {
		long teamId = playersRepositorie.discoverTeamId(idJogador);
		teamRepositorie.defineCaptain(idJogador, teamId);
		//throw new UnsupportedOperationException();
	}

	public Long buscarCapitaoDoTime(Long idTime) {
		return teamRepositorie.discoverCaptain(idTime);
		//throw new UnsupportedOperationException();
	}

	public String buscarNomeJogador(Long idJogador) {
		return playersRepositorie.discoverPlayerName(idJogador);
		//throw new UnsupportedOperationException();
		}

	public String buscarNomeTime(Long idTime) {
		return teamRepositorie.discoverTeamName(idTime);
		//throw new UnsupportedOperationException();
	}

	public List<Long> buscarJogadoresDoTime(Long idTime) {
		return playersRepositorie.discoverTeamPlayers(idTime);
		//throw new UnsupportedOperationException();
	}

	public Long buscarMelhorJogadorDoTime(Long idTime) {
		return playersRepositorie.discoverBestPlayer(idTime);
		// throw new UnsupportedOperationException();
	}

	public Long buscarJogadorMaisVelho(Long idTime) {
		throw new UnsupportedOperationException();
	}

	public List<Long> buscarTimes() {

		throw new UnsupportedOperationException();
	}

	public Long buscarJogadorMaiorSalario(Long idTime) {
		throw new UnsupportedOperationException();
	}

	public BigDecimal buscarSalarioDoJogador(Long idJogador) {
		throw new UnsupportedOperationException();
	}

	public List<Long> buscarTopJogadores(Integer top) {
		throw new UnsupportedOperationException();
	}

}
