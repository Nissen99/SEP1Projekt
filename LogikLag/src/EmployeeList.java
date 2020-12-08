import java.util.ArrayList;

public class EmployeeList
{
  private ArrayList<Employee> employees;


  public EmployeeList(){
    employees = new ArrayList<>();
  }

  public Employee getEmployee(int employeeID){
    for (int i = 0; i < employees.size(); i++)
    {
      if (employees.get(i).getEmployeeID() == employeeID){
        return employees.get(i);
      }
    }
    return null; //Throw something
  }


  public void addEmployee(Employee employee){
    employees.add(employee);
  }

  public void removeEmployee(int employeeID){
    for (int i = 0; i < employees.size(); i++)
    {
      if (employees.get(i).getEmployeeID() == employeeID){
        employees.remove(i);
        break; //Det er unik ID så når det er fundet kan vi godt stoppe
      }
    }
  }

  public ArrayList<Employee> getAllEmployees(){
    return employees;
  }

}
