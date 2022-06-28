package AProject;

import ALoginPage.Home;
import ALoginPage.SigninPage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

public class LoginFont extends JFrame implements ActionListener {

    private JFrame f;
    private JLabel label;
    private JPanel panel;
    private JPanel pane;
    private JButton loginButton, cancelButton, signinButton;
    private JTextField jtextfield;
    private JPasswordField field;
    private JLabel username, password;
    private JLabel l;
    private ImageIcon icon;
    private ImageIcon icon1;
    private JLabel text, text2;

    public LoginFont() {

        icon = new ImageIcon("C:\\icon\\hospitall.jpg"); // Left picture.
        setIconImage(icon.getImage());

        icon1 = new ImageIcon("C:\\icon\\padlock (4).png"); // Logo at header.
        setIconImage(icon1.getImage());

        // All Fonts
        Font fo = new Font("Georgia", Font.PLAIN, 18);
        Font text2font = new Font("Serif", Font.BOLD, 20);
        Font font = new Font("Arial", Font.ITALIC | Font.BOLD, 15);
        Color c = new Color(135,206,235);

        Border br = BorderFactory.createLineBorder(c); // design border.
//        Container co = getContentPane(); // Container that holds panels.

        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();

        panel.setLayout(null); // Set panels to null.
        panel2.setLayout(null);

        // Add labels.
        JLabel label = new JLabel(icon); //Insert image into label. (left image)
        label.setBounds(0,0,225,400);
        panel.add(label); //Add label to panel.

        // Panels properties.
        panel.setBackground(Color.WHITE);
        panel.setBounds(0,0,225,400);
        //Panel 2..
        panel2.setBackground(Color.WHITE);
        panel2.setBounds(225,0,375,400);

        // Add border.
        panel.setBorder(br);
        panel2.setBorder(br);

        // Add panels to Container.
//        co.add(panel);
//        co.add(panel2);

        // Label thats holds header image.
        JLabel header = new JLabel(icon1);
        header.setBounds(140,0,65,75);
        panel2.add(header); //Add header to panel.


        // SET JFIELDS
        // set username label.
        username = new JLabel("Username: ");
        username.setBounds(45, 65, 200, 30);
        username.setFont(fo);

        //username field.
        jtextfield = new JTextField(28);
        jtextfield.setBounds(50, 100, 250, 25);
        jtextfield.setBackground(Color.white);
        jtextfield.setBorder(br);

        // set password label.
        password = new JLabel("Password: ");
        password.setBounds(45, 150, 200, 30);
        password.setFont(fo);

        // password field.
        field = new JPasswordField(28);
        field.setBounds(50, 185, 250, 25);
        field.setBackground(Color.WHITE);
        field.setBorder(br);

        // Caution Label.
        l = new JLabel();
        l.setBounds(40,210,300,30);
        l.setFont(font);
        l.setForeground(Color.RED);
        panel2.add(l);

        // SET BUTTONS.
        // Login
        loginButton = new JButton("Login");
        loginButton.setBounds(35, 240, 100, 38);
        loginButton.setBackground(c);
        loginButton.setFont(fo);
        loginButton.setForeground(Color.BLACK);
        loginButton.setEnabled(true);
        loginButton.setBorder(br);

        // Cancel.
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(200,240,100,38);
        cancelButton.setBackground(c);
        cancelButton.setFont(fo);
        cancelButton.setForeground(Color.black);
        cancelButton.setEnabled(true);
        cancelButton.setBorder(br);


        // Label.
        JLabel label2 = new JLabel("or");
        label2.setFont(fo);
        label2.setBounds(140,260,188,80);

        // Sign In.
        signinButton = new JButton("Sign In");
        signinButton.setBounds(145,281,100,38);
        signinButton.setContentAreaFilled(false);
        signinButton.setFocusPainted(false);
        signinButton.setBorderPainted(false);
        signinButton.setFont(fo);
        signinButton.setForeground(c);

         // Add Buttons to panel. (panel2).
        panel2.add(loginButton);
        panel2.add(cancelButton);
        panel2.add(label2);
        panel2.add(signinButton);


        loginButton.addActionListener(this);

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        signinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                new SigninPage();
            }
        });


        // FRAME PROPERTIES.

        f = new JFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\icon\\medicine (1).png");
        f.setIconImage(icon);
        f.setResizable(false);

        // Add panels to frame.
        f.add(panel);
        f.add(panel2);

        // Adding properties to panel.
        panel2.add(l);
        panel2.add(username);
        panel2.add(jtextfield);
        // p2.
        panel2.add(password);
        panel2.add(field);

        f.setLayout(null);
        f.setTitle("e-HOSPITAL");
        f.setLocationRelativeTo(null);
        f.setSize(600, 400);
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 600;
        int height = 400;
        f.setBounds(center.x - width / 2, center.y - height / 2, width, height);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFont();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        String s = e.getActionCommand();
        if (jtextfield.getText().isBlank() == false && field.getText().isBlank() == false) {
            loginButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    f.dispose();
                    new Home();
                }
            });
//            l.setForeground(Color.black);
//            l.setText("You have successfully logged in ");
        } else if (jtextfield.getText().isBlank() == false && field.getText().isBlank() == true) {
            l.setText("      Please insert password.      ");
            field.setText("");
        } else if (jtextfield.getText().isBlank() == true && field.getText().isBlank() == false) {
            l.setText("      Please insert username.    ");
            jtextfield.setText("");
        } else {
            l.setText("Please insert username and password.");
            jtextfield.setText("");
            field.setText("");
        }
    }
}








//@Override
//public void actionPerformed(ActionEvent e) {
//        JOptionPane.showMessageDialog(null,"You have clicked start button");
//        }
//        });

//    @Override
//    public void actionPerformed(ActionEvent e) {
//            String s = e.getActionCommand();
//          if (s.equals("Cancel")) {
//              f = cancelButton.getActionCommand().get
//          }
//
//        }

//        public void CancelButtonOnAction(ActionEvent event) {
//            Stage stage = (Stage) CancelButton.getScene().getWindow();
//            stage.close();
//        if (s.equals("Login")) {
//            // set the text of the label to the text of the field
////            l.setText(jtextfield.getText());
//            l.setText("Enter username and password");
//            // set the text of field to blank
//            jtextfield.setText(" ");
//            field.setText(" ");
//        }

//    public void actionPerformed(ActionEvent e) {
//        String s = e.getActionCommand();
//        if (s.equals("Login")) {
//            // set the text of the label to the text of the field
//            l.setText(jtextfield.getText());
//
//            // set the text of field to blank
//            jtextfield.setText(" ");
//        }
//    }







// try {
//         BufferedImage img = ImageIO.read(new File("medicine.jpg"));
//         JLabel pic = new JLabel(new ImageIcon(img));
//         panel.add(pic);
//         } catch (IOException e) {
//         }

//image2 = new ImageIcon("C:\\icon\\medicine.jpg");
//        setIconImage(image2.getImage());
//        label.setSize(24,24);
//        logo = new JLabel(image2);
//        logo = new JLabel("Login");
//        panel.add(logo);

//        setLayout(new FlowLayout());
//        JLabel text = new JLabel("Login");
//        panel.add(text);
//
//        startButton = new JButton("Start");
//        startButton.setBounds(50,50,100,50);
//        startButton.setBackground(Color.blue);
//        panel.add(startButton);
//        logo = new JPanel();
//        logo.setSize(200,200);
//        image2 = new ImageIcon("C:\\icon\\medicine.jpg");
//        setIconImage(image2.getImage());


//   startButton = new JButton("Start");
//           startButton.setBounds(50,50,100,50);
//           startButton.setBackground(Color.blue);
//           startButton.addActionListener(new ActionListener() {
//@Override
//public void actionPerformed(ActionEvent e) {
//        JOptionPane.showMessageDialog(null,"You have clicked start button");
//        }
//        });
//
//        label.add(startButton);


//    private ImageIcon image1;
//    private JLabel label1;
//    private ImageIcon image2;
//    private JLabel label2;
//
//    LoginFont() {
//        setLayout(new FlowLayout());
//
//        image1 = new ImageIcon("C://Users//Kloss//Desktop//JbImage//image1.png");
////        image1 = new ImageIcon(getClass().getResource("C://Users//Kloss//Desktop//FILES//display_pic//it.jpg"));
//
//        label1 = new JLabel(image1);
//        add(label1);
//
////        image2 = new ImageIcon(getClass().getResource("C:\\Users\\Kloss\\Desktop\\FILES\\display_pic\\it2.jpg"));
//
//        label2 = new JLabel(image2);
//        add(label2);
//    }
//
//    public static void main(String[] args) {
//        LoginFont frame = new LoginFont();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//        frame.pack();
//        frame.setTitle("Hospital");
//}













//    JPanel panel = new JPanel();
//    JLabel label = new JLabel();
//
//    public Gui()
//    {
//        setTitle("Hospital");
//        setVisible(true);
//        setSize(400,200);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//        label.setIcon(new ImageIcon)
//    }

