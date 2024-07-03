package entities;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Escationamento extends Veiculo implements OperacoesVeiculo {
    protected List<Veiculo> veiculos = new ArrayList<>();

    @Override
    public void entradaCarro(String placa, String modelo, String marca, String cor, LocalDateTime horaEntrada) {
        veiculos.add(new Carro(placa, modelo, marca, cor, horaEntrada));
    }

    @Override
    public void entradaMoto(String placa, String modelo, String marca, String cor, LocalDateTime horaEntrada) {
        veiculos.add(new Moto(placa, modelo, marca, cor, horaEntrada));
    }

    @Override
    public void saidaCarro(Veiculo veiculo, LocalDateTime horaSaida) {
        Duration qtdTempo = Duration.between(horaSaida, veiculo.getHoraEntrada());
        long qtdTempoHoras = qtdTempo.toHours();

        System.out.println(qtdTempoHoras * 7);
    }

    @Override
    public void saidaMoto(Veiculo veiculo, LocalDateTime horaSaida) {

    }
}
