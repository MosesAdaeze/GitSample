package Gui.Basic;

import javax.swing.*;
import java.awt.*;

public class Jtextfield extends JFrame {
        Jtextfield()
        {
            setLayout(new FlowLayout());
            JLabel lblRollno = new JLabel("Text: ");
            JTextField txtRollno = new JTextField("Enter",15);

            JLabel lblName = new JLabel("Name :");
            JLabel lbl = new JLabel("Numbers : ");
            JTextField txtName = new JTextField("Mr Thakur",15);

            add(lblRollno);
            add(txtRollno);
            add(lbl);
            add(lblName);
            add(txtName);
        }



        public static void main(String args[])
        {
            Jtextfield frame = new Jtextfield();
            frame.setTitle("Jtextfield");
            frame.setBounds(200,250,300,300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setVisible(true);
        }
    }

//    Jtextfield() {
//        JFrame tf = new JFrame();
//
//        tf.setTitle("TField");
//        tf.setVisible(true);
//        tf.setLayout(new FlowLayout());
//        tf.setSize(200, 200);
//
//        JTextField textField = new JTextField(20);
//
////        textField.setBounds(5,10,50,100);
////        textField.setText("This is a text");
////        textField.setColumns(20);
//
//        add(textField);
//    }
//    public static void main(String args[])
//    {
//        new Jtextfield();
//    }
//}
