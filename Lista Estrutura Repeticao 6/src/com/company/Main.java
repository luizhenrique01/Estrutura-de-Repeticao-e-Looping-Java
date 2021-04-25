package com.company;

import java.util.Scanner;

public class Main {
    /*Fazer um programa leia uma seqüência de valores inteiros fornecida pelo usuário em uma
    linha de entrada e conte o número de valores positivos, negativos e zeros.
    */
    public static void main(String[] args) {
        //variaveis
        Scanner entrada = new Scanner(System.in);
        int total,numeros,positivos = 0,negativos = 0,zeros = 0,cont;

        //entrada
        System.out.println("Digite a quantidade de valores inteiros que deseja inserir: ");
        total = entrada.nextInt();

        //calculo
        for (cont = 1; cont <= total; cont++)
        {
            System.out.println("Digite os valores que deseja inserir: ");
            numeros = entrada.nextInt();

            if (numeros > 0){
                positivos++;
            } else if (numeros < 0){
                negativos++;
            }else{
                zeros++;
            }

        }

            System.out.println("O numero de numeros positivos inseridos foram: " + positivos);
            System.out.println("O numero de numeros negativos inseridos foram: " + negativos);
            System.out.println("O numero de numeros zero inseridos foram: " + zeros);
            entrada.close();

    }
}
