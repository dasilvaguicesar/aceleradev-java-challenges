package br.com.codenation;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    DesafioMeuTimeApplication testeDesafio = new DesafioMeuTimeApplication();
    testeDesafio.incluirTime(1l, "Brasil", LocalDate.now(), "Amarelo", "Azul");
    testeDesafio.incluirTime(2l, "Argentina", LocalDate.now(), "Azul", "Branco");
    testeDesafio.incluirJogador(1l, 1l, "Romario", LocalDate.now(), 9, BigDecimal.TEN);
    testeDesafio.incluirJogador(2l, 1l, "Bebeto", LocalDate.now(), 7, BigDecimal.TEN);
    testeDesafio.incluirJogador(3l, 1l, "Cafu", LocalDate.now(), 6, BigDecimal.TEN);
    testeDesafio.incluirJogador(4l, 2l, "Sergio", LocalDate.now(), 9, BigDecimal.TEN);
    testeDesafio.incluirJogador(5l, 2l, "Jose", LocalDate.now(), 7, BigDecimal.TEN);
    testeDesafio.definirCapitao(1l);
    testeDesafio.definirCapitao(3l);
    System.out.println("Capitão do Brasil é o jogador com id: " + testeDesafio.buscarCapitaoDoTime(1l));
    System.out.println("Capitão da Argentina é o jogador com id: " + testeDesafio.buscarCapitaoDoTime(2l));
    System.out.println("O nome do jogador com id 2 é " + testeDesafio.buscarNomeJogador(2l));
    System.out.println("O nome do time com id 1 é " + testeDesafio.buscarNomeTime(1l));
    System.out.println("Os id's de jogadores do time 1 são: " + testeDesafio.buscarJogadoresDoTime(2l));
    System.out.println("O melhor jodagor do time 1 é: " + testeDesafio.buscarMelhorJogadorDoTime(2l));
  }
}
