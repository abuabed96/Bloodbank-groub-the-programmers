package BloodBank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ammar
 */
public class StockAvailabilityController implements Initializable {

    @FXML
    private Label lblStock;
    @FXML
    private Label lblBloodType;
    @FXML
    private ChoiceBox<String> ChoiceBoxBloodType1;
    @FXML
    private ChoiceBox<String> ChoiceBoxComponent;
    @FXML
    private Button btnCheckAvailability;
    @FXML
    private Button btnBack;
    @FXML
    private TextField txtTypeQuantity;
    @FXML
    private TextField txtComoQuantity;
 
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
          ChoiceBoxBloodType1.getItems().add("A+");
        ChoiceBoxBloodType1.getItems().add("O+");
        ChoiceBoxBloodType1.getItems().add("B+");
        ChoiceBoxBloodType1.getItems().add("AB+");
        ChoiceBoxBloodType1.getItems().add("A-");
        ChoiceBoxBloodType1.getItems().add("O-");
        ChoiceBoxBloodType1.getItems().add("B-");
        ChoiceBoxBloodType1.getItems().add("AB-");
        
         ChoiceBoxComponent.getItems().add("Whole Blood");
         ChoiceBoxComponent.getItems().add("Single Donor Platelet");
         ChoiceBoxComponent.getItems().add("Single Donor Plasma");
         ChoiceBoxComponent.getItems().add("Sagm Packed Red Blood Cells");
         ChoiceBoxComponent.getItems().add("Platelet Rich Plasma");
         ChoiceBoxComponent.getItems().add("Platelet Poor Plasma");
         ChoiceBoxComponent.getItems().add("Plasma");
         ChoiceBoxComponent.getItems().add("Packed Red Blood Cells");
         ChoiceBoxComponent.getItems().add("Leukoreduced Rbc");
         ChoiceBoxComponent.getItems().add("Irradiated RBC");
         ChoiceBoxComponent.getItems().add("Fresh Frozen Plasma");
         ChoiceBoxComponent.getItems().add("Cryoprecipitate");
         ChoiceBoxComponent.getItems().add("Cryo Poor Plasma");
         
         
         
       
        
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
    private void check(ActionEvent event) {
    }
        
    }
    

