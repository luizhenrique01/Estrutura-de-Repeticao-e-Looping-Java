package com.company;

import java.util.Scanner;

public class Main {
        /*
        Um hotel com 75 apartamentos deseja fazer uma promoção especial de final de semana,
        concedendo um desconto de 25% na diária. Com isto, espera aumentar sua taxa de
        ocupação de 50 para 80%. Sendo dado o valor normal da diária, calcular e imprimir:
        a) o valor da diária promocional;
        b) o valor total arrecadado com 80% de ocupação e diária promocional;
        c) o valor total arrecadado com 50% de ocupação e diária normal;
        d) a diferença entre estes dois valores.
        */
    public static void main(String[] args) {
	    //variaveis
	    double desDiaria, valorDiaria,totalPromocional25,porcentTotal80,totalPromocional80,porcentTotal50,total50,dif;

	    //entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da diaria: ");
        valorDiaria = entrada.nextDouble();

        //calculo
        desDiaria =   0.25 * valorDiaria;
        totalPromocional25 = valorDiaria - desDiaria;

        porcentTotal80 =   (double)(75*80)/100;
        totalPromocional80 = porcentTotal80 * totalPromocional25;

        porcentTotal50 = (double)(75*50)/100;
        total50 = porcentTotal50 * valorDiaria;

        dif = totalPromocional80 - total50;

        //saida
        System.out.println("O valor total da diaria promocial de 25% e: " + totalPromocional25);
        System.out.println("O valor total da diaria promocial de 25% com 80% dos quartos ocupados sao: " + totalPromocional80);
        System.out.println("O valor total da diaria NORMAL com 50% dos quartos ocupados sao: " + total50);
        System.out.print("A diferenca de 80% de quartos ocupados com desconto para 50% dos quartos sem desconto e de: " + dif);
    }
}
