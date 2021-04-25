package com.company;

import java.util.Scanner;

public class Main {
    /*Faça um algoritmo que leia 2 números inteiros e faça sua adição. Se o resultado for maior
    ou igual a 10, some 5 a este número. Caso contrário some 7 a ele. Imprima o resultado
    final.
    */
    public static void main(String[] args) {
        //variavel
        Scanner entrada = new Scanner(System.in);
        int n1,n2,nTotal;

        //entrada
        System.out.println("Digite o numero 1: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o numero 2: ");
        n2 = entrada.nextInt();

        //calculo e saida
        nTotal = n1 + n2;
        if (nTotal >= 10){
            System.out.print("Resultado: " + (nTotal+5));
        } else {
            System.out.print("Resultado: " + (nTotal+7));
        }
    }
}
