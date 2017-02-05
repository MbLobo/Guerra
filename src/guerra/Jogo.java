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
    Territorio[] mapaMundi = new Territorio[40];
    
    public Jogo(){
        mapaMundi[0] = new Territorio("Alasca", 1, 7, -1, -1);
        mapaMundi[1] = new Territorio("Vancouver", 0, 2, 9, -1);
        mapaMundi[2] = new Territorio("Groelândia", 1, 3, 10, -1);
        mapaMundi[9] = new Territorio("California", 1, 5, 4, -1);
        mapaMundi[10] = new Territorio("Otawa", 2, 9, 18, -1);
        mapaMundi[17] = new Territorio("México", 9, 25, 18, -1);
        mapaMundi[18] = new Territorio("Nova York", 10, 17, 19, -1);
    
        mapaMundi[24] = new Territorio("Chile", 31, 32, 25, -1);
        mapaMundi[25] = new Territorio("Colômbia", 24, 33, 17, -1);
        mapaMundi[32] = new Territorio("Argentina", 33, 24, 39, -1);
        mapaMundi[33] = new Territorio("Brasil", 25, 32, -1, -1);
        
        mapaMundi[3] = new Territorio("Inglaterra", 2, 4, -1, -1);
        mapaMundi[4] = new Territorio("Itália", 3, 5, 12, -1);
        mapaMundi[5] = new Territorio("Suécia", 4, 13, -1, -1);
        mapaMundi[12] = new Territorio("Alemanha", 4, 13, 20, -1);
        mapaMundi[13] = new Territorio("Moscou", 12, 5, 14, 21);
        
        mapaMundi[19] = new Territorio("Nigéria", 18, 27, 20, -1);
        mapaMundi[20] = new Territorio("Egito", 12, 19, 28, 21);
        mapaMundi[27] = new Territorio("Congo", 19, 28, 35, -1);
        mapaMundi[28] = new Territorio("Sudão", 20, 27, 36, 29);
        mapaMundi[35] = new Territorio("África do Sul", 36, 27, -1, -1);
        mapaMundi[36] = new Territorio("Madagascar", 35, 28, -1, -1);
        
        mapaMundi[21] = new Territorio("Oriente Médio", 13, 20, 29, 22);
        mapaMundi[22] = new Territorio("Índia", 21, 30, 23, 14);
        mapaMundi[23] = new Territorio("China", 15, 22, 31, -1);
        mapaMundi[31] = new Territorio("Japão", 23, 27, 25, -1);
        mapaMundi[14] = new Territorio("Omsk", 13, 22, 15, -1);
        mapaMundi[15] = new Territorio("Sibéria", 14, 23, -1, -1);
        mapaMundi[7] = new Territorio("Vladvostok", 0, 15, -1, -1);
    
        mapaMundi[29] = new Territorio("Sumatra", 28, 21, 30, -1);
        mapaMundi[30] = new Territorio("Bornéu", 29, 31, 22, 38);
        mapaMundi[38] = new Territorio("Austrália", 30, 39, -1, -1);
        mapaMundi[39] = new Territorio("Nova Guiné", 38, 31, 32, -1);
        
        mapaMundi[6] = new Territorio("água", -1, -1, -1, -1);
        mapaMundi[8] = new Territorio("água", -1, -1, -1, -1);
        mapaMundi[11] = new Territorio("água", -1, -1, -1, -1);
        mapaMundi[16] = new Territorio("água", -1, -1, -1, -1);
        mapaMundi[26] = new Territorio("água", -1, -1, -1, -1);
        mapaMundi[34] = new Territorio("água", -1, -1, -1, -1);
        mapaMundi[37] = new Territorio("água", -1, -1, -1, -1);
        
        print();
        sorteio();
        System.out.println();
        System.out.println();
        print();
        novoJogo();
    }
    private void sorteio(){
        List<Integer> indexes = new ArrayList<>();
        
        for (int i = 0; i < mapaMundi.length; i++) {
            indexes.add(i);
        }
        
        Collections.shuffle(indexes);
        
        for (int i = 0; i < mapaMundi.length; i+=2) {
            mapaMundi[indexes.get(i)].setCor('a');
            mapaMundi[indexes.get(i+1)].setCor('v');
        }
        
        /*Territorio[] aux = mapaMundi.clone();
        Random rnd = ThreadLocalRandom.current();
        for (int i=39;i>0;i--){
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = aux[index].getTerritorio();
            aux[index].setTerritorio(aux[i].getTerritorio());
            aux[i].setTerritorio(a);
        }
        for(int i=0;i<40;i++){
            if(i%2 == 0){
                aux[i].setCor('a');
            }
            else if(i%2 != 0){
                aux[i].setCor('v');
            }
        }*/
    }
    
    private void novoJogo(){
        
    }
    
    private void print(){
        for(int i=0;i<40;i++){
            if(i%8 == 0){
                System.out.println();
            }
            System.out.print(mapaMundi[i] + "  ");
        }
    }
}
