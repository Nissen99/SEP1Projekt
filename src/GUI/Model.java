package GUI;

import LogikLag.Employee;
import LogikLag.EmployeeList;
import LogikLag.Project;
import LogikLag.ProjectList;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Model {

  private ArrayList<Employee> list = new ArrayList<>();





  public ArrayList<Employee> getAllStudentsFromFile()
  {
    EmployeeList employeeList = null;
    try
    {
      FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\mikke\\IdeaProjects\\SEP1Projekt\\EmployeeFile.bin"));
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

  public ArrayList<Project> getAllProjectsFromFile()
  {
    ProjectList projectList = null;
    try
    {
      FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\mikke\\IdeaProjects\\SEP1Projekt\\ProjectFile.bin"));
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



}
