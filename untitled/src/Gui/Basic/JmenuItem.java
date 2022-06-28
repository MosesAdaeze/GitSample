package Gui.Basic;

import javax.swing.*;
import java.awt.*;

public class JmenuItem extends JFrame {
    JMenuBar menuBar;
    JMenu filemenu, editmenu, exitmenu;
    JmenuItem openitem, newitem, copyitem, pasteitem, closeitem;

    public JmenuItem(){
        menuBar = new JMenuBar();

        filemenu = new JMenu ("File");
        editmenu = new JMenu ("Edit");
        exitmenu = new JMenu ("Exit");

//        newitem = new JmenuItem("New");
//        openitem = new JmenuItem("Open");
//        copyitem = new JmenuItem("Close");
//        pasteitem = new JmenuItem("Paste");
//        closeitem = new JmenuItem("Close");

        filemenu.add(newitem);
        filemenu.add(openitem);
        filemenu.add(copyitem);
        filemenu.add(pasteitem);
        filemenu.add(closeitem);


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
        JMenuItem run = new JMenuItem();
    }
}
