package aula1.exercicios;

public class N10e11ImprimirFigura {
	
	public static void main(String[] args) {
		
		//NÚMERO10
		String figura2 = "*\n***\n*****\n*******\n*********";
		System.out.println(figura2);
		
		//NÚMERO 11
		String figura = "*";
		
		for(; !figura.equals("***********");) {
			System.out.println(figura);
			figura += "**";
		}
	}
}
