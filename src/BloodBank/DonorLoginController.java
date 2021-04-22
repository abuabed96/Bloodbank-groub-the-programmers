package BloodBank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ammar
 */
public class DonorLoginController implements Initializable {

    @FXML
    private Label lblDonorLogin;
    @FXML
    private TextField txtUserName;
    @FXML
    private Button btnBack;
    @FXML
    private Button btnLogin;
    @FXML
    private PasswordField txtPassword;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Back(ActionEvent event) throws IOException {
         ((Node)event.getSource()).getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Home.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
    }

    @FXML
    private void Login(ActionEvent event) throws SQLException {
        String username = txtUserName.getText();
        String password = txtPassword.getText();

        Connection connection = Connect.getInstance().getConnect();
        Statement statement = connection.createStatement();

        ResultSet resultset = statement.executeQuery("select * from Donor where Username = '" + username + "' and Password = '" + password + "'");

        if (resultset.next()) {

            try {
                ((Node) event.getSource()).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DonorScreen.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
            } catch (Exception e) {
                System.out.println("Cant load new window");
            }
        }
        else{
            System.out.println("tryyyyyyyyyyyy");
        }
    
    }
    }


