package Gui.Basic;

import javax.swing.*;
import java.awt.*;

public class Jlabel extends JFrame {
    Jlabel() {

        setLayout(new FlowLayout());
        JLabel lblName = new JLabel("Jlabel.com");
        lblName.setHorizontalAlignment(lblName.CENTER);
        add(lblName);
    }

    public static void main(String args[])
    {
        Jlabel frame = new Jlabel();
        frame.setTitle("Jlabel");
        frame.setBounds(200,250,300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }






//    public Jlabel() {
//        label = new Jlabel();
//        Jlabel label = new Jlabel("This is a basic label");

//
//        label.setTitle("Label");
//        label.setSize(400, 400);
//        label.setBounds(50, 50, 130, 30);
//        label.setLayout(null);
//        label.setVisible(true);
//        label.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        label.add(label);
//    }
////    public static void main(String[] args) {
//       Jlabel run= new Jlabel();
//    }
}
