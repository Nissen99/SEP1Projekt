package GUI;
import Acquaintance.ILogik;
import LogikLag.Employee;
import LogikLag.LogikFacade;
import LogikLag.Project;
import LogikLag.ProjectList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ControllerProjects implements Initializable
{
  @FXML public TableView projectTableview;
  @FXML public TableColumn<String, Integer> projectIDCounm;
  @FXML public TableColumn<Project, String> projectNavnCounm;
  @FXML public Label projectNameLabel;
  @FXML public Label projectIDLabel;
  @FXML public Label kundeNavnLabel;
  @FXML public TableView projectEmployeeTabel;
  @FXML public TableColumn<String, Integer> projectEmplyeeIDcounm;
  @FXML public TableColumn<Employee, String> projectEmplyeeRolleCounm;
  @FXML public TableColumn<Employee, String> projectEmplyeeNameCounm;
  @FXML public ComboBox projectStatusComboBox;
  @FXML public TableColumn projectStatusCounm;
  @FXML public Label tidBrugtLabel;
  @FXML public TextField textAreaBrugteTimer;
  @FXML private Button return_btn_return;
  @FXML private Button opretProjekt;
  @FXML private Button sletProjektKnap;

  private ILogik logik;
  private LogikFacade logikFacade = new LogikFacade();

  private ObservableList<String> statusList = FXCollections.observableArrayList();



@FXML
public void opretProjekt(ActionEvent event) throws IOException {

        Parent nextView = FXMLLoader.load(getClass().getResource("OpretProjekt.fxml"));
        Scene newScene = new Scene(nextView);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(newScene);
}


public void upDateStatus(){
  ProjectList list = logikFacade.datamanagement.loadProject();
  Project project = (Project) projectTableview.getSelectionModel().getSelectedItem();
  list.getProject(project.getProjectID()).setProjectStatus(String
      .valueOf(projectStatusComboBox.getSelectionModel().getSelectedItem()));

  logikFacade.datamanagement.writeToFile(list);

  reset();
}


  public void addHoursWorked(){

  int timerBrugt = Integer.parseInt(textAreaBrugteTimer.getText());

    ProjectList list = logikFacade.datamanagement.loadProject();
    Project project = (Project) projectTableview.getSelectionModel().getSelectedItem();

    list.getProject(project.getProjectID()).addHoursWorked(timerBrugt);

    logikFacade.datamanagement.writeToFile(list);

    //Opdatere fæltet live
    tidBrugtLabel.setText(String.valueOf(project.getProjectHoursWorked() + timerBrugt));

    textAreaBrugteTimer.clear();
    reset();


  }

public void appintScrumMaster(){
  ProjectList projectList = logikFacade.datamanagement.loadProject();

  Project project = (Project) projectTableview.getSelectionModel().getSelectedItem();

  Employee employee = (Employee) projectEmployeeTabel.getSelectionModel().getSelectedItem();

  projectList.getProject(project.getProjectID()).appointScrumMaster(employee.getEmployeeID());

  logikFacade.datamanagement.writeToFile(projectList);


  reset();

  //unselector row så den er opdateret med ny scrum master næste gang den bliver valgt
  projectEmployeeTabel.getItems().clear();

}


  public void appintProductOwner(){
    ProjectList projectList = logikFacade.datamanagement.loadProject();

    Project project = (Project) projectTableview.getSelectionModel().getSelectedItem();

    Employee employee = (Employee) projectEmployeeTabel.getSelectionModel().getSelectedItem();

    projectList.getProject(project.getProjectID()).appointProductOwner(employee.getEmployeeID());

    logikFacade.datamanagement.writeToFile(projectList);


    reset();

    //unselector row så den er opdateret med ny product owner næste gang den bliver valgt
    projectEmployeeTabel.getItems().clear();

  }




  public void removeProject()
  {
    ProjectList list = logikFacade.datamanagement.loadProject();
    Project project = (Project) projectTableview.getSelectionModel().getSelectedItem();
    list.removeProject(project.getProjectID());
    logikFacade.datamanagement.writeToFile(list);

    reset();
  }


public void reset(){
  projectTableview.getItems().clear();
  projectTableview.getItems().addAll(logikFacade.datamanagement.getAllProjectsFromFile());
}

public void setup(){
  projectIDCounm.setCellValueFactory(new PropertyValueFactory("projectID"));
  projectNavnCounm.setCellValueFactory(new PropertyValueFactory("projectName"));
  projectStatusCounm.setCellValueFactory(new PropertyValueFactory("projectStatus"));

}


  //Det her sker onClick, så hvis man ikke vælger et project kaster den Nullpointer
public void displaySelected(MouseEvent event){
  Project project = (Project) projectTableview.getSelectionModel().getSelectedItem();

  if (project == null)
  {
    projectNameLabel.setText("Intet valgt");
  }
  else {
    projectNameLabel.setText(project.getProjectName());
    projectIDLabel.setText(String.valueOf(project.getProjectID()));
    kundeNavnLabel.setText(project.getClient().getClientName());
    tidBrugtLabel.setText(String.valueOf(project.getProjectHoursWorked()));

  }
  projectEmployeeTabel.getItems().clear();//Clear når vi trykker på nyt project, ellers ville det bare ligge oven på
  projectEmployeeTabel.getItems().addAll(logikFacade.datamanagement.getAllTeamMembersFromProject(project));
  projectEmplyeeIDcounm.setCellValueFactory(new PropertyValueFactory("employeeID"));
  projectEmplyeeRolleCounm.setCellValueFactory(new PropertyValueFactory("role"));
  projectEmplyeeNameCounm.setCellValueFactory(new PropertyValueFactory("employeeName"));

}




public void seKrav(){
  System.out.println("pop ud for Krav");
}


public void addTeamMember(){
  System.out.println("adder team member");
}

public void fjernTeamMember(){
  System.out.println("fuck off mr team member");
}



  @FXML
  public void ChangeScene(javafx.event.ActionEvent actionEvent) throws IOException {
   if(actionEvent.getSource() == return_btn_return) {
      Parent nextView = FXMLLoader.load(getClass().getResource("StartSide.fxml"));
      Scene newScene = new Scene(nextView);
      Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
      stage.setScene(newScene);
    }}

  @Override public void initialize(URL url, ResourceBundle resourceBundle)
  {
    setup();
    reset();
    statusList.addAll("Ikke startet", "Startet", "Afsluttet", "Godkendt","Afvist" );
    projectStatusComboBox.setItems(statusList);

  }



}