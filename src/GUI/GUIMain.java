package GUI;

import javafx.application.Application;
import javafx.stage.Stage;


public class GUIMain extends Application
{

  public void start(Stage primaryStage) throws Exception
  {

GUIFacade facade = new GUIFacade();
ViewHandlerOne viewHandler = new ViewHandlerOne(facade);
facade.start(primaryStage);


  }

  public static void main(String[] args) {
    launch(args);
  }
}



