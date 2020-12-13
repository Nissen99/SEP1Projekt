package Acquaintance;

import LogikLag.Employee;

public interface IEmployee {
    void setRole(String role);
    Employee copy();
    String getRole();
    int getEmployeeID();
    String getEmployeeName();
    int getNumberOfProjects();
}
