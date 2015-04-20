/**
 * ActionChiffre.java					20 avr. 2015
 * IUT Info 1 2014/2015 groupe 3
 */
package iut.info1.projetS2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * Classe d'action d'interface graphique : affiche le chiffre correspondant
 * au bouton sur l'écran de contrôle
 * @author Sébastien
 * @version 1.0
 */
public class ActionChiffre implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            // Affiche le chiffre correspondant dans le label écran de la calculatrice
            String str = ((JButton)e.getSource()).getText();
            if(!Calculatrice.ecran.getText().equals("0"))
                str = Calculatrice.ecran.getText() + str;
            Calculatrice.ecran.setText(str);
        }
}
