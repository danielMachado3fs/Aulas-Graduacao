package aula1.exercicios;

import java.util.Scanner;

public class N14BonusSalario {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o salario: ");
		double salario = entrada.nextDouble();		
		double bonus = 0.2 * salario; //ao informar o sal�rio, usa-se v�gula ao inv�s de ponto
		//pois o java utiliza a localiz�o da m�quina, nesse caso, PT-BR.
		entrada.close();
		System.out.println("O bonus a ser recebido � de R$" + bonus);
	}

}
