package Labwork1;

import Gui.Basic.Jtextarea;
import Gui.Basic.MenuDemo;

import javax.swing.*;

public class Work2 extends JFrame {
    JMenuBar menubar;
    JMenu schoolmenu, coursemenu;
    JMenuItem niit,andela,hiit;
    JButton click;

    public Work2() {
        menubar = new JMenuBar();//object of our JMenuBar
        //creating object of Jmenu and assigning title.
        schoolmenu = new JMenu("School");
        coursemenu = new JMenu("Course");

        niit = new JMenuItem("Niit");
        andela = new JMenuItem("Andela");
        hiit = new JMenuItem("Hiit");

        schoolmenu.add(niit);
        schoolmenu.add(andela);
        schoolmenu.add(hiit);

        //adding JMenu to our JMenuBar.
        menubar.add(schoolmenu);
        menubar.add(coursemenu);

        JPanel panel = new JPanel();
        setTitle("Note");
        JTextArea area = new JTextArea(5,20);
//        area.setBounds(10,30, 200,200);
        setSize(300,300);
        setVisible(true);
        add(area);
        panel.add(area);


        setJMenuBar(menubar);
        setSize(300, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Work2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        click = new JButton("Click");
        JPanel JButton = new JPanel();
        panel.add(JButton);
        add(click);


    }
    public static void main(String[] args) {
        Work2 run = new Work2();
    }
}
