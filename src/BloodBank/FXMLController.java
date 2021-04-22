package BloodBank;




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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class FXMLController implements Initializable {

    @FXML
    private Label lblName;
    @FXML
    private Label lblAge;
    @FXML
    private Label lblPhone;
    @FXML
    private Label lblEmail;
    @FXML
    private Label lblBloodType;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtAge;
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
    private TextField txtName1;
    @FXML
    private TextField txtName11;
    @FXML
    private Label lblName1;
    @FXML
    private Label lblName2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
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
         ((Node)event.getSource()).getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Home.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
    }

    @FXML
    private void selectDate(ActionEvent event) {
        
        lblDate.setText(DatePicker.getValue().toString());
    }
    
    
    
}
