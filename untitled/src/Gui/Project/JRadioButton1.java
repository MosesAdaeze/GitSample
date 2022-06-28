package Gui.Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButton1 extends JFrame implements ActionListener {
    JPanel panel;
    JFrame f;
    JRadioButton r1, r2, r3, r4, r5;
    //identify OBJECT
    JRadioButton1() {
        //OBJECT OF OUR JFRAME.
        f = new JFrame();

        //CREATING OBJECT OF JRADIOBUTTON AND ASSIGNMENT TITLE.
        r1 = new JRadioButton("Motorways");
        r1.setBounds(40,60,200,50);

        r2 = new JRadioButton("National Roads");
        r2.setBounds(40,100,200,50);

        r3 = new JRadioButton("Regional Roads");
        r3.setBounds(40,140,200,50);

        r4 = new JRadioButton("Urban Areas");
        r4.setBounds(40, 180, 200, 50);

        r5 = new JRadioButton("Special Limits");
        r5.setBounds(40,220,200,50);

        //ADDING OBJECT TO PANEL.
        panel = new JPanel();
        panel.add(r1);
        panel.add(r2);
        panel.add(r3);
        panel.add(r4);
        panel.add(r5);
        add(panel);

        ButtonGroup bg = new ButtonGroup();  //CREATING A GROUP BUTTON GROUP FOR OUR JRADIOBUTTON.

        //THEN ADDING OUR JRADIOBUTTON TO THE BUTTON GROUP.
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        bg.add(r5);

        //ADDING ACTIONLISTENER TO "THIS" OUR JRADIOBUTTON;r1 e.g
        r1.addActionListener(this);  //THIS: REFERS TO the current object in a method or constructor.
        r2.addActionListener(this);  //or CURRENT OBJECT(r2).
        r3.addActionListener(this);
        r4.addActionListener(this);
        r5.addActionListener(this);
        //OUR JFRAME, ADDING OUR JRADIOBUTTON(r1) TO JFRAME.
        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.add(r4);
        f.add(r5);
        f.add(panel);

        //GIVING OUR JFRAME ITS PROPERTIES.
        f.setTitle("Ireland Base");
        f.setSize(400, 500);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // TO RUN OUR JRADIOBUTTON MAIN.
        JRadioButton1 run = new JRadioButton1();
    }

    @Override //feature that allows a subclass or child class to,
              //provide a specific implementation of a method.
    public void actionPerformed(ActionEvent e) {
        //IMPLEMENTING METHODS.
        if (r1.isSelected()) {
            //GIVING VARIABLE NAME (IMAGE) TO IMAGEICON.
            ImageIcon image = new ImageIcon("C://Users/Kloss//Desktop//JbImage//image1.png");
            JOptionPane.showMessageDialog(this,"Speed limit for Motorways","Limit Speed", JOptionPane.PLAIN_MESSAGE, image);
                                                        //component, object message, string title, variable name(image).
        }
        if (r2.isSelected()) {
            ImageIcon image = new ImageIcon("C://Users/Kloss//Desktop//JbImage//image2.png");
            JOptionPane.showMessageDialog(this,"Speed limit for National Roads","Limit Speed", JOptionPane.PLAIN_MESSAGE, image);
                                                        //component, object message, string title, variable name(image).
        }
        if (r3.isSelected()) {
            ImageIcon image = new ImageIcon("C://Users/Kloss//Desktop//JbImage//image3.png");
            JOptionPane.showMessageDialog(this,"Speed limit for Regional Roads","Limit Speed", JOptionPane.PLAIN_MESSAGE, image);
        }
        if (r4.isSelected()) {
            ImageIcon image = new ImageIcon("C://Users/Kloss//Desktop//JbImage//image4.png");
            JOptionPane.showMessageDialog(this,"Speed limit for Urban Areas","Limit Speed", JOptionPane.PLAIN_MESSAGE, image);
        }
        if (r5.isSelected()) {
            ImageIcon image = new ImageIcon("C://Users/Kloss//Desktop//JbImage//image5.png");
//            JOptionPane.showMessageDialog(this, image, "Limit Speed", JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(this,"Speed limit for Special Limits","Limit Speed", JOptionPane.PLAIN_MESSAGE, image);
        }
    }
}
