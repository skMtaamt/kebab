/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kebab;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author porretta.christian
 */
public class kebabbaro {
    
    public boolean kebab;
    
    public synchronized boolean sforna(){
        kebab = false;
        try {
            Thread.sleep(5000);
            kebab = true;
        }catch (InterruptedException ex) {
         }
        return kebab;
    }
}
