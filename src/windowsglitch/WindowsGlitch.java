/*
 * Tim Sexton
 * Windows Glitch Application
 * Purpose: Create an application that can recreate an old windows visual glitch
 * for artistic purposes.
 */
package windowsglitch;

//Import Statements

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.util.List;
import java.util.ArrayList; 
import javax.swing.JLabel;
import javax.swing.JButton;

public class WindowsGlitch {
    //Variables
    private static final int APPLICATION_WIDTH  = 800;      // Width, in pixels
    private static final int APPLICATION_HEIGHT = 600;      // Height, in pixels
    
    public static void main(String[] args) {
        
        // Create a new application
        JFrame application = new JFrame();
        
        // Set default close operation for the application
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set application size
        application.setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
        
        // Prevent resizing
        application.setResizable(false);
        
        // Set application title
        application.setTitle("Trailing Windows Glitch Creator");
        
        // Make application visible
        application.setVisible(true);
        
    }
}
