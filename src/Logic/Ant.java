/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
import java.applet.AudioClip;
import Interface.VictoryView;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 **
 ** @author Luis Alonso Corella Chaves
 ** @author Ana Elena Ulate Salas
 ** @date 2017-08-04
 ** 
 **/
public class Ant implements IAntInterface{
    private String nickName;
    private int health ;
    private int alcoholLevel;
    private int status;
    private boolean toxic = false;
    private int countRows = 0;
    private int countColumns = 0;
    private int previous = 0;
    int count = 0;
    Box newBox = null;
    public Ant(String nickName, int health, int alcoholLevel, int status) {
        this.nickName = nickName;
        this.health = health;
        this.alcoholLevel = alcoholLevel;
        this.status = status;
    }

    public String getNickName() {
        return nickName;
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

    public boolean isToxic() {
        return toxic;
    }

    public int getCountRows() {
        return countRows;
    }

    public int getCountColumns() {
        return countColumns;
    }
    
    
    public void setNickName(String nickName) {
        this.nickName = nickName;
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

    public void setToxic(boolean toxic) {
        this.toxic = toxic;
    }

    public void setCountRows(int countRows) {
        this.countRows = countRows;
    }

    public void setCountColumns(int countColumns) {
        this.countColumns = countColumns;
    }
    
    
    public void errorSound() 
    {
        AudioClip errorSound;
        errorSound = java.applet.Applet.newAudioClip(getClass().getResource("/Icons/error.wav"));
        errorSound.play();
    }
    public void crash(int code)
    {
        if(changeStatus() == 2)
        {
            hip(code);
        }
        else if(this.toxic == true)
        {
            this.setHealth(this.health - 20);
            hip(code);
        }
    }
    //Method to move the Ant
@Override
    public void walk(int code,JFrame frame) {
        if(previous  != getBack(code))
        {
            previous = code;
            switch (code) 
            { 
                case 38:
                    //Arriba
                    if (countRows > 0)
                    {
                        Globals.matriz[countRows][countColumns].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pasto.png")));
                        countRows--;
                        if(!(changeStatus() == 1 && Globals.matriz[countRows][countColumns].getType() == 3))
                        {
                            this.eatClod(Globals.matriz[countRows][countColumns].getType());
                            Globals.matriz[countRows][countColumns].setType(0); 
                        }
                        Globals.matriz[countRows][countColumns].setWalkedBox(true);
                        Globals.matriz[countRows][countColumns].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PruebaAnt.png")));
                    } else {
                        errorSound();
                        crash(code);
                    }
                    break;
                case 37:
                    //Izquierda
                    if (countColumns > 0) 
                    {
                        Globals.matriz[countRows][countColumns].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pasto.png")));
                        countColumns--;
                        if(!(changeStatus() == 1 && Globals.matriz[countRows][countColumns].getType() == 3))
                        {
                            this.eatClod(Globals.matriz[countRows][countColumns].getType());
                            Globals.matriz[countRows][countColumns].setType(0); 
                        }
                        Globals.matriz[countRows][countColumns].setWalkedBox(true);
                        Globals.matriz[countRows][countColumns].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PruebaAnt.png")));
                        
                    }else {
                        errorSound();
                        crash(code);
                    }
                    break;
                case 39:
                    //Derecha
                    if (countColumns < Globals.amountColumns - 1) 
                    {
                        Globals.matriz[countRows][countColumns].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pasto.png")));
                        countColumns++;
                        if(!(changeStatus() == 1 && Globals.matriz[countRows][countColumns].getType() == 3))
                        {
                            this.eatClod(Globals.matriz[countRows][countColumns].getType());
                            Globals.matriz[countRows][countColumns].setType(0); 
                        }
                        Globals.matriz[countRows][countColumns].setWalkedBox(true);
                        Globals.matriz[countRows][countColumns].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PruebaAnt.png")));
                    } else {
                        errorSound();
                        crash(code);
                    }
                    break;
                case 40:
                    //Abajo
                    if (countRows < Globals.amountRows - 1) 
                    {
                        Globals.matriz[countRows][countColumns].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pasto.png")));
                        countRows++;
                        if(!(changeStatus() == 1 && Globals.matriz[countRows][countColumns].getType() == 3))
                        {
                            this.eatClod(Globals.matriz[countRows][countColumns].getType());
                            Globals.matriz[countRows][countColumns].setType(0); 
                        }
                        Globals.matriz[countRows][countColumns].setWalkedBox(true);
                        Globals.matriz[countRows][countColumns].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PruebaAnt.png")));                     
                    }else {
                        errorSound();
                        crash(code);
                    }
                    break;
                default:
                    break;
            }
            win(frame);
        }else{
            errorSound();
        }
    }
    public void win(JFrame frame)
    {
        if(this.countRows == Globals.amountRows - 1 && this.countColumns == Globals.amountColumns - 1) 
        {
            VictoryView vc = new VictoryView();
            vc.setVisible(true);
            frame.setVisible(false);
        }
    }
    public void limit()
    {
        if (countRows > 0 || countColumns > 0 || countColumns < Globals.amountColumns - 1 || countRows < Globals.amountRows - 1)
        {
            if(changeStatus() == 3)
            {
                this.setHealth(this.health - 20);
            }
        }
    }
    //Method Hip
    @Override
    public void hip(int code) {
        int randomMove = (int) Math.floor(Math.random()*(37-41)+41);
        switch (code) 
        {
            case 37:
                walk(randomMove,null);    
                break;
            case 38:
                walk(randomMove,null);
                break;
            case 39:
                walk(randomMove,null);
                break;
            default:
                walk(randomMove,null);
                break;
        }
    }//Method to eat clod
    @Override
    public void eatClod(int clod) {
       switch(clod)
       {
           case 0:
               methodToEat(clod);
               
               break;
           case 1:
               methodToEat(clod);
               break;
           case 2:
               methodToEat(clod);
               break;
           case 3:
               methodToEat(clod);
               break;
            default:
            break;
       }    
    }
    public void changeToxicStatus()
    {
        if(count > 3)
        {
            this.toxic = false;   
            count = 0; 
        }else{
            count++;                 
        }
    }
    public void methodToEat(int clod){
        switch (clod) {
            case 0:
                modifyHealth(clod);
                changeAlcoholLevel(clod);
                break;
            case 1:
                modifyHealth(clod);
                changeAlcoholLevel(clod);
                break;
            case 2:
                modifyHealth(clod);                
                changeAlcoholLevel(clod);
                break;
            case 3:
                modifyHealth(clod);
                changeAlcoholLevel(clod);
                break;
            default:
                break;
        }
    }
    //MEthod to modify Health
    @Override
    public void modifyHealth(int type) {
        switch (this.changeStatus()) {
            case 1://Is sober
                switch(type)
                {
                    case 1://Typy clod is sugar
                        this.setHealth(this.health + 10);
                        break;
                    case 2://Typy clod is alcohol
                        this.setHealth(this.health - 10);
                        break;
                    default:
                        break;
                }   
                break;
            case 2://Is drunk
                if(this.toxic == false)
                {
                    switch(type)
                    {
                        case 1:
                            this.setHealth(this.health + 10);
                            break;
                        case 2:
                            this.setHealth(this.health - 20);
                            break;
                        case 3://Type clod  is Toxic
                            this.setHealth(this.health - 50);
                            this.toxic = true;
                            break;
                        default:
                            break;
                    }   
                    break;   
                }
            case 3: 
                if(this.toxic == true) 
                {
                    switch(type)
                    {
                        case 0://Nothing
                            this.setHealth(this.health + 10);
                            break;
                        case 1:
                            this.setHealth(this.health + 20);
                            break;
                        case 2:
                            this.setHealth(this.health = 0);
                            break;
                        case 3:
                            this.setHealth(this.health = 0);
                            break;
                            //Falta validar que si chocz con un borde estando envenenada baja en 20 la salud
                        default:
                            break;
                    }
                break;
                } 
            default:
            break;
        }   
    }
    public int getBack(int code)
    {
        int data = 0;
        switch (code) {
            case 38:
                data = 40;
                break;
            case 40:
                data = 38;
                break;
            case 37:
                data = 39;
                break;
            case 39:
                data = 37;
                break;
            default:
                break;
        }
        return data;
    }
    //Method to change Alcohol level
    @Override
    public void changeAlcoholLevel(int type) {
        
        switch(this.changeStatus())
        {
            case 1://Is sober
                switch(type)
                {
                    case 2:
                        this.setAlcoholLevel(this.alcoholLevel + 20);
                        break;
                    default:
                        break;
                }
                break;
            case 2://Is drunk
                switch(type)
                {
                    case 0:
                        this.setAlcoholLevel(this.alcoholLevel - 10);
                        break;
                    case 1:
                        this.setAlcoholLevel(this.alcoholLevel - 10);
                        break;
                    case 2:
                        this.setAlcoholLevel(this.alcoholLevel + 20);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
    }
    public void showPath(JPanel panel)
    {
        panel.setLayout(new java.awt.GridLayout(Globals.amountRows, Globals.amountColumns));
        for (int i = 0; i < Globals.amountRows; i++) {
            for (int j = 0; j < Globals.amountColumns; j++) {
                newBox = new Box(0);
                panel.add(newBox);
                Globals.matriz[0][0].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Toxic-icon.png")));
                if(Globals.matriz[i][j].isWalkedBox())
                {
                    newBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Toxic-icon.png")));
                }else
                {
                    newBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pasto.png")));
                }
                Globals.matriz[i][j] = newBox;
            }    
        }  
        panel.paintAll(panel.getGraphics());
    }
    @Override
    public int changeStatus() {
        if(this.health <= 0)
        {
            this.status = 0;// esta muerta
        }
        else if(this.toxic == true)
        {
            this.status = 3;//envenenada
            changeToxicStatus();
        }
        else if(this.alcoholLevel > 0)
        {
            this.status = 2;//Ebria
        }
        else if(this.alcoholLevel == 0)
        {
            this.status = 1;//Sobria
        }
       return this.status;
    }
}