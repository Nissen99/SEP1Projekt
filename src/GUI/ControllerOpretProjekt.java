package GUI;
import Acquaintance.ILogik;
import LogikLag.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ControllerOpretProjekt implements Initializable {

  public Button opretetMedarbejder;
  public Button Returnbutton;
  public TextField textFieldMedArbejder;
  @FXML
  public Button addAnsvarligTeammenber;
  @FXML
  public ComboBox addedTeamMember;
  @FXML public TextField opretProjectNavn;
  @FXML public TextField opretProjectTimer;
  @FXML public TextField opretProjectKundeNavn;
  @FXML public TextField opretProjectKundeEmail;
  @FXML public TextField opretProjectTelefonNummer;
  @FXML public DatePicker opretProjectDeadLine;
  @FXML public Label opretProjectHowManySelectedLabel;

  private ArrayList<Employee> employeeArrayList;
  private ArrayList<Employee> employeeValgtList;
  private ObservableList<String> list;
  private ILogik logik;
  private LogikFacade logikFacade = new LogikFacade();







  public void ChangeScene(javafx.event.ActionEvent actionEvent) throws IOException {
    Parent nextView = FXMLLoader.load(getClass().getResource("ProjectUI.fxml"));
    Scene newScene = new Scene(nextView);
    Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
    stage.setScene(newScene);
    stage.setScene(newScene);

  }

  public void valgtTeamMember() {
    employeeValgtList.add(employeeArrayList.get(addedTeamMember.getSelectionModel().getSelectedIndex()));
    employeeArrayList.remove(employeeArrayList.get(addedTeamMember.getSelectionModel().getSelectedIndex()));

    list.remove(list.get(addedTeamMember.getSelectionModel().getSelectedIndex()));
    //Det var svært at få et overblik over hvem man har valgt, det ville være for stor
    //en ændring at lave nyt tableview til at vise det, så vi addede en counter, så du kan se hvor mange du har valgt
    opretProjectHowManySelectedLabel.setText(String.valueOf(employeeValgtList.size()));
    addedTeamMember.setItems(list);
  }







  public void opretProject(){
    TeamMemberList teamMemberList = new TeamMemberList();

    for (int i = 0; i < employeeValgtList.size(); i++)
    {
      teamMemberList.addTeamMember(employeeValgtList.get(i));
    }

    ProjectList list = logikFacade.datamanagement.loadProject();

    list.addProject(new Project(opretProjectNavn.getText(),
        Integer.parseInt(opretProjectTimer.getText()),
        new Client(opretProjectKundeNavn.getText(), opretProjectKundeEmail.getText(), opretProjectTelefonNummer.getText()),
        teamMemberList, new MyDate(opretProjectDeadLine.getValue().getDayOfMonth(),
        opretProjectDeadLine.getValue().getMonthValue(), opretProjectDeadLine.getValue().getYear())));

    logikFacade.datamanagement.writeToFile(list);



  }

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {

    employeeValgtList = new ArrayList<>();
    employeeArrayList = logikFacade.datamanagement.getAllEmployeesFromFile();

    list = FXCollections.observableArrayList();

    for (int i = 0; i < employeeArrayList.size(); i++) {
      list.add(employeeArrayList.get(i).getEmployeeID() + ", " + employeeArrayList.get(i).getEmployeeName());
    }
    addedTeamMember.setItems(list);
  }
}

