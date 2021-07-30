package ua.application.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox =  FXMLLoader.load(getClass().getClassLoader().getResource("mainPain.fxml"));
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.show();
    }
}
