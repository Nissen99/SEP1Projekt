package LogikLag;

import Datalag.datamanagement;

public class BinaryFileFix
{
    private LogikFacade logikFacade;
  public static void main(String[] args)
  {

    //Der bliver oprettet 5 Employees i systemet
    //Der bliver oprettet 4 projecter
    //Så bliver nogle af Employees lagt på et af projekterne



    Employee mikkel = new Employee("Mikkel");
    Employee mikkel2 = new Employee("Solaiman");
    Employee mikkel3 = new Employee("Bastion");
    Employee mikkel4 = new Employee("Antonio");

    Employee mikkel5 = new Employee("Mikkel5");

    EmployeeList teamMemberList = new EmployeeList();

    Project gg = new Project("Hule Project", 48, new Client("Mikkel", "guderup@nedern", "36728172"), new TeamMemberList(), new MyDate(3,5,2020));
    Project gg1 = new Project("Det sjove project", 60, new Client("lul", "guderup@nedern", "36728172"), new TeamMemberList(), new MyDate(3,5,2020));
    Project gg2 = new Project("Køkken", 48, new Client("Nicee", "guderup@nedern", "36728172"), new TeamMemberList(), new MyDate(3,5,2020));
    Project gg3 = new Project("spise bord", 48, new Client("nej", "guderup@nedern", "36728172"), new TeamMemberList(), new MyDate(3,5,2020));






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

    projectList.getProjects().get(0).getTeamMemberList().addTeamMember(mikkel);
    projectList.getProjects().get(0).getTeamMemberList().addTeamMember(mikkel2);
    projectList.getProjects().get(0).getTeamMemberList().addTeamMember(mikkel3);


    datamanagement data = new datamanagement();
    data.writeToFile(projectList);
    data.writeToFile(teamMemberList);
    System.out.println(data.loadProject());
    System.out.println("Nu burde din Bin filer være up to date :)");
  }
}
