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
    public void walk(int code, JFrame frame);
    public void hip(int code);
    public void eatClod(int clod);
    public void modifyHealth(int type);
    public void changeAlcoholLevel(int type);
    public int changeStatus();
}