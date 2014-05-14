/*
 * Tim Sexton
 * Windows Glitch Application
 * Purpose: Create an application that can recreate an old windows visual glitch
 * for artistic purposes.
 */
package windowsglitch;

//Import Statements

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*; 

public class WindowsGlitch extends JPanel implements ActionListener{
    //Variables
    private static final int APPLICATION_WIDTH  = 800;                          // Width, in pixels FIXED FOR NOW
    private static final int APPLICATION_HEIGHT = 600;                          // Height, in pixels FIXED FOR NOW
    private JFrame application = new JFrame();
    private JPanel defaultPanel = new JPanel();
    private JButton uploadBackground = new JButton("Upload Background Image");
    private JFileChooser fc;
    private JTextArea log;
    static private String newline = "\n";
    private String backgroundPath = "";
    private boolean retrievedBackground = false;
    private Image bgImage = null;
    
    
     // Handle button events
    @Override
    public void actionPerformed(ActionEvent e) {
        //Set up the file chooser.
        if (fc == null) {
            fc = new JFileChooser();
        }
        
        if (e.getSource() == uploadBackground) {
            // Open File Browser Dialog Box
            int returnVal = fc.showOpenDialog(uploadBackground);
            
            // Handle Opening File
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                
                //We want to get an image
                
                        
                try {  
                    bgImage = ImageIO.read(file);        
                } catch (IOException f) {}
                
                validate();
                repaint();
                
            } 
        }
        
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Draw the background image if it's available
        if (retrievedBackground) {
            g.drawImage(bgImage, 0, 0, APPLICATION_WIDTH, APPLICATION_HEIGHT, this);
        }
        
    }
    
    public WindowsGlitch() {
        
        // Add to panel to jframe
        defaultPanel.add(uploadBackground);
        application.add(defaultPanel);
        
        // Add action listener for upload Background
        uploadBackground.addActionListener(this);
        
        //APPLICATION PROPERTIES
        
        //Exit on close
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set application size
        application.setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
        
        // Prevent resizing
        application.setResizable(false);
        
        // Set application title
        application.setTitle("Trailing Windows Glitch Simulator");
        
        // Make application visible
        application.setVisible(true);
        
        validate();
        repaint();
        
       
    }
    
    public static void main(String[] args) { 
        
        new WindowsGlitch();
        
    }
}
