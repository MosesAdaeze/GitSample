package ALoginPage;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contact_Doctor extends JFrame {

    private JFrame f;
    ImageIcon icon1;

    Contact_Doctor() {
        // FONTS.
        Font fo = new Font("Perpetua Titling MT", Font.BOLD, 15);
        Font font = new Font("Perpetua Titling MT", Font.BOLD, 30);
        Font fon = new Font("Georgia", Font.BOLD, 20);
        Font h = new Font("Georgia", Font.PLAIN, 20);
        Font wfont = new Font("Perpetua Titling MT", Font.PLAIN, 15);
        Font labfont = new Font("Serif", Font.PLAIN, 15);
        Color lor = new Color(135,206,235);

        icon1 = new ImageIcon("C:\\icon\\medicine (10).png");
        setIconImage(icon1.getImage());


        Border br = BorderFactory.createLineBorder(lor); // design border.
        Border border = BorderFactory.createLineBorder(Color.WHITE);
        Container co = new Container();
        // Panels.
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();

        panel.setLayout(null); // Set panels to null.
        panel2.setLayout(null);

        // Panels properties.
        panel.setBackground(Color.WHITE);
        panel.setBounds(0,0,250,720);
        //Panel 2..
        panel2.setBackground(lor);
        panel2.setBounds(250,0,780,720);

        co.add(panel);
        co.add(panel2);

        panel2.setBorder(br);

//        Add labels.
        JLabel label = new JLabel(icon1); //Insert icon into label. (hospital logo).
        label.setBounds(5,0,100,70);
        panel.add(label); //Add label to panel.

        JLabel label2 = new JLabel("NIIT Clinic");
        label2.setBounds(90,15,300,50);
        label2.setFont(fo);
        label2.setForeground(lor);
        panel.add(label2);

        // Icons on buttons.
        ImageIcon home = new ImageIcon("C:\\icon\\home.png");
        setIconImage(home.getImage());

        ImageIcon bp = new ImageIcon("C:\\icon\\add2.png");
        setIconImage(bp.getImage());

        ImageIcon p = new ImageIcon("C:\\icon\\patient (2).png");
        setIconImage(p.getImage());

        ImageIcon s = new ImageIcon("C:\\icon\\customer-support.png");
        setIconImage(s.getImage());

        ImageIcon l = new ImageIcon("C:\\icon\\logout (1).png");
        setIconImage(l.getImage());

        JButton bt = new JButton(home);
        bt.setText(" Home                          ");
        bt.setFocusPainted(false);
        bt.setBounds(10,130,230,45);
        bt.setBackground(Color.WHITE);
        bt.setFont(fo);
        bt.setBorder(br);
        panel.add(bt);

        JButton bt1 = new JButton(bp);
        bt1.setText(" Book Appointment  ");
        bt1.setBounds(10,195,230,45);
        bt1.setBackground(Color.WHITE);
        bt1.setFont(fo);
        bt1.setBorder(br);
        panel.add(bt1);

        JButton bt2 = new JButton(p);
        bt2.setText(" Contact Doctor      ");
        bt2.setBounds(10,260,230,45);
        bt2.setBackground(Color.WHITE);
        bt2.setFocusPainted(false);
        bt2.setFont(fo);
        bt2.setBorder(br);
        panel.add(bt2);

        JButton bt3 = new JButton(s);
        bt3.setText(" services                     ");
        bt3.setBounds(10,325,230,45);
        bt3.setBackground(Color.WHITE);
        bt3.setFont(fo);
        bt3.setBorder(br);
        panel.add(bt3);

        JButton bt4 = new JButton(l);
        bt4.setText(" Log Out                     ");
        bt4.setBounds(10,390,230,45);
        bt4.setBackground(Color.WHITE);
        bt4.setContentAreaFilled(false);
        bt4.setFocusPainted(false);
        bt4.setBorderPainted(false);
        bt4.setFont(fo);
        bt4.setBorder(br);
        panel.add(bt4);

        JLabel header = new JLabel("Contact a Doctor");
        header.setBounds(200,5,600,50);
        header.setFont(font);
        header.setForeground(Color.WHITE);
        panel2.add(header);

        JLabel header2 = new JLabel("<html>Get 24x7 access to quality care from anywhere through interactive " +
                "mobile phone calls which,<br> gives you immediate access to our highly trained and experienced " +
                "doctors, who will assist you with<br> your medical and wellness needs.");
        header2.setBounds(80,20,750,100);
        header2.setFont(labfont);
        header2.setForeground(Color.WHITE);
        panel2.add(header2);

        JLabel q = new JLabel("Why do you want to contact a doctor?");
        q.setBounds(40,120,600,20);
        q.setFont(fon);
        q.setForeground(Color.WHITE);
        panel2.add(q);

        JRadioButton q1 = new JRadioButton("Wants a family doctor ?");
        q1.setBounds(40,160,400,22);
        q1.setFont(wfont);
        q1.setForeground(Color.BLACK);
        panel2.add(q1);

        JRadioButton q2 = new JRadioButton("Ask related health questions ?");
        q2.setBounds(40,200,400,22);
        q2.setFont(wfont);
        q2.setForeground(Color.BLACK);
        panel2.add(q2);

        JRadioButton q3 = new JRadioButton("Medical Routine ?");
        q3.setBounds(40,240,400,22);
        q3.setFont(wfont);
        q3.setForeground(Color.BLACK);
        panel2.add(q3);

        JRadioButton q4 = new JRadioButton("Others.");
        q4.setBounds(40,280,400,22);
        q4.setFont(wfont);
        q4.setForeground(Color.BLACK);
        panel2.add(q4);

        // Button Group.
        ButtonGroup bg = new ButtonGroup();

        bg.add(q1);
        bg.add(q2);
        bg.add(q3);
        bg.add(q4);
        // NEXT.

        JLabel labe = new JLabel("Insert your phone number below.");
        labe.setBounds(40,300,600,50);
        labe.setFont(fon);
        labe.setForeground(Color.WHITE);
        panel2.add(labe);

        JLabel note = new JLabel("! please ensure the phone number you enter is accurate");
        note.setBounds(40,320,600,50);
        note.setFont(labfont);
        note.setForeground(Color.WHITE);
        panel2.add(note);

        JTextField num = new JTextField(40);
        num.setBounds(40,360, 300,30);
        num.setBackground(Color.white);
        num.setBorder(br);
        panel2.add(num);

        JButton submit = new JButton("Submit");
        submit.setBounds(40,400,120,30);
        submit.setFont(fon);
        submit.setForeground(Color.WHITE);
        submit.setBackground(lor);
        submit.setBorder(border);
        submit.setFont(fon);
        panel2.add(submit);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"<html>This will take few minute,<br> " +
                        "Doctor will be in touch with you shortly.", "Note",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // CENTERS
        JLabel header3 = new JLabel("Niit clinic centers");
        header3.setBounds(200,430,600,50);
        header3.setFont(font);
        header3.setForeground(Color.WHITE);
        panel2.add(header3);

        JLabel header4 = new JLabel("Visit any centers nearer to your area in below lists.");
        header4.setBounds(230,450,600,50);
        header4.setFont(labfont);
        header4.setForeground(Color.WHITE);
        panel2.add(header4);

        // images
        ImageIcon ask1 = new ImageIcon("C:\\icon\\asterisk.png");
        ask1.setImage(ask1.getImage());

        ImageIcon ask2 = new ImageIcon("C:\\icon\\asterisk.png");
        ask1.setImage(ask1.getImage());

        ImageIcon ask3 = new ImageIcon("C:\\icon\\asterisk.png");
        ask1.setImage(ask1.getImage());

        ImageIcon ask4 = new ImageIcon("C:\\icon\\asterisk.png");
        ask1.setImage(ask1.getImage());

        JLabel ask1image = new JLabel(ask1);
        ask1image.setBounds(20,480,100,50);
        panel2.add(ask1image);

        JLabel lab1 = new JLabel("22a mortular way, zazu estate, machala Road, lagos.");
        lab1.setBounds(100,480,600,50);
        lab1.setFont(h);
        lab1.setForeground(Color.WHITE);
        panel2.add(lab1);

        JLabel ask1image1 = new JLabel(ask2);
        ask1image1.setBounds(20,530,100,50);
        panel2.add(ask1image1);

        JLabel lab2 = new JLabel("No 7, Bishop Abayode Cole Street, portable Road lagos.");
        lab2.setBounds(100,530,600,50);
        lab2.setFont(h);
        lab2.setForeground(Color.WHITE);
        panel2.add(lab2);

        JLabel ask1image2 = new JLabel(ask3);
        ask1image2.setBounds(20,580,100,50);
        panel2.add(ask1image2);

        JLabel lab3 = new JLabel("Block 80, Shop 11, Satelite Market, Rukuba Road lagos.");
        lab3.setBounds(100,580,600,50);
        lab3.setFont(h);
        lab3.setForeground(Color.WHITE);
        panel2.add(lab3);

        JLabel ask1image3 = new JLabel(ask4);
        ask1image3.setBounds(20,630,100,50);
        panel2.add(ask1image3);

        JLabel lab4 = new JLabel("10B, Agbogunleri Street, Sapa Road lagos.");
        lab4.setBounds(100,630,600,50);
        lab4.setFont(h);
        lab4.setForeground(Color.WHITE);
        panel2.add(lab4);


        // BACK BUTTON.
        JButton back = new JButton("Back");
        back.setBounds(650,640,100,25);
        back.setFont(fon);
        back.setForeground(lor);
        back.setBackground(Color.WHITE);
        back.setBorder(br);
        back.setFont(fon);
        panel2.add(back);

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Home();
                f.dispose();
            }
        });

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Book_Appointment();
                f.dispose();
            }
        });

        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Services obj = new Services();
                f.dispose();

            }
        });

        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginPage();
                f.dispose();
            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Home();
                f.dispose();
            }
        });


        // FRAME.
        f = new JFrame();
        // Set logo in jframe title.
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\icon\\medicine (1).png");
        f.setIconImage(icon); // Add Logo(icon).

        // Adding Container to JFrame.
        f.add(co);

        // Jframe properties.
        f.setTitle("NIIT CLINIC |  Contact Doctor. ");
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setSize(1030,720);

        // Set JFrame to center screen.
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 1030;
        int height = 720;
        f.setBounds(center.x - width / 2, center.y - height / 2, width, height);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Contact_Doctor();
    }
}
