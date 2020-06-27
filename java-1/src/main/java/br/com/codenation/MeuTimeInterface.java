package br.com.codenation;

import br.com.codenation.exceptions.TimeNaoEncontradoException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

interface MeuTimeInterface {

    void incluirTime(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal, String corUniformeSecundario) throws UnsupportedOperationException;

    void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario);

    void definirCapitao(Long idJogador);

    Long buscarCapitaoDoTime(Long idTime) throws TimeNaoEncontradoException;

    String buscarNomeJogador(Long idJogador);

    String buscarNomeTime(Long idTime);

    Long buscarJogadorMaiorSalario(Long idTime);

    BigDecimal buscarSalarioDoJogador(Long idJogador);

    List<Long> buscarJogadoresDoTime(Long idTime);

    Long buscarMelhorJogadorDoTime(Long idTime);

    Long buscarJogadorMaisVelho(Long idTime);

    List<Long> buscarTimes();

    List<Long> buscarTopJogadores(Integer top);
}
