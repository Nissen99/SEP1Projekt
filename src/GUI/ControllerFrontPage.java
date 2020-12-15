package GUI;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class ControllerFrontPage
{

  @FXML public Button switcher;
  private ViewHandlerOne whatever;
  private GUIFacade guiFacade;
  private Region root;


  public void init(ViewHandlerOne viewHandler, GUIFacade facade, Region root){
    this.guiFacade = facade;
    this.whatever = viewHandler;
    this.root = root;
  }

  @FXML
  public void switchScene(ActionEvent event) throws IOException
  {
    if(event.getSource() == switcher){
    Parent root = FXMLLoader.load(getClass().getResource("test123.fxml"));

    Scene scene = new Scene(root);

    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    stage.setResizable(true);
    stage.setScene(scene);
    stage.show();
  }
  }

//    try
//    {
//
//      FXMLLoader loader = new FXMLLoader();
//      Region root = loader.load();
//      Parent nextView = loader.load(getClass().getResource("test123.fxml"));
//    }catch (IOException e){
//      e.printStackTrace();
//    }
//    System.out.println("Whateatea");
//  }

}
