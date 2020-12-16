package GUI;

import Acquaintance.IData;
import Acquaintance.IGUI;
import Acquaintance.ILogik;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUIFacade extends Application implements IGUI
{

  private static GUIFacade guiFacade;
  public static ILogik logik;

  public static GUIFacade getInstance(){
    return guiFacade;
  }

    @Override
  public void start(Stage stage) throws Exception
  {
      FXMLLoader loader = new FXMLLoader();
      Parent root = FXMLLoader.load(getClass().getResource("StartSide.fxml"));
      Scene scene = new Scene(root);
      stage.setResizable(true);
      stage.setScene(scene);
      stage.show();

}

    @Override
    public void injectLogik(ILogik _logik) {
      logik = logik;
    }

    @Override
    public void start2() {
        launch();
    }
}




