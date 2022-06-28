package AdminLogin;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Surgery extends JFrame {

    private JFrame f;
    private ImageIcon icon1;
    private JTable j;

    Surgery(){

        // FONTS.
        Font font = new Font("Perpetua Titling MT", Font.BOLD, 25);
        Font fon = new Font("Serif", Font.PLAIN, 18);
        Font fo = new Font("Perpetua Titling MT", Font.BOLD, 15);


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
        JPanel panel3 = new JPanel();

        panel.setLayout(null); // Set panels to null.
        panel2.setLayout(null);
        panel3.setLayout(null);

        // Panels properties.
        panel.setBackground(lor);
        panel.setBounds(0,0,250,720);
        //Panel 2..
        panel2.setBackground(Color.WHITE);
        panel2.setBounds(250,0,780,30);
        //panel 3.
        panel3.setBackground(Color.WHITE);
        panel3.setBounds(250,30,780,720);

        co.add(panel);
        co.add(panel2);
        co.add(panel3);


//        Add labels.
        JLabel label = new JLabel(icon1); //Insert icon into label. (hospital logo).
        label.setBounds(5,0,100,70);
        panel.add(label); //Add label to panel.

        JLabel label2 = new JLabel("NIIT Clinic");
        label2.setBounds(90,15,300,50);
        label2.setFont(fo);
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        // Icons on buttons.
        ImageIcon home = new ImageIcon("C:\\icon\\four-dots (1).png");
        setIconImage(home.getImage());

        ImageIcon bp = new ImageIcon("C:\\icon\\teamwork (1).png");
        setIconImage(bp.getImage());

        ImageIcon p = new ImageIcon("C:\\icon\\logout.png");
        setIconImage(p.getImage());

        JButton bt = new JButton(home);
        bt.setText(" Home                       ");
        bt.setFocusPainted(false);
        bt.setBounds(20,130,220,45);
        bt.setBackground(Color.WHITE);
        bt.setFont(fo);
        bt.setContentAreaFilled(false);
        bt.setFocusPainted(false);
        bt.setBorderPainted(false);
        bt.setForeground(Color.WHITE);
        bt.setBorder(br);
        panel.add(bt);

        JButton bt1 = new JButton(bp);
        bt1.setText(" Team Members       ");
        bt1.setBounds(20,190,220,45);
        bt1.setBackground(Color.WHITE);
        bt1.setFont(fo);
        bt1.setContentAreaFilled(false);
        bt1.setFocusPainted(false);
        bt1.setBorderPainted(false);
        bt1.setForeground(Color.WHITE);
        bt1.setBorder(br);
        panel.add(bt1);

        JButton bt2 = new JButton(p);
        bt2.setText(" Log out                ");
        bt2.setBounds(20,250,220,45);
        bt2.setBackground(Color.WHITE);
        bt2.setContentAreaFilled(false);
        bt2.setFocusPainted(false);
        bt2.setBorderPainted(false);
        bt2.setFont(fo);
        bt2.setForeground(Color.WHITE);
        bt2.setBorder(br);
        panel.add(bt2);


        // PROFILE.

        ImageIcon pimage = new ImageIcon("C:\\icon\\profile-modified.png");
        setIconImage(pimage.getImage());

        JLabel profile = new JLabel(pimage);
        profile.setBounds(75,500,80,70);


        JButton pname = new JButton("Lisa Marshmello");
        pname.setBounds(20,570,200,50);
        pname.setContentAreaFilled(false);
        pname.setFocusPainted(false);
        pname.setBorderPainted(false);
        pname.setFont(fo);
        pname.setForeground(Color.WHITE);

        panel.add(profile);
        panel.add(pname);

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AdminHome();
                f.dispose();
            }
        });

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Team_Members();
                f.dispose();
            }
        });

        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login();
                f.dispose();
            }
        });



        // PANEL3.

        ImageIcon noti = new ImageIcon("C:\\icon\\silent (1).png");
        noti.setImage(noti.getImage());

        JLabel notimage = new JLabel(noti);
        notimage.setBounds(690,-7,50,50);
        panel2.add(notimage);

        // PANELS IN PANEL3.

        ImageIcon appoint = new ImageIcon("C:\\icon\\medical.png");
        appoint.setImage(appoint.getImage());

        JPanel pan = new JPanel();
        pan.setLayout(null);
        pan.setBounds(15,5,230,150);
        panel3.add(pan);

        JButton appointment = new JButton(appoint);
        appointment.setText("Appointments ");
        appointment.setBounds(-5,30,240,100);
        appointment.setContentAreaFilled(false);
        appointment.setFocusPainted(false);
        appointment.setBorderPainted(false);
        appointment.setHorizontalTextPosition(JButton.LEFT);
        appointment.setFont(h);
        pan.add(appointment);

        ImageIcon patient = new ImageIcon("C:\\icon\\viber.png");
        patient.setImage(patient.getImage());

        JPanel pan2 = new JPanel();
        pan2.setLayout(null);
        pan2.setBounds(265,5,230,150);
        panel3.add(pan2);

        JButton cp = new JButton(patient);
        cp.setText("<html>Contact<br>Patient");
        cp.setBounds(10,30,200,100);
        cp.setContentAreaFilled(false);
        cp.setFocusPainted(false);
        cp.setBorderPainted(false);
        cp.setHorizontalTextPosition(JButton.LEFT);
        cp.setFont(h);
        pan2.add(cp);


        ImageIcon sur = new ImageIcon("C:\\icon\\surgery (1).png");
        sur.setImage(sur.getImage());

        JPanel pan3 = new JPanel();
        pan3.setLayout(null);
        pan3.setBounds(510,5,230,150);
        pan3.setBackground(lor);
        panel3.add(pan3);

        JButton surgery = new JButton(sur);
        surgery.setText("Surgery  ");
        surgery.setBounds(10,30,200,100);
        surgery.setForeground(Color.WHITE);
        surgery.setContentAreaFilled(false);
        surgery.setFocusPainted(false);
        surgery.setBorderPainted(false);
        surgery.setHorizontalTextPosition(JButton.LEFT);
        surgery.setFont(h);
        pan3.add(surgery);


        JLabel sch = new JLabel("Surgeries");
        sch.setBounds(40,180,500,50);
        sch.setFont(font);
        panel3.add(sch);

        JPanel pn = new JPanel();
        pn.setBounds(0,230,780,500);
        pn.setBackground(Color.PINK);
        panel3.add(pn);


        String[][] data = {
                { "101","jasuuc","Joint surgery","Dr David machamallow","2:25 pm" },
                { "101","jasuuc","Joint surgery","Dr David machamallow","2:25 pm" },
                { "101","jasuuc","Joint surgery","Dr David machamallow","2:25 pm" },
                { "101","jasuuc","Joint surgery","Dr David machamallow","2:25 pm" },
                { "101","jasuuc","Joint surgery","Dr David machamallow","2:25 pm" },
        };

        // Column Names
        String[] columnNames = { "ID","Patients Name", "Surgery", "Assistant Doctor", "Time"};

        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(0, 230, 980, 500);
        j.setSize(100, 500);
        j.setRowHeight(j.getRowHeight() + 50);
        j.setBackground(Color.WHITE);
        j.setBorder(br);

        // adding it to JScrollPane
//        JScrollPane sp = new JScrollPane(j);
//        pn.add(sp);
        pn.add(new JScrollPane(j));
//        panel3.add(sp);


        // BACK BUTTON.
        JButton back = new JButton("Back");
        back.setBounds(650,610,100,25);
        back.setFont(fon);
        back.setForeground(lor);
        back.setBackground(Color.WHITE);
        back.setBorder(br);
        back.setFont(fon);
        panel3.add(back);

        appointment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Doc_Appointment();
                f.dispose();
            }
        });

        cp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Contact_Patient();
                f.dispose();
            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AdminHome();
                f.dispose();
            }
        });








        f = new JFrame();
        // Jframe Title bar.
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\icon\\medicine (1).png");
        f.setIconImage(icon);
        f.setTitle("NIIT CLINIC | Surgeries");

        //Add Panels to frame.
        f.add(co);

        f.setSize(1300,800);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set JFrame to center screen.
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 1030;
        int height = 720;
        f.setBounds(center.x - width / 2, center.y - height / 2, width, height);
        f.setVisible(true);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new Surgery();
    }
}
