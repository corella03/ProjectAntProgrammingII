/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @author Ana Elena Ulate Salas
 ** @date 2017-08-04
 ** 
 **/
public class Configuration {
    private String Nickname;
    private int rows;
    private int columns;

    public Configuration() {
    }    
    public Configuration(String Nickname, int rows, int columns) 
    {
        this.Nickname = Nickname;
        this.rows = rows;
        this.columns = columns;
    }
    //Getters
    public String getNickname() 
    {
        return Nickname;
    }
    public int getRows() 
    {
        return rows;
    }
    public int getColumns() 
    {
        return columns;
    }
    //Setters
    public void setNickname(String Nickname) 
    {
        this.Nickname = Nickname;
    }
    public void setRows(int rows) 
    {
        this.rows = rows;
    }
    public void setColumns(int columns) 
    {
        this.columns = columns;
    }
    @Override
    public String toString() {
        return Nickname + "," + rows + "," + columns;
    }   
}