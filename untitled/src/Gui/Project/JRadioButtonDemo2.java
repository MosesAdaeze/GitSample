package Gui.Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonDemo2 extends JFrame {
    JPanel c1, c2;

    JRadioButtonDemo2() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(c1);
        panel.add(c2);
        c1.setAlignmentX(Component.LEFT_ALIGNMENT);
        c2.setAlignmentX(Component.LEFT_ALIGNMENT);

        panel.setSize(200,200);
//        setDefaultCloseOperation(e);
    }

    public static void main(String[] args) {
        JRadioButtonDemo2 run = new JRadioButtonDemo2();
    }
}


