/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guerra;

/**
 *
 * @author Narcizo
 */
public class Continente {
    //private final String[] pais;
    private char[] americaNorte = new char[7];
    private char[] americaSul = new char[4];
    private char[] europa = new char[5];
    private char[] africa = new char[6];
    private char[] asia = new char[7];
    private char[] oceania = new char[4];
    
    public Continente(){
        //Territorio ter = new Territorio();
    }

    public char[] getAmericaNorte() {
        return americaNorte;
    }

    public char[] getAmericaSul() {
        return americaSul;
    }

    public char[] getEuropa() {
        return europa;
    }

    public char[] getAfrica() {
        return africa;
    }

    public char[] getAsia() {
        return asia;
    }

    public char[] getOceania() {
        return oceania;
    }

    public void setAmericaNorte(char[] americaNorte) {
        this.americaNorte = americaNorte;
    }

    public void setAmericaSul(char[] americaSul) {
        this.americaSul = americaSul;
    }

    public void setEuropa(char[] europa) {
        this.europa = europa;
    }

    public void setAfrica(char[] africa) {
        this.africa = africa;
    }

    public void setAsia(char[] asia) {
        this.asia = asia;
    }

    public void setOceania(char[] oceania) {
        this.oceania = oceania;
    }
    
}
