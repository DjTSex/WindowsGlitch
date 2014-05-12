/*
 * Tim Sexton
 * Windows Glitch Application
 * Purpose: Create an application that can recreate an old windows visual glitch
 * for artistic purposes.
 */
package windowsglitch;

//Import Statements

import java.awt.event.*;
import java.io.*; 
import javax.swing.*;

public class WindowsGlitch extends JFrame implements ActionListener{
    //Variables
    private static final int APPLICATION_WIDTH  = 800;                          // Width, in pixels FIXED FOR NOW
    private static final int APPLICATION_HEIGHT = 600;                          // Height, in pixels FIXED FOR NOW
    private JFrame application = new JFrame();
    private JPanel defaultPanel = new JPanel();
    private JButton uploadBackground = new JButton("Upload Background Image");
    private JFileChooser fc;
    private JTextArea log;
    static private String newline = "\n";
    
    
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
                log.append("Attaching file: " + file.getName()
                           + "." + newline);
            } else {
                log.append("Attachment cancelled by user." + newline);
            }
            log.setCaretPosition(log.getDocument().getLength());
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
        

        
       
    }
    
    public static void main(String[] args) { 
        
        new WindowsGlitch();
        
    }
}
