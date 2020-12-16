package GUI;

import LogikLag.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Model {

  private ArrayList<Employee> list = new ArrayList<>();






  public ArrayList<Employee> getAllEmployeesFromFile()
  {
    EmployeeList employeeList = null;
    try
    {
      FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\Mikkel\\IdeaProjects\\SEP1Projekt3\\EmployeeFile.bin"));
      ObjectInputStream loadEmployee = new ObjectInputStream(inputStream);

      employeeList = (EmployeeList) loadEmployee.readObject();
      inputStream.close();
      loadEmployee.close();
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }

   ArrayList<Employee> employeeArrayList = employeeList.getAllEmployees();


    return employeeArrayList;
  }

  //Overloading
  public ArrayList<Project> getAllProjectsFromFile()
  {
    ProjectList projectList = null;
    try
    {
      FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\Mikkel\\IdeaProjects\\SEP1Projekt3\\ProjectFile.bin"));
      ObjectInputStream loadEmployee = new ObjectInputStream(inputStream);

      projectList = (ProjectList) loadEmployee.readObject();
      inputStream.close();
      loadEmployee.close();
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }

    ArrayList<Project> projectArrayList = projectList.getProjects();


    return projectArrayList;
  }


//Overloading
  public ArrayList<Project> getAllProjectsFromFile(Employee employee)
  {
    ProjectList projectList = null;
    try
    {
      FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\Mikkel\\IdeaProjects\\SEP1Projekt3\\ProjectFile.bin"));
      ObjectInputStream loadEmployee = new ObjectInputStream(inputStream);

      projectList = (ProjectList) loadEmployee.readObject();
      inputStream.close();
      loadEmployee.close();
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
    }

    ArrayList<Project> projectArrayList = projectList.getProjectsByTeamMemberID(employee.getEmployeeID());


    return projectArrayList;
  }


  public ArrayList<Employee> getAllTeamMembersProject(Project project)
  {


    ArrayList<Employee> employeeArrayList = project.getTeamMemberList().getAllTeamMembers();


    return employeeArrayList;
  }


  public ArrayList<Requirement> getAllRequirementsFromProject(Project project)
  {
    ArrayList<Requirement> requirementArrayList = project.getAllRequirements();


    return requirementArrayList;
  }





}
