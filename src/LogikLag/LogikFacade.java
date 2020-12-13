package LogikLag;
import Acquaintance.*;

import java.util.ArrayList;

public class LogikFacade implements ILogik {

    private MyDate date;
    private Task task;
    private Project project;
    private Employee employee;

    public LogikFacade(MyDate date, Task task, Project project) {
        this.date = date;
        this.task = task;
        this.project = project;
        this.employee = employee;
    }


    @Override
    public int getMonth() {
        return date.getMonth();
    }

    @Override
    public int getYear() {
        return date.getYear();
    }

    @Override
    public int getDay() {
        return date.getDay();
    }

    // denne her skal skrives om, da metoden ikke bliver override, skal der kigges på
    // fordi det er void metoden. Eventuelt laves om til en string.
    @Override
    public void setRole(String role) {
        return employee.setRole();
    }

    // denne her skal skrives om, da metoden ikke bliver override, skal der kigges på
    @Override
    public Employee copy() {
        return employee.copy();
    }

    @Override
    public String getRole() {
        return employee.getRole();
    }

    @Override
    public int getEmployeeID() {
    return employee.getEmployeeID();
    }
    @Override
    public String getEmployeeName() {
        return employee.getEmployeeName();
}

    @Override
    public int getNumberOfProjects() {
        return employee.getNumberOfProjects();
    }
    @Override
    public Requirement getRequirement(int requirementID) {
    return project.getRequirement(requirementID);
}
    @Override
    public void addRequirement(Requirement requirement) {
        return project.addRequirement();
    }
    @Override
    public void removeRequirement(int requirementID) {
        return project.getRequirement(requirementID);
    }

    @Override
    public void appointScrumMaster(int employeeID) {

    }

    @Override
    public void appointProductOwner(int employeeID) {

    }

    @Override
    public Client getClient() {
        return null;
    }

    @Override
    public ArrayList<Requirement> getAllRequirements() {
        return null;
    }

    @Override
    public MyDate getProjectDeadline() {
        return null;
    }

    @Override
    public TeamMemberList getTeamMemberList() {
        return null;
    }

    @Override
    public int getProjectID() {
        return 0;
    }

    @Override
    public String getProjectName() {
        return null;
    }

    @Override
    public int getProjectEstimatedHours() {
        return 0;
    }

    @Override
    public int getProjectHoursWorked() {
        return 0;
    }

    @Override
    public String getProjectStatus() {
        return null;
    }

    @Override
    public ArrayList<Project> getProjectByStatus(String status) {
        return null;
    }

    @Override
    public Project getProjectByTeamMemberID(int teamMemberID) {
        return null;
    }

    @Override
    public Project getProjectByProjectName(String projectName) {
        return null;
    }

    @Override
    public Project getProjectByProjectClient(String clientName) {
        return null;
    }

    @Override
    public void updateRequirementStatus(ArrayList<String> taskStatus) {

    }

    @Override
    public void addTask(Task task) {

    }

    @Override
    public void removeTask(int taskID) {

    }

    @Override
    public ArrayList<Task> getAllTasks() {
        return null;
    }

    @Override
    public MyDate getRequirementDeadline() {
        return null;
    }

    @Override
    public Task getTasks(int taskID) {
        return null;
    }

    @Override
    public Employee getResponsibleTeamMember() {
        return null;
    }

    @Override
    public int getRequirementID() {
        return 0;
    }

    @Override
    public String getRequirementName() {
        return null;
    }

    @Override
    public String getUserStory() {
        return null;
    }

    @Override
    public int getRequirementEstimatedHours() {
        return 0;
    }

    @Override
    public int getRequirementHoursWorked() {
        return 0;
    }

    @Override
    public String getRequirementStatus() {
        return null;
    }

    @Override
    public void addTeamMember(Employee teamMember) {

    }

    @Override
    public void removeTeamMember(int employeeID) {

    }

    @Override
    public ArrayList<Employee> getAllTeamMembers() {
        return null;
    }

    @Override
    public int getNumberOfTeamMembers() {
        return 0;
    }

    @Override
    public String getClientName() {
        return null;
    }

    @Override
    public String getClientEmail() {
        return null;
    }

    @Override
    public String getClientPhoneNumber() {
        return null;
    }
}