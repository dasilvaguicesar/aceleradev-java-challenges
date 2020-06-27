package challenge;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    List<Carro> parkingSpaces = new ArrayList<>();
    int counter = 0;

    public void estacionar(Carro carro) throws EstacionamentoException {
      if(parkingSpaces.size() < 10){
        if (carro.getMotorista() == null){
          throw new EstacionamentoException("naoDeveTerCarroAutonomo");
        } else {
            parkingSpaces.add(carro);
        }
      }else{
        for (Carro parkedCar : parkingSpaces){
          if(parkedCar.getMotorista().getIdade() < 55){
            parkingSpaces.remove(parkedCar);
            parkingSpaces.add(carro);
            break;
          }else if(counter == 9){
            throw new EstacionamentoException("casoTodosSejamSeniorONovoMotoristaNaoTeraVaga");
          }else{
            counter++;
          }
        }
      }
    }

    public int carrosEstacionados() {
        int occupiedParkingSpaces = parkingSpaces.size();;
        return occupiedParkingSpaces;
    }

    public boolean carroEstacionado(Carro carro) {
        for (Carro parkedCar : parkingSpaces) {
            if (parkedCar == carro) {
                return true;
            }
        }
        return false;
    }
}
