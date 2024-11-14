package Teste.Ex2;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número:");
        int n= sc.nextInt();

        if (ehFibonacci(n)) {
            System.out.print("O número "+n+" pertence à sequência de Fibonacci");
        }
        else{
            System.out.println("O número "+n+" não pertence à sequência de Fibonacci");
        }

        sc.close();
    }

    public static boolean ehFibonacci(int n){
        int a=0,b=1;

        if (n == 0 || n == 1) {
            return true;
        }

        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b == n; 
    }
}
