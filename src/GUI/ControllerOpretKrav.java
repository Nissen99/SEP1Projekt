package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerOpretKrav implements Initializable
{

  @FXML public TextField textFieldName;
  @FXML public TextArea teaxtAreaUserStory;
  @FXML public TextField textFieldTidsOverslag;
  @FXML public DatePicker dateReaderDeadline;
  @FXML public ComboBox comboBoxAnsvarligTeam;
  @FXML public Button opretKravAnsvarligTeamMenber;
  private ViewHandler viewHandler;


  public void returnmetode(ActionEvent event) throws IOException {
    viewHandler.ChangeScene(event, "KravUI.fxml");
  }

  public void setViewHandler(ViewHandler viewHandler) {
    this.viewHandler = viewHandler;
  }
  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    ViewHandler viewHandler = new ViewHandler();
    setViewHandler(viewHandler);
  }
}
