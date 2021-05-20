package com.jimboidin.chapter16;

// Demonstrate a push button and handle action events

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo implements ActionListener {
    JLabel jlab;

    ButtonDemo(){
        // create a new JFrame container
        JFrame jfrm = new JFrame("A Button example");

        // Specify a flow layout for the layout manager
        jfrm.setLayout(new FlowLayout());

        // Give frame an initial size
        jfrm.setSize(220,90);

        // Terminate the program when user closes the application
        jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Make two buttons
        JButton jbtnUp = new JButton("Up");
        JButton jbtnDown = new JButton("Down");

        // Add action listeners
        jbtnUp.addActionListener(this);
        jbtnDown.addActionListener(this);

        // Add the buttons to the content pane
        jfrm.add(jbtnUp);
        jfrm.add(jbtnDown);

        // Create a label
        jlab = new JLabel("Press a button");

        // Add the label to the frame
        jfrm.add(jlab);

        // Display the frame
        jfrm.setVisible(true);
    }

    // Handle button events
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Up"))
            jlab.setText("You pressed up");
        else
            jlab.setText("You pressed down");
    }

    public static void main(String[] args){
        // Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(ButtonDemo::new);
    }
}
