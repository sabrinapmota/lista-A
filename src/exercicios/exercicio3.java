package exercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = input.nextDouble();
        double calculo = (nota1 + nota2)/2;
        if (calculo == 10) {
            System.out.println("Aprovado com distinção");
        } else if (calculo >= 7) {
            System.out.println("Aprovado. ");
        } else {
            System.out.println("Reprovado. ");
        }
    }

}