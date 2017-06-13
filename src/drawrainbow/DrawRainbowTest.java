
package drawrainbow;

import javax.swing.JFrame;

/**
 *
 * @author thiagomurphy
 */

public class DrawRainbowTest {

    
    public static void main(String[] args) {
        
        //create an object of DrawRainbow class
        DrawRainbow panel = new DrawRainbow();
        
        JFrame app = new JFrame();
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(400, 250);
        app.setVisible(true);
        
    }//end main
    
}//end class DrawRainbowTest
