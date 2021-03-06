package LogikLag;

import java.io.Serializable;
import java.util.ArrayList;

public class Requirement extends IDGen implements Serializable
{
  private MyDate requirementDeadline;
  private ArrayList<Task> tasks;
  private Employee responsibleTeamMember;
  private int requirementID;
  private String requirementName;
  private String userStory;
  private int requirementEstimatedHours;
  private int requirementHoursWorked;
  private String requirementStatus;

  public Requirement(String requirementName, String userStory,
      int requirementEstimatedHours, Employee responsibleTeamMember,
      MyDate requirementDeadline)
  {
    this.requirementName = requirementName;
    this.userStory = userStory;
    this.requirementEstimatedHours = requirementEstimatedHours;
    this.requirementDeadline = requirementDeadline.copy();
    this.responsibleTeamMember = responsibleTeamMember;
    tasks = new ArrayList<>();
    requirementStatus = "Not started";

    this.requirementID = generateRequirementID();

  }

  public void updateRequirementStatus(ArrayList<String> taskStatus){
    for (int i = 0; i < tasks.size(); i++)
    {
      if (tasks.get(i).getTaskStatus().equals("startet")){
        this.requirementStatus = "startet";
      }
    }

    if (tasks.stream().allMatch(task -> task.getTaskStatus().equals("afsluttet")));{
      this.requirementStatus = "afsluttet";
    }
  }


  public void addTask(Task task)
  {
    tasks.add(task);
  }

  public void removeTask(int taskID)
  {

    for (int i = 0; i < tasks.size(); i++)
    {
      if (tasks.get(i).getTaskID() == taskID)
      {
        tasks.remove(i);
        break; //Det er unik ID så når det er fundet kan vi godt stoppe
      }
    }
  }

  public ArrayList<Task> getAllTasks()
  {
    return tasks;
  }

  public MyDate getRequirementDeadline()
  {
    return requirementDeadline.copy();
  }

  public Task getTasks(int taskID)
  {
    for (int i = 0; i < tasks.size(); i++)
    {
      if (tasks.get(i).getTaskID() == taskID)
      {
        return tasks.get(i);
      }
    }
    return null; //Should Throw something I think
  }

  public Employee getResponsibleTeamMember()
  {
    return responsibleTeamMember;
  }

  public int getRequirementID()
  {
    return requirementID; //.copy();
  }

  public String getRequirementName()
  {
    return requirementName;
  }

  public String getUserStory()
  {
    return userStory;
  }
  //bliver også brugt i project eventuelt skal det slettes i project eller her.
  public int getRequirementEstimatedHours()
  {
    return requirementEstimatedHours;
  }
  //bliver også brugt i project eventuelt skal det slettes i project eller her.
  public int getRequirementHoursWorked()
  {
    return requirementHoursWorked;
  }
//bliver også brugt i project eventuelt skal det slettes i project eller her.
  public String getRequirementStatus()
  {
    return requirementStatus;
  }

}
