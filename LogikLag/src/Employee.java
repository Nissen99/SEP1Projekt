public class Employee
{
  private int employeeID;
  private String employeeName;
  private int numberOfProjects;
  private String role;

  public Employee(String employeeName)
  {
    this.employeeName = employeeName;
    this.role = "Employee";
  }

  public void setRole(String role){
this.role = role; //Switch case later
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
