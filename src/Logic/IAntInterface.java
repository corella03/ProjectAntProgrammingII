/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @author Ana Elena Ulate
 ** @date 2017-08-04
 ** 
 **/
public interface IAntInterface {
    public void walk(int code);
    public void hip(int code);
    public void eatClod(int clod);
    public void modifyHealth(int type);
    public void changeAlcoholLevel(int type);
    public int changeStatus();
}