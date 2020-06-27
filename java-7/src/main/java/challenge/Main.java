package challenge;

import static java.util.concurrent.ThreadLocalRandom.current;

public class Main {
  private static Cor getCor() {
    return Cor.values()[current().nextInt(0, 2)];
  }
  public static void main(String[] args) {

    Estacionamento estacionamento = new Estacionamento();

    try{
      Motorista ada = Motorista.builder()
          .withNome("Ada")
          .withIdade(20)
          .withPontos(3)
          .withHabilitacao("1231")
          .build();

      Carro carroBranco = Carro.builder()
          .withCor(Cor.BRANCO)
          .withPlaca("123")
          .withMotorista(ada)
          .build();
      estacionamento.estacionar(carroBranco);
      System.out.println(estacionamento.carrosEstacionados());
      System.out.println(estacionamento.carroEstacionado(carroBranco));
    } catch (Exception e){
      e.printStackTrace();
    }
  }
}


