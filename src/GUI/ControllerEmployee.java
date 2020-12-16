package GUI;
import Acquaintance.*;
import LogikLag.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import LogikLag.LogikFacade;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ControllerEmployee implements Initializable
{

  @FXML public TableColumn<String, Integer> tableColumnEmployeeID;
  @FXML public TableColumn<Employee, String> tableColumnEmployeeName;
  @FXML public TableView tableViewEmployee;
  @FXML
  public Button findMedarbejderKnap;
  @FXML public TableColumn<String, Integer> employeeTeableCounmProjectID;
  @FXML public TableColumn<Project, String> employeeTableCounmProjectName;
  @FXML public TableView employeeProjectTableView;
  @FXML public TableColumn employeeRoleCounm;


  @FXML public Button return_button;
  @FXML
  public Label nameLabel;
  @FXML
  public Label employeeIDLabel;
  @FXML
  public Button opretMedarbejder;
  private Datalag.datamanagement data;
  private  ILogik logik;
  private GUIFacade gui;
  private  LogikFacade logikFacade = new LogikFacade();

  public void setlogik(ILogik logik) {
  this.logik = logik;
}


  @FXML
  public void opretEmployee(ActionEvent actionEvent) throws IOException {
    System.out.println("Employee du bøgse");
    Parent nextView = FXMLLoader.load(getClass().getResource("OpretMedarbejder.fxml"));
    Scene newScene = new Scene(nextView);
    Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
    stage.setScene(newScene);
    //  viewHandler.closeView();
    // model.opretProjekt();
  }




  public void findEmployee(){
    System.out.println("Employee den bøgse");
    // model.findProjekt
  }

  public void fjernEmployee(){
    System.out.println("Fjerner nok den man har markeret");
  }
  @FXML
  public void reset()
  {
//    ObservableList<Employee> list2 = FXCollections.observableList(model.getAllStudentsFromFile());
    tableViewEmployee.getItems().addAll(logikFacade.datamanagement.getAllEmployeesFromFile());
  }


  public void setup()
  {
    tableColumnEmployeeID.setCellValueFactory(new PropertyValueFactory("employeeID"));
    tableColumnEmployeeName.setCellValueFactory(new PropertyValueFactory("employeeName"));

  }

  public void ChangeScene(javafx.event.ActionEvent actionEvent) throws IOException {
    if (actionEvent.getSource() == return_button) {
      Parent nextView = FXMLLoader.load(getClass().getResource("StartSide.fxml"));
      Scene newScene = new Scene(nextView);
      Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
      stage.setScene(newScene);


    }
  }



  //Det her sker onClick, så hvis man ikke vælger en person kaster den Nullpointer
  public void displaySelected(MouseEvent event){

    Employee person =  (Employee) tableViewEmployee.getSelectionModel().getSelectedItem();

    if (person == null) //hvis man har fat i en tom row skriver den vælg medarbejder
    {
      nameLabel.setText("Intet valgt");
    }
    else {
      nameLabel.setText(person.getEmployeeName());
      employeeIDLabel.setText(String.valueOf(person.getEmployeeID()));
    }
    employeeProjectTableView.getItems().clear(); //Clear når vi trykker på ny person, ellers ville det bare ligge oven på
    employeeProjectTableView.getItems().addAll(logikFacade.datamanagement.getAllProjectsFromFile(person));
    employeeTeableCounmProjectID.setCellValueFactory(new PropertyValueFactory("projectID"));
    employeeTableCounmProjectName.setCellValueFactory(new PropertyValueFactory("projectName"));
  }

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
      setup();
      reset();
  }
}