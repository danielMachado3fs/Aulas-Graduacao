/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1.exercicios;

import java.util.Scanner;

/**
 *
 * @author daniel.maciel
 */
public class N17MediaFor {
    
    public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
       System.out.println("Informe os valores para caucular a média:");
       double total = 0;
       double cont;
       for(cont = 1; cont <= 5; cont++){
           System.out.print("Valor " + cont + ": ");
           double valor = entrada.nextDouble(); //ao informar o valor, deve-se informá-lo com vírgula
           //pois o java utiliza a localização da máquina
           total += valor;
           entrada.close();
       } 
       double media = total/(cont-1); 
       System.out.println("O somatório dos valores é: " + total);
       System.out.println("A média dps valores é: " + media);
    }
}
