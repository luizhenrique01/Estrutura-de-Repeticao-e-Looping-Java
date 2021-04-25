package com.company;

import java.util.Scanner;

public class Main {
    /* A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando dados sobre o
    salário e número de filhos de cada habitante. A prefeitura deseja saber:
    a) média do salário da população;
    b) média do número de filhos;
    c) maior salário;
    d) percentual de pessoas com salário até R$100,00.
    O final da leitura de dados se dará com a entrada de um salário negativo.*/
    public static void main(String[] args) {
    //variaveis
    Scanner entrada = new Scanner(System.in);
    double salario = 0,mediaSalario = 0,nSalarios = 0,nFilhos = 0,mediaFilhos = 0, maiorSalario = 0, percentSalario = 0,salario100 = 0;
    int filhos,habitantes,cont,contSalario = 0;

    //entrada habitante
    System.out.println("Quantidade de habitantes a ser inserida: ");
    habitantes = entrada.nextInt();

    //calculos
    for (cont = 1; cont <= habitantes; cont++){

        //entrada salario e filho
        System.out.println("Quantidade de salario recebido: ");
        salario = entrada.nextDouble();
        System.out.println("Numero de filhos: ");
        filhos = entrada.nextInt();

        //conta
        nSalarios += salario;
        mediaSalario = nSalarios / habitantes;
        nFilhos += filhos ;
        mediaFilhos = nFilhos / habitantes;

        if(salario > maiorSalario){
            maiorSalario = salario;
        }

        if (salario > 100){
            contSalario++;
        }
    }
        percentSalario = contSalario * 100;
        salario100 = percentSalario / habitantes;


    //saida de dados
    System.out.printf("A media salarial da populacao e: %.2f: "+"\n",mediaSalario);
    System.out.printf("A media de filhos da populacao e: %.2f: "+"\n",mediaFilhos);
    System.out.printf("O maior salario e: %.2f: "+"\n",maiorSalario);
    System.out.print("O percentual de pessoas com o salario maior que 100 e: "+salario100+"%");
    entrada.close();
    }
}
