package entities;

import java.time.LocalDateTime;

public class Moto extends Veiculo {
    public Moto(String placa, String modelo, String marca, String cor, LocalDateTime horaEntrada) {
        super();
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.horaEntrada = horaEntrada;
    }

}
