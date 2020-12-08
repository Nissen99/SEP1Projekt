import java.util.ArrayList;

public class TeamMemberList
{
  private ArrayList<Employee> employees;

  public TeamMemberList()
  {
   employees = new ArrayList<>();

  }

  public Employee getTeamMember(int employeeID){
    for (int i = 0; i < employees.size(); i++)
    {
      if (employees.get(i).getEmployeeID() == employeeID){
        return employees.get(i);
      }
    }
    return null; //Prob Throw something
  }


  public void addTeamMember(Employee teamMember)
  {
    employees.add(teamMember.copy());
    employees.get(getNumberOfTeamMembers()-1).setRole("team member");
  }

  public void removeTeamMember(int employeeID){
    for (int i = 0; i < employees.size(); i++)
    {
      if (employees.get(i).getEmployeeID() == employeeID){
        employees.remove(i);
        break; //Det er unik ID så når det er fundet kan vi godt stoppe
      }
    }
  }

  public ArrayList<Employee> getAllTeamMembers()
  {
    return employees;
  }

  public int getNumberOfTeamMembers(){
    return employees.size();
  }

}
