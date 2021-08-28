package aula_heranca.exercicios5_6_7_8;

/**
 *
 * @author daniel.maciel
 */
public class Zoologico {
    public static void main(String [] args){
    	
    	//instanciando um objeto do tipo Cachorro
        Cachorro ted = new Cachorro("Ted", "pitbull", "amarrom", 8);
        System.out.println(ted.getNome()); //mostrar o nome do cachorro atrav�s do .getNome m�todo
        ted.setCor("preto"); //mudar a cor do cachorro
        System.out.println(ted.mostrarCachorro()); 
        
        //instanciando um objeto do tipo Cox
        Cox c1 = new Cox(true, "branco", 7.9);
        c1.setRaca("vira lata"); //atribuindo ra�a ao objeto c1 pelo m�todo herdado da classe cachorro
   
        System.out.println(c1.getRaca()); //mostrar a ra�a atribuida ao objeto c1
        
    }
}
