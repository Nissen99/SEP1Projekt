package LogikLag;

import Acquaintance.IData;
import Acquaintance.ILogik;
import Datalag.DataManagement;

public class TestLogik
{
    private LogikFacade logikFacade;
    private IData data;
  public static void main(String[] args)
  {

    Employee mikkel = new Employee("Mikkel");
    Employee mikkel2 = new Employee("Mikkel2");
    Employee mikkel3 = new Employee("Mikkel3");
    Employee mikkel4 = new Employee("Mikkel4");
    Employee mikkel5 = new Employee("Mikkel5");

   EmployeeList teamMemberList = new EmployeeList();


    teamMemberList.addEmployee(mikkel);
    teamMemberList.addEmployee(mikkel2);
    teamMemberList.addEmployee(mikkel3);
    teamMemberList.addEmployee(mikkel4);
    teamMemberList.addEmployee(mikkel5);


    DataManagement data = new DataManagement();
    data.writeToFile(teamMemberList);
    mikkel.setRole("Whatever");
      System.out.println(data.loadEmployee());
  }
}
