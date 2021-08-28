package aula_heranca.exercicios5_6_7_8;

/**
 *
 * @author daniel.maciel
 */
public class Cachorro extends Animal{
    private String nome, raca;
    Cachorro(String nome, String raca, String cor, double peso){
        super(cor,peso);
        this.nome = nome;
        this.raca = raca;
    }
    
    Cachorro(String nome){
        this.nome = nome;
    }
    Cachorro(String cor, double peso){
        super(cor,peso);
    }
    Cachorro(){}
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    public String getRaca(){
        return raca;
    }
    public String mostrarCachorro(){
      String cachorro = "O "+nome+" é da raça "+raca;
      return cachorro;
    }
}
