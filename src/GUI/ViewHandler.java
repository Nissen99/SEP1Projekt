package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ViewHandler implements Initializable
{
private ViewHandler viewHandler;


  public ViewHandler(){

  }

public void ChangeScene(ActionEvent event, String FxmlFil) throws IOException {
  Parent nextView = FXMLLoader.load(getClass().getResource(FxmlFil));
  Scene newScene = new Scene(nextView);
  Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

  stage.setScene(newScene);
  stage.setScene(newScene);
  stage.setTitle(FxmlFil);
}



  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {

  }
}
