/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guerra;
import java.util.*;

/**
 *
 * @author Narcizo
 */
public class Territorio{
    private char cor;
    private String territorio;
    private int[] fronteira = new int[4];

    public void setCor(char cor) {
        this.cor = cor;
    }

    public void setFronteira(int a, int b, int c, int d){
        this.fronteira[0] = a;
        this.fronteira[1] = b;
        this.fronteira[2] = c;
        this.fronteira[3] = d;
    }
    public void setTerritorio(String territorio) {
        this.territorio = territorio;
    }
    
    
    public Territorio(String territorio, int a, int b, int c, int e){
        setTerritorio(territorio);
        setFronteira(a, b, c, e);
    }

    public char getCor() {
        return cor;
    }

    public String getTerritorio() {
        return territorio;
    }

    public int[] getFronteira() {
        return fronteira;
    }
    
    public void print(){
        for(int i = 0; i < 5; i++){
            System.out.println("\n");
            for(int j = 0; j < 8; j++){
                System.out.println("");
            }
        }
    }
    @Override
    public String toString(){
        return (getTerritorio())+ " " + (getCor());
    } 
}
