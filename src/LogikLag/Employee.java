package LogikLag;

import java.io.Serializable;

public class Employee implements  Serializable
{
  private int employeeID;
  private String employeeName;
  private int numberOfProjects;
  private String role;

  public Employee(String employeeName)
  {
    this.employeeName = employeeName;
    this.role = "employee";
  }

  public void setRole(String role){
 //Switch case for at være sikker på man får en valid rolle

    switch (role){

      case "employee":
        this.role = "employee";
        break;

      case "team member":
        this.role = "team member";
        break;

      case "scrum master":
        this.role = "scrum master";
        break;

      case "product owner":
        this.role = "product owner";
        break;

      default:
        break;
    }

  }

  public Employee copy()
  {

    Employee placeHolder = new Employee(this.employeeName); //Måske virker det her ??
    placeHolder.setRole(this.role);
    placeHolder.employeeID = this.employeeID;
    placeHolder.numberOfProjects = this.numberOfProjects;

    return placeHolder;
  }

  public String getRole()
  {
    return role;
  }

  public int getEmployeeID()
  {
    return employeeID;
  }

  public String getEmployeeName()
  {
    return employeeName;
  }

  public int getNumberOfProjects()
  {
    return numberOfProjects;
  }

}