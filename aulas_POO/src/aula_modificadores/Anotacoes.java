package aula_modificadores;

public class Anotacoes {
	
	/*
	 MODIFICADORES DE ACESSO
	 
	 Tipos de modificadores
	 
	 	>> public: torna dispon�vel para acesso os atributos e m�todos de uma classe para 
	 	todas as classe do sistema, ou seja, pode ser acessado diretamente.
	 	
	 	>> protected: modificador de acesso intermedi�rio entre o public e o private.
	 	Ele permite o acesso aos atributos de uma classe apenas dentro do pacote a
	 	qual a classe pertence, ou seja, se a Classe1 e Classe2 est�o no pacote p1
	 	e a classe3 no pacote p2, ent�o a classe2 pode acessar um atributo protected
	 	da classe1, ja a classe3 n�o consegue sendo necess�rio criar um m�todo dentro
	 	da classe1 para realizar um acesso indireto ao atributo.
	 	
	 	>> private: torna m�todos e atributos invis�veis para as outras classes do sistema.
	 	Para ser possivel atribuir valores a um atributo private � necess�rio fazer um 
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
	 
	 O construtor � utilizado somente para construir objetos. Ele inicializa os atributos quando um
	 objeto � contruido da seguinte forma:
	 
	 	�Tipo String � inicializado com null;
	 	�Tipo num�rico � inicializado com zero;
	 	�Tipo booleano � inicializado com false;
	 	�Tipo objeto � inicializado com null.
	 	
	 A PALAVRA (STATIC)
	 
	 	A palavra static cria uma vari�vel �nica que ser� compartilhada por todos os objetos dessa
	 	classe, ou seja, todo objeto instanciado usar� a a mesma vari�vel para atribuir valor.
	 */

}
