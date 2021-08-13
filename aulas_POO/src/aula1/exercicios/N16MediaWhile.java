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
public class N16MediaWhile {
    
    public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
       System.out.println("Informe os valores para caucular a média:");
       int cont = 1;
       double total = 0;
       while(cont <= 5){
           System.out.print("Valor " + cont + ": ");
           double valor = entrada.nextDouble();
           total += valor;
           cont++;
       }  
       entrada.close();
       double media = total/(cont-1); 
       System.out.println("O somatório dos valores é: " + total);
       System.out.println("A média dps valores é: " + media);
    }
}
