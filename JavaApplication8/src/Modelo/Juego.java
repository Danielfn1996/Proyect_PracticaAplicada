/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.function.UnaryOperator;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;

/**
 *
 * @author Cristian Rojas
 */
public class Juego extends Palabra {

    public int idPartida;
    public String descripcion;

    public Juego() {
    }

    public Juego(int idPartida, String descripcion, int id, String palabra) {
        super(id, palabra);
        this.idPartida = idPartida;
        this.descripcion = descripcion;
    }

    public int getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int tamanioPalabra(TextField txt[][], int posicion) {
        String palabra = "";

        for (int j = 0; j < 5; j++) {
            palabra = palabra + txt[posicion][j].getText();
        }

        return palabra.length();
    }

}
