package AProject;

import javax.swing.*;
import java.awt.*;

public class Project_Test {
}
//    public static void main(String[] args) {
//        JFrame start_frame = new JFrame("P.D");
//        int width = 600;
//        int height = 405;
//        start_frame.setSize(width, height);
//        start_frame.setVisible(true);
//        start_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Panel to hold our buttons
//        JPanel start_panel = new JPanel();
//        start_panel.setLayout(null);
//        start_frame.add(start_panel);
//
//
//        // Button to initialize everything
//        JButton start_button = new JButton("Start");
//        start_button.setBounds(new Rectangle((width - 100)/2, (height - 10)/2, 200, 50));
//        start_button.setSize(new Dimension(80, 20));
//        start_button.setFocusable(false);
//        start_panel.add(start_button);
//    }
// TEST 2
/// panel = new JPanel();
//         panel.setSize(200,715);
//         panel.setBackground(Color.pink);
//
//
//         JFrame frame = new JFrame();
//         Image icon = Toolkit.getDefaultToolkit().getImage("C:\\icon\\medicine (1).png");
//         frame.setIconImage(icon);
//         frame.add(panel);
//         frame.setLayout(null);
//         frame.setSize(250,715);
//         frame.setUndecorated(false);
//         frame.setVisible(true);




//    private boolean initialized = false;
//    private Actions actions = new Actions();
//
//    private javax.swing.JScrollPane jspFavouritesList = new javax.swing.JScrollPane();
//    private javax.swing.DefaultListModel<String> listModel = new javax.swing.DefaultListModel<String>();
//    private javax.swing.JList<String> favouritesList = new javax.swing.JList<String>(
//            listModel);
//
//    private javax.swing.JLabel lblAcknowledgement = new javax.swing.JLabel();
//    private javax.swing.JLabel lblTitle = new javax.swing.JLabel();
//
//    private javax.swing.JButton btnAdd = new javax.swing.JButton();
//    private javax.swing.JButton btnRemove = new javax.swing.JButton();
//
//    public void initialize() {
//        initializeGui();
//        initializeEvents();
//        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//    }
//
//    /**
//     *
//     */
//    private void initializeGui() {
//        if (initialized)
//            return;
//        initialized = true;
//        this.setSize(500, 400);
//
//        Dimension windowSize = this.getSize();
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        this.setLocation(screenSize.width / 2 - windowSize.width / 2,
//                screenSize.height / 2 - windowSize.height / 2);
//        Container pane = this.getContentPane();
//        pane.setLayout(new BorderLayout());
//        setLayout(new BorderLayout());
//        setTitle("Favourite Weather Locations");
//
//        JPanel jpSouth = new JPanel();
//        jpSouth.setLayout(new FlowLayout());
//
//        JPanel jpNorth = new JPanel();
//        jpNorth.setLayout(new FlowLayout());
//
//        JPanel jpCenter = new JPanel();
//        jpCenter.setLayout(new BoxLayout(jpCenter, BoxLayout.PAGE_AXIS));
//
//        JPanel jpEast = new JPanel();
//        JPanel jpWest = new JPanel();
//
//        getContentPane().setBackground(Color.WHITE);
//        jpEast.setBackground(Color.WHITE);
//        jpWest.setBackground(Color.WHITE);
//        jpCenter.setBackground(Color.WHITE);
//
//        getContentPane().add(jspFavouritesList);
//        jpCenter.add(jspFavouritesList);
//        jspFavouritesList.setViewportView(favouritesList);
//        favouritesList
//                .setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
//        favouritesList.addListSelectionListener(this);
//
//        jpCenter.add(btnAdd);
//        jpCenter.add(btnRemove);
//        jpCenter.setAlignmentY(CENTER_ALIGNMENT);
//        btnAdd.setText("Add Location");
//        btnAdd.setAlignmentX(Component.CENTER_ALIGNMENT);
//        btnAdd.setFont(new Font("Calibri", Font.PLAIN, 18));
//
//        jpCenter.add(btnRemove);
//        btnRemove.setText("Remove Location");
//        btnRemove.setAlignmentX(Component.CENTER_ALIGNMENT);
//        btnRemove.setFont(new Font("Calibri", Font.PLAIN, 18));
//
//        getContentPane().add(jpEast, BorderLayout.EAST);
//        getContentPane().add(jpWest, BorderLayout.WEST);
//
//        getContentPane().add(jpSouth);
//        jpSouth.add(lblAcknowledgement);
//        add(lblAcknowledgement, BorderLayout.SOUTH);
//        lblAcknowledgement.setText(FetchWeatherForecast.getAcknowledgement());
//        lblAcknowledgement.setHorizontalAlignment(SwingConstants.CENTER);
//        lblAcknowledgement.setFont(new Font("Tahoma", Font.ITALIC, 12));
//
//        getContentPane().add(jpNorth);
//        jpNorth.add(lblTitle);
//        add(lblTitle, BorderLayout.NORTH);
//        lblTitle.setText("Your Favourite Locations");
//        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
//        lblTitle.setFont(new Font("Calibri", Font.PLAIN, 32));
//        lblTitle.setForeground(Color.DARK_GRAY);
//
//        getContentPane().add(jpCenter);
//
//    }
//
//    private void initializeEvents() {
//        // TODO: Add action listeners, etc
//    }
//    public class Actions implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            String command = e.getActionCommand();
//            command = command == null ? "" : command;
        // TODO: add if...if else... for action commands
//
//        }
//    }
//
//    public void dispose() {
//        // TODO: Save settings
//        // super.dispose();
//        System.exit(0);
//    }
//
//    public void setVisible(boolean b) {
//        initialize();
//        super.setVisible(b);
//    }
//
//    public static void main(String[] args) {
//
//        new MainFrame().setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent evt){
//
//        if (evt.getSource() == btnAdd) {
//            showNewFrame();
//            //OPEN THE SEARCH WINDOW
//
//        }
//
//    }
//
//    private void showNewFrame() {
//        JFrame frame = new JFrame("Search Window" );
//        frame.setSize( 500,120 );
//        frame.setLocationRelativeTo( null );
//        frame.setVisible( true );
//
//    }






//    public Test() {
//        super("Java AWT Examples");
////        prepareGUI();
//    }
//
//    public static void main(String[] args) {
//        Test awtGraphicsDemo = new Test();
//        awtGraphicsDemo.setVisible(true);
//    }

//    private void prepareGUI() {
//        setSize(400, 400);
//        addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent windowEvent) {
//                System.exit(0);
//            }
//        });
//    }

//    @Override
//    public void paint(Graphics g) {
//        Graphics2D g2 = (Graphics2D) g;
//        Font plainFont = new Font("Serif", Font.PLAIN, 24);
//        g2.setFont(plainFont);
//        g2.drawString("Welcome to TutorialsPoint", 50, 70);
//    }


// Creating a button.
//        button = new JButton("TAP");
//        button.setFont(font);
//        //265 315 95
//        button.setBounds(265,370,91,20);
//        button.setBackground(lor);
//        button.setForeground(color);
//        label.add(button); // Add button to label.


//  Add ActionListener to button.
//        button.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent ae) { // To dispose frame(launchPage) to next page(LoginPage).
//                f.dispose(); // Dispose.
//                new LoginPage(); // Enter next page.
//            }
//        }

///          image = new ImageIcon("C:\\icon\\hospitall.jpg");
////          setIconImage(image.getImage());
//
//        Border br = BorderFactory.createLineBorder(Color.black);
//        Container co=getContentPane();
//
//        JPanel panel =new JPanel();
//        JPanel panel2 =new JPanel();
//
//        panel.setLayout(null);
//        panel2.setLayout(null);
//
//        JLabel label =new JLabel("hghv");
//        JLabel label2 =new JLabel("kjhfhu");
////          label2.setVerticalTextPosition(JLabel.TOP);
//
//        label.setBounds(0,0,225,400);
//        label2.setBounds(10,10,188,400);
//
//        panel.add(label);
//        panel2.add(label2);
//
//        panel.setBackground(Color.yellow);
//        panel.setBounds(0,0,225,400);
//        //Panel 2
//        panel2.setBackground(Color.pink);
//        panel2.setBounds(225,0,375,400);
//
//        panel.setBorder(br);
//        panel2.setBorder(br);
//
//        co.add(panel);
//        co.add(panel2);
//
////          image = new ImageIcon("C:\\icon\\merge_from_ofoct (2).jpg"); // Login side image.
////          setIconImage(image.getImage());
////          label = new JLabel(image);
////          label.setSize(600, 405);
//
//        icon = new ImageIcon("C:\\icon\\padlock (3).png"); // Logo at header.
//        setIconImage(icon.getImage());
//
////          lock = new ImageIcon("C:\\icon\\padlock (1).png"); // Logo at header.
////          setIconImage(lock.getImage());
//
//        Font fo = new Font("Serif", Font.BOLD, 18);
//        Font font = new Font("Arial", Font.ITALIC | Font.BOLD, 15);
//        Font text2font = new Font("Serif", Font.BOLD, 20);
//        Font fon = new Font("Serif", Font.LAYOUT_RIGHT_TO_LEFT, 30);
//        Color color = new Color(255, 255, 255);
//        Color c = new Color( 135,206,235);
////          Color c = new Color(51,204,255);
//
//
//        // Creating a panel.
//
//        panel = new JPanel();
////          panel.setLayout(null);
////          panel.setBackground(Color.WHITE);
////          label.add(panel);
//
//        // Add panel to Label.
//        panel.setSize(300, 400);
//
//        text1 = new JLabel(icon);
////          panel.add(text1);// Add text1 -(image) to panel.
//
////          text2 = new JLabel("e-HOSPITAL                 ");
////          text2.setFont(text2font);
////          text2.setForeground(c);
////          panel.add(text2); // Add text2 to panel.
//
////          text3 = new JLabel(lock);
//////        text3.setForeground(c);
//////          text3.setFont(fon);
////          panel.add(text3); // Add text3 to panel.
//
//
//        // Set Dimension to jtextfields and fields label.
//        Dimension textDimension = new Dimension(200, 27);
//
//        username = new JLabel("                 Username                  ");
//        username.setFont(fo);
//        panel2.add(username);
//
//        // Set size and and Jtextfield to Panel.
////          public void mouseExited(MouseEvent e)
////          {
////              if (! getVisibleRect().contains(e.getPoint()) )
////              {
////                  setBackground(...);
////              }
////          }
//
//        jtextfield = new JTextField(25);
//        jtextfield.setPreferredSize(textDimension);
//        jtextfield.setMinimumSize(textDimension);
//        jtextfield.setMaximumSize(textDimension);
////          panel.add(jtextfield);
//
//        password = new JLabel("Password");
//        password.setFont(fo);
////          panel.add(password);
//
//        field = new JPasswordField(25);
//        field.setPreferredSize(textDimension);
//        field.setMinimumSize(textDimension);
//        field.setMaximumSize(textDimension);
////          panel.add(field);
//
//        // Label for Action Performed.
//        l = new JLabel();
//        l.setFont(font);
//        l.setForeground(Color.RED);
////          panel.add(l);
//
//        // Creating Button and Adding to Panel.
//        loginButton = new JButton("Login");
//        loginButton.setLayout(new FlowLayout(FlowLayout.CENTER));
//        loginButton.setSize(300, 25);
//        loginButton.setBackground(Color.WHITE);
//        loginButton.setFont(fo);
//        loginButton.setForeground(Color.black);
//
//        cancelButton = new JButton("Cancel");
//        cancelButton.setBackground(Color.white);
//        cancelButton.setFont(fo);
//        cancelButton.setForeground(Color.black);
//
//        JLabel or = new JLabel("or");
//        or.setVerticalTextPosition(JLabel.BOTTOM);
//
//        signinButton = new JButton("Sign In");
//        signinButton.setBounds(100,370,91,20);
//        signinButton.setBackground(Color.WHITE);
//        signinButton.setFont(fo);
//        signinButton.setForeground(Color.BLACK);
//
////          panel.add(loginButton);
////          panel.add(cancelButton);
////          panel.add(or);
////          panel.add(signinButton); // Adding to Jpanel.
//
//        // Adding Actionlistener to buttons.
//        loginButton.addActionListener(this); // To login Button.
//
//        cancelButton.addActionListener(new ActionListener() { // To cancel Button.
//public void actionPerformed(ActionEvent e) {
//        f.dispose();
//        } // Dispose page when clicked.
//        });
//
//        signinButton.addActionListener(new ActionListener() {
//@Override
//public void actionPerformed(ActionEvent e) {
//        f.dispose();
//        new SigninPage(); // Enters a signin page.
//        }
//        });
//
//
//        // Properties of Jframe.
//
//        f = new JFrame();
//        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\icon\\medicine (1).png");
//        f.setIconImage(icon);
//        f.add(panel);
//        f.add(panel2);
//        f.setLayout(null);
//        f.setTitle("e-HOSPITAL- User login");
//        f.setResizable(false);
//        f.setLocationRelativeTo(null);
//        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
//        f.setSize(600, 400);
//        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
//        int width = 600;
//        int height = 400;
//        f.setBounds(center.x - width / 2, center.y - height / 2, width, height);
//        f.setVisible(true);
//        }
//
//@Override // Methods.
//public void actionPerformed(ActionEvent e) {
//        if (jtextfield.getText().isBlank() == false && field.getText().isBlank() == false) {
//        loginButton.addActionListener(new ActionListener() {
//public void actionPerformed(ActionEvent ae) {
//        f.dispose();
//        new Home();
//        }
//        });
//        } else if (jtextfield.getText().isBlank() == false && field.getText().isBlank() == true) {
//        l.setText("      Please insert your password      ");
//        field.setText("");
//        } else if (jtextfield.getText().isBlank() == true && field.getText().isBlank() == false) {
//        l.setText("      Please insert username    ");
//        jtextfield.setText("");
//        } else {
//        l.setText("Please insert username and password");
//        jtextfield.setText("");
//        field.setText("");
//        }
//        }
//
