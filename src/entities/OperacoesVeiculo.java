package entities;

import java.time.LocalDateTime;

public interface OperacoesVeiculo {
    void entradaCarro(String placa, String modelo, String marca, String cor, LocalDateTime horaEntrada);
    void entradaMoto(String placa, String modelo, String marca, String cor, LocalDateTime horaEntrada);

    void saidaCarro(Veiculo veiculo, LocalDateTime horaSaida);
    void saidaMoto(Veiculo veiculo, LocalDateTime horaSaida);
}
