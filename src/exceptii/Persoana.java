/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptii;

/**
 *
 * @author Andrei
 */
public class Persoana {
    private String nume;
    private int varsta;

    public Persoana(String nume, int varsta) {
        if(varsta<0){
            throw new VarstaNegativaException(varsta);
        }
        if(nume == null || nume.length()==0){
            throw new IllegalArgumentException("Numele nu poate lipsi");
        }
        if(nume.length()<3 || !nume.matches("[A-Za-z \\-]+")){
            throw new IllegalArgumentException("Numele nu pare de om");
        }
        
        this.nume = nume;
        this.varsta = varsta;
    }
    
    
}
