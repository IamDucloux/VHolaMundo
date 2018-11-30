/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.awt.Point;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(10);
                        JFrame ventanita = new JFrame("¡VIRUS!");
                        ventanita.setSize(300, 300);
                        ventanita.setVisible(true);
                        ventanita.setLocationRelativeTo(null);
                        Point p = ventanita.getLocationOnScreen();
                        int largo = p.x * 2;
                        int ancho = p.y * 2;
                        Random r1 = new Random();
                        Random r2 = new Random();
                        int dx = r1.nextInt(largo);
                        int dy = r2.nextInt(ancho);
                        ventanita.setLocation(dx, dy);
                    } catch (InterruptedException ex) {

                    }

                }
            }
        }
        );
        t1.start();
    }

}
