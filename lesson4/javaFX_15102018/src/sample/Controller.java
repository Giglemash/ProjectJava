package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextArea textArea;

    @FXML
    TextArea textArea2;


    public void sendMsg(ActionEvent actionEvent) {
        textArea.appendText(textArea2.getText() + "\n");
        textArea2.clear();
        textArea2.requestFocus();
    }
}
