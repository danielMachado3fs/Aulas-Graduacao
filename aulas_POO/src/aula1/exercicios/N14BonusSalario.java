package aula1.exercicios;

import java.util.Scanner;

public class N14BonusSalario {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o salario: ");
		double salario = entrada.nextDouble();		
		double bonus = 0.2 * salario; //ao informar o salário, usa-se vígula ao invés de ponto
		//pois o java utiliza a localizão da máquina, nesse caso, PT-BR.
		entrada.close();
		System.out.println("O bonus a ser recebido é de R$" + bonus);
	}

}
