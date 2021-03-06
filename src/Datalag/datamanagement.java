package Datalag;

import Acquaintance.ILogik;
import LogikLag.Employee;
import LogikLag.EmployeeList;
import LogikLag.Project;
import LogikLag.ProjectList;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class datamanagement implements Serializable {


    public datamanagement() {
    }

    File employeeFile = new File("EmployeeFile" + ".bin");
    File projectFile = new File("ProjectFile" + ".bin");

//Overloading princippet bliver benyttet her og i projectlisten.
    public void writeToFile(EmployeeList employees) {

        try {

            FileOutputStream outputStream = new FileOutputStream(employeeFile);
            ObjectOutputStream WriteToFileStream = new ObjectOutputStream(outputStream);
            WriteToFileStream.writeObject(employees);
            outputStream.close();
            WriteToFileStream.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(datamanagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(datamanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Overloading princippet bliver benyttet her og i EmployeeListen.
    public void writeToFile(ProjectList projectList) {

        try {

            FileOutputStream outputStream = new FileOutputStream(projectFile);
            ObjectOutputStream WriteToFileStream = new ObjectOutputStream(outputStream);
            WriteToFileStream.writeObject(projectList);
            outputStream.close();
            WriteToFileStream.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(datamanagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(datamanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public EmployeeList loadEmployee() {

        EmployeeList employees = null;

        try {
            FileInputStream inputStream = new FileInputStream(employeeFile);
            ObjectInputStream loadEmployee = new ObjectInputStream(inputStream);

            employees = (EmployeeList) loadEmployee.readObject();
            inputStream.close();
            loadEmployee.close();


        } catch (FileNotFoundException ex) {
            Logger.getLogger(datamanagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(datamanagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(datamanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employees;
    }


    public ProjectList loadProject() {

        ProjectList projects = null;

        try {
            FileInputStream inputStream = new FileInputStream(projectFile);
            ObjectInputStream loadEmployee = new ObjectInputStream(inputStream);

            projects = (ProjectList) loadEmployee.readObject();
            inputStream.close();
            loadEmployee.close();


        } catch (FileNotFoundException ex) {
            Logger.getLogger(datamanagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(datamanagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(datamanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return projects;
    }



    public ArrayList<Employee> getAllEmployeesFromFile()
    {
        EmployeeList employeeList = null;
        try
        {
            FileInputStream inputStream = new FileInputStream(employeeFile);
            ObjectInputStream loadEmployee = new ObjectInputStream(inputStream);

            employeeList = (EmployeeList) loadEmployee.readObject();
            inputStream.close();
            loadEmployee.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        ArrayList<Employee> employeeArrayList = employeeList.getAllEmployees();


        return employeeArrayList;
    }

    //Overloading
    public ArrayList<Project> getAllProjectsFromFile()
    {


        ProjectList projectList = null;

        try
        {
            FileInputStream inputStream = new FileInputStream(projectFile);
            ObjectInputStream loadEmployee = new ObjectInputStream(inputStream);

            projectList = (ProjectList) loadEmployee.readObject();
            inputStream.close();
            loadEmployee.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        ArrayList<Project> projectArrayList = projectList.getProjects();


        return projectArrayList;
    }


    //Overloading
    public ArrayList<Project> getAllProjectsFromFile(Employee employee)
    {
        ProjectList projectList = null;
        try
        {
            FileInputStream inputStream = new FileInputStream(projectFile);
            ObjectInputStream loadEmployee = new ObjectInputStream(inputStream);

            projectList = (ProjectList) loadEmployee.readObject();
            inputStream.close();
            loadEmployee.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        ArrayList<Project> projectArrayList = projectList.getProjectsByTeamMemberID(employee.getEmployeeID());


        return projectArrayList;
    }








    public ArrayList<Employee> getAllTeamMembersFromProject(Project project)
    {


        ArrayList<Employee> employeeArrayList = project.getTeamMemberList().getAllTeamMembers();


        return employeeArrayList;
    }

}
