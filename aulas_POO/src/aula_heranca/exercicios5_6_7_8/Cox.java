package aula_heranca.exercicios5_6_7_8;

/**
 *
 * @author daniel.maciel
 */
public class Cox extends Cachorro{
    private boolean tosa;
    
    Cox(boolean tosa, String cor, double peso){
        super(cor,peso);
        this.tosa = tosa;
    }
    
    public String mostraAnimal(){
        String statusTosa;
        if(tosa == true){
            return statusTosa = "Este cachorro está tosad";
        }else{
            return statusTosa = "Você precisa tosar o cachorro";
        }
    }
    
}
