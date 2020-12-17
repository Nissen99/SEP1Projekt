package GUI;
import LogikLag.Employee;
import LogikLag.EmployeeList;
import LogikLag.LogikFacade;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerOpretMedarbejder implements Initializable
{

  public Button opretetMedarbejder;
  public Button Returnknap;
  public TextField textFieldMedArbejder;
  private LogikFacade logikFacade = new LogikFacade();




    public void ChangeScene(javafx.event.ActionEvent actionEvent) throws IOException {
        if(actionEvent.getSource() == Returnknap) {
            Parent nextView = FXMLLoader.load(getClass().getResource("EmployeeUI.fxml"));
            Scene newScene = new Scene(nextView);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(newScene);
            stage.setScene(newScene);

    }
        }


        public void opretMedarbejder() throws IOException
        {
      EmployeeList list = logikFacade.loadEmployee();
      list.addEmployee(new Employee(textFieldMedArbejder.getText()));
      logikFacade.writeToFile(list);
      textFieldMedArbejder.clear();
          System.out.println("Medarbejder oprettet");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
