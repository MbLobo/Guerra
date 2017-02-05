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
public class Mapa {
    private int[][] mapaMundi = new int[5][8];
    
    public Mapa(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 8; j++){
                mapaMundi[i][j] = '0';
            }
        }
    }
    public void setMapa(int territorio, int l, int c){
        this.mapaMundi[l][c] = territorio;
    }
}
