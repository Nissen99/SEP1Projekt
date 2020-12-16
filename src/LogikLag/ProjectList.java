package LogikLag;

import java.io.Serializable;
import java.util.ArrayList;

public class ProjectList implements Serializable
{
  private ArrayList<Project> projects;


  public ProjectList(){
    projects = new ArrayList<>();
  }

// er det ike det samme som getProjectID?
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
// vi har metoden to steder måske skal vi samle eller noget i den duer. en her og en anden i project.
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
  // samme her med project står 2 steder eventuelt samler vi den i project så det ikke fylder.

  public Project getProjectByID(int projectID){
    for (int i = 0; i < projects.size(); i++)
    {
      if (projects.get(i).getProjectID() == projectID){
        return projects.get(i);
      }
    }
    return null;
  }
// vi har en metode i project der hedder getprojectname har ikke kigget grundigt på den men eventuelt
  // er det ikke den samme metode?
  public Project getProjectByProjectName(String projectName){
    for (int i = 0; i < projects.size(); i++)
    {
      if (projects.get(i).getProjectName().equals(projectName)){
        return projects.get(i);
      }
    }
    return null;
  }

  public ArrayList<Project> getProjectsByProjectClient(String clientName){
    for (int i = 0; i < projects.size(); i++)
    {
      ArrayList<Project> projectArrayList = new ArrayList<>();

      if (projects.get(i).getClient().getClientName().equals(clientName)){
      projectArrayList.add(projects.get(i));
      }
    }
    return projects;
  }

  public ArrayList<Project> getProjectsByTeamMemberID(int teamMemberID){
    ArrayList<Project> projectArrayList = new ArrayList<>();

    for (int i = 0; i < projects.size(); i++)
    {
      if (projects.get(i).getTeamMemberList().getTeamMember(teamMemberID) != null){
         projectArrayList.add(projects.get(i));
       }
    }
    return projectArrayList;
  }


}
