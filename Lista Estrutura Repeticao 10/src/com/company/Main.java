package com.company;

import java.util.Scanner;

public class Main {
    /* Escrever um algoritmo que lê um valor N inteiro e positivo e que calcula e escreve o valor
    de E:
    E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N!
    */
    public static void main(String[] args) {
        //variaveis
        Scanner entrada = new Scanner(System.in);
        int num, N, valor;
        double n, fat;

        //leitura
        System.out.print("Digite um numero Inteiro: ");
        N = entrada.nextInt();

        //validacao e conta
        if(N > 0){
            n = 1;
            for(num = 1; num <= N; num++) {
                fat = 1;
                for (valor = num; valor > 1; valor--){
                    fat = fat * valor;
                }
                n = n + 1/fat;
            }

            System.out.printf("A expressao fatorial E e igual a: %.2f\n",n);

        }else{
            System.out.println("Erro: Digite um numero positivo");
        }
    }
}
