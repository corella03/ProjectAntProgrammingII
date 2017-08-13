/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
/**
 *
 * @author Ana Elena Ulate Salas
 */
public class Path {
    int column;
    int row;
    Globals go = new Globals();
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
}
