package Gui.Basic;

import javax.swing.*;

public class Jtextarea extends JFrame {
    Jtextarea() {
    JFrame f= new JFrame();

    f.setTitle("Note");
    JTextArea area = new JTextArea("Write Text");
    area.setBounds(10,30, 200,200);
    f.setSize(300,300);
    f.setLayout(null);
    f.setVisible(true);
    f.add(area);
}
    public static void main(String args[])
    {
        new Jtextarea();
    }
}
