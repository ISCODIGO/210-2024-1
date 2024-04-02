package org.example.pruebagui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class LoginView {
    @FXML private TextField usuario;
    @FXML private PasswordField password;

    protected static Stage ventanaPrincipal;

    @FXML public void login() throws IOException {
        if (usuario.getText().isBlank() || password.getText().isBlank()) {
            return;
        }

        // Las credenciales temporales son usuario: admin, password: 1234
        if (authenticate(usuario.getText(), password.getText())) {
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

    public boolean authenticate(String usuario, String password) {
        InputStream inputStream = getClass().getResourceAsStream("credenciales.txt");

        if (inputStream != null) {
            Scanner entrada = new Scanner(inputStream);

            while (entrada.hasNextLine()) {
                String linea = entrada.nextLine();
                String[] partes = linea.split(":");

                if (usuario.equals(partes[0])) {
                    String passwordCifrado = Cifrar.palabraCifrada(password);
                    if (passwordCifrado.equals(partes[1])) {
                        return true;
                    }
                    return false; // Asumiendo que el usuario es unico
                }
            }
            entrada.close();
        }

        return false;
    }
 }
