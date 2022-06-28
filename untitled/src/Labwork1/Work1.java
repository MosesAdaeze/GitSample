package Labwork1;

import Gui.Basic.Jtextarea;
import Gui.Basic.Jtextfield;

import javax.swing.*;
import java.awt.*;

public class Work1 extends JFrame{
    Work1()
    {
//        work = new Work1();

        setLayout(new FlowLayout());
        //First identify label and textfield.
        //lblName is the label object & txt is the textfield object.
        JLabel lblName = new JLabel("Username: ");
        JTextField txt = new JTextField(15);
        //identify second label and textfield.
        //same.
        JLabel lblName1 = new JLabel("Password :");
        JTextField txtName = new JTextField(15);
//        JPanel = new Panel();
        //adding it--to show.
        add(lblName);
        add(txt);
        add(lblName1);
        add(txtName);

    }
//framing.
    public static void main(String args[]){
        //set frame.
        Work1 frame = new Work1();
        frame.setTitle("User Details");
        frame.setBounds(200,250,300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

