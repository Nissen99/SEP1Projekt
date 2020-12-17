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
  @FXML public Button fjernMedarbejderKnap;
  @FXML public TableColumn employeeTableCounmProjectStatus;
  private Datalag.datamanagement data;
  private  ILogik logik;
  private GUIFacade gui;
  private ViewHandler viewHandler;
  private  LogikFacade logikFacade = new LogikFacade();



  @FXML
  public void opretEmployee(ActionEvent event) throws IOException {
      viewHandler.ChangeScene(event,"OpretMedarbejder.fxml");



  }
  public void ChangeScene(ActionEvent event) throws IOException {
    viewHandler.ChangeScene(event, "StartSide.fxml");
  }


  public void removeMedarbejder(){
    EmployeeList list = logikFacade.datamanagement.loadEmployee();
    Employee person =  (Employee) tableViewEmployee.getSelectionModel().getSelectedItem();
    list.removeEmployee(person.getEmployeeID());
    logikFacade.datamanagement.writeToFile(list);
    tableViewEmployee.getItems().clear();
    reset();
  }

  @FXML
  public void reset()
  {
    tableViewEmployee.getItems().addAll(logikFacade.datamanagement.getAllEmployeesFromFile());
  }


  public void setup()
  {
    tableColumnEmployeeID.setCellValueFactory(new PropertyValueFactory("employeeID"));
    tableColumnEmployeeName.setCellValueFactory(new PropertyValueFactory("employeeName"));

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
    employeeTableCounmProjectStatus.setCellValueFactory(new PropertyValueFactory("projectStatus"));
  }
  public void setViewHandler(ViewHandler viewHandler) {
    this.viewHandler = viewHandler;
  }
  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
      ViewHandler viewHandler = new ViewHandler();
     setViewHandler(viewHandler);
      setup();
      reset();

  }
}