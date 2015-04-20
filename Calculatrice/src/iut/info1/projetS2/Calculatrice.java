/**
 * Calculatrice.java					19 avr. 2015
 * IUT Info 1 2014/2015 groupe 3
 */

package iut.info1.projetS2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Créé une interface graphique pour l'application Calculatrice
 * @author Sébastien
 * @version 0.1
 */
@SuppressWarnings("serial")
public class Calculatrice extends JFrame {

    /** Elements de la calculatrice */
    public static final String[] elements_calculatrice = {
                                    "7", "8", "9", "4", "5", "6", "1", "2",
                                    "3", ".", "0", "=", "/", "*", "+", "-", "C",
                                    "(", ")", "x10^x", "^x", "V", "DEL", "-->", 
                                    "RAZ()", "INCR()", "MOY()", "VOIR()", "shift"
                                     };
    
    /** Container principal de l'application */
    private JPanel container = new JPanel();
    
    /** panel contenant l'écran de la calculatrice */
    JPanel pan_ecran = new JPanel();  
    
    /** panel contenant les boutons spéciaux de la calculatrice (x10^x ...) */
    JPanel pan_speciaux = new JPanel();
    
    /** panel contenant les boutons chiffres de la calculatrice */
    JPanel pan_chiffres = new JPanel();
    
    /** panel contenant les boutons opérateurs de la calculatrice */
    JPanel pan_operateurs = new JPanel();
    
    /** Ecran de la calculatrice */
    protected static JLabel ecran = new JLabel("0");
    
    /** boutons correspondant aux éléments de la calculatrice */
    JButton[] boutons = new JButton[elements_calculatrice.length];
    
    
    /**
     * Génération de l'interface
     */
    public Calculatrice() {
        super();
        
     // titre de la fenêtre
        setTitle("Calculatrice");
        
     // taille de la fenêtre
        setSize(900, 700);
        
     // fenêtre au centre de l'écran
        setLocationRelativeTo(null);
        
     // quitte l'application lorsque l'on clique sur la croix
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
     // fenêtre non redimensionable
        setResizable(false);
    
     // construit la fenêtre : les composants sont insérés
        build();
        
     // le container principal de l'application
        setContentPane(container);
        
     // la fenêtre sera visible
        setVisible(true);  
    }


    /**
     * Met en place tous les composants de la fenêtre : boutons, labels, ...
     * @return container le container principal de l'application
     */
    private JPanel build() {
   
/* Ajout des Panels qui contiendront les composants de l'interface */
        
        pan_ecran.setPreferredSize(new Dimension(700, 50));
        // l'écran est entouré d'une bordure
        pan_ecran.setBorder(BorderFactory.createLineBorder(Color.black));
        
   

        pan_speciaux.setPreferredSize(new Dimension(500, 200));
        
     // layout en grille de 3 lignes et 4 colonnes   
        GridLayout grille_speciaux = new GridLayout(3, 4);
        grille_speciaux.setHgap(10);    // espacement horizontal entre les boutons
        grille_speciaux.setVgap(10);    // espacement vertical entre les boutons
        
        pan_speciaux.setLayout(grille_speciaux);
        

        pan_chiffres.setPreferredSize(new Dimension(400, 400));
        
        GridLayout grille_chiffres = new GridLayout(4, 3);
        grille_chiffres.setHgap(8);
        grille_chiffres.setVgap(8);
        
        pan_chiffres.setLayout(grille_chiffres);
        
        
     

        pan_operateurs.setPreferredSize(new Dimension(100, 400));
        
        GridLayout grille_operateurs = new GridLayout(5, 1);
        grille_operateurs.setHgap(8);
        grille_operateurs.setVgap(8);
        
        pan_operateurs.setLayout(grille_operateurs);
        

     
/* Ajout des composants dans les paneaux */   
     // police de l'affichage de l'écran
        ecran.setFont(new Font("Verdana", Font.PLAIN, 40));
     // aligne le texte à droite, comme sur l'écran d'une calculatrice physique   
        ecran.setHorizontalAlignment(JLabel.RIGHT);
     // taille du Label = taille du panel  
        ecran.setPreferredSize(new Dimension(700, 50));
        
        pan_ecran.add(ecran);    
        
     // ajout des boutons dans les panneaux adéquats
        for (int i = 0 ; i < elements_calculatrice.length ; i++) {
            
           boutons[i] = new JButton(elements_calculatrice[i]); 
           
            if (i < 12) { // Ajout des boutons chiffres
                pan_chiffres.add(boutons[i]);
            } else if (i < 17) {        // ajout des boutons opérateurs
                pan_operateurs.add(boutons[i]);
            } else {            // ajout des boutons spéciaux
                pan_speciaux.add(boutons[i]);
            }    
            
            switch(i) {
            case 0: /* falls through */
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: boutons[i].addActionListener(new ActionChiffre());
                break;
            case 11: boutons[i].addActionListener(new ActionEgale());
                break;
            case 12: boutons[i].addActionListener(new ActionDivise());
                break;
            case 13: boutons[i].addActionListener(new ActionMultiplie());
                break;
            case 14: boutons[i].addActionListener(new ActionPlus());
                break;
            case 15: boutons[i].addActionListener(new ActionMoins());
                break;   
            case 16: boutons[i].addActionListener(new ActionReset());
            }
        }

/* Ajout des panneaux dans le container principal */   
        container.add(pan_ecran);
        container.add(pan_speciaux);
        container.add(pan_chiffres);
        container.add(pan_operateurs);
        return container;
    }
}
