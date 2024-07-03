package entities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Integer result = 3;
    Scanner sc = new Scanner(System.in);

    public String newVeiculo() {
        while(result != 1 && result != 2){

        System.out.print("Digite '1' para guardar um CARRO, ou digite '2' para guardar uma MOTO: ");

        try{
            result = sc.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Valor inválido");
        }

        }
        return Integer.toString(result);
    }
}
