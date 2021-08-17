
import java.util.*;

public class ExemploLista {
	
	public static void main(String[] args) {
		//Primeiro criamos um ArrayList.
		List umaLista = new ArrayList();

		    //Para adicionar elementos ao final da lista, usamos o método add
		    umaLista.add("Vinícius");
		    umaLista.add("De");
		    umaLista.add("Mendonça");
		    imprime("Após adicionar os primeiros elementos", umaLista);

		    //Também podemos adicionar um elemento numa posição qualquer da lista
		    umaLista.add(1, "Godoy");
		    imprime("Após adicionar Godoy na posição 1", umaLista);

		    umaLista.add("Garcia");
		    umaLista.add("Menezes");
		    imprime("Após adicionar Garcia e Menezes na lista", umaLista);

		    //Podemos obter o tamanho da lista chamando o método size()
		    System.out.println("O tamanho da lista é: " + umaLista.size());
		    
		    //Podemos acessar um elemento da lista usando get. Note que o índice das
		    //listas começa em 0.
		    System.out.println("O 4º elemento da lista, de índice 3 é: " + umaLista.get(3));
		    
		    //Podemos ver se existe um determinado valor na lista
		    if (umaLista.contains("Godoy"))
		        System.out.println("Godoy está lá!");
		    else
		        System.out.println("Godoy não está lá!");
		    
		    if (umaLista.contains("Braga"))
		        System.out.println("Braga está lá!");
		    else
		        System.out.println("Braga não está lá!");
		    
		    //Podemos descobrir qual é o índice de um elemento da lista
		    int indiceDe = umaLista.indexOf("De");
		    System.out.println("O índice de 'De' é:" + indiceDe);

		    //Dá também para remover um elemento da lista com remove
		    umaLista.remove("Garcia");
		    imprime("Removemos Garcia", umaLista);

		    //Remove também aceita um índice!
		    umaLista.remove(umaLista.size()-1); //Remover o último elemento
		    imprime("Removemos a lista na posição " + (umaLista.size()) + ": ", umaLista);

		    //Podemos ordenar a lista, desde que a classe dentro dela seja Comparable:
		    Collections.sort(umaLista);
		    imprime("Lista ordenada", umaLista);

		    //É possível criar cópias da lista em praticamente qualquer estrutura:
		    List<String> outraLista = new LinkedList<String>(umaLista); 
		    imprime("Impressão da outra lista", umaLista);
		    outraLista = null;

		    //Podemos também remover todos os elementos da lista
		    umaLista.clear();

		    //Podemos criar uma versão imodificável da lista
		    outraLista = Collections.unmodifiableList(umaLista); //Não é uma cópia!
		    try {
		       outraLista.add("Menezes de Barros");
		    } catch (UnsupportedOperationException e) {
		       System.out.println("Ops... não dá para inserir!");
		    }
		    
		    //Podemos transformar um arrayQualquer numa lista
		    String[] frutas = new String[] {"Banana", "Maçã", "Banana", "Laranja", "Banana"};
		    List<String> listaFrutas = Arrays.asList(frutas);
		    imprime("Lista de frutas", listaFrutas);
		    
		    //E podemos adicionar uma lista inteira dentro de outra
		    umaLista.add("Pera");
		    umaLista.add("Goiaba");
		    umaLista.addAll(listaFrutas);
		    
		    imprime("Lista de frutas com frutas de umaLista", umaLista);
		    
		    //Há também métodos para remover todos os que forem iguais(removeAll), 
		    //manter todos os que forem iguais (retainAll)
		    //ou ver se todos os elementos de uma lista estão em outra (containsAll)
		    umaLista.retainAll(listaFrutas); //Mantém só as frutas que estiverem em listaFrutas
		    imprime("Lista após a remoção", umaLista);
		    
		    //Você também pode usar o iterador para remover um elemento enquanto 
		    //percorre a lista. Por exemplo, vamos remover as bananas:        
		    Iterator<String> it = umaLista.iterator();
		    while (it.hasNext()) //Enquanto temos elementos da lista
		    {
		        String fruta = it.next(); //Obtemos o próximo elemento
		        if (fruta.equals("Banana")) //Estamos na banana?
		            it.remove();            //Removemos!
		    }
		    imprime("Uma lista sem bananas", umaLista);        
		}

}
