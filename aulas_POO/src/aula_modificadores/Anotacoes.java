package aula_modificadores;

public class Anotacoes {
	
	/*
	 MODIFICADORES DE ACESSO
	 
	 Tipos de modificadores
	 
	 	>> public: torna disponível para acesso os atributos e métodos de uma classe para 
	 	todas as classe do sistema, ou seja, pode ser acessado diretamente.
	 	
	 	>> protected: modificador de acesso intermediário entre o public e o private.
	 	Ele permite o acesso aos atributos de uma classe apenas dentro do pacote a
	 	qual a classe pertence, ou seja, se a Classe1 e Classe2 estão no pacote p1
	 	e a classe3 no pacote p2, então a classe2 pode acessar um atributo protected
	 	da classe1, ja a classe3 não consegue sendo necessário criar um método dentro
	 	da classe1 para realizar um acesso indireto ao atributo.
	 	
	 	>> private: torna métodos e atributos invisíveis para as outras classes do sistema.
	 	Para ser possivel atribuir valores a um atributo private é necessário fazer um 
	 	acesso indireto ao atributo.
	 	
	 	>>EXEMPLO
	 	
	 	public class Pessoa { 
	 		private String nome;	>atributo privado
	 		private int idade; 		>atributo privado
	 		
	 		void setIdade(int idade){ 		>acesso indireto para atribuir valor ao atributo idade
	 			if (idade >= 0) { 
	 				this.idade = idade; 
	 			}else{ 
	 				System.out.print("Idade invalida"); 
	 			} 
	 		} 
	 		
	 		int getIdade(){		>acesso indireto para ler o valor do atributo idade
	 			return this.idade; 
	 		} 
	 	}
	 	
	 CONSTRUTORES
	 
	 O construtor é utilizado somente para construir objetos. Ele inicializa os atributos quando um
	 objeto é contruido da seguinte forma:
	 
	 	•Tipo String é inicializado com null;
	 	•Tipo numérico é inicializado com zero;
	 	•Tipo booleano é inicializado com false;
	 	•Tipo objeto é inicializado com null.
	 	
	 A PALAVRA (STATIC)
	 
	 	A palavra static cria uma variável única que será compartilhada por todos os objetos dessa
	 	classe, ou seja, todo objeto instanciado usará a a mesma variável para atribuir valor.
	 */

}
