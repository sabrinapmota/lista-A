package exercicios;

import java.util.Scanner;

    public class Exercicio1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("digite o primeiro número: ");
            double primeiroNumero = input.nextDouble();
            System.out.println("Digite o segundo número: ");
            double segundoNumero = input.nextDouble();
            if (primeiroNumero > segundoNumero) {
                System.out.println("O número maior é: " + primeiroNumero);
            } else {
                System.out.println("O maior número é: " + segundoNumero);
            }
        }
    }
