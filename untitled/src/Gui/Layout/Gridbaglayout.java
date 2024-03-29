package Gui.Layout;

import javax.swing.*;
import java.awt.*;

public class Gridbaglayout extends JFrame {
    JButton red, blue, green;

    public Gridbaglayout(){

        red = new JButton("Red");
        blue = new JButton("Blue");
        green = new JButton("Green");

        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("GridBagLayout");
        setLocationRelativeTo(null);

        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        add(red, c);

        c.gridx = 1;
        c.gridy = 1;
        add(blue);

        c.gridx = 2;
        c.gridy = 2;
        add(green, c);
    }

    public static void main(String[] args) {
        Gridbaglayout run = new Gridbaglayout();
    }
}
