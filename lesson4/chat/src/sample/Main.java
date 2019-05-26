package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.text.html.ImageView;
import java.awt.*;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Detective Pikachu Chat");
        primaryStage.setScene(new Scene(root, 700, 600));
        primaryStage.initStyle(StageStyle.UNDECORATED);
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

