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

    Project gg = new Project("bøgse", 48, new Client("Mikkel bøgse", "guderup@nedern", "36728172"), new TeamMemberList(), new MyDate(3,5,2020));
      Project gg1 = new Project("Homo", 60, new Client("lul bøgse", "guderup@nedern", "36728172"), new TeamMemberList(), new MyDate(3,5,2020));
      Project gg2 = new Project("lul", 48, new Client("Nicee bøgse", "guderup@nedern", "36728172"), new TeamMemberList(), new MyDate(3,5,2020));
      Project gg3 = new Project("haha", 48, new Client("nej bøgse", "guderup@nedern", "36728172"), new TeamMemberList(), new MyDate(3,5,2020));






      ProjectList projectList = new ProjectList();
      projectList.addProject(gg);
      projectList.addProject(gg1);
      projectList.addProject(gg2);
      projectList.addProject(gg3);
      teamMemberList.addEmployee(mikkel);
    teamMemberList.addEmployee(mikkel2);
    teamMemberList.addEmployee(mikkel3);
    teamMemberList.addEmployee(mikkel4);
    teamMemberList.addEmployee(mikkel5);


    DataManagement data = new DataManagement();
    data.writeToFile(projectList);
    mikkel.setRole("Whatever");
      System.out.println(data.loadProject());
  }
}
