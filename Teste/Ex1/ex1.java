package Teste.Ex1;

public class ex1{
    public static void main(String[] args) {
        int indice=13, soma=0;

        for(int k=0;k<indice;){
            k++;
            soma+=k;
        }

        System.out.print("Valor final de soma:"+ soma);
    }
}