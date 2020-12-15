package GUI;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Region;

import java.io.IOException;

public class ViewHandlerOne
{

  private GUIFacade facade;


  public ViewHandlerOne(GUIFacade facade){
    this.facade = facade;
  }





public void loadView(String string)
  {


    try
    {
      FXMLLoader loader = new FXMLLoader();
      Region root = loader.load();
      Parent nextView = loader.load(getClass().getResource("test123.fxml"));

    }
    catch (IOException e)
    {
      e.printStackTrace();
    }



  }
  public void loadView()
  {


    try
    {
      FXMLLoader loader = new FXMLLoader();
      Region root = loader.load();
      Parent nextView = loader.load(getClass().getResource("Student" + ".fxml"));

    }
    catch (IOException e)
    {
      e.printStackTrace();
    }



  }



}
