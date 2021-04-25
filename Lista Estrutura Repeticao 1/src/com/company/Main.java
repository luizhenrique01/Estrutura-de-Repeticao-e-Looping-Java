package com.company;
import java.util.Scanner;

public class Main {
    //Dado dois números imprimir somente o maior deles
    public static void main(String[] args) {
        //variavel
        Scanner entrada = new Scanner(System.in);
        int n1,n2;
        //entrada
        System.out.println("Digite o numero 1: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o numero 2: ");
        n2 = entrada.nextInt();

        //calculo saida
        if (n1 > n2){
            System.out.print("O maior numero e: " + n1);
        } else {
            System.out.print("O maior numero e: " + n2);
        }

    }
}
