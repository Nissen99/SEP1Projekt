package GUI;

import LogikLag.Employee;
import LogikLag.EmployeeList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Model {

  private ArrayList<Employee> list = new ArrayList<>();

  public ArrayList<Employee> getAllStudentsFromFile()


  {
    Scanner in = null;
    try
    {
      in = new Scanner(new File(
              "C:\\Users\\Antonio\\Documents\\GitHub\\SEP1Projekt\\src\\GUI\\Students.txt"));
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }

    EmployeeList employeeList = new EmployeeList();

    String s;

    while (in.hasNext())
    {

      s = in.nextLine();

      String[] split = s.split(", ");

      Employee other = new Employee(split[2]);

      employeeList.addEmployee(other);

    }
    list = employeeList.getAllEmployees();
    return list;
  }}
