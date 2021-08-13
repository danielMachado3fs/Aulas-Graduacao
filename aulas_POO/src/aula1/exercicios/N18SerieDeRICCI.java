/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1.exercicios;

/**
 *
 * @author daniel.maciel
 */
import java.util.Scanner;

public class N18SerieDeRICCI {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("<<<Série de RICC>>>\n");
        System.out.print("Quantos termos deseja calcular? ");
        int nt = entrada.nextInt();
        System.out.println("Informe os dois primeiros termos");
        System.out.print("Termo 1: ");
        long t1 = entrada.nextLong();
        System.out.print("Termo 2: ");
        long t2 = entrada.nextLong();        
        System.out.print(t1 +" "+ t2);
        long resultado;
        entrada.close();
        for(int cont = 2; cont <= nt; cont++){
            resultado = t1 + t2;
            t1 = t2;
            t2 = resultado;
            System.out.print(" " + resultado);
        }
        System.out.println("\nObrigado!");
    }
}
