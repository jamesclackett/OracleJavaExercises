package com.jimboidin.chapter16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class TFDemo implements ActionListener {
    JTextField jtf;
    JButton jbtnRev;
    JLabel jlabPrompt, jlabContents;

    TFDemo(){
        // Create a new JFrame Container.
        JFrame jfrm = new JFrame("Use a Text Field");

        //Specify FlowLayout for the layout manager
        jfrm.setLayout(new FlowLayout());

        // Give the frame an initial size
        jfrm.setSize(240, 120);

        // Terminate the program when the user closes the application
        jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Create a new text field
        jtf = new JTextField(10);

        // Set the action commands for the text field
        jtf.setActionCommand("MyTF");

        // Create the Reverse Button
        jbtnRev = new JButton("Reverse");

        // Add action listeners
        jtf.addActionListener(this);
        jbtnRev.addActionListener(this);

        // Create the labels
        jlabPrompt = new JLabel("Enter text: ");
        jlabContents = new JLabel("");

        // Add the components to the content pane
        jfrm.add(jlabPrompt);
        jfrm.add(jtf);
        jfrm.add(jbtnRev);
        jfrm.add(jlabContents);

        // Display the frame
        jfrm.setVisible(true);
    }

    // Handle action events
    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("Reverse")){
            // The Reverse button was pressed
            String orgStr = jtf.getText();
            String resStr = "";

            // Reverse the string in the text field
            for (int i = orgStr.length()-1; i >= 0; i--)
                resStr += orgStr.charAt(i);

            // Store the reversed string in the text field
            jtf.setText(resStr);
        }
        else
            // Enter was pressed while focus was in the text field
            jlabContents.setText("You pressed ENTER. Text is: " + jtf.getText());
    }

    public static void main(String[] args){
        // Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(TFDemo::new);
    }



}
