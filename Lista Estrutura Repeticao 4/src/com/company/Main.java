package com.company;

import java.util.Scanner;

public class Main {
    /*Faça um algoritmo que segundo uma nota informada pelo usuário, verifique em qual faixa
    a mesma se encaixa e imprima para o usuário a mensagem correspondente conforme a
    tabela abaixo:
    Faixa das notas Mensagem
    Nota > = 8 e Nota < = 10 Ótimo
    Nota > = 7 e Nota < 8 Bom
    Nota > = 5 e Nota < 7 Regular
    Nota < 5 Insatisfatório
    */
    public static void main(String[] args) {

        //variavel
        Scanner entrada = new Scanner(System.in);
        int nota;

        //entrada
        System.out.println("Digite a nota: ");
        nota = entrada.nextInt();

        //calculo

        if(nota > 8  &&  nota <= 10)
        {
            System.out.print("Sua nota foi otima");
        }
        if(nota == 7)
        {
            System.out.print("Sua nota foi boa");
        }
        if(nota >= 5 && nota < 7 )
        {
            System.out.print("Sua nota foi regular");
        } if(nota < 5 )
        {
            System.out.print("Sua nota foi ruim");
        }else{
            System.out.print("Digite uma nota valida entre 1 e 10");
        }

    }
}
