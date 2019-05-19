package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.web.WebView;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;

import javax.swing.text.html.ImageView;
import java.awt.*;

//Сказать что я сейчас недоволен, это ничего не сказать. Я считаю что JavaFX не то что не разобран, к нему даже не прикасались на уроке. Это огромнейшая платформа.
//Чтобы что то сделать, в ней нужно действительно хорошо разбираться. В CSS, JavaScript, HTML тоже. Вот я создал эквалайзер, не смог его подключить. Как работать с
// primaryStage и создать свой ободок и кнопку завершения программы, так и не разобрался. Чтобы поставить фоновую картинку для textField, textArea нужно танцевать с
//бубном. "Продвинутые вопросы создания графического интерфейса" - нет. Я высказываю недовольство, потому что тема действительно огромная, а мы ее проходим мельком
//и возвращаемся к суровым будням Java. В общем, я не нашел решения своих вопросов. Сделал два чата, один простейший, а второй оставленный до лучших времен.

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Detective Pikachu Chat");

        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();
        String content =
                "Hello World!";
        webEngine.loadContent(content, "H:\\Games\\Steam\\steamapps\\workshop\\content\\431960\\1276104287\\index.html");
        primaryStage.setScene(new Scene(root, 975, 528));
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
    }



//    @Override
//    public void start(Stage primaryStage) {
//        TextArea textArea = new TextArea();
//        textArea.getStyleClass().add("framed");
//
//        Scene scene = new Scene(new StackPane(textArea));
//        scene.getStylesheets().add("Styles.css");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//

    public static void main(String[] args) {
        launch(args);
    }
}
//    public void onExit(ActionEvent actionEvent) {
//        Stage stage = (Stage) ExitButton.getScene().getWindow();
//        stage.close();
//    }
//}

