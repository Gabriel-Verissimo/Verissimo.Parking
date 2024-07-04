package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public abstract class Veiculo {
    String placa;
    String modelo;
    String marca;
    LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;
    private final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
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
                ". Placa: " + placa +
                ". Hora de Entrada: " + horaEntrada.format(fmt) +
                ".";
    }
}
