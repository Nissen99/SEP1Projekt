package Acquaintance;

import LogikLag.*;

import java.util.ArrayList;

public interface ILogik {

  void injectData(IData _data);

    int getEmployeeID();
    int getNumberOfProjects();
    int getProjectID();
    Project getProjectByTeamMemberID(int teamMemberID);
    Task getTasks(int taskID);
    Employee getResponsibleTeamMember();
    int getRequirementHoursWorked();


}

