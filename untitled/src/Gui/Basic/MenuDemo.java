package Gui.Basic;

import javax.swing.*;

public class MenuDemo extends JFrame {
    JMenuBar menuBar;
    JMenu filemenu, editmenu, exitmenu;


    public MenuDemo(){
        menuBar = new JMenuBar();//object of our JMenuBar

        //creating object of Jmenu and assigning title.
        filemenu = new JMenu ("File");
        editmenu = new JMenu ("Edit");
        exitmenu = new JMenu ("Exit");

        //adding JMenu to our JMenuBar.
        menuBar.add(filemenu);
        menuBar.add(editmenu);
        menuBar.add(exitmenu);

        setJMenuBar(menuBar);

        setSize(300,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("JMenuBar Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MenuDemo run = new MenuDemo();
    }
}
