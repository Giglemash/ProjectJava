package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Detective Pikachu Chat");
        primaryStage.setScene(new Scene(root, 700, 600));
//        Scene scene = new Scene(root);
//        primaryStage.setScene(scene);
//        scene.getStylesheets().add("yellowOnBlack.css");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
//    public void onExit(ActionEvent actionEvent) {
//        Stage stage = (Stage) ExitButton.getScene().getWindow();
//        stage.close();
//    }
//}

