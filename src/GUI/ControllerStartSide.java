package GUI;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerStartSide implements Initializable
{

  public Button medarbejdereKnap;
  public Button projekterKnap;
  private Model model;





//  public void skift(){
//    model.skift("bøgse");
//  }

  public void setModel(Model model){
    this.model = model;
  }





    public void ChangeScene(javafx.event.ActionEvent actionEvent) throws IOException {
        if(actionEvent.getSource() == medarbejdereKnap) {
            Parent nextView = FXMLLoader.load(getClass().getResource("EmployeeUI.fxml"));
            Scene newScene = new Scene(nextView);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(newScene);

    }  else if (actionEvent.getSource() == projekterKnap) {
            Parent nextView = FXMLLoader.load(getClass().getResource("ProjectUI.fxml"));
            Scene newScene = new Scene(nextView);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(newScene);
            stage.setScene(newScene);
        }
}

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
