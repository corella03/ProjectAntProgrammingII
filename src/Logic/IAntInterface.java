/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
import javax.swing.JFrame;
/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @author Ana Elena Ulate Salas
 ** @date 2017-08-04
 ** 
 **/
public interface IAntInterface {
    //Interface class that is implemented in class ant
    public void walk(int code, JFrame frame);//Method to move the Ant
    public void hip(int code);//Method Hip this ant move random
    public void eatClod(int clod);//Method to eat clod
    public void modifyHealth(int type);//Method to modify Health
    public void changeAlcoholLevel(int type);//Method to change Alcohol level
    public int changeStatus();//Method for change status of the ant
}