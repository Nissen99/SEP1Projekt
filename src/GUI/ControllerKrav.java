package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerKrav implements Initializable

{
  private ViewHandler viewHandler;


  public void findKrav(){
    System.out.println("finder bøgser");
    // model.findProjekt
  }

  public void sletkrav(){
    System.out.println("Slet krav");
  }

  public void addKrav(){
    System.out.println("adder krav");
  }

  public void fjernKrav(){
    System.out.println("fuck off med dit lorte krav");
  }
  @FXML
  public void returnmetode(ActionEvent event) throws IOException {
    viewHandler.ChangeScene(event, "ProjectUI.fxml");
  }
  public void opretkrav(ActionEvent event) throws IOException {
    viewHandler.ChangeScene(event, "OpretKrav.fxml");
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


