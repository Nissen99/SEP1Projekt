package GUI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class ControllerProjects
{
@FXML
private Button return_btn_return;
@FXML
private Button opretProjekt;


//  public void setModel(Model model){
//  this.model = model;
//}
@FXML
public void opretProjekt(ActionEvent event) throws IOException {
    System.out.println("fuck du bøgse");
        Parent nextView = FXMLLoader.load(getClass().getResource("OpretProjekt.fxml"));
        Scene newScene = new Scene(nextView);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(newScene);

}
public void findProjekt(){
  System.out.println("Fuck det bøgse");
// model.findProjekt
}

public void seKrav(){
  System.out.println("pop ud for Krav");
}

public void sletProjekt(){
  System.out.println("Slet projekt");
}

public void addTeamMember(){
  System.out.println("adder team member");
}

public void fjernTeamMember(){
  System.out.println("fuck off mr team member");
}

  @FXML
  public void ChangeScene(javafx.event.ActionEvent actionEvent) throws IOException {
   if(actionEvent.getSource() == return_btn_return) {
      Parent nextView = FXMLLoader.load(getClass().getResource("StartSide.fxml"));
      Scene newScene = new Scene(nextView);
      Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
      stage.setScene(newScene);
    }}}