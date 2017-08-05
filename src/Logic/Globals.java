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
 ** @date 2017-08-01
 ** 
 **/
public class Globals {
    public static int amountRows;
    public static int amountColumns;
    public static Box[][] matriz;
    //Getters
    public static int getAmountRows()
    {
        return amountRows;
    }
    public static int getAmountColumns() 
    {
        return amountColumns;
    }
    
    
    
    
    //Setters
    public static void setAmountRows(int amountRows) 
    {
        Globals.amountRows = amountRows;
    }
    public static void setAmountColumns(int amountColumns)
    {
        Globals.amountColumns = amountColumns;
    }
}