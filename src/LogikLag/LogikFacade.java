package LogikLag;
import Acquaintance.*;

import java.util.ArrayList;
import Datalag.datamanagement;
public class LogikFacade implements ILogik {

    private MyDate date;
    private Task task;
    private Project project;
    private Employee employee;
    public datamanagement datamanagement;
    private static LogikFacade logikFacade;


    public LogikFacade() {
        datamanagement =  new datamanagement();
    }
    @Override
   public void  writeToFile(EmployeeList employees) {
        writeToFile(employees);
   }

    @Override
    public void writeToFile(ProjectList projectList) {
         writeToFile(projectList);

    }
    @Override
    public EmployeeList loadEmployee() {
        return loadEmployee();
    }
    @Override
    public ProjectList loadProject() {
        return  loadProject();
    }
    @Override
    public ArrayList<Employee> getAllEmployeesFromFile() {
        return getAllEmployeesFromFile();
    }
    @Override
    public ArrayList<Project> getAllProjectsFromFile() {
        return getAllProjectsFromFile();
    }
    @Override
    public  ArrayList<Project> getAllProjectsFromFile(Employee employee) {
        return getAllProjectsFromFile();
    }

    @Override
    public ArrayList<Employee> getAllTeamMembersFromProject(Project project) {
        return getAllTeamMembersFromProject(project);
    }


    public void createProject(String projectName, int projectEstimatedHours,
        Client client, TeamMemberList teamMemberList, MyDate projectDeadline){
        Project project = new Project(projectName, projectEstimatedHours, client, teamMemberList, projectDeadline);
    }

    public String getDate()
    {
        return date.getDate();
    }

    // denne her skal skrives om, da metoden ikke bliver override, skal der kigges på
    // fordi det er void metoden. Eventuelt laves om til en string.
    public void setRole(String role) {
         employee.setRole(role);
    }

    // denne her skal skrives om, da metoden ikke bliver override, skal der kigges på
    public Employee copy() {
        return employee.copy();
    }

    public String getRole() {
        return employee.getRole();
    }


    @Override
    public int getEmployeeID() {
    return employee.getEmployeeID();
    }

    public String getEmployeeName() {
        return employee.getEmployeeName();
}

    @Override
    public int getNumberOfProjects() {
        return employee.getNumberOfProjects();
    }
    public Requirement getRequirement(int requirementID) {
    return project.getRequirement(requirementID);
}
    public void addRequirement(Requirement requirement) {
         project.addRequirement(requirement);
    }
    public void removeRequirement(int requirementID) {
        project.getRequirement(requirementID);
    }

    public void appointScrumMaster(int employeeID) {

    }

    public void appointProductOwner(int employeeID) {

    }

    public Client getClient() {
        return null;
    }

    public ArrayList<Requirement> getAllRequirements() {
        return null;
    }

    public MyDate getProjectDeadline() {
        return null;
    }

    public TeamMemberList getTeamMemberList() {
        return null;
    }

    @Override
    public int getProjectID() {
        return 0;
    }

    public String getProjectName() {
        return null;
    }

    public int getProjectEstimatedHours() {
        return 0;
    }

    public int getProjectHoursWorked() {
        return 0;
    }

    public String getProjectStatus() {
        return null;
    }

    public ArrayList<Project> getProjectByStatus(String status) {
        return null;
    }

    public Project getProjectByTeamMemberID(int teamMemberID) {
        return null;
    }


    public Project getProjectByProjectName(String projectName) {
        return null;
    }

    public Project getProjectByProjectClient(String clientName) {
        return null;
    }

    public void updateRequirementStatus(ArrayList<String> taskStatus) {

    }

    public void addTask(Task task) {

    }

    public void removeTask(int taskID) {

    }

    public ArrayList<Task> getAllTasks() {
        return null;
    }

    public MyDate getRequirementDeadline() {
        return null;
    }

    public Task getTasks(int taskID) {
        return null;
    }

    public Employee getResponsibleTeamMember() {
        return null;
    }


    public int getRequirementID() {
        return 0;
    }

    public String getRequirementName() {
        return null;
    }

    public String getUserStory() {
        return null;
    }


    public int getRequirementEstimatedHours() {
        return 0;
    }

    public int getRequirementHoursWorked() {
        return 0;
    }

    public String getRequirementStatus() {
        return null;
    }

    public void addTeamMember(Employee teamMember) {

    }

    public void removeTeamMember(int employeeID) {

    }

    public ArrayList<Employee> getAllTeamMembers() {
        return null;
    }


    public int getNumberOfTeamMembers() {
        return 0;
    }

    public String getClientName() {
        return null;
    }

    public String getClientEmail() {
        return null;
    }

    public String getClientPhoneNumber() {
        return null;
    }



}