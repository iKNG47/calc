package main.helloWorld;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HelloWorld  extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("asd");
        AnchorPane anchorPane = FXMLLoader.load(getClass().getClassLoader().getResource("example.fxml"));
        Scene scene= new Scene(anchorPane);
        stage.setScene(scene);
        stage.show();
    }
}
