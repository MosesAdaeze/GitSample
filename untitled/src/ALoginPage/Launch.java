package ALoginPage;

import AProject.LoginFont;
import AdminLogin.AdminHome;
import Gui.Basic.Jtextfield;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;


public class Launch extends JFrame{

    private JFrame f;
    private ImageIcon icon;
    private JLabel label;

    public Launch() {


        // Assigning font and color.
        Font font = new Font("Helvetica",Font.BOLD, 20);
        Font fo = new Font("Serif", Font.BOLD, 18);
        Color color = new Color(255,255,255);
        Color lor = new Color(51,204,255);
//        Color c = new Color(51,153,255);

        Border border = BorderFactory.createLineBorder(lor);

        // Launch image.
        icon = new ImageIcon("C:\\icon\\e-hospital.jpg");
        setIconImage(icon.getImage());
        label = new JLabel(icon);
        label.setText("Welcome");
        label.setFont(new Font("Edwardian Script ITC",Font.BOLD, 50));
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setForeground(color);
        label.setBorder(border);
        label.setSize(600, 400);


        // Properties of JFRAME.

        f = new JFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\icon\\medicine (1).png"); // Logo in Jframe title.
        f.setIconImage(icon);

        f.setDefaultCloseOperation(f.HIDE_ON_CLOSE);

        f.add(label);
        f.setLayout(null);
        f.setTitle("NIIT CLINIC");
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setSize(600,400);
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 600;
        int height = 400;
        f.setBounds(center.x - width / 2, center.y - height / 2, width, height);
        f.setUndecorated(true);
        f.setVisible(true);

        // Set timer for the launch page.

        Timer tm = new Timer(4000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        f.dispose();
                        new LoginPage();
                    }
                });
            }
        });
        tm.setRepeats(false);
        tm.start();
    }

    public static void main(String[] args) {
        new Launch();
    }
}

//                    LOGIN PAGE.java

  class LoginPage extends JFrame implements ActionListener {

      private JFrame f;
      private JButton loginButton, cancelButton, signinButton, AdminButton;
      private JTextField jtextfield;
      private JPasswordField field;
      private JLabel username, password;
      private JLabel l;
      private ImageIcon icon;
      ImageIcon icon1;

      public LoginPage() {
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
          Container co = getContentPane(); // Container that holds panels.

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
          //panel2.setBorder(br);

          // Add panels to Container.
          co.add(panel);
          co.add(panel2);

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
          signinButton = new JButton("Sign Up");
          signinButton.setBounds(145,281,100,38);
          signinButton.setContentAreaFilled(false);
          signinButton.setFocusPainted(false);
          signinButton.setBorderPainted(false);
          signinButton.setFont(fo);
          signinButton.setForeground(c);

          AdminButton = new JButton("Admin Login");
          AdminButton.setBounds(100,330,150,25);
          AdminButton.setBackground(c);
          AdminButton.setEnabled(true);
          AdminButton.setBorder(br);
          AdminButton.setFont(fo);
          AdminButton.setForeground(Color.BLACK);

          // Add Buttons to panel. (panel2).
          panel2.add(loginButton);
          panel2.add(cancelButton);
          panel2.add(label2);
          panel2.add(signinButton);
          panel2.add(AdminButton);


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

          AdminButton.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  new Login();
                  f.dispose();
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
          f.setTitle("NIIT CLINIC");
          f.setLocationRelativeTo(null);
          f.setSize(600, 400);

          // This part, Set Jframe to Center of Window.
          Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
          int width = 600;
          int height = 400;
          f.setBounds(center.x - width / 2, center.y - height / 2, width, height);
          f.setVisible(true);
      }

      public static void main(String[] args) {
          new LoginPage();
      }

      Color c = new Color(135,206,235);

      Border red = BorderFactory.createLineBorder(Color.red);

      @Override
      public void actionPerformed(ActionEvent e) {
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
              field.setBorder(red);
              field.setText("");
          } else if (jtextfield.getText().isBlank() == true && field.getText().isBlank() == false) {
              l.setText("      Please insert username.    ");
              jtextfield.setBorder(red);
              jtextfield.setText("");
          } else {
              l.setText("Please insert username and password.");
              jtextfield.setText("");
              field.setBorder(red);
              jtextfield.setBorder(red);
              field.setText("");
          }
      }
  }

class Login extends JFrame implements ActionListener{

    private JFrame f;
    private JButton loginButton, cancelButton, AdminButton;
    private JTextField jtextfield;
    private JPasswordField field;
    private JLabel username, password;
    private JLabel l;
    private ImageIcon icon;
    ImageIcon icon1;

    public Login() {
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
        Container co = getContentPane(); // Container that holds panels.

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
        //panel2.setBorder(br);

        // Add panels to Container.
        co.add(panel);
        co.add(panel2);

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

        AdminButton = new JButton("User Login");
        AdminButton.setBounds(100,320,150,25);
        AdminButton.setBackground(c);
        AdminButton.setEnabled(true);
        AdminButton.setBorder(br);
        AdminButton.setFont(fo);
        AdminButton.setForeground(Color.BLACK);



        // Add Buttons to panel. (panel2).
        panel2.add(loginButton);
        panel2.add(cancelButton);
        panel2.add(AdminButton);


        loginButton.addActionListener(this);

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        AdminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginPage();
                f.dispose();
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
        f.setTitle("NIIT CLINIC");
        f.setLocationRelativeTo(null);
        f.setSize(600, 400);

        // This part, Set Jframe to Center of Window.
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 600;
        int height = 400;
        f.setBounds(center.x - width / 2, center.y - height / 2, width, height);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AdminLogin.Login();
    }

    Color c = new Color(135,206,235);

    Border red = BorderFactory.createLineBorder(Color.red);


    @Override
    public void actionPerformed(ActionEvent e) {
        if (jtextfield.getText().isBlank() == false && field.getText().isBlank() == false) {
            loginButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    f.dispose();
                    new AdminHome();
                }
            });
//            l.setForeground(Color.black);
//            l.setText("You have successfully logged in ");
        } else if (jtextfield.getText().isBlank() == false && field.getText().isBlank() == true) {
            l.setText("      Please insert password.      ");
            field.setText("");
            field.setBorder(red);
        } else if (jtextfield.getText().isBlank() == true && field.getText().isBlank() == false) {
            l.setText("      Please insert username.    ");
            jtextfield.setBorder(red);
            jtextfield.setText("");
        } else {
            l.setText("Please insert username and password.");
            jtextfield.setText("");
            jtextfield.setBorder(red);
            field.setBorder(red);
            field.setText("");
        }
    }
}
