package org.example.pruebagui;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML private Canvas canvas;
    @FXML private Label ladoLabel;
    @FXML private Slider slider;
    @FXML private Label puntos;
    @FXML private ColorPicker colorPicker;

    private GraphicsContext gc;
    private Poligono poligono = null;

    @FXML public void mouseEnter(MouseEvent event) {
        // System.out.println("El mouse entra en el componente: x=" + event.getX() + ", y=" + event.getY());
    }

    @FXML public void mouseExit(MouseEvent event) {
        // System.out.println("El mouse sale del componente: x=" + event.getX() + ", y=" + event.getY());
    }

    @FXML public void mouseClick(MouseEvent event) {
        /*
        Al hacer un clic en el canvas se crea un objeto que controla la
        cantidad de puntos que se pueden dibujar.
        */
        if (poligono == null) {
            poligono = new Poligono(slider.valueProperty().intValue());
        }

        poligono.agregarPunto(event.getX(), event.getY());
        puntos.setText(String.valueOf(poligono.getPuntos()));

        if (poligono.estaListo()) {
            gc.setFill(colorPicker.getValue());
            gc.fillPolygon(poligono.getEjeX(), poligono.getEjeY(), poligono.getLados());
            poligono = null;  // Para reiniciar el proceso
        }
    }

    @FXML public void reiniciarClick() {
        slider.setDisable(false);
        puntos.setText("0");

        // Limpiar el canvas
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = canvas.getGraphicsContext2D();

        // Conectar los cambios del Slider con el Label
        IntegerProperty valor = new SimpleIntegerProperty();
        valor.bindBidirectional(slider.valueProperty());
        ladoLabel.textProperty().bind(valor.asString());

        // Otra forma de conectar slider con el Label
        /*slider.valueProperty().addListener(
                (observableValue, oldVal, newVal) -> ladoLabel.setText(
                        String.valueOf((int)newVal.floatValue())
                )
        );*/
    }
}