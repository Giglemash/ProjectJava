package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.text.html.ImageView;
import java.awt.*;
import java.net.URL;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Controller {

//    @FXML
//    public Button closeButton;
//
//    @FXML
//   private ImageView imageview;

    @FXML
    TextArea textArea;
//    Image image = new Image(H:\Project\ProjectJava\lesson4\chat\src\sample\img\hd.png);
//    imageview.setImage(image);

    @FXML
    TextField textField;

//    @FXML
//    public void handleCloseButtonAction(ActionEvent event) {
//        Stage stage = (Stage) closeButton.getScene().getWindow();
//        stage.close();
//    }
public class WebViewController
{
    @FXML
    private WebView webView;

    @FXML
    private void initialize()
    {
        WebEngine engine = webView.getEngine();
        engine.load("H:\\Games\\Steam\\steamapps\\workshop\\content\\431960\\1276104287\\index.html");
    }
}
    public void sendMsg() {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }
}

