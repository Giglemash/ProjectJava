package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

//    @FXML
//    public Button closeButton;

    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

//    @FXML
//    public void handleCloseButtonAction(ActionEvent event) {
//        Stage stage = (Stage) closeButton.getScene().getWindow();
//        stage.close();
//    }

    public void sendMsg() {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }
}

