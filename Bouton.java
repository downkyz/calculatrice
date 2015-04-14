/**
 * Bouton.java					4 avr. 2015
 * IUT Info 1 2014/2015 groupe 3
 */
package iut.info1.interfaces;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;

/**
 * Création d'un bouton personnalisé
 * @author Sébastien
 *
 */
@SuppressWarnings("serial")
public class Bouton extends JButton {
    
    /** TODO commenter le rôle de ce champ */
    private String name;
    
    /**
     * TODO commenter l'état initial atteint
     * @param nom
     */
    public Bouton(String nom) {
        super(nom);
        this.name = nom;
    }
    
    public void paintComponent(Graphics g) {
        //On choisit une couleur de fond pour le rectangle
        g.setColor(Color.white);
        //On le dessine de sorte qu'il occupe toute la surface
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        
        g.drawString(this.name, this.getWidth() / 2 - (this.getWidth()/ 2 /4), 
                (this.getHeight() / 2));
    }

}
