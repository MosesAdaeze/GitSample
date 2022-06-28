package Gui.Basic;

import javax.swing.*;

public class TabbedPaneDemo extends JFrame {
    JTabbedPane tabbedPane;

    public TabbedPaneDemo(){
        tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
        tabbedPane.add("Tab1",null);
        tabbedPane.add("Tab2",null);
        tabbedPane.add("Tab3",null);
        tabbedPane.setSize(150,150);

        setTitle("TabbedPane Demo");
        setSize(300,300);
        setVisible(true);
        add(tabbedPane);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        TabbedPaneDemo run = new TabbedPaneDemo();
    }
}
