/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BloodBank;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author abdul
 */
public class DonorPageController implements Initializable {
    
    @FXML
    private TextField txtEmail;
    @FXML
    private Button btnRegisterDonors;
    @FXML
    private Button btnBack;
    @FXML
    private DatePicker DatePicker;
    @FXML
    private Label lblDate;
    @FXML
    private ChoiceBox<String> ChoiceBoxBloodType;
    @FXML
    private TextField txtFirstName;
    @FXML
    private TextField txtPhone;
    @FXML
    private TextField txtLastName;
    @FXML
    private TextField txtUsername;
    @FXML
    private PasswordField txtpassword;
    @FXML
    private PasswordField txtconfpass;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        ChoiceBoxBloodType.getItems().add("A+");
        ChoiceBoxBloodType.getItems().add("O+");
        ChoiceBoxBloodType.getItems().add("B+");
        ChoiceBoxBloodType.getItems().add("AB+");
        ChoiceBoxBloodType.getItems().add("A-");
        ChoiceBoxBloodType.getItems().add("O-");
        ChoiceBoxBloodType.getItems().add("B-");
        ChoiceBoxBloodType.getItems().add("AB-");
    }
    
    @FXML
    private void Back(ActionEvent event) throws IOException {
        ((Node) event.getSource()).getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Home.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
    
    @FXML
    private void selectDate(ActionEvent event) {
    }
    
    @FXML
    private void Register(ActionEvent event) throws SQLException {
        Connection connection = Connect.getInstance().getConnect();
        Statement statement = connection.createStatement();
        Connect c = new Connect();
        c.newDonor(txtFirstName.getText(), txtLastName.getText(), txtEmail.getText(), Integer.parseInt(txtPhone.getText()), ChoiceBoxBloodType.getValue(), txtUsername.getText(), txtpassword.getText());
        
    }
    
}
