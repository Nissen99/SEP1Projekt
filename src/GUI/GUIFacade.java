package GUI;

import Acquaintance.IGUI;
import Acquaintance.ILogik;
import LogikLag.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GUIFacade extends Application implements IGUI
{

  private static GUIFacade guiFacade;
  private static ILogik logik;
    LogikFacade logikFacade = new LogikFacade();
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
    public void injectLogik(ILogik logik) {
      this.logik = logik;

    }
    public ILogik getLogik() {
      return logik;
    }


    @Override
    public void start2() {
        launch();
    }

    @Override
    public void startApplication(String[] args) {
        guiFacade = this;
        launch(args);
    }

}


