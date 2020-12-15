package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUIFacade extends Application
{

  private static GUIFacade guiFacade;


  public static GUIFacade getInstance(){
    return guiFacade;
  }

@Override
  public void start(Stage stage) throws Exception
  {
      Parent root = FXMLLoader.load(getClass().getResource("StartSide.fxml"));
      Scene scene = new Scene(root);
      stage.setResizable(true);
      stage.setScene(scene);
      stage.show();
}


    public static void main(String[] args) {
        launch(args);

    }
}




