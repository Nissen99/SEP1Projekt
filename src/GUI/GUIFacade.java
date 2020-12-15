package GUI;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUIFacade
{

  private static GUIFacade guiFacade;


  public static GUIFacade getInstance(){
    return guiFacade;
  }


  public void start(Stage stage) throws Exception
  {
    Parent p = FXMLLoader.load(getClass().getResource("MainView.fxml"));

  Scene scene = new Scene(p);
        scene.setFill(javafx.scene.paint.Color.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
}



}
