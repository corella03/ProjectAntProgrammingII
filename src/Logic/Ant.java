/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.applet.AudioClip;

/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @author Ana Elena Ulate
 ** @date 2017-08-04
 ** 
 **/
public class Ant implements IAntInterface{
    private String nickName;
    private int path;//talvez se necesiten 2 listas 1 para filas y otras para columnas
    private int health;
    private int alcoholLevel;
    private int status;
    int countRows = 0;
    int countColumns = 0;

    public Ant(String nickName, int health, int alcoholLevel, int status) {
        this.nickName = nickName;
        this.health = health;
        this.alcoholLevel = alcoholLevel;
        this.status = status;
    }

    public String getNickName() {
        return nickName;
    }

    public int getPath() {
        return path;
    }

    public int getHealth() {
        return health;
    }

    public int getAlcoholLevel() {
        return alcoholLevel;
    }

    public int getStatus() {
        return status;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPath(int path) {
        this.path = path;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAlcoholLevel(int alcoholLevel) {
        this.alcoholLevel = alcoholLevel;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public void errorSound() 
    {
        AudioClip errorSound;
        errorSound = java.applet.Applet.newAudioClip(getClass().getResource("/Icons/error.wav"));
        errorSound.play();
    }
    //Method to move the Ant
    @Override
    public void walk(int code) {
         switch (code) 
        {
            case 38:
                //Arriba
                if (countRows > 0)
                {
                    Globals.matriz[countRows][countColumns].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pasto.png")));
                    countRows--;
                    Globals.matriz[countRows][countColumns].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Aint.png")));
                } else {
                    errorSound();
                }
                break;
            case 37:
                //Izquierda
                if (countColumns > 0) 
                {
                    Globals.matriz[countRows][countColumns].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pasto.png")));
                    countColumns--;
                    Globals.matriz[countRows][countColumns].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Aint.png")));
                }else {
                    errorSound();
                }
                break;
            case 39:
                //Derecha
                if (countColumns < Globals.amountColumns - 1) 
                {
                    Globals.matriz[countRows][countColumns].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pasto.png")));
                    countColumns++;
                    Globals.matriz[countRows][countColumns].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Aint.png")));
                } else {
                    errorSound();
                }
                break;
            case 40:
                //Abajo
                if (countRows < Globals.amountRows - 1) 
                {
                    Globals.matriz[countRows][countColumns].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pasto.png")));
                    countRows++;
                    Globals.matriz[countRows][countColumns].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Aint.png")));
                }else {
                    errorSound();
                }
                break;
            default:
                break;
        }
    }
    //Method Hip
    @Override
    public void hip(int code) {
        
        int randomMove = (int) Math.floor(Math.random()*(37-41)+41);
        System.out.println(randomMove);
        switch (code) 
        {
            case 37:
                walk(randomMove);
                break;
            case 38:
                walk(randomMove);
                break;
            case 39:
                walk(randomMove);
                break;
            default:
                walk(randomMove);
                break;
        }
    }
    @Override
    public void eatClod(int Clod) {
        
        
    }

    @Override
    public void modifyHealth(int life) {
        
    }

    @Override
    public void changeAlcoholLevel(int alcoholIngested) {
        
    } 
}