package org.example.pruebagui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML private Canvas canvas;
    private GraphicsContext gc;

    @FXML public void mouseEnter(MouseEvent event) {
        System.out.println("El mouse entra en el componente: x=" + event.getX() + ", y=" + event.getY());
    }

    @FXML public void mouseExit(MouseEvent event) {
        System.out.println("El mouse sale del componente: x=" + event.getX() + ", y=" + event.getY());
    }

    @FXML public void mouseClic(MouseEvent event) {
        System.out.println(event.getButton());
        /*System.out.println(event.getClickCount());

        // Si el generador del clic fue un canvas...
        if (event.getSource() instanceof Canvas) {
            Canvas canvas = (Canvas) event.getSource();
            System.out.println("Alto:" + canvas.getHeight() + " Ancho:" + canvas.getWidth());
        }

        if (event.getClickCount() == 2) {
            System.out.println("Se ha ejecutado un doble clic");
        }*/

        if (event.getButton() == MouseButton.PRIMARY) {
            gc.strokeRect(event.getX(), event.getY(), 100, 100);
        } else if (event.getButton() == MouseButton.SECONDARY) {
            gc.strokeOval(event.getX(), event.getY(), 100, 100);
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = canvas.getGraphicsContext2D();
    }
}