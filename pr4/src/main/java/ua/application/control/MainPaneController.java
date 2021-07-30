package ua.application.control;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.Locale;

public class MainPaneController {
    @FXML
    private Button userButton;
    @FXML
    private TextArea textArea;
    public void initialize(){
        userButton.setOnAction(actionEvent -> { String orgText = textArea.getText();
            String altText = orgText.toLowerCase(Locale.ROOT);
            textArea.setText(altText);});
    }
}
