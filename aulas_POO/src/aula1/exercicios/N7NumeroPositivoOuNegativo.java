package aula1.exercicios;

import java.util.Scanner;

public class N7NumeroPositivoOuNegativo {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um n�mero:");
		double x = teclado.nextDouble();
		
		teclado.close();
		
		if(x > 0) {
			System.out.println("N�mero Positivo");
		}else {
			System.out.println("N�mero Negativo");
		}
	}

}
