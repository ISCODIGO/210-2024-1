package org.example.pruebagui;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML public void mouseEnter(MouseEvent event) {
        System.out.println("El mouse entra en el componente: x=" + event.getX() + ", y=" + event.getY());
    }

    @FXML public void mouseExit(MouseEvent event) {
        System.out.println("El mouse sale del componente: x=" + event.getX() + ", y=" + event.getY());
    }

    @FXML public void mouseClic(MouseEvent event) {
        System.out.println(event.getClickCount());

        // Si el generador del clic fue un canvas...
        if (event.getSource() instanceof Canvas) {
            Canvas canvas = (Canvas) event.getSource();
            System.out.println("Alto:" + canvas.getHeight() + " Ancho:" + canvas.getWidth());
        }

        if (event.getClickCount() == 2) {
            System.out.println("Se ha ejecutado un doble clic");
        }
    }
}