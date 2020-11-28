/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlancaNievesMonitor;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carla Nuñez
 */

  public class BlancaN implements Runnable {

    protected Mesa miMesa;

    public BlancaN (Mesa m) {
        miMesa = m;
    }

    public void run() {
        while (true) {
            try {

                miMesa.pasear();
                miMesa.servirComida();
            } catch (InterruptedException ex) {
                Logger.getLogger(BlancaN.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
  

