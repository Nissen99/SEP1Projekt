import java.util.ArrayList;

public class Project
{
  private Client client;
  private ArrayList<Requirement> requirements;
  private MyDate projectDeadline;
  private TeamMemberList teamMemberList;
  private int projectID;
  private String projectName;
  private int projectEstimatedHours;
  private int projectHoursWorked;
  private String projectStatus;

  public Project(String projectName, int projectEstimatedHours, Client client,
      TeamMemberList teamMemberList, MyDate projectDeadline)
  {
    this.projectName = projectName;
    this.projectEstimatedHours = projectEstimatedHours;
    this.client = client;
    this.teamMemberList = teamMemberList;
    this.projectDeadline = projectDeadline.copy();

    this.projectStatus = "Not Started";
    requirements = new ArrayList<>();
  }


  public Requirement getRequirement(int requirementID){
    for (int i = 0; i < requirements.size(); i++)
    {
      if (requirements.get(i).getRequirementID() == requirementID){
        return requirements.get(i);
      }
    }
    return null; //Throw something idk
  }




  public void addRequirement(Requirement requirement)
  {
    requirements.add(requirement);
  }

  public void removeRequirement(int requirementID)
  {
    for (int i = 0; i < requirements.size(); i++)
    {
      if (requirements.get(i).getRequirementID() == requirementID)
      {
        requirements.remove(i);
        break; //Det er unik ID så når det er fundet kan vi godt stoppe
      }
    }
  }

  //Der kan kun være 1 product owner/scrum master, så hvis en ny bliver sat
  // laver vi den nuværende til "team member" igen
  public void appointScrumMaster(int employeeID)
  {

    for (int i = 0; i < teamMemberList.getNumberOfTeamMembers(); i++)
    {
      if (teamMemberList.getAllTeamMembers().get(i).getRole().equals("scrum master"))
      {
        teamMemberList.getAllTeamMembers().get(i).setRole("team member");
      }
    }

    for (int i = 0; i < teamMemberList.getNumberOfTeamMembers(); i++)
    {
      if (teamMemberList.getAllTeamMembers().get(i).getEmployeeID()
          == employeeID)
      {
        teamMemberList.getAllTeamMembers().get(i).setRole("scrum master");
      }
    }
  }

  public void appointProductOwner(int employeeID)
  {

    for (int i = 0; i < teamMemberList.getNumberOfTeamMembers(); i++)
    {
      if (teamMemberList.getAllTeamMembers().get(i).getRole()
          .equals("product owner"))
      {
        teamMemberList.getAllTeamMembers().get(i).setRole("team member");
      }
    }

    for (int i = 0; i < teamMemberList.getNumberOfTeamMembers(); i++)
    {
      if (teamMemberList.getAllTeamMembers().get(i).getEmployeeID()
          == employeeID)
      {
        teamMemberList.getAllTeamMembers().get(i).setRole("product owner");
      }
    }
  }

  public Client getClient()
  {
    return client;
  }

  public ArrayList<Requirement> getAllRequirements()
  {
    return requirements;
  }

  public MyDate getProjectDeadline()
  {
    return projectDeadline;
  }

  public TeamMemberList getTeamMemberList()
  {
    return teamMemberList;
  }

  public int getProjectID()
  {
    return projectID;
  }

  public String getProjectName()
  {
    return projectName;
  }

  public int getProjectEstimatedHours()
  {
    return projectEstimatedHours;
  }

  public int getProjectHoursWorked()
  {
    return projectHoursWorked;
  }

  public String getProjectStatus()
  {
    return projectStatus;
  }
}
