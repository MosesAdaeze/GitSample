package Gui.Project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class JRadioButtonExample extends JFrame  {
    JFrame frame;
    JRadioButton catbotton;

    JRadioButtonExample() {
        frame = new JFrame();
        setDefaultLookAndFeelDecorated(true);
        setLocationRelativeTo(null);
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setTitle("Radio Button");
        JRadioButton birdButton = new JRadioButton("birdButton");
        birdButton.setMnemonic(KeyEvent.VK_B);
        birdButton.setActionCommand("birdString");
        birdButton.setSelected(true);

        JRadioButton catButton = new JRadioButton("catString");
        catButton.setMnemonic(KeyEvent.VK_C);
        catButton.setActionCommand("catString");

        JRadioButton dogButton = new JRadioButton("dogString");
        dogButton.setMnemonic(KeyEvent.VK_D);
        dogButton.setActionCommand("dogString");

        JRadioButton rabbitButton = new JRadioButton("rabbitString");
        rabbitButton.setMnemonic(KeyEvent.VK_R);
        rabbitButton.setActionCommand("rabbitString");

        JRadioButton pigButton = new JRadioButton("pigString");
        pigButton.setMnemonic(KeyEvent.VK_P);
        pigButton.setActionCommand("pigString");

        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        add(rabbitButton);
        add(birdButton);

        //Register a listener for the radio buttons.
//        birdButton.addActionListener(this);
//        catButton.addActionListener(this);
//        dogButton.addActionListener(this);
//        rabbitButton.addActionListener(this);
//        pigButton.addActionListener(this);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        .setIcon(new ImageIcon("C://Users/Kloss//Desktop//JbImage//image1.jpg"
//                + e.getActionCommand()
//                + ".gif"));
//    }

    public static void main(String[] args) {
        JRadioButtonExample run = new JRadioButtonExample();
    }
}
