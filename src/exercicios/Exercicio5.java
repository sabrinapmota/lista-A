package exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7: ");
        int numero = input.nextInt();

        if (numero == 1) {
            System.out.println("Domingo");
        } else if (numero == 2) {
            System.out.println("Segunda-feira");
        } else if (numero == 3) {
            System.out.println("Terça-feira");
        } else if (numero == 4) {
            System.out.println("Quarta-feira");
        } else if (numero == 5) {
            System.out.println("Quinta-feira");
        } else if (numero == 6) {
            System.out.println("Sexta-feira");
        } else if (numero == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Número inválido! ");
        }
    }
}
