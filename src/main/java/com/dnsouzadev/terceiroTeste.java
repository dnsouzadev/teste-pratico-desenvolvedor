package com.dnsouzadev;

public class terceiroTeste {

    public static void main(String[] args) {
        // vetor que guarda os dados
        double[] faturamentoDiario = {100.0, 80.0, 150.0, 200.0, 120.0, 0.0, 190.0, 240.0, 190.0, 100.0, 0.0, 470.0, 210.0, 130.0, 160.0, 110.0, 200.0, 160.0};

        double menorFaturamento = faturamentoDiario[0];
        double maiorFaturamento = faturamentoDiario[0];
        double somaFaturamento = 0;
        int diasAcimaDaMedia = 0;
        int diasComFaturamento = 0;

        for (double faturamento : faturamentoDiario) {
            if (faturamento != 0) {
                if (faturamento < menorFaturamento) menorFaturamento = faturamento;
                if (faturamento > maiorFaturamento) maiorFaturamento = faturamento;

                somaFaturamento += faturamento;
                diasComFaturamento++;
                }
        }

        double mediaMensal = diasComFaturamento > 0 ? somaFaturamento / diasComFaturamento : 0;
        System.out.println("Média mensal: " + mediaMensal);

        for (double faturamento : faturamentoDiario) {
            if (faturamento > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor faturamento: " + menorFaturamento);
        System.out.println("Maior faturamento: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento superior à média mensal: " + diasAcimaDaMedia);
    }
}
