package com.l3.gl.view;

import javax.swing.*;
import java.awt.*;
import com.l3.gl.Controller.Controller;

public class task {
    private JFrame frame;

    public task(Controller controller) {
        frame = new JFrame("Tasks");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Bienvenue dans l'interface des tâches");

        JButton btnQuit = new JButton("Quitter");
        btnQuit.addActionListener(e -> System.exit(0));

        frame.add(label);
        frame.add(btnQuit);
        frame.setVisible(true);
    }
}