package Gui.Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonDemo extends JFrame implements ActionListener {
    JRadioButton rb1, rb2;
    JButton b;

    JRadioButtonDemo() {
        rb1 = new JRadioButton("Male");
        rb1.setBounds(100, 50, 100, 30);

        rb2 = new JRadioButton("Female");
        rb2.setBounds(100, 100, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        rb1.addActionListener(this);
        rb2.addActionListener(this);

        b = new JButton("click");
        b.setBounds(100, 150, 80, 30);
        b.addActionListener(this);
        add(rb1);
        add(rb2);
        add(b);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

//        JPanel panel = new JPanel();
//        ImageIcon icon = new ImageIcon("C://Users/Kloss//Desktop//JbImage//image1.jpg");
//        JLabel label = new JLabel(icon);
//        JPanel panel = new JPanel(new GridBagLayout());
//        panel.add(label);
//        panel.
    }

    public void actionPerformed(ActionEvent e) {
        if (rb1.isSelected()) {
            JOptionPane.showMessageDialog(this, "You are Male.");
//            JOptionPane.showMessageDialog(this, icon, "image icon", JOptionPane.INFORMATION_MESSAGE);
//            setSize(100,100);
//            JOptionPane.setDefaultLocale(JFrame.CENTER_ALIGNMENT);
        }
        if (rb2.isSelected()) {
            JOptionPane.showMessageDialog(this, "You are Female.");
        }
    }

    public static void main(String args[]) {
        new JRadioButtonDemo();
    }
}

    //In initialization code:
    //Create the radio buttons.

//    JFrame f;
//    JButton jb;
//    JPanel p;

//    JRadioButtonDemo(){
//        f = new JFrame();
//        JRadioButton r1 = new JRadioButton("Motorways");
//        JRadioButton r2 = new JRadioButton("National Roads");
//        JRadioButton r3 = new JRadioButton("Regional Roads");
//        JRadioButton r4 = new JRadioButton("Urban Areas");
//        JRadioButton r5 = new JRadioButton("Special Limits");
//
//        r1.addActionListener(this);
//        add(r1);

        //In initialization code:
        //Create the radio buttons.

//        jb = new JButton();
//        jb.setIcon(new ImageIcon("C://Users/Kloss//Desktop//JbImage//image1.jpg"));
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setVisible(true);
//        setSize(300,300);
//        setLayout(new FlowLayout());
//        validate();
//        add(jb);

//        p = new JPanel();
//        p.add(jb);


//        r1.setBounds(120, 50, 120, 30);
//        r2.setBounds(250, 50, 80, 30);
//        r3.setBounds(380,50,120,30);
//        r4.setBounds(500,50,80,30);
//        r5.setBounds(600,50,120,30);

//        ButtonGroup bg = new ButtonGroup();
//        bg.add(r1);
//        bg.add(r2);
//        bg.add(r3);
//        bg.add(r4);
//        bg.add(r5);
//
//        f.add(r1);
//        f.add(r2);
//        f.add(r3);
//        f.add(r4);
//        f.add(r5);
//        f.setSize(300,300);
//        f.setLayout(null);
//        f.setVisible(true);
//        f.setLayout(new FlowLayout());
//    }
//    public static void main(String[] args) {
//        JRadioButtonDemo run = new JRadioButtonDemo();
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
////        f.setIcon(new ImageIcon("C://Users/Kloss//Desktop//JbImage//image1.jpg"));
//    }
//}
