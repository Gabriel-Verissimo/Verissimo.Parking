package entities;

import java.time.LocalDateTime;

public abstract class Veiculo {
    String placa, modelo, marca, cor;
    LocalDateTime horaEntrada, horaSaida;

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    @Override
    public String toString() {
        return modelo.toUpperCase() +
                " placa: " + placa +
                ", horaEntrada: " + horaEntrada +
                " .";
    }
}
