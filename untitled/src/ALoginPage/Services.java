package ALoginPage;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Services extends JFrame {

    private JFrame f;
    private ImageIcon icon1;

    public Services(){

        // FONTS.
        Font fo = new Font("Perpetua Titling MT", Font.BOLD, 15);
        Font font = new Font("Perpetua Titling MT", Font.BOLD, 20);
        Font fon = new Font("Georgia", Font.BOLD, 20);
        Font wfont = new Font("Zapfino", Font.BOLD, 21);
        Font labfont = new Font("Serif", Font.PLAIN, 15);
        Color lor = new Color(135,206,235);

        icon1 = new ImageIcon("C:\\icon\\medicine (10).png");
        setIconImage(icon1.getImage());


        Border br = BorderFactory.createLineBorder(lor); // design border.
//        Border border = BorderFactory.createLineBorder(Color.WHITE);
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
        label2.setFont(font);
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

        // Panel2 Properties.
        ImageIcon image = new ImageIcon("C:\\icon\\appointment.png");
        setIconImage(image.getImage());

        ImageIcon image2 = new ImageIcon("C:\\icon\\doctor.png");
        setIconImage(image.getImage());

        ImageIcon image3 = new ImageIcon("C:\\icon\\first-aid-kit.png");
        setIconImage(image.getImage());

        JLabel iconimage = new JLabel(image);
        iconimage.setBounds(80,40,150,130);
        iconimage.setBorder(br);
        panel2.add(iconimage);

        JLabel image1label = new JLabel("<html>Book Appointment</html>");
        image1label.setBounds(60,170,200,50);
        image1label.setFont(wfont);
        image1label.setForeground(Color.WHITE);
        panel2.add(image1label);

        JLabel iconimage2 = new JLabel(image2);
        iconimage2.setBounds(310,40,150,130);
        iconimage2.setBorder(br);
        panel2.add(iconimage2);

        JLabel image1label2 = new JLabel("Meet a Doctor");
        image1label2.setBounds(310,185,200,20);
        image1label2.setFont(wfont);
        image1label2.setForeground(Color.WHITE);
        panel2.add(image1label2);


        JLabel iconimage3 = new JLabel(image3);
        iconimage3.setBounds(515,40,160,130);
        iconimage3.setBorder(br);
        panel2.add(iconimage3);

        JLabel image1label3 = new JLabel("Be Well");
        image1label3.setBounds(555,185,100,20);
        image1label3.setFont(wfont);
        image1label3.setForeground(Color.WHITE);
        panel2.add(image1label3);


        // Second panel properties.
        JPanel panell1 = new JPanel();
        JPanel panell2 = new JPanel();

        panell1.setLayout(null);
        panell2.setLayout(null);

        // Panels
        ImageIcon l1 = new ImageIcon("C:\\icon\\number-one.png");
        setIconImage(l1.getImage());

        ImageIcon l2 = new ImageIcon("C:\\icon\\number-2.png");
        setIconImage(l1.getImage());

        // properties.

        JLabel labell1 = new JLabel(l1);
        labell1.setBounds(20,280,100,100);
        labell1.setBorder(br);
        panel2.add(labell1);

        //Panell 1
        panell1.setBackground(Color.WHITE);
        panell1.setBounds(130,250,600,170);
        panel2.add(panell1);

        JLabel panelabel1 = new JLabel(" Schedule Appointment.");
        panelabel1.setBounds(20,-10,600,100);
        panelabel1.setForeground(Color.BLACK);
        panelabel1.setFont(fon);
        panell1.add(panelabel1);

        JLabel panelabell1 = new JLabel("<html> When scheduling your appointment, please ensure the phone number you enter is accurate.<br>" +
                "We will call you to confirm your appointment. If we're unable to contact you, we will cancel<br>" +
                "your appointment so that we may accommodate other patients.<html>");
        panelabell1.setBounds(20,40,600,100);
        panelabell1.setForeground(Color.BLACK);
        panelabell1.setFont(labfont);
        panell1.add(panelabell1);

        JLabel labell2 = new JLabel(l2);
        labell2.setBounds(20,490,100,100);
        labell2.setBorder(br);
        panel2.add(labell2);

        //Panel 2
        panell2.setBackground(Color.WHITE);
        panell2.setBounds(130,460,600,170);
        panel2.add(panell2);

        JLabel panelabel2 = new JLabel(" 24/7 Quick Care .");
        panelabel2.setBounds(20,-10,600,100);
        panelabel2.setForeground(Color.BLACK);
        panelabel2.setFont(fon);
        panell2.add(panelabel2);

        JLabel panelabell2 = new JLabel("<html> Getting sick is an inconvenience, but having access to quality care shouldn't be. Forget wai-<br>" +
                "ting hours to see a doctor. With e-healthcare, you can speak to our doctors over the phone<br> through troll-free number.<html>");
        panelabell2.setBounds(20,48,600,100);
        panelabell2.setForeground(Color.BLACK);
        panelabell2.setFont(labfont);
        panell2.add(panelabell2);

        // Panel border
        panell1.setBorder(br);
        panell2.setBorder(br);

        // Back Button.
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

        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Contact_Doctor();
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
        f.setTitle("NIIT CLINIC |  Services ");
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
        new Services();
    }
}
