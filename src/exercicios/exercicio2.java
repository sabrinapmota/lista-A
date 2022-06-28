package exercicios;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] precoProdutos = new double[3];
        System.out.println("Digite o preço do primeiro produto: ");
        precoProdutos[0] = input.nextDouble();
        System.out.println("Digite o preço do segundo produto: ");
        precoProdutos[1] = input.nextDouble();
        System.out.println("Digite o preço do terceiro produto: ");
precoProdutos[2] = input.nextDouble();
if (precoProdutos[0] < precoProdutos[1] && precoProdutos[0] < precoProdutos[2]){
    System.out.println("O produto mais barato é: " + precoProdutos[0] );
}else if (precoProdutos[1] < precoProdutos[0]&& precoProdutos[1] < precoProdutos[2]) {
    System.out.println("O produto mais barato é: " + precoProdutos[1]);
}else {
    System.out.println("O produto mais barato é: " + precoProdutos[2]);
}
    }
}
