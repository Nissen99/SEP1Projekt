package LogikLag;

import java.io.Serializable;
import java.util.ArrayList;

public class IDGen implements Serializable
{
  private ArrayList<Integer> employeeIDs = new ArrayList<>();
  private ArrayList<Integer> projectIDs = new ArrayList<>();
  private ArrayList<Integer> taskIDs = new ArrayList<>();
  private ArrayList<Integer> requirementIDs = new ArrayList<>();




  public int generateEmployeeID(){
    int generated = 0;
    boolean runAgain;

    do
    {
      runAgain = false;
      generated = (int) (Math.random() * 899 + 100);

      for (int i = 0; i < employeeIDs.size(); i++)
      {
        if (employeeIDs.get(i) == generated)
        {
          runAgain = true;
        }

      }
    }while (runAgain);

    return generated;

  }



  public int generateProjectID(){
    int generated = 0;
    boolean runAgain;

    do
    {
      runAgain = false;
      generated = (int) (Math.random() * 899 + 100);

      for (int i = 0; i < projectIDs.size(); i++)
      {
        if (projectIDs.get(i) == generated)
        {
          runAgain = true;
        }

      }
    }while (runAgain);

    return generated;
  }

  public int generateTaskID(){
    int generated = 0;
    boolean runAgain;

    do
    {
      runAgain = false;
      generated = (int) (Math.random() * 899 + 100);

      for (int i = 0; i < taskIDs.size(); i++)
      {
        if (taskIDs.get(i) == generated)
        {
          runAgain = true;
        }

      }
    }while (runAgain);

    return generated;
  }



  public int generateRequirementID(){
    int generated = 0;
    boolean runAgain;

    do
    {
      runAgain = false;
      generated = (int) (Math.random() * 899 + 100);

      for (int i = 0; i < requirementIDs.size(); i++)
      {
        if (requirementIDs.get(i) == generated)
        {
          runAgain = true;
        }

      }
    }while (runAgain);

    return generated;
  }


}
