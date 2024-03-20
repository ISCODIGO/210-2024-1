package org.example.pruebagui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginView {
    @FXML private TextField usuario;
    @FXML private PasswordField password;

    protected static Stage ventanaPrincipal;

    @FXML public void login() throws IOException {
        // Las credenciales temporales son usuario: admin, password: 1234
        if (usuario.getText().equals("admin") && password.getText().equals("1234")) {
            changeScene(ventanaPrincipal, "hello-view.fxml");
        } else {
            System.out.println("No esta autorizado");
        }
    }

    public void changeScene(Stage stage, String sceneName) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(sceneName));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setScene(scene);
    }
 }
