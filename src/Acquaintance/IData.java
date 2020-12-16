package Acquaintance;

import LogikLag.Employee;
import LogikLag.EmployeeList;
import LogikLag.Project;
import LogikLag.ProjectList;

import java.util.ArrayList;

public interface IData {
    ArrayList<Employee> getAllEmployeesFromFile();
    ArrayList<Project> getAllProjectsFromFile();
    ArrayList<Project> getAllProjectsFromFile(Employee employee);
    void writeToFile(EmployeeList employees);
    void writeToFile(ProjectList projectList);
    EmployeeList loadEmployee();
    ProjectList loadProject();


}
