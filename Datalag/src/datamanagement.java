

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
    public void readEmployee() throws FileNotFoundException {
        Scanner scanner = new Scanner(EMPLOYEE_FILE);
        System.out.println(scanner.nextLine());
    }

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
    public void WritetoFile(Employee employee) {
        try {
            FileOutputStream outputStream = new FileOutputStream(EMPLOYEE_FILE);
            ObjectOutputStream WriteToFile =  new ObjectOutputStream(outputStream);
            WriteToFile.writeObject(employee);
            outputStream.close();
            WriteToFile.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(datamanagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(datamanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Employee loadEmployee() {
        Employee employee = null;
        try {
            FileInputStream inputStream = new FileInputStream(EMPLOYEE_FILE);
            ObjectInputStream loadEmployee = new ObjectInputStream(inputStream);
            employee = (Employee) loadEmployee.readObject();
            inputStream.close();
            loadEmployee.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(datamanagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(datamanagement.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(datamanagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employee;
    }
}
