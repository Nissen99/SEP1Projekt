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
  private ViewHandler viewHandler;



    public void ChangeScene(ActionEvent event) throws IOException {
        viewHandler.ChangeScene(event, "EmployeeUI.fxml");

        }


        public void opretMedarbejder() throws IOException
        {
      EmployeeList list = logikFacade.loadEmployee();
      list.addEmployee(new Employee(textFieldMedArbejder.getText()));
      logikFacade.writeToFile(list);
      textFieldMedArbejder.clear();
          System.out.println("Medarbejder oprettet");
    }
    public void setViewHandler(ViewHandler viewHandler) {
        this.viewHandler = viewHandler;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ViewHandler viewHandler = new ViewHandler();
        setViewHandler(viewHandler);
    }
}
