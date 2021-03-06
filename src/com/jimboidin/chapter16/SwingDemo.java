package com.jimboidin.chapter16;

import javax.swing.*;
import java.awt.*;

// A simple Swing program

public class SwingDemo {

    SwingDemo() {

        // Create a new JFrame container.
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Give the frame an initial size
        jfrm.setSize(275, 100);

        // Terminate the program when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text-based label
        JLabel jlab = new JLabel(" GUI programming with Swing.");

        // Add a label to the content pane
        jfrm.add(jlab, BorderLayout.EAST);

        // Display the frame
        jfrm.setVisible(true);
    }

    public static void main(String[] args){
        // Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(SwingDemo::new);
    }
}
