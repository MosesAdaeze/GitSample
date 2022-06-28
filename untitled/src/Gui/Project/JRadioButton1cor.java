package Gui.Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButton1cor extends JFrame implements ActionListener {
    JFrame f;
    JRadioButton r1, r2, r3, r4, r5;

    JRadioButton1cor() {
        f = new JFrame();
        r1 = new JRadioButton("Motorways");
        r2 = new JRadioButton("National Roads");
        r3 = new JRadioButton("Regional Roads");
        r4 = new JRadioButton("Urban Areas");
        r5 = new JRadioButton("Special Limits");
        Box box1 = Box.createVerticalBox();
//        JPanel box1 = new JPanel();
//        box1.setLayout(new BoxLayout(box1, BoxLayout.X_AXIS));

        box1.add(r1);
        box1.add(r2);
        box1.add(r3);
        box1.add(r4);
        box1.add(r5);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        bg.add(r5);

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        r4.addActionListener(this);
        r5.addActionListener(this);


//        JPanel panel = new JPanel(new GridLayout(1,5));
//        panel.add(r1);
//        panel.add(r2);
//        panel.add(r3);

        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.add(r4);
        f.add(r5);
        f.setTitle("Ireland Base");
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setLayout(new BoxLayout(f, BoxLayout.X_AXIS));
        f.add(box1);
    }

    public static void main(String[] args) {
        JRadioButton1cor run = new JRadioButton1cor();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (r1.isSelected()) {
            ImageIcon image = new ImageIcon("C://Users/Kloss//Desktop//JbImage//image1.png");
            JOptionPane.showMessageDialog(this,"Speed limit for Motorways","Limit Speed", JOptionPane.PLAIN_MESSAGE, image);
        }
        if (r2.isSelected()) {
            ImageIcon image = new ImageIcon("C://Users/Kloss//Desktop//JbImage//image2.png");
            JOptionPane.showMessageDialog(this,"Speed limit for National Roads","Limit Speed", JOptionPane.PLAIN_MESSAGE, image);
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
