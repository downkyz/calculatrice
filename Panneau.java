/**
 * Panneau.java					2 avr. 2015
 * IUT Info 1 2014/2015 groupe 3
 */
package iut.info1.interfaces;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Créé un panneau contenant des objets graphiques
 * @author Sébastien
 *
 */
@SuppressWarnings("serial")
public class Panneau extends JPanel {

    /** Position du rond en x */
    private int posX = 0;
    
    /** Position du rond en y */
    private int posY = 0;
   
    /**
     * Création d'un objet graphique pour la fenêtre
     * @param g le p
     */
    public void paintComponent(Graphics g){
        //On choisit une couleur de fond pour le rectangle
        g.setColor(Color.white);
        //On le dessine de sorte qu'il occupe toute la surface
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.red);
        g.fillOval(posX, posY, 100, 100);
    }

    /**
     * @return the posX
     */
    public int getPosX() {
        return posX;
    }

    /**
     * @param posX the posX to set
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }

    /**
     * @return the posY
     */
    public int getPosY() {
        return posY;
    }

    /**
     * @param posY the posY to set
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    
}
