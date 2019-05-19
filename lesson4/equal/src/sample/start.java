package sample;

import javafx.application.Application;
import javafx.stage.Stage;

public class start extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        Group root = new Group();
        Scene scene = new Scene(root, 400, 200, Color.TRANSPARENT);
        primaryStage.setScene(scene);
    }
}
