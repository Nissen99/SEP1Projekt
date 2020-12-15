package Datalag;

import LogikLag.Employee;
import LogikLag.EmployeeList;
import LogikLag.Project;
import LogikLag.ProjectList;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class datamanagement implements Serializable {
    // mener vi allerede har et array for employee gjorde bare det her for der ikke fejl.
    private ArrayList<String> employees;
    private static final File EMPLOYEE_FILE = new File("Employee.txt");
    private static final File TEAMMENBERS_FILE = new File("Employee.txt");
    private static final File PROJECT_FILE = new File("Employee.txt");
    FileWriter fileWriter = null;

    public datamanagement() {
        employees = new ArrayList<>();
    }
/*
    public Arraylist<Employee> getEmployee throws FileNotFoundException {
        readEmployee();
        return employees;
    }
*/


    public ProjectList readProjects() throws FileNotFoundException
    {

        Scanner scanner = new Scanner(PROJECT_FILE);
        ProjectList projectList = new ProjectList();
        String s;

        while (scanner.hasNext()){
            s = scanner.nextLine();

            String[] split = s.split(", ");
//
//            Employee other = new Employee();
//            projectList.(other);

        }
        return projectList;
    }




    public EmployeeList readEmployees() throws FileNotFoundException
    {

             Scanner scanner = new Scanner(EMPLOYEE_FILE);
        EmployeeList employeeList = new EmployeeList();
               String s;
            while (scanner.hasNext()){
                s = scanner.nextLine();

                String[] split = s.split(", ");
//
//                Employee other = new Employee();
//                list.(other);

            }
            return employeeList;
        }}




/*
    public void saveScoreFile(Player player, GameTimer gameTimer) {
        try {
            int totalScore = player.getScore() + player.getCoin();
            fileWriter = new FileWriter(HIGHSCORE_FILE);
            fileWriter.append(player.getName() + ": " + totalScore + " point & "
                    + gameTimer.getTimeRemaining() + " sekunder.\n");
            fileWriter.close();
        } catch (IOException ex) {
            System.err.println("*** fejl ved FileWriter ***");
        }
    }
*/
//    public void WritetoFile(Employee employee) {
//        try {
//            FileOutputStream outputStream = new FileOutputStream(EMPLOYEE_FILE);
//            ObjectOutputStream WriteToFileStream =  new ObjectOutputStream(outputStream);
//            WriteToFileStream.writeObject(employee);
//            outputStream.close();
//            WriteToFileStream.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(datamanagement.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(datamanagement.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    public EmployeeList loadEmployee() {
//
//        EmployeeList employees;
//        try {
//            FileInputStream inputStream = new FileInputStream(EMPLOYEE_FILE);
//            ObjectInputStream loadEmployee = new ObjectInputStream(inputStream);
//
//           // employees = (Employee) loadEmployee.readObject();
//            inputStream.close();
//            loadEmployee.close();
//
//
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(datamanagement.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(datamanagement.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(datamanagement.class.getName()).log(Level.SEVERE, null, ex);
//        }
//      //  return employee;
//        return;
//    }
//
