package Acquaintance;

import LogikLag.*;

import java.util.ArrayList;

public interface ILogik {
  void createProject(String projectName, int projectEstimatedHours,
      Client client, TeamMemberList teamMemberList, MyDate projectDeadline);
    String getDate();
    void setRole(String role);
    Employee copy();
    String getRole();
    int getEmployeeID();
    String getEmployeeName();
    int getNumberOfProjects();
    Requirement getRequirement(int requirementID);
    void addRequirement(Requirement requirement);
    void removeRequirement(int requirementID);
    void appointScrumMaster(int employeeID);
    void appointProductOwner(int employeeID);
    Client getClient();
    ArrayList<Requirement> getAllRequirements();
    MyDate getProjectDeadline();
    TeamMemberList getTeamMemberList();
    int getProjectID();
    String getProjectName();
    int getProjectEstimatedHours();
    int getProjectHoursWorked();
    String getProjectStatus();
    ArrayList<Project> getProjectByStatus(String status);
    Project getProjectByProjectClient(String clientName);
    Project getProjectByTeamMemberID(int teamMemberID);
    Project getProjectByProjectName(String projectName);
    Project getProjectByProjectClient(String clientName);
    void updateRequirementStatus(ArrayList<String> taskStatus);
    void addTask(Task task);
    void removeTask(int taskID);
    ArrayList<Task> getAllTasks();
    MyDate getRequirementDeadline();
    Task getTasks(int taskID);
    Employee getResponsibleTeamMember();
    int getRequirementID();
    String getRequirementName();
    String getUserStory();
    int getRequirementEstimatedHours();
    int getRequirementHoursWorked();
    String getRequirementStatus();
    void addTeamMember(Employee teamMember);
    void removeTeamMember(int employeeID);
    ArrayList<Employee> getAllTeamMembers();
    int getNumberOfTeamMembers();
    String getClientName();
    String getClientEmail();
    String getClientPhoneNumber();
}

