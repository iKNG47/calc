module pr4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    exports ua.application.main;
    exports ua.application.control;
    opens ua.application.control to javafx.controls, javafx.fxml;

}