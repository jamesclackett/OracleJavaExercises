package com.jimboidin.chapter16;

// Demonstrate a simple JList

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class ListDemo implements ListSelectionListener {
    JList<String> jlst;
    JLabel jlab;
    JScrollPane jscrlp;

    // Create an array of names
    String[] names = { "Sherry", "Jon", "Rachel", "Sasha",
                        "Josselyn", "Randy", "Tom", "Mary",
                        "Ken", "Andrew", "Matt", "Todd"};


    ListDemo() {

        JFrame jfrm = new JFrame("JList Demo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(200,160);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlst = new JList<>(names);
        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jscrlp = new JScrollPane(jlst);
        jscrlp.setPreferredSize(new Dimension(120,90));

        jlab = new JLabel("Please choose a name");

        jlst.addListSelectionListener(this);

        jfrm.add(jscrlp);
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }

    @Override
    public void valueChanged(ListSelectionEvent le) {
        // Get the index of the changed item
        int idx = jlst.getSelectedIndex();
        // Display selection, if item was selected
        if (idx != -1)
            jlab.setText("Current selection: " + names[idx]);
        else // Otherwise re-prompt
            jlab.setText("Please choose a name");
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(ListDemo::new);
    }
}
