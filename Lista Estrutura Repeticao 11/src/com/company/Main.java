package com.company;

import java.util.Scanner;
    /*
     Em uma eleição presidencial existem quatro candidatos. Os votos são informados através
    de códigos. Os dados utilizados para a contagem dos votos obedecem à seguinte
    codificação:
    1,2,3,4 = voto para os respectivos candidatos;
    5 = voto nulo;
    6 = voto em branco;
    Elabore um algoritmo que leia o código do candidado em um voto. Calcule e escreva:
    - total de votos para cada candidato;
    - total de votos nulos;
    - total de votos em branco.

    Como finalizador do conjunto de votos, tem-se o valor 0
    */

public class Main {

    public static void main(String[] args) {
        //variaveis
        int voto,candidato1=0,candidato2=0,candidato3=0,candidato4=0,nulo,branco,cont,nVotos,vNulo=0,vBranco=0,para = 1;

        //entrada
        Scanner entrada = new Scanner(System.in);
        //calculo
        System.out.println("Para votar digite o CODIGO: ");
        while (para != 0){
             //entrada votos
             voto = entrada.nextInt();
             if (voto == 1) {
                 candidato1++;
             } else if (voto == 2) {
                 candidato2++;
             } else if (voto == 3) {
                 candidato3++;
             } else if (voto == 4) {
                 candidato4++;
             } else if (voto == 5){
                 vNulo++;
             } else if (voto == 6){
                 vBranco++;
             }
            System.out.println("Digite 0 para sair do codigo ou o proximo voto");
            para = entrada.nextInt();
         }
        //saida
        System.out.println("Total de votos Candidato 1: " + candidato1);
        System.out.println("Total de votos Candidato 2: " + candidato2);
        System.out.println("Total de votos Candidato 3: " + candidato3);
        System.out.println("Total de votos Candidato 4: " + candidato4);
        System.out.println("Total de votos Nulos: " + vNulo);
        System.out.println("Total de votos Brancos: " + vBranco);

    }
}
