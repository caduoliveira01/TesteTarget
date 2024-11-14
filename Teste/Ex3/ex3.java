package Teste.Ex3;

public class ex3 {
    public static void main(String[] args) {
        double[] faturamento = {221.3, 0.0, 250.5, 300.1, 0.0, 500.0, 0.0};

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;
        int diasAcimaDaMedia = 0;

        for (double valor : faturamento) {
            if (valor > 0) {
                menorFaturamento = Math.min(menorFaturamento, valor);
                maiorFaturamento = Math.max(maiorFaturamento, valor);
                somaFaturamento += valor;
                diasComFaturamento++;
            }
        }

        double mediaMensal = diasComFaturamento > 0 ? somaFaturamento / diasComFaturamento : 0;

        for (double valor : faturamento) {
            if (valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        System.out.printf("Menor faturamento: %.2f%n", menorFaturamento);
        System.out.printf("Maior faturamento: %.2f%n", maiorFaturamento);
        System.out.printf("Dias com faturamento acima da média: %d%n", diasAcimaDaMedia);
    }
}

