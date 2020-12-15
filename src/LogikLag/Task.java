package LogikLag;

import java.io.Serializable;

public class Task implements Serializable
{
  private MyDate taskDeadline;
  private int taskID;
  private String taskName;
  private String taskDescription;
  private int taskHoursWorked;
  private int taskEstimatedHours;
  private String taskStatus;
  private Employee responsibleTeamMember;
  private String taskText;


  public Task(String taskName, String taskDescription, int taskEstimatedHours, MyDate taskDeadline, Employee responsibleTeamMember, String taskText){

    this.taskName = taskName;
    this.taskDescription = taskDescription;
    this.taskEstimatedHours = taskEstimatedHours;
    this.taskDeadline = taskDeadline.copy();
    this.responsibleTeamMember = responsibleTeamMember;
    this.taskText = taskText;

    taskHoursWorked = 0;
    taskStatus = "Not started";

    //ID generator
  }

  public MyDate getTaskDeadline()
  {
    return taskDeadline.copy();
  }

  public int getTaskID()
  {
    return taskID;
  }

  public String getTaskName()
  {
    return taskName;
  }

  public String getTaskDescription()
  {
    return taskDescription;
  }

  public int getTaskHoursWorked()
  {
    return taskHoursWorked;
  }

  public int getTaskEstimatedHours()
  {
    return taskEstimatedHours;
  }

  public String getTaskStatus()
  {
    return taskStatus;
  }

  public Employee getResponsibleTeamMember()
  {
    return responsibleTeamMember;
  }

  public void addTaskHoursWorked(int hours){
    this.taskHoursWorked += hours;
  }

  public void updateTaskStatus(String taskStatus){
    //TO DO
  }
}
