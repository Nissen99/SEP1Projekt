package GUI;
import Acquaintance.ILogik;
import LogikLag.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javax.swing.*;
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
  private ViewHandler viewHandler;






  public void ChangeScene(ActionEvent event) throws IOException {
    viewHandler.ChangeScene(event, "ProjectUI.fxml");

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

    clearOpretFaelter();
  }


  //så kan man se det ret tydeligt når man trykker Bekræft Oprettelse, da den bliver "reset"
  public void clearOpretFaelter(){
  opretProjectNavn.clear();
    opretProjectTimer.clear();
    opretProjectKundeNavn.clear();
    opretProjectKundeEmail.clear();
    opretProjectTelefonNummer.clear();
    opretProjectDeadLine.getEditor().clear();

    initialize();
addedTeamMember.setItems(list);
    opretProjectHowManySelectedLabel.setText(String.valueOf(0));


  }
  public void setViewHandler(ViewHandler viewHandler) {
    this.viewHandler = viewHandler;
  }


  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    ViewHandler viewHandler = new ViewHandler();
    setViewHandler(viewHandler);
    employeeValgtList = new ArrayList<>();
    employeeArrayList = logikFacade.datamanagement.getAllEmployeesFromFile();

    list = FXCollections.observableArrayList();

    for (int i = 0; i < employeeArrayList.size(); i++) {
      list.add(employeeArrayList.get(i).getEmployeeID() + ", " + employeeArrayList.get(i).getEmployeeName());
    }
    addedTeamMember.setItems(list);
  }


  //Det her er overloading, jeg vil gerne køre den igen men uden argumenterne
  public void initialize(){
    employeeValgtList = new ArrayList<>();
    employeeArrayList = logikFacade.datamanagement.getAllEmployeesFromFile();

    list = FXCollections.observableArrayList();

    for (int i = 0; i < employeeArrayList.size(); i++) {
      list.add(employeeArrayList.get(i).getEmployeeID() + ", " + employeeArrayList.get(i).getEmployeeName());
    }
    addedTeamMember.setItems(list);
  }

  }


