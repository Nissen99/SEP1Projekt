package Acquaintance;

import LogikLag.Employee;
import LogikLag.Project;
import LogikLag.Task;
import javafx.stage.Stage;

public interface IGUI {
void injectLogik(ILogik logik);
    void start2();
    int getEmployeeID();
    int getNumberOfProjects();
    int getProjectID();
    Project getProjectByTeamMemberID(int teamMemberID);
    Task getTasks(int taskID);
    Employee getResponsibleTeamMember();







}
