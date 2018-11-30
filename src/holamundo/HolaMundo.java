/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.awt.Point;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author T-101
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame ventanita = new JFrame("¡VIRUS!");
        ventanita.setSize(300,300);
        ventanita.setVisible(true);
        ventanita.setLocationRelativeTo(null);
        Point punto=ventanita.getLocationOnScreen();
        Random x = new Random(punto.x);
        Random y = new Random(punto.y);
        int dx = x.nextInt()*2;
        int dy = y.nextInt()*2;
        ventanita.setLocation(dx, dy);
        
    }
    
}
