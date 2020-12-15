package Acquaintance;

import LogikLag.EmployeeList;
import LogikLag.ProjectList;

public interface IData {
    void writeToFile(EmployeeList employees);
    void writeToFile(ProjectList projectList);
    EmployeeList loadEmployee();
    ProjectList loadProject();

}
