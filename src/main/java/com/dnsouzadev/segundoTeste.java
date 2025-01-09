package com.dnsouzadev;

import java.util.Scanner;

public class segundoTeste {
    // input: int:
    // verifica se o numero pertence a sequencia de Fibonacci
    // output: boolean
    // print: se pertence ou nao

    public static boolean pertenceFibonacci(int numero) {
        // 0 1 1 2 3 5 8 13 21 34 55 89 144
        int a = 0, b = 1, c = 0;
        while (c < numero) {
            c = a + b;
            a = b;
            b = c;
        }
        return c == numero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        boolean verifica = pertenceFibonacci(numero);

        if (verifica) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
