package org.example.pruebagui;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML private Canvas canvas;
    @FXML private Label ladoLabel;
    @FXML private Slider slider;
    @FXML private Label puntos;
    double[] arrX;
    double[] arrY;

    private GraphicsContext gc;

    @FXML public void mouseEnter(MouseEvent event) {
        System.out.println("El mouse entra en el componente: x=" + event.getX() + ", y=" + event.getY());
    }

    @FXML public void mouseExit(MouseEvent event) {
        System.out.println("El mouse sale del componente: x=" + event.getX() + ", y=" + event.getY());
    }

    @FXML public void mouseClick(MouseEvent event) {
        int lados = (int)slider.getValue();
        int diferencia = lados - arrX.length;
        puntos.setText(String.valueOf(diferencia));

        if (diferencia == 0) {
            gc.fillPolygon(arrX, arrY, lados);
        }

        // Si el generador del clic fue un canvas...
        /*
        if (event.getSource() instanceof Canvas) {
            Canvas canvas = (Canvas) event.getSource();
            System.out.println("Alto:" + canvas.getHeight() + " Ancho:" + canvas.getWidth());
        }

        if (event.getClickCount() == 2) {
            System.out.println("Se ha ejecutado un doble clic");
        }*/

        /*
        if (event.getButton() == MouseButton.PRIMARY) {
            Random rnd = new Random();
            Color color = Color.rgb((int)event.getX(), (int)event.getY(), rnd.nextInt(256));
            gc.setFill(color);
            gc.fillRect(event.getX(), event.getY(), 100, 100);
        } else if (event.getButton() == MouseButton.SECONDARY) {
            gc.strokeOval(event.getX(), event.getY(), 100, 100);

            gc.fillPolygon(
                    new double[]{
                        5, 20, 35, 25, 15
                    }, new double[] {
                       30, 10, 30, 50, 50
                    }, 6
            );
        }*/

    }

    @FXML public void fijarClick() {
        puntos.setText(String.valueOf(slider.getValue()));
        slider.setDisable(true);
        int lados = (int)slider.getValue();
        arrX = new double[lados];
        arrY = new double[lados];
        puntos.setText("0");
    }

    @FXML public void reiniciarClick() {
        slider.setDisable(false);
        puntos.setText(String.valueOf(slider.getValue()));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = canvas.getGraphicsContext2D();
        IntegerProperty valor = new SimpleIntegerProperty();
        valor.bindBidirectional(slider.valueProperty());
        ladoLabel.textProperty().bind(valor.asString());
    }
}