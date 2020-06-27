package br.com.codenation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
  public static void main(String[] args) {
  DesafioMeuTimeApplication testeDesafio = new DesafioMeuTimeApplication();
    testeDesafio.incluirTime(1l, "Brasil", LocalDate.now(), "Amarelo", "Azul");
    testeDesafio.incluirTime(2l, "Argentina", LocalDate.now(), "Azul", "Branco");
    testeDesafio.incluirJogador(3l, 1l, "Romario", LocalDate.now().minus(25, ChronoUnit.YEARS), 9, BigDecimal.ZERO);
    testeDesafio.incluirJogador(4l, 1l, "Bebeto", LocalDate.now().minus(20, ChronoUnit.YEARS), 7, BigDecimal.TEN);
    testeDesafio.incluirJogador(5l, 1l, "Cafu",LocalDate.now() , 6, BigDecimal.ZERO);
    testeDesafio.incluirJogador(6l, 2l, "Sergio", LocalDate.now(), 9, BigDecimal.valueOf(8));
    testeDesafio.incluirJogador(7l, 2l, "Jose", LocalDate.now(), 7, BigDecimal.valueOf(7));
    testeDesafio.definirCapitao(3l);
    testeDesafio.definirCapitao(6l);
    System.out.println("Capitão do Brasil é o jogador com id: " + testeDesafio.buscarCapitaoDoTime(2l));
    System.out.println("Capitão da Argentina é o jogador com id: " + testeDesafio.buscarCapitaoDoTime(2l));
    System.out.println("O nome do jogador com id 4 é " + testeDesafio.buscarNomeJogador(4l));
    System.out.println("O nome do time com id 1 é " + testeDesafio.buscarNomeTime(1l));
    System.out.println("Os id's de jogadores do time 2 são: " + testeDesafio.buscarJogadoresDoTime(2l));
    System.out.println("O melhor jogador do time 2 é: " + testeDesafio.buscarMelhorJogadorDoTime(2l));
    System.out.println("O jodagor mais velho do time 1 é o com id: " + testeDesafio.buscarJogadorMaisVelho(1l));
    System.out.println("A quantidade de times é : " + testeDesafio.buscarTimes().size());
    System.out.println("O joagador com maior salario é o com id: " + testeDesafio.buscarJogadorMaiorSalario(1l));
    System.out.println("O salario do jogador com id 4 é: " + testeDesafio.buscarSalarioDoJogador(4l));
    System.out.println("Os top jogadores são: " + testeDesafio.buscarTopJogadores(3));
  }
}
