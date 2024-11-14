package Teste.Ex5;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para ser invertida: ");
        String input = scanner.nextLine();

        String stringInvertida = inverterString(input);
        System.out.println("String invertida: " + stringInvertida);

        scanner.close();
    }

    public static String inverterString(String str) {
        String resultado = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            resultado += str.charAt(i);
        }
        return resultado;
    }
}
