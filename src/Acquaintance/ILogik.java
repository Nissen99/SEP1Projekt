package Acquaintance;

import LogikLag.*;

import java.util.ArrayList;

public interface ILogik {

    int getEmployeeID();
    int getNumberOfProjects();
    int getProjectID();
    Project getProjectByTeamMemberID(int teamMemberID);
    Task getTasks(int taskID);
    Employee getResponsibleTeamMember();
    int getRequirementHoursWorked();
    ProjectList loadProject();
    EmployeeList loadEmployee();
    void writeToFile(ProjectList projectList);
    void  writeToFile(EmployeeList employees);
    ArrayList<Employee> getAllEmployeesFromFile();
    ArrayList<Project> getAllProjectsFromFile();
    ArrayList<Project> getAllProjectsFromFile(Employee employee);
    ArrayList<Employee> getAllTeamMembersFromProject(Project project);
}

