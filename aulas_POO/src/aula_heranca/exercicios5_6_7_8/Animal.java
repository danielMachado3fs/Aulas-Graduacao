/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_heranca.exercicios5_6_7_8;

import javax.swing.*;

/**
 *
 * @author daniel.maciel
 */
public class Animal {
    private double peso;
    private String cor;
    
    Animal(String cor, double peso){
        this.cor = cor;
        this.peso = peso;
    }
    
    Animal(){}
    
    Animal(String cor){
        this.cor = cor;
    }
    Animal(double peso){
        this.peso = peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    public void mostrarAnimal(){
        String animal = "O animal tem cor " +cor+ "e pesa: " +peso+ " kilos.";
        JOptionPane.showMessageDialog(null, animal);
    }
}
