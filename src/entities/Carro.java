package entities;

import java.time.LocalDateTime;

public class Carro extends Veiculo {

    public Carro(String placa, String modelo, String marca, LocalDateTime horaEntrada) {
        super();
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.horaEntrada = horaEntrada;
    }
}
