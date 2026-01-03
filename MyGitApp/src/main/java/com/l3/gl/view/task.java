package com.l3.gl.view;

import javax.swing.*;
import java.awt.*;
import com.l3.gl.Controller;

public class task {
    private JFrame frame;

    public task(Controller Controller) {
        frame = new JFrame("Login");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton btnConnect = new JButton("Connecter");
        JButton btnQuit = new JButton("Quitter");

        btnConnect.addActionListener(e -> {
            frame.dispose();
            Controller.showTaskUI();
        });

        btnQuit.addActionListener(e -> System.exit(0));

        frame.add(btnConnect);
        frame.add(btnQuit);
        frame.setVisible(true);
    }
}
