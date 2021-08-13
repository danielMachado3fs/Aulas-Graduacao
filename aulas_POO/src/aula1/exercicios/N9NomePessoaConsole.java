package aula1.exercicios;

import java.util.Scanner;

public class N9NomePessoaConsole {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o nome completo:");
		String n = teclado.nextLine();
		
		teclado.close();
		
		System.out.println(n);
	}
	
	

}
