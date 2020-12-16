package GUI;

import Acquaintance.IData;
import Acquaintance.IGUI;
import Acquaintance.ILogik;
import LogikLag.*;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GUIFacade extends Application implements IGUI
{

  private static GUIFacade guiFacade;
  private static IData data;
  private static ILogik logik = new ILogik()
  {
    @Override public void injectData(IData _data)
    {
      data = _data;
    }

    @Override public int getEmployeeID()
    {
      return getEmployeeID();
    }

    @Override public int getNumberOfProjects()
    {
      return getNumberOfProjects();
    }

    @Override public int getProjectID()
    {
      return getProjectID();
    }

    @Override public Project getProjectByTeamMemberID(int teamMemberID)
    {
      return getProjectByTeamMemberID(teamMemberID);
    }

    @Override public Task getTasks(int taskID)
    {
      return getTasks(taskID);
    }

    @Override public Employee getResponsibleTeamMember()
    {
      return getResponsibleTeamMember();
    }

    @Override public int getRequirementHoursWorked()
    {
      return getRequirementHoursWorked();
    }

    @Override public ArrayList<Employee> getAllEmployeesFromFile()
    {
      return getAllEmployeesFromFile();
    }

    @Override public ArrayList<Project> getAllProjectsFromFile()
    {
      return getAllProjectsFromFile();
    }

    @Override public ArrayList<Project> getAllProjectsFromFile(
        Employee employee)
    {
      return getAllProjectsFromFile(employee);
    }

    @Override public void writeToFile(EmployeeList employees)
    {
      writeToFile(employees);
    }

    @Override public void writeToFile(ProjectList projectList)
    {
      writeToFile(projectList);
    }

    @Override public EmployeeList loadEmployee()
    {
      return loadEmployee();
    }

    @Override public ProjectList loadProject()
    {
      return loadProject();
    }
  };



  public static GUIFacade getInstance(){
    return guiFacade;
  }

    @Override
  public void start(Stage stage) throws Exception
  {
      FXMLLoader loader = new FXMLLoader();
      Parent root = FXMLLoader.load(getClass().getResource("StartSide.fxml"));
      Scene scene = new Scene(root);
      stage.setResizable(true);
      stage.setScene(scene);
      stage.show();

}


    @Override
    public void injectLogik(ILogik logik) {
      this.logik = logik;
    }

    @Override
    public void start2() {
        launch();
    }
}




