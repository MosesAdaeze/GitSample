package AProject;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainJLabels {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("C:\\icon\\silent.png");
        Border border = BorderFactory.createLineBorder(Color.green);


        JLabel label = new JLabel();
        label.setText("Bro, do you even code");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.LEFT); //set text left,center of imageicon.
//        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(Color.black);
//        label.setFont(new Font("MV Boli",font.PLAIN,20));
//        label.setIconTextGap(-5);
        label.setBackground(Color.pink);
        label.setOpaque(true);
        label.setBorder(border);
//        label.setVerticalAlignment(JLabel.CENTER);
//        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(0,0,250,250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
//        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
//        frame.pack();
    }
}
