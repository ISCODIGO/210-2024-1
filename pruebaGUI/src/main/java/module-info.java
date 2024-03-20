module org.example.pruebagui {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.pruebagui to javafx.fxml;
    exports org.example.pruebagui;
}