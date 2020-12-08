import java.util.ArrayList;

public class ProjectList
{
  private ArrayList<Project> projects;


  public ProjectList(){
    projects = new ArrayList<>();
  }


  public Project getProject(int projectID){
    for (int i = 0; i < projects.size(); i++)
    {
      if (projects.get(i).getProjectID() == projectID){
        return projects.get(i);
      }
    }
    return null; //Throw something
  }

  public void addProject(Project project){
    projects.add(project);
  }

  public void removeProject(int projectID){
    for (int i = 0; i < projects.size(); i++)
    {
      if (projects.get(i).getProjectID() == projectID){
         projects.remove(i);
        break; //Det er unik ID så når det er fundet kan vi godt stoppe
      }
    }
  }

  public ArrayList<Project> getProjects()
  {
    return projects;
  }

  public int getNumberOfProjects(){
    return projects.size();
  }

  public ArrayList<Project> getProjectByStatus(String status){
    ArrayList<Project> placeHolder = new ArrayList<>();

    for (int i = 0; i < projects.size(); i++)
    {
      if (projects.get(i).getProjectStatus().equals(status)){
        placeHolder.add(projects.get(i));
      }
    }
    return placeHolder;
  }

  public Project getProjectByID(int projectID){
    for (int i = 0; i < projects.size(); i++)
    {
      if (projects.get(i).getProjectID() == projectID){
        return projects.get(i);
      }
    }
    return null;
  }

  public Project getProjectByProjectName(String projectName){
    for (int i = 0; i < projects.size(); i++)
    {
      if (projects.get(i).getProjectName().equals(projectName)){
        return projects.get(i);
      }
    }
    return null;
  }

  public Project getProjectByProjectClient(String clientName){
    for (int i = 0; i < projects.size(); i++)
    {
      if (projects.get(i).getClient().getClientName().equals(clientName)){
        return projects.get(i);
      }
    }
    return null;
  }

  public Project getProjectByTeamMemberID(int teamMemberID){
    for (int i = 0; i < projects.size(); i++)
    {
       if (projects.get(i).getTeamMemberList().getTeamMember(teamMemberID) != null){
         return projects.get(i);
       }
    }
    return null;
  }


}
