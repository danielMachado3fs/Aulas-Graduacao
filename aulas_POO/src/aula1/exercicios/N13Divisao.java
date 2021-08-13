package aula1.exercicios;

import javax.swing.JOptionPane;

public class N13Divisao {
	
	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("Informe o numerador:");
		double numerador = Double.parseDouble(n1);
		String n2 = JOptionPane.showInputDialog("Informe o denominador:");
		double denominador = Double.parseDouble(n2);
		
		if(denominador != 0 || denominador > 0) {
			double resultado = numerador / denominador;
			JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
		}else {
			JOptionPane.showMessageDialog(null, "O denominador não de ser 0 ou negaivo!");
		}
		
	}

}
