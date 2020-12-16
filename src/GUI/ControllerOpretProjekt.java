package GUI;
import LogikLag.Employee;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ControllerOpretProjekt implements Initializable
{

  public Button opretetMedarbejder;
  public Button Returnbutton;
  public TextField textFieldMedArbejder;
  @FXML public Button addAnsvarligTeammenber;
  @FXML public ComboBox addedTeamMember;
  private Model model;
  private ArrayList<Employee> employeeArrayList;
  private ArrayList<Employee> employeeValgtList;
  private ObservableList<String> list;



  public void ChangeScene(javafx.event.ActionEvent actionEvent) throws IOException {
            Parent nextView = FXMLLoader.load(getClass().getResource("ProjectUI.fxml"));
            Scene newScene = new Scene(nextView);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(newScene);
            stage.setScene(newScene);

    }

    public void valgtTeamMember(){

    employeeValgtList.add(employeeArrayList.get(addedTeamMember.getSelectionModel().getSelectedIndex()));
        list.remove(list.get(addedTeamMember.getSelectionModel().getSelectedIndex()));

    addedTeamMember.setItems(list);

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Model model = new Model();
        setModel(model);
      employeeValgtList = new ArrayList<>();
      employeeArrayList = model.getAllEmployeesFromFile();

    list = FXCollections.observableArrayList();

      for (int i = 0; i < employeeArrayList.size(); i++)
      {
        list.add(employeeArrayList.get(i).getEmployeeID() + ", " + employeeArrayList.get(i).getEmployeeName());
      }
      addedTeamMember.setItems(list);
    }

  private void setModel(Model model)
  {
    this.model = model;
  }
}
