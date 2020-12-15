package GUI;

import javafx.scene.layout.Region;


public class ControllerFrontPage
{


  private ViewHandlerOne whatever;
  private GUIFacade guiFacade;
  private Region root;


  public void init(ViewHandlerOne viewHandler, GUIFacade facade, Region root){
    this.guiFacade = facade;
    this.whatever = viewHandler;
    this.root = root;
  }


  public void switchScene(){
  whatever.loadView();
  }

}
