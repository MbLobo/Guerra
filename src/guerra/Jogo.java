/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guerra;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Narcizo
 */
public class Jogo {
    Territorio[] mapaMundi = new Territorio[33];
    
    public Jogo(){
        mapaMundi[0] = new Territorio("Alasca", 1, 28, -1, -1);
        mapaMundi[1] = new Territorio("Vancouver", 0, 2, 3, -1);
        mapaMundi[2] = new Territorio("Groelândia", 1, 4, 11, -1);
        mapaMundi[3] = new Territorio("California", 1, 5, 4, -1);
        mapaMundi[4] = new Territorio("Otawa", 2, 3, 6, -1);
        mapaMundi[5] = new Territorio("México", 3, 6, 8, -1);
        mapaMundi[6] = new Territorio("Nova York", 5, 4, 16, -1);
    
        mapaMundi[7] = new Territorio("Chile", 8, 25, 9, -1);
        mapaMundi[8] = new Territorio("Colômbia", 5, 7, 10, -1);
        mapaMundi[9] = new Territorio("Argentina", 10, 7, 32, -1);
        mapaMundi[10] = new Territorio("Brasil", 8, 9, -1, -1);
        
        mapaMundi[11] = new Territorio("Inglaterra", 2, 12, -1, -1);
        mapaMundi[12] = new Territorio("Itália", 11, 13, 14, -1);
        mapaMundi[13] = new Territorio("Suécia", 12, 15, -1, -1);
        mapaMundi[14] = new Territorio("Alemanha", 12, 15, 17, -1);
        mapaMundi[15] = new Territorio("Moscou", 14, 13, 22, 26);
        
        mapaMundi[16] = new Territorio("Nigéria", 6, 17, 18, -1);
        mapaMundi[17] = new Territorio("Egito", 14, 16, 19, 22);
        mapaMundi[18] = new Territorio("Congo", 16, 20, 19, -1);
        mapaMundi[19] = new Territorio("Sudão", 17, 18, 21, 29);
        mapaMundi[20] = new Territorio("África do Sul", 18, 21, -1, -1);
        mapaMundi[21] = new Territorio("Madagascar", 19, 20, -1, -1);
        
        mapaMundi[22] = new Territorio("Oriente Médio", 17, 15, 29, 23);
        mapaMundi[23] = new Territorio("Índia", 17, 15, 29, 23);
        mapaMundi[24] = new Territorio("China", 22, 26, 24, 30);
        mapaMundi[25] = new Territorio("Japão", 23, 27, 25, -1);
        mapaMundi[26] = new Territorio("Omsk", 24, 30, 32, 7);
        mapaMundi[27] = new Territorio("Sibéria", 15, 23, 27, -1);
        mapaMundi[28] = new Territorio("Vladvostok", 26, 28, 24, -1);
    
        mapaMundi[29] = new Territorio("Sumatra", 19, 22, 30, -1);
        mapaMundi[30] = new Territorio("Bornéu", 31, 23, 29, 25);
        mapaMundi[31] = new Territorio("Austrália", 30, 32, -1, -1);
        mapaMundi[32] = new Territorio("Nova Guiné", 31, 25, 9, -1);
        print();
        sorteio();
        novoJogo();
    }
    private void sorteio(){
        Territorio[] aux = mapaMundi.clone();
        Random rnd = ThreadLocalRandom.current();
        for (int i = aux.length - 1; i > 0; i--){
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = aux[index].getTerritorio();
            aux[index].setTerritorio(aux[i].getTerritorio());
            aux[i].setTerritorio(a);
        }
    }
    private void novoJogo(){
        
    }
    private void print(){
        for(int i=0;i<33;i++){
            System.out.println(mapaMundi[i] + "  ");
        }
    }
}
