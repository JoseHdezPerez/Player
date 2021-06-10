/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import game.Game;
/**
 *
 * @author jmllamasg
 */

//TobiKadachiVSDarkzakest
public class Player {
    int x, y;
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public void MueveAbajo() {
       x+=1;
    }

    public void MueveIzquierda() {
       x-=1;
    }

    public void MueveArriba() {
        y-=1;
    }

    public void MueveDerecha() {
       y+=1;
    }
    
}
