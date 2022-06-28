package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.stage.StageStyle;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import java.net.URL;

public class LoginController implements Initializable {

    @FXML
    private Label LoginMessage;
    @FXML
    private ImageView brandingImageView;
    @FXML
    private ImageView LogoImageView;
    @FXML
    private Button CancelButton;
    @FXML
    private TextField UsernameTextfield;
    @FXML
    private PasswordField EnterPasswordTextfield;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File brandingFile = new File("C:\\Users\\Kloss\\Desktop\\images\\hospital2.jpg");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        brandingImageView.setImage(brandingImage);

        File LogoFile = new File("C:\\Users\\Kloss\\Desktop\\images\\hospitalLogo.png");
        Image LogoImage = new Image(LogoFile.toURI().toString());
        LogoImageView.setImage(LogoImage);
    }

    public void LoginButtonOnAction(ActionEvent event) {
        if (UsernameTextfield.getText().isBlank() == false && EnterPasswordTextfield.getText().isBlank() == false) {
            validatelogin();
        } else {
            LoginMessage.setText("Please insert username or password");
        }
    }

    public void CancelButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) CancelButton.getScene().getWindow();
        stage.close();
    }

    public void validatelogin() {
        DatabaseConnection connect = new DatabaseConnection();
        Connection connection = connect.getconnection();

//        try {
//            Statement statement = connection.createStatement();
////            ResultSet queryResult = statement.executeQuery(verifyLogin);
//
//            while(queryResult.next()) {
//                if (queryResult.getInt(1) == 1) {
//                    LoginMessage.setText("Congratulation");
//                }else {
//                    LoginMessage.setText("Invalid login, Please try again");
//                }
//            }
//        }catch (Exception e) {
//            e.printStackTrace();
//            e.getCause();
//        }
//    }
//
//    public void CreateAccountForm(){
//        try{
//            Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
//            Stage RegisterStage = new Stage();
//            RegisterStage.setTitle("SignIn");
//            RegisterStage.initStyle(StageStyle.DECORATED);
//            RegisterStage.setScene(new Scene(root, 540, 493));
//            RegisterStage.show();
//        }
    }
}



//    public void validatelogin();
//        DatabaseConnection connect = new DatabaseConnection();
//        Connection connection = connect.getconnection();

//        String verifyLogin = "SELECT count(1) FROM `user_account` WHERE username = "" = "fastcan""


//
