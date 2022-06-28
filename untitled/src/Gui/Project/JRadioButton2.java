package Gui.Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButton2 extends JFrame {
    JPanel panel, panel02;
    JRadioButton motorways, nationalRoad, regionalRoad, urbanAreas, specialLimits;
    ButtonGroup bg;
    ImageIcon icon30, icon50, icon80, icon100, icon120;
    JLabel piclabel;

    public JRadioButton2() {
        panel = new JPanel();
        panel02 = new JPanel();
        motorways = new JRadioButton("Motorways");
        nationalRoad = new JRadioButton("National Roads");
        regionalRoad = new JRadioButton("Regional Roads");
        urbanAreas = new JRadioButton("Urban Areas");
        specialLimits = new JRadioButton("Special Limits");

        icon120 = new ImageIcon("C://Users/Kloss//Desktop//JbImage//image1.png");
        icon100 = new ImageIcon("C://Users/Kloss//Desktop//JbImage//image2.png");
        icon80 = new ImageIcon("C://Users/Kloss//Desktop//JbImage//image3.png");
        icon50 = new ImageIcon("C://Users/Kloss//Desktop//JbImage//image4.png");
        icon30 = new ImageIcon("C://Users/Kloss//Desktop//JbImage//image5.png");

        piclabel = new JLabel();

        bg = new ButtonGroup();
        bg.add(motorways);
        bg.add(nationalRoad);
        bg.add(regionalRoad);
        bg.add(urbanAreas);
        bg.add(specialLimits);

        panel.add(motorways);
        panel.add(nationalRoad);
        panel.add(regionalRoad);
        panel.add(urbanAreas);
        panel.add(specialLimits);
        panel02.add(piclabel);
        specialLimits.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                piclabel.setIcon(icon30);}
        });
        urbanAreas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {piclabel.setIcon(icon50);}
        });
        regionalRoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {piclabel.setIcon(icon80);}
        });
        nationalRoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {piclabel.setIcon(icon100);}
        });
        motorways.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {piclabel.setIcon(icon120);}
        });

        setTitle("Road Safety ");
        setVisible(true);
        setDefaultCloseOperation(3);
        setSize(300, 200);
        panel.setBackground(Color.lightGray);
        add(panel);
        add(panel02, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        JRadioButton2 run = new JRadioButton2();
    }
}

