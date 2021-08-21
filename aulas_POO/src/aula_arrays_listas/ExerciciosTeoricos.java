
package aula_arrays_listas;

import java.util.*;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel.maciel
 */
public class ExerciciosTeoricos {
    /*
    1.O que é um Array?
    O array é um objeto onde é possivel definir n espaços de memória (casa)
    com um índice numérico crescente. Nessas casas é possivel armaenar e remover
    dados de acordo com a necessidade
    
    2.A qual pacote pertence a classe Arrays?
    A classe Arrays pertence a sub-pacote "util" do pacote java = "java.util".
    
    3.Para que serve o método binarySearch()?
    Serve para retornar a posição a qual se encontra um elemento especificado
    pelo programador.
    
    4.Para que serve o método equal?
    Serve para comparar um vetor com outro vetor retornando true ou false.
    
    5.Para que serve o método fill?
    Serve para preencher o vetor com o número passado como argumento, ele coloca
    o mesmo número em todas as casas.
    
    6.Para que serve o método sort?
    É um dos métodos utilizados para ordernar um vetor.
    
    7.Para que serve o método toString?
    Serve para retornar todos os elementos do vetor passado como argumento.
    
    8.Escreva a linha de código para instanciar um array 3x2.
    int [][] matriz = new int[3][2];
    
    9.Escreva o código para carregar um array 3x4;
    int [][] matriz = new int[3][4];
    int x = 0
    for(int linha = 0; linha<=matriz.length; linha++){
        for(int col = 0; col<=matriz.length; col++){
            matriz[linha][col] = x;
            x++;
        }
    }    
    
    10.Para que serve as classes Wrapper?
    Essas clases são objetos para possibilitar usar métodos para manusear os
    tipos primitivos, como por exemplo tranformar uma String em um int.
    
    11.Qual a diferença entre um vetor e um array?
    Array é uma classe, ou seja, possui métodos para manipular os dados. Vetor é 
    simplesmente um conjunto de dados onde não conta com métodos específicos para auxiliar
    manipulação dos dados.
    
    12.Qual o comando utilizado para criar um vetor?
    (tipo de dado)[] (nome do vetor);
    
    13.O que faz o método add() da classe Vector?
    Adiciona um novo dado à lista.
    
    14.Qual a vantagem da utilização da classe Vector?
    A vantagem são os métodos que ela possui, facilitando o manuseio dos dados
    nos vetores/listas instanciados.
        
    15.Suponha  que  você  tenha  um  vetor  chamado  agenda  que  tenha 
    capacidade de armazenar 30 nomes e você adiciona um 31°; nome. 
    O que acontece com o vetor?
    Ultrapassa a capacidade do vetor gerando um erro nosstema.
    */
    
    public static void main(String [] args){
    	
        
        
        List lista = new ArrayList<>();
        
        lista.add(25);
        lista.add("novo");
        lista.add(25.6);
        System.out.println(lista);
        
        String [] agenda = new String[4];
        agenda[0] = "daniel";
        agenda[1] = "higor";
        agenda[2] = "daniel";
        agenda[4] = "daniel";
        agenda[3] = "higor";
        
        for(int i = 0; i< agenda.length; i++){
        System.out.println(agenda[i]);            
        }       
        
    }
    
}
