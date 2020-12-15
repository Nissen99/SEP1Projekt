package GUI;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.Region;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ViewHandlerOne
{

  private GUIFacade facade;


  public ViewHandlerOne(GUIFacade facade){
    this.facade = facade;
  }





public void loadView()
  {


    try
    {
      FXMLLoader loader = new FXMLLoader();
      Region root = loader.load();
      Parent nextView = loader.load(getClass().getResource("test123" + ".fxml"));

    }
    catch (IOException e)
    {
      e.printStackTrace();
    }



  }


}
