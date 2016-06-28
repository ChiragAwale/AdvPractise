/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.gameEngine.userInterface;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author chira
 */
public class UserInterface extends JFrame {

    JTextArea textArea;
    JScrollPane scroll;
    JButton forward;
    JButton back;
    JButton left;
    JButton right;

    public UserInterface() {
        prepareGUI();
    }

    public void prepareGUI() {

        setSize(500, 500);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setTitle("Game");

        textArea = new JTextArea(15, 15);
        scroll = new JScrollPane(textArea);
        add(scroll);

        forward = new JButton("Forward");
        back = new JButton("Back");
        left = new JButton("Left");
        right = new JButton("Right");
        add(forward);
        add(back);
        add(left);
        add(right);

        setVisible(true);

    }

}
