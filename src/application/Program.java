package application;

import entities.Carro;

import entities.Moto;
import entities.Veiculo;


import java.util.*;
import java.time.LocalDateTime;

import static application.UI.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Veiculo> veiculos = new ArrayList<>();

        printWelcome();
        System.out.println();
        UI.printMenu();

        String input = sc.nextLine();

        while (!Objects.equals(input, "0")) {
            try {
                UI.clearScreen();
                switch (input) {

                    case "1":
                        UI.printCase1();
                        System.out.println("Digite a placa do veículo: ");
                        String placa = sc.nextLine();
                        System.out.println("Digite o modelo do veículo: ");
                        String modelo = sc.nextLine();
                        System.out.println("Digite a marca do veículo: ");
                        String marca = sc.nextLine();
                        System.out.println("Digite a cor do veículo: ");
                        String cor = sc.nextLine();
                        LocalDateTime horaEntrada = LocalDateTime.now();

                        String result = null;
                        while (result == null) {

                            UI.printEscolhaVeic();
                            result = sc.nextLine();

                            if (Objects.equals(result, "1")) {
                                veiculos.add(new Carro(placa, modelo, marca, cor, horaEntrada));
                            } else if (Objects.equals(result, "2")) {
                                veiculos.add(new Moto(placa, modelo, marca, cor, horaEntrada));
                            } else result = null;
                        }
                        System.out.println("Veículo guardado!");
                        break;

                    case "2":
                        UI.printCase2();
                        System.out.println("Digite a placa do veiculo a ser retirado: ");
                        String retirarPlaca = sc.nextLine();
                        String modeloRetirado = null;
                        for (Veiculo veic : veiculos) {
                            if (Objects.equals(veic.getPlaca(), retirarPlaca)) {
                                modeloRetirado = veic.getModelo();
                            }
                        }
                        veiculos.removeIf(veiculo -> Objects.equals(veiculo.getPlaca(), retirarPlaca));
                        assert modeloRetirado != null;
                        System.out.println("Veiculo retirado: " + modeloRetirado.toUpperCase() + " " + retirarPlaca);

                        break;

                    case "3":
                        UI.printCase3();
                        for (Veiculo veic : veiculos) {
                            System.out.println(veic.getModelo().toUpperCase() + " " + veic.getPlaca().toUpperCase() + " " + veic.getHoraEntrada());
                        }
                        break;

                    case "4":
                        System.out.println("Digite a placa do veiculo a ser consultado: ");
                        String consultPlaca = sc.nextLine();

                        try {

                            System.out.println(veiculos.stream().anyMatch(veiculo -> Objects.equals(veiculo.getPlaca(), consultPlaca)));
                        } catch (Exception e) {
                            System.out.println("Veiculo não encontrado.");
                        }
                        break;

                    case "0":
                        break;

                    default:

                        System.out.println("Escolha inválida.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                System.out.println();
            }

            UI.printMenu();
            input = sc.nextLine();
        }


        sc.close();
    }
}