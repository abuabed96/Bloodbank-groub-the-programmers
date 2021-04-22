/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BloodBank;

import java.net.URL;
import java.sql.SQLException;
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
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class AdministratorController implements Initializable {

    @FXML
    private Button btnLogoff;
    @FXML
    private Tab ScreenNewDonation;
    @FXML
    private TextField txtFisrtName;
    @FXML
    private TextField txtLastName;
    @FXML
    private ChoiceBox<String> ChoiceBoxBloodType;
    @FXML
    private DatePicker DatePicker;
    @FXML
    private TextField txtPhone;
    @FXML
    private Button btnSave;

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
    private void LogOff(ActionEvent event) {
        try {
            ((Node) event.getSource()).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Home.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Cant load new window");
        }
    }

    @FXML
    private void selectDate(ActionEvent event) {
    }

    @FXML
    private void Save(ActionEvent event) throws SQLException {
        Connect c = new Connect();
        c.newDontion(txtFisrtName.getText(), txtLastName.getText(), ChoiceBoxBloodType.getValue(), Integer.parseInt(txtPhone.getText()));

    }

}
