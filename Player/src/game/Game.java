/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import player.Player;

/**
 *
 * @author jmllamasg
 */
public class Game {
    Player p;
    
    public void movement(String m) {
        if (m.equalsIgnoreCase("Derecha")){
            p.MueveDerecha();
        }
        else if (m.equalsIgnoreCase("Izquierda")){
            p.MueveIzquierda();
        }
        else if (m.equalsIgnoreCase("Arriba")){
            p.MueveArriba();
        }
        else if (m.equalsIgnoreCase("Abajo")){
            p.MueveAbajo();
        }
    }


}

