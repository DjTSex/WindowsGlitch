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

public class WindowsGlitch extends JFrame{
    //Variables
    private static final int APPLICATION_WIDTH  = 800;                          // Width, in pixels FIXED FOR NOW
    private static final int APPLICATION_HEIGHT = 600;                          // Height, in pixels FIXED FOR NOW
    private JFrame application = new JFrame();
    private JPanel defaultPanel = new JPanel();
    private JButton uploadBackground = new JButton("Upload Background Image");
    
    public WindowsGlitch() {
        
        // Add to panel to jframe
        defaultPanel.add(uploadBackground);
        application.add(defaultPanel);
        
        //APPLICATION PROPERTIES
        
        //Exit on close
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
    
    public static void main(String[] args) { 
        
        new WindowsGlitch();
        
    }
}
