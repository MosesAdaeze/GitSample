package ALoginPage;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SigninPage extends JFrame implements ActionListener{

    private JFrame f;
    private ImageIcon icon;
    private JLabel label1;
    private JTextField jtextfield1, jtextfield2, jtextfield3;
    private JPasswordField pfield;
    private JPasswordField cpfield;
    private JButton bsignin, bclose, bback;
    private JLabel FN, LN, UN, password,cpassword;
    private JLabel labe;

    public SigninPage() {

        icon = new ImageIcon("C:\\icon\\user.png");
        setIconImage(icon.getImage());

        Font fo = new Font("Bauhaus 93", Font.BOLD, 40);
        Font font = new Font("Arial", Font.ITALIC | Font.PLAIN, 15);
        Font lfont = new Font("Serif", Font.BOLD, 18);
        Font fon = new Font("Georgia",Font.PLAIN,18);
        Color color = new Color(	255,255,255);
        Color c = new Color(135,206,235);

        Border br = BorderFactory.createLineBorder(c); // design border.
//        Container co = getContentPane(); // Container that holds panels.

        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();

        panel.setLayout(null); // Set panels to null.
        panel2.setLayout(null);

        // Add labels.
        JLabel label = new JLabel(icon); //Insert image into label. (left image)
        label.setBounds(200,0,30,50);
        panel.add(label); //Add label to panel.

        JLabel label2 = new JLabel("SIGN UP");
        label2.setBounds(240,5,300,50);
        label2.setFont(fo);
        label2.setForeground(Color.white);
        panel.add(label2);

        // Panels properties.
        panel.setBackground(c);
        panel.setBounds(0,0,600,50);
        //Panel 2..
        panel2.setBackground(Color.WHITE);
        panel2.setBounds(0,50,600,550);


        // FIELDS.

        FN = new JLabel("Firstname: ");
        FN.setFont(lfont);
        FN.setBounds(120,20,100,28);
        panel2.add(FN);

        jtextfield1 = new JTextField(45);
        jtextfield1.setBounds(120,55, 360,28);
        jtextfield1.setBorder(br);
        panel2.add(jtextfield1);

        LN = new JLabel("Lastname: ");
        LN.setBounds(120,90,360,28);
        LN.setFont(lfont);
        panel2.add(LN);

        jtextfield2 = new JTextField(45);
        jtextfield2.setBounds(120,115, 360,28);
        jtextfield2.setBorder(br);
        panel2.add(jtextfield2);

        UN = new JLabel("Username: ");
        UN.setBounds(120,155,360,28);
        UN.setFont(lfont);
        panel2.add(UN);

        jtextfield3 = new JTextField(45);
        jtextfield3.setBounds(120,190, 360,28);
        jtextfield3.setBackground(Color.white);
        jtextfield3.setBorder(br);
        panel2.add(jtextfield3);


        password = new JLabel("Password: ");
        password.setBounds(120,230,360,28);
        password.setFont(lfont);
        panel2.add(password);

        pfield = new JPasswordField(45);
        pfield.setBounds(120,265, 360,28);
        pfield.setBorder(br);
        pfield.setBackground(Color.WHITE);
        panel2.add(pfield);

        cpassword = new JLabel("Confirm password: ");
        cpassword.setBounds(120,305,360,28);
        cpassword.setFont(lfont);
        panel2.add(cpassword);

        cpfield = new JPasswordField(45);
        cpfield.setBounds(120,340, 360,28);
        cpfield.setBorder(br);
        cpfield.setBackground(Color.WHITE);
        panel2.add(cpfield);

        labe = new JLabel();
        labe.setBounds(140,370,500,20);
        labe.setFont(font);
        labe.setForeground(Color.RED);
        panel2.add(labe);


        bsignin = new JButton(" Sign Up ");
        bsignin.setBounds(120,395,100,38);
        bsignin.setFont(fon);
        bsignin.setForeground(Color.BLACK);
        bsignin.setBackground(c);
        bsignin.setBorder(br);

        bback = new JButton(" Back ");
        bback.setBounds(260,395,100,38);
        bback.setFont(fon);
        bback.setForeground(Color.BLACK);
        bback.setBackground(c);
        bback.setBorder(br);

        bclose = new JButton(" Close ");
        bclose.setBounds(400,395,100,38);
        bclose.setFont(fon);
        bclose.setForeground(Color.BLACK);
        bclose.setBackground(c);
        bclose.setBorder(br);

        panel2.add(bsignin);
        panel2.add(bback);
        panel2.add(bclose);


        bback.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
                new LoginPage();
            }
        });

        bclose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });

        bsignin.addActionListener(this);


        f = new JFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\icon\\medicine (1).png");
        f.setIconImage(icon);

        f.setLayout(null);
        f.setTitle("NIIT CLINIC |  SignUp ");
        f.add(panel);
        f.add(panel2);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setSize(600,550);
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 600;
        int height = 550;
        f.setBounds(center.x - width / 2, center.y - height / 2, width, height);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new SigninPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (FN.getText().isBlank() == false && LN.getText().isBlank() == false && UN.getText().isBlank() == false &&
                pfield.getText().isBlank() == false && cpfield.getText().isBlank() == false) {
            bsignin.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    f.dispose();
                    new Home();
                }
            });
//            label.setText("You have logged in successfully");
//            label.setForeground(Color.black);
        } else {
            labe.setText("Please insert necessary details in empty fields.");
        }
    }
}
