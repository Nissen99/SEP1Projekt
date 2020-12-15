package GUI;
import LogikLag.Employee;
import LogikLag.Employee;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerEmployee
{

  @FXML public TableColumn<String, Integer> tableColumnEmployeeID;
  @FXML public TableColumn<Employee, String> tableColumnEmployeeName;
  @FXML public TableView tableViewEmployee;
  private Model model;
  @FXML public Button return_button;


    public void setModel(Model model){
    this.model = model;
  }

  public void opretEmployee(){
    System.out.println("Employee du bøgse");
    //  viewHandler.closeView();
    // model.opretProjekt();
  }


public void displaySelected(MouseEvent event){
      

}


  public void findEmployee(){
    System.out.println("Employee den bøgse");
    setup();
    reset();
    // model.findProjekt
  }

  public void fjernEmployee(){
    System.out.println("Fjerner nok den man har markeret");
  }

  public void reset()
  {
    ObservableList<Employee> list2 = FXCollections.observableList(model.getAllStudentsFromFile());
    tableViewEmployee.getItems().addAll(model.getAllStudentsFromFile());
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
  }}