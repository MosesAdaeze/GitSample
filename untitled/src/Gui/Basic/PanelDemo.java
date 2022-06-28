package Gui.Basic;

import javax.swing.*;

public class PanelDemo extends JFrame {
    JPanel panel;

    public PanelDemo() {
        panel = new JPanel();
        setVisible(true);
        setTitle("The frame");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
    }

    public static void main(String[] args) {
        PanelDemo run = new PanelDemo();

    }
}
