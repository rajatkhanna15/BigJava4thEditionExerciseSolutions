/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigjavachapter2exerciseanswers;

import javax.swing.JFrame;

/**
 * TwoSquareViewer for exercise P2.16
 *
 * @author ChrisBerryman
 */
public class P2_16 {
    
    /**
     * Initialises and displays the JFrame.
     */
    public void createAndShowGUI() {

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Two Square Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TwoSquareComponent component = new TwoSquareComponent();
        frame.add(component);
        frame.setVisible(true);

    }
    
}
