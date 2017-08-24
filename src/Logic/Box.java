/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
import javax.swing.JLabel;
/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @author Ana Elena Ulate Salas
 ** @date 2017-08-01
 ** 
 **/
public class Box extends JLabel{
    private int type;
    public Box(int type) 
    {
        super();
        this.type = type;
    }
    public int getType() 
    {
        return type;
    }
    public void setType(int type) 
    {
        this.type = type;
    }
}