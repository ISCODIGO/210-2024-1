module org.example.lambdaevento {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.lambdaevento to javafx.fxml;
    exports org.example.lambdaevento;
}