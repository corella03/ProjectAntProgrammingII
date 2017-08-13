/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Interface.GameView;
import java.awt.Frame;
import java.util.ArrayList;

/**
 *
 * @author Ana Elena Ulate Salas
 */
public class Path {
    int column;
    int row;
    Globals go = new Globals();
    Box newBox = null;
    GameView game = new GameView();
    public Path() {
    }
    public void placeObstacules(int obs){
        int cont = 0;
        while(cont <= obs){
         setAlcohol();
         setSugar();
         setPoison();
         cont++; 
        }   
    }
    public void setAlcohol(){
        column = (int)(Math.random()*(1+go.getAmountColumns()));
        row = (int) (Math.random()*(1+go.getAmountRows()));
        go.matriz[0][4].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Beer-icon.png")));
        System.out.println(column);
        System.out.println(row);
        System.out.println("---");
   }
    public void setSugar(){
        column = (int)(Math.random()*(1+go.getAmountColumns()));
        row = (int) (Math.random()*(1+go.getAmountRows()));
        go.matriz[3][5].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Sugar-icon.png")));
        System.out.println(column);
        System.out.println(row);
        System.out.println("***");
    }
    public void setPoison(){
        column = (int) (Math.random()*(1+go.getAmountColumns()));
        row = (int) (Math.random()*(1+go.getAmountRows()));
        go.matriz[2][5].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Toxic-icon.png")));
        System.out.println(column);
        System.out.println(row);
        System.out.println("+++");
   }
    public ArrayList<ArrayList<Integer>> getRandomPositions(int amount, int limitX,int limitY)//limtX
    {
        ArrayList<ArrayList<Integer>> clodList = new  ArrayList<>();
        while(clodList.size() < amount)
        {
            int rndX = (int) Math.floor(Math.random()*(0-limitX)+limitX);
            int rndY  = (int) Math.floor(Math.random()*(0-limitY)+limitY );
            ArrayList<Integer> indexList = new ArrayList<>();
            indexList.add(rndX);
            indexList.add(rndY);
            if(!clodList.contains(indexList))
            {
                clodList.add(indexList);
            }
        }
        return clodList;
    }
    //Method for start game
    public Frame starGame() {
        Globals.matriz = new Box[Globals.amountRows][Globals.amountColumns];
        //this.gamePanel.setLayout(new java.awt.GridLayout(Globals.amountRows, Globals.amountColumns));
        game.setLayout(new java.awt.GridLayout(Globals.amountRows, Globals.amountColumns));
        ArrayList<ArrayList<Integer>> randomPositionList = getRandomPositions(15,Globals.amountRows,
                Globals.amountColumns);      
        int cont = 0;
        for (int i = 0; i < Globals.amountRows; i++) {
            for (int j = 0; j < Globals.amountColumns; j++) {
                //colocar solo ad
                ArrayList<Integer> listOfIndex =  new ArrayList<>();
                listOfIndex.add(i);
                listOfIndex.add(j);
                
                if(randomPositionList.contains(listOfIndex))
                {
                    if(cont < 5)
                    {
                        newBox = new Box(1);
                    }
                    else if(cont < 10)
                    {
                        newBox = new Box(2);
                    }
                    else if(cont < 15){
                        newBox = new Box(3);
                    }
                    cont++;
                }else{
                    newBox = new Box(0);
                }
                game.add(newBox);
                //gamePanel.add(newBox);
                //System.out.println("----------------------------------");
                //System.out.println(newBox.typeClod());
                //System.out.println("----------------------------------");
                Globals.matriz[i][j] = newBox;
                newBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pasto.png")));
//                if(newBox.typeClod() == 1)
//                {
//                    newBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pasto.png")));
//                }else
//                {
//                    newBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/tierra.png")));
//                }
                if(newBox.getType() == 1)
                {
                newBox.setText("1");
                }
                else if(newBox.getType() == 2)
                {
                newBox.setText("2");
                }
                else if(newBox.getType() == 3)
                {
                newBox.setText("3");
                }
                else if(newBox.getType() == 0)
                {
                newBox.setText("0");
                }
                //newBox.setBackground(Color.decode("#DEB887"));
            }
        }
        Globals.matriz[0][0].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Aint.png")));
        Globals.matriz[Globals.amountRows - 1][Globals.amountColumns - 1].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/adobe-image-ready-icono-4767-32.png")));
        game.paintAll(game.getGraphics());
        return game;
    }
}
