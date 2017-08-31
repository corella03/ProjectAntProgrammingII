/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.ArrayList;
import javax.swing.JPanel;
/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @author Ana Elena Ulate Salas
 ** @date 2017-08-04
 ** 
 **/
public class Path {
    int column;
    int row;
    Box newBox = null;
    
    //GameView game = new GameView();
    public Path() {
    }
    /**
     * Method to produce Random positions 
     * @param amount
     * @param limitX
     * @param limitY
     * @return 
     */
    public ArrayList<ArrayList<Integer>> getRandomPositions(int amount, int limitX,int limitY){
        ArrayList<ArrayList<Integer>> clodList = new  ArrayList<>();
        while(clodList.size() < amount){
            int rndX = (int) Math.floor(Math.random()*(0-limitX)+limitX);
            int rndY  = (int) Math.floor(Math.random()*(0-limitY)+limitY );
            ArrayList<Integer> indexList = new ArrayList<>();
            indexList.add(rndX);
            indexList.add(rndY);
            if(!clodList.contains(indexList)){
                clodList.add(indexList);
            }
        }
        return clodList;
    }
    /**
     * Method to start game, generated boxes and Update boxes
     */  
    public void starGame(JPanel panel) {
        Globals.matriz = new Box[Globals.amountRows][Globals.amountColumns];
        panel.setLayout(new java.awt.GridLayout(Globals.amountRows, Globals.amountColumns));
        ArrayList<ArrayList<Integer>> randomPositionList = getRandomPositions
        (Globals.amountClods,Globals.amountRows,Globals.amountColumns);      
        int cont = 0;
        //Randomly chooses what is going to be in each of the Path boxes
        for (int i = 0; i < Globals.amountRows; i++) {
            for (int j = 0; j < Globals.amountColumns; j++) {
                ArrayList<Integer> listOfIndex =  new ArrayList<>();
                listOfIndex.add(i);
                listOfIndex.add(j);
                if(randomPositionList.contains(listOfIndex)){
                    int typeAmountClod = Globals.amountClods / 3;
                    if(cont < typeAmountClod){
                        newBox = new Box(1);
                    }
                    else if(cont < (typeAmountClod * 2)){
                        newBox = new Box(2);
                    }
                    else if(cont < (typeAmountClod * 3)){
                        newBox = new Box(3);
                    }
                    cont++;
                }
                else{
                    newBox = new Box(0);
                }
                //Add box to panel and set its image
                panel.add(newBox);
                Globals.matriz[i][j] = newBox;
                newBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pasto.png")));
                if(newBox.getType() == 1 && Globals.matriz[i][j] != Globals.matriz[0][0] 
                        && Globals.matriz[i][j] != Globals.matriz[Globals.amountRows -1][Globals.amountColumns -1]){
                    newBox.setText("1");
                    newBox.setIcon((new javax.swing.ImageIcon(getClass().getResource("/Icons/pasto.png"))));
                }
                else if(newBox.getType() == 2 && Globals.matriz[i][j] != Globals.matriz[0][0] 
                        && Globals.matriz[i][j] != Globals.matriz[Globals.amountRows -1][Globals.amountColumns -1]){
                    newBox.setText("2");
                newBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pasto.png")));
                }
                else if(newBox.getType() == 3 && Globals.matriz[i][j] != Globals.matriz[0][0] 
                        && Globals.matriz[i][j] != Globals.matriz[Globals.amountRows -1][Globals.amountColumns -1]){
                    newBox.setText("3");
                newBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pasto.png")));
                }
                else{
                newBox.setText("0");
                }
            }
        }
        Globals.matriz[0][0].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PruebaAnt.png")));
        Globals.matriz[Globals.amountRows - 1][Globals.amountColumns - 1].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/hormiguero.jpg")));
        panel.paintAll(panel.getGraphics());
    }
}
