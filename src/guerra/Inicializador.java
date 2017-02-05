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
public class Inicializador {
    private Territorio[] mapaMundi = new Territorio[33];
    
    public Inicializador(){
        mapaMundi[0].setTerritorio("Alasca");
        mapaMundi[0].setFronteira(1, 28, -1, -1);
        mapaMundi[1].setTerritorio("Vancouver");
        mapaMundi[1].setFronteira(0, 2, 3, -1);
        mapaMundi[2].setTerritorio("Groelândia");
        mapaMundi[2].setFronteira(1, 4, 11, -1);
        mapaMundi[3].setTerritorio("California");
        mapaMundi[3].setFronteira(1, 5, 4, -1);
        mapaMundi[4].setTerritorio("Otawa");
        mapaMundi[4].setFronteira(2, 3, 6, -1);
        mapaMundi[5].setTerritorio("México");
        mapaMundi[5].setFronteira(3, 6, 8, -1);
        mapaMundi[6].setTerritorio("Nova York");
        mapaMundi[6].setFronteira(5, 4, 16, -1);
    
        mapaMundi[7].setTerritorio("Chile");
        mapaMundi[7].setFronteira(8, 25, 9, -1);
        mapaMundi[8].setTerritorio("Colômbia");
        mapaMundi[8].setFronteira(5, 7, 10, -1);
        mapaMundi[9].setTerritorio("Argentina");
        mapaMundi[9].setFronteira(10, 7, 32, -1);
        mapaMundi[10].setTerritorio("Brasil");
        mapaMundi[10].setFronteira(8, 9, -1, -1);
        
        mapaMundi[11].setTerritorio("Inglaterra");
        mapaMundi[11].setFronteira(2, 12, -1, -1);
        mapaMundi[12].setTerritorio("Itália");
        mapaMundi[12].setFronteira(11, 13, 14, -1);
        mapaMundi[13].setTerritorio("Suécia");
        mapaMundi[13].setFronteira(12, 15, -1, -1);
        mapaMundi[14].setTerritorio("Alemanha");
        mapaMundi[14].setFronteira(12, 15, 17, -1);
        mapaMundi[15].setTerritorio("Moscou");
        mapaMundi[15].setFronteira(14, 13, 22, 26);
        
        mapaMundi[16].setTerritorio("Nigéria");
        mapaMundi[16].setFronteira(6, 17, 18, -1);
        mapaMundi[17].setTerritorio("Egito");
        mapaMundi[17].setFronteira(14, 16, 19, 22);
        mapaMundi[18].setTerritorio("Congo");
        mapaMundi[18].setFronteira(16, 20, 19, -1);
        mapaMundi[19].setTerritorio("Sudão");
        mapaMundi[19].setFronteira(17, 18, 21, 29);
        mapaMundi[20].setTerritorio("África do Sul");
        mapaMundi[20].setFronteira(18, 21, -1, -1);
        mapaMundi[21].setTerritorio("Madagascar");
        mapaMundi[21].setFronteira(19, 20, -1, -1);
        
        mapaMundi[22].setTerritorio("Oriente Médio");
        mapaMundi[22].setFronteira(17, 15, 29, 23);
        mapaMundi[23].setTerritorio("Índia");
        mapaMundi[23].setFronteira(22, 26, 24, 30);
        mapaMundi[24].setTerritorio("China");
        mapaMundi[24].setFronteira(23, 27, 25, -1);
        mapaMundi[25].setTerritorio("Japão");
        mapaMundi[25].setFronteira(24, 30, 32, 7);
        mapaMundi[26].setTerritorio("Omsk");
        mapaMundi[26].setFronteira(15, 23, 27, -1);
        mapaMundi[27].setTerritorio("Sibéria");
        mapaMundi[27].setFronteira(26, 28, 24, -1);
        mapaMundi[28].setTerritorio("Vladvostok");
        mapaMundi[28].setFronteira(0, 27, -1, -1);
    
        mapaMundi[29].setTerritorio("Sumatra");
        mapaMundi[29].setFronteira(19, 22, 30, -1);
        mapaMundi[30].setTerritorio("Bornéu");
        mapaMundi[30].setFronteira(31, 23, 29, 25);
        mapaMundi[31].setTerritorio("Austrália");
        mapaMundi[31].setFronteira(30, 32, -1, -1);
        mapaMundi[32].setTerritorio("Nova Guiné");
        mapaMundi[32].setFronteira(31, 25, 9, -1);
        
        for(int i=0;i<5;i++){
            for(int j=0;j<8;j++){
               // cor[i][j] = 'n';
            }
        }
    }
}
