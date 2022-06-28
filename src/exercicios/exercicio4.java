package exercicios;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do salário atual: ");
        double salarioAtual = input.nextDouble();
        double novoSalario = 0;
        double valorReajuste = 0;
        double percentual = 0;
        if (salarioAtual <= 280) {
            percentual = 0.20;
            valorReajuste = salarioAtual * percentual;
            novoSalario = salarioAtual + valorReajuste;
        } else if (salarioAtual > 280 && salarioAtual <= 700) {
            percentual = 0.15;
            valorReajuste = salarioAtual * percentual;
            novoSalario = salarioAtual + valorReajuste;

        } else if (salarioAtual > 700 && salarioAtual <= 1500) {
            percentual = 0.10;
            valorReajuste = salarioAtual * percentual;
            novoSalario = salarioAtual + valorReajuste;

        } else {
            percentual = 0.05;
            valorReajuste = salarioAtual * percentual;
            novoSalario = salarioAtual + valorReajuste;

        }
        System.out.println("O percentual é: " + percentual);
        System.out.println("Salário antes do reajuste: " + salarioAtual);
        System.out.println("O valor do aumento é: " + valorReajuste);
        System.out.println("Seu novo salário após o aumento é: " + novoSalario);
    }
}
