package AdminLogin;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AdminHome extends JFrame {

    private JFrame f;
    private ImageIcon icon1;

    public AdminHome(){

        // FONTS.
        Font fo = new Font("Perpetua Titling MT", Font.BOLD, 15);
        Font font = new Font("Perpetua Titling MT", Font.BOLD, 20);
        Font fon = new Font("Georgia", Font.PLAIN, 15);
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
        ImageIcon home = new ImageIcon("C:\\icon\\four-dots.png");
        setIconImage(home.getImage());

        ImageIcon bp = new ImageIcon("C:\\icon\\teamwork (1).png");
        setIconImage(bp.getImage());

        ImageIcon p = new ImageIcon("C:\\icon\\logout.png");
        setIconImage(p.getImage());

        JButton bt = new JButton(home);
        bt.setText(" Home                              ");
        bt.setFocusPainted(false);
        bt.setBounds(20,130,250,45);
        bt.setBackground(Color.WHITE);
        bt.setFont(fo);
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
        bt1.setBorder(br);
        bt1.setForeground(Color.WHITE);
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

        Color color = new Color(220,220,220);

        ImageIcon noti = new ImageIcon("C:\\icon\\silent (1).png");
        noti.setImage(noti.getImage());

        JLabel notimage = new JLabel(noti);
        notimage.setBounds(690,-7,50,50);
        panel2.add(notimage);

        JLabel text = new JLabel("<html>Hello Lisa</html>");
        text.setBounds(10,15,200,50);
        text.setFont(font);
        panel3.add(text);

        JLabel text2 = new JLabel(" Welcome back!");
        text2.setBounds(16,35,200,50);
        text2.setFont(labfont);
        panel3.add(text2);

        // PANELS IN PANEL3.

        ImageIcon appoint = new ImageIcon("C:\\icon\\medical.png");
        appoint.setImage(appoint.getImage());

        JPanel pan = new JPanel();
        pan.setLayout(null);
        pan.setBounds(15,120,230,150);
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
        pan2.setBounds(265,120,230,150);
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


        ImageIcon sur = new ImageIcon("C:\\icon\\surgery.png");
        sur.setImage(sur.getImage());

        JPanel pan3 = new JPanel();
        pan3.setLayout(null);
        pan3.setBounds(510,120,230,150);
        panel3.add(pan3);

        JButton surgery = new JButton(sur);
        surgery.setText("Surgery  ");
        surgery.setBounds(10,30,200,100);
        surgery.setContentAreaFilled(false);
        surgery.setFocusPainted(false);
        surgery.setBorderPainted(false);
        surgery.setHorizontalTextPosition(JButton.LEFT);
        surgery.setFont(h);
        pan3.add(surgery);


        appointment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Doc_Appointment();
                f.dispose();
            }
        });


        f = new JFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\icon\\medicine (1).png");
        f.setIconImage(icon);

        f.add(co);

        f.setResizable(false);
        f.setTitle("NIIT CLINIC  |  Admin Home");
        f.setLocationRelativeTo(null);
        f.setSize(1030, 720);

        // This part, Set Jframe to Center of Window.
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 1030;
        int height = 720;
        f.setBounds(center.x - width / 2, center.y - height / 2, width, height);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AdminHome();
    }
}
