package com.dnsouzadev;

import java.util.Scanner;

public class quintoTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para inverter: ");
        String entrada = scanner.nextLine();

        String invertida = inverterString(entrada);

        System.out.println("String invertida: " + invertida);

        scanner.close();
    }

    public static String inverterString(String str) {
        char[] caracteres = new char[str.length()];
        int j = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            caracteres[j] = str.charAt(i);
            j++;
        }

        return new String(caracteres);
    }
}
