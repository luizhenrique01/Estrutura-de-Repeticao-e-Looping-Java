package com.company;
import java.util.Scanner;

public class Main {
    /*. Faça um algoritmo que leia o ano de nascimento de uma pessoa e calcule sua idade,
    considerando o ano atual. Para verificar se já fez aniversário no ano atual pergunte se a
    pessoa já fez aniversário, sendo que ela pode entrar com a informação "S"(sim) ou "N"
    (não). Com isto é possível se ter maior precisão sobre a idade. Verifique também se a
    pessoa já tem idade para conseguir Carta de Habilitação (18 anos ou mais) e imprima a
    mensagem referente a esta checagem. Imprima a idade da pessoa
    */
    public static void main(String[] args) {
        //variavel
        Scanner entrada = new Scanner(System.in);
        int anoNascimento, idadeAtual;
        char fezAniversario = 'S';

        //entrada
        System.out.println("Digite seu ano de nascimento: ");
        anoNascimento = entrada.nextInt();
        System.out.println("Digite S se ja fez aniversario ou N se ainda não fez: ");
        fezAniversario = entrada.next().charAt(0);

        //calculo e saida
        idadeAtual = 2021 - anoNascimento;
        System.out.print(fezAniversario);

        if (fezAniversario == 'S' || fezAniversario == 's')
        {
            if (idadeAtual >= 18) {
                System.out.println("Sua idade atual e: " + idadeAtual + "\n");
                System.out.print("Voce esta hábil a tirar carteira de motorista");
            } else {
                System.out.println("Sua idade atual e: " + idadeAtual + "\n");
                System.out.print("Voce nao hábil a tirar carteira de motorista");
            }
        }
        else
        {
            if (idadeAtual >= 18) {
                System.out.print("Sua idade atual e: " + (idadeAtual - 1) + "\n");
                System.out.print("Voce esta esta hábil a tirar carteira de motorista");
            } else {
                System.out.print("Sua idade atual e: " + (idadeAtual - 1) + "\n");
                System.out.print("Voce nao esta hábil a tirar carteira de motorista");
            }
        }
        entrada.close();
    }
}

