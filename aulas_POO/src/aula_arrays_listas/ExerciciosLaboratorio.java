package aula_arrays_listas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class ExerciciosLaboratorio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
    	
        //1. Escreva a(s) linha(s) de c√≥digo para construir um array de inteiros com 
        //20 posicoes.
        System.out.println("Numero 1");
        int [] x = new int[20];       
        
        //2. Escreva um laco de repeticao para carregar um array de inteiros de 10 
        //posicoes. O array devera receber como conteudo o valor da sua posicao.
        System.out.println("\nNumero 2");
        int [] y = new int[10];
        for(int i = 0; i < y.length; i++){
            y [i] = i;
        System.out.println("Posicao "+i+" = "+y[i]);
        }
        
        //3. Escreva o comando para mostrar o tamanho de um array.
        System.out.println("\nNumero 3");
        System.out.println("O vetor y contem "+y.length+" casas");
        
        //4. Escreva um programa para:
        //a. Carregar um array unidimensional com 10 posicoes de inteiros onde 
        //os numeros deverao ser digitados pelo usuario utilizando a entrada grafica de Java.
        int [] vetor = new int[10];
//        for(int i = 0; i < vetor.length; i++){
//            String nu = JOptionPane.showInputDialog("Informe o "+i+"∞ numero");
//            int n = Integer.parseInt(nu);
//            vetor[i] = n;
//        }
        System.out.println(Arrays.toString(vetor));
        
        //b. Ordenar os numeros carregados no array.
        java.util.Arrays.sort(vetor);
        
        //c. Adicionar um codigo que solicita ao usuario um numero 
        //qualquer e o programa devera buscar esse numero no array 
        //carregado.
        System.out.println("\nN˙mero 4.c: Informe o n˙medo para busca");
        int numero = entrada.nextInt();
        Arrays.binarySearch(vetor, numero);
        
        //5. Escreva um codigo para mostrar todos os numeros carregados.
        System.out.println("\nNumero 5:");
        System.out.println(Arrays.toString(vetor));
                
        //6. Escreva um programa onde o usuario digita um numero inteiro e um 
        //vetor de 50 posicoes armazena esse numero em todas as suas posicoes.
        System.out.println("\nNumero 6: Informe um numero para preencher o Array:");
        int np = entrada.nextInt();
        Arrays.fill(vetor, np);
        System.out.println(Arrays.toString(vetor));
        
        //7. Escreva um programa que carrega um array bidimensional 3x3 somente 
        //com numeros pares(o programa devera validar a entrada) e mostre os 
        //numeros carregados.
        System.out.println("\nNumero 7: Array bidimencional par");
        Random r = new Random();
        int [][] matPar = new int[3][3];
        
        for(int linha = 0; linha < matPar.length; linha++) {
        	for(int col = 0; col < matPar.length; col++) {
        		int rn = r.nextInt(100);
        		if(rn % 2 == 0) {
        			matPar[linha][col] = rn;
        		}       		
        	}        	
        }
        
        for(int linha = 0; linha < matPar.length; linha++) {
        	for(int col = 0; col < matPar.length; col++) {
        		System.out.print(matPar[linha][col] + " ");
        		}
        	System.out.println(" ");
        }
        
        //8. Refaca o exercicio anterior utilizando a classe Vector.
        Vector[][] vm = new Vector[3][3];
		
	}

}
