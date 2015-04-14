/**
 * Fenetre.java					2 avr. 2015
 * IUT Info 1 2014/2015 groupe 3
 */
package iut.info1.interfaces;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Test de JFrame
 * @author Sébastien
 * @version 1.0
 */
@SuppressWarnings("serial")
public class Fenetre extends JFrame {

    /** Définit le panneau sur lequel nous allons travailler */
    private Panneau pan = new Panneau();
    
    /** Création du bouton lancer */
    private Bouton btn_lancer = new Bouton("Lancer");
    
    /** TODO commenter le rôle de ce champ */
    private JPanel container = new JPanel();

    /**
     * Création d'une fenetre
     */
    public Fenetre() { 
        // titre de la fenetre
        this.setTitle("Ma première fenêtre Java");
        //taille de la fenetre
        this.setSize(800, 700);
        // ferme la fenêtre lorsque l'on appuie sur la croix
        this.setDefaultCloseOperation(Fenetre.EXIT_ON_CLOSE);             
        // centre la fenetre
        this.setLocationRelativeTo(null);
        this.setContentPane(container);
        
        container.setBackground(Color.white);
        container.setLayout(new BorderLayout());
        container.add(pan, BorderLayout.CENTER);
        
        container.add(btn_lancer, BorderLayout.SOUTH);
        // la fenetre sera visible
        this.setVisible(true); 

        go();
    }    

    /**
     * animation d'un objet
     */
    public void go() {
        int largeur = pan.getWidth() - 100;
        int longueur = pan.getHeight() - 100;

        while(true) { // boucle infinie
            for(int i = 0; i < largeur; i++){
                int x = pan.getPosX();// y = pan.getPosY();
                x++;
                //    y++;
                pan.setPosX(x);
                //   pan.setPosY(y);
                pan.repaint();  
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for(int i = 0; i < longueur; i++){
                int y = pan.getPosY();// y = pan.getPosY();
                //    x++;
                y++;
                //   pan.setPosX(x);
                pan.setPosY(y);
                pan.repaint();  
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for(int i = 0; i < largeur; i++){
                int x = pan.getPosX();// y = pan.getPosY();
                x--;
                //    y++;
                pan.setPosX(x);
                //   pan.setPosY(y);
                pan.repaint();  
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for(int i = 0; i < longueur; i++){
                int y = pan.getPosY();// y = pan.getPosY();
                //    x++;
                y--;
                //   pan.setPosX(x);
                pan.setPosY(y);
                pan.repaint();  
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

    
