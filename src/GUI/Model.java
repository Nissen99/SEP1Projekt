package GUI;
import LogikLag.Employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Model {

  private ArrayList<Employee> list = new ArrayList<>();

  public ArrayList<Employee> getAllStudentsFromFile()
  {
    Scanner in = null;
    try
    {
      in = new Scanner(new File(
          "C:\\Users\\Mikkel\\IdeaProjects\\JavaFXSEP\\Projects\\Students.txt"));
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }

    String s;

    while (in.hasNext())
    {

      s = in.nextLine();

      String[] split = s.split(", ");

      Employee other = new Employee(split[2]);

      list.add(other);

    }
    return list;
  }

}
