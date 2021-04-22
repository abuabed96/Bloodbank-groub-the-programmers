package BloodBank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.URL;
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
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ammar
 */
public class HomeController implements Initializable {

    @FXML
    private Label lblBloodAvailability;
    @FXML
    private Button btnRegisterNow;
    @FXML
    private Label lblRegisteration;
    @FXML
    private Button btnStartNow;
    @FXML
    private Label lblMyDonations;
    @FXML
    private Label lblBloodBank;
    @FXML
    private Button btnCheck;
    @FXML
    private Button btnAdminLogin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void RegisterNow(ActionEvent event) {
        
        try {
                ((Node) event.getSource()).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DonorPage.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
            } catch (Exception e) {
                System.out.println("Cant load new window");
            }
        
        }
    

    

    @FXML
    private void CheckAvailability(ActionEvent event) {
        
         try {
                ((Node) event.getSource()).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("StockAvailability.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
            } catch (Exception e) {
                System.out.println("Cant load new window");
            }
    }

    @FXML
    private void btnStartNow(ActionEvent event) {
        try {
                ((Node) event.getSource()).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DonorLogin.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
            } catch (Exception e) {
                System.out.println("Cant load new window");
            }
        
    }

    @FXML
    private void AdminLogin(ActionEvent event) {
        try {
                ((Node) event.getSource()).getScene().getWindow().hide();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AdminLogin.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
            } catch (Exception e) {
                System.out.println("Cant load new window");
            }
    }
    
    }

