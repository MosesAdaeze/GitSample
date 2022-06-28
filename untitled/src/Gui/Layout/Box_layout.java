package Gui.Layout;

import javax.swing.*;
import java.awt.*;

public class Box_layout extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(10,10,100,100);
        f.setTitle("BoxLayout");
        f.setSize(200,200);
        Container container = f.getContentPane();

        BoxLayout layout = new BoxLayout(container,BoxLayout.Y_AXIS);
        container.setLayout(layout);

        JButton botton = new JButton();
        JButton one = new JButton("One");
        JButton two = new JButton("Two");
        JButton three = new JButton("Three");
        JButton four = new JButton("Four");

        container.add(one);
        container.add(two);
        container.add(three);
        container.add(four);

//        container.add(JButton);

    }
}
