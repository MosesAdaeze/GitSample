package Gui.Basic;

import javax.swing.*;

public class JFrameDemo{
    JFrame frame;
    public JFrameDemo() {
        frame = new JFrame();
        frame.setVisible(true);
        frame.setTitle("Demo");
        frame.setSize(200, 200);
//Other Methods
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    public static void main(String[] args) {
        JFrameDemo run = new JFrameDemo();

    }

}
