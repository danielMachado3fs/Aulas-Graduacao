package implementacao_fila;

import java.util.*;

public class Interface {
	
	public static void main(String[] args) {
		
		}
	
	public static void menu() {
		
		Scanner entrada = new Scanner(System.in);
		int opcao;
		do {			
			System.out.println(">>>Fila de Clientes do Consultório<<<\n");
			System.out.println("(1) Inserir cliente na fila");
			System.out.println("(2) Mostrar primeiro da fila");
			System.out.println("(3) Atender cliente");
			System.out.println("(4) Tamanho da fila");
			System.out.println("(5) Encerrar atendimento");
			opcao = entrada.nextInt();
			
		}while(opcao != 0);	
	}
	
	public static void executaOpcao(int op) {
		switch(op) {
		case 1: 
		}
	}
}
