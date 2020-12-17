package GUI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerStartSide implements Initializable
{

  public Button medarbejdereKnap;
  public Button projekterKnap;
  private ViewHandler viewHandler;




//  public void skift(){
//    model.skift("bøgse");
//  }
    public void ChangeScene(ActionEvent event) throws IOException {
        if(event.getSource() == medarbejdereKnap) {
            viewHandler.ChangeScene(event, "EmployeeUI.fxml");


    }  else if (event.getSource() == projekterKnap) {
                viewHandler.ChangeScene(event, "ProjectUI.fxml");


        }

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
