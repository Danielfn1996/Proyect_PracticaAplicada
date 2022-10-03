/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DAO.PalabraDao;
import DAO.conexionSql;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;

/**
 *
 * @author Ruben Leon
 */
public class Palabra {

    public int id;
    public String descripcion;

    public int getId() {
        return id;
    }

    public Palabra(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Palabra() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void validarCaracteres(TextField txt, int limit) {
        Pattern pattern = Pattern.compile("[a-zA-Z]*");
        UnaryOperator<TextFormatter.Change> textLimitFilter = change -> {
            if (change.isContentChange()) {
                int newLength = change.getControlNewText().length();
                if (newLength > limit) {
                    String trimmedText = change.getControlNewText().substring(0, limit);
                    change.setText(trimmedText);
                    int oldLength = change.getControlText().length();
                    change.setRange(0, oldLength);
                }
            }
            if (pattern.matcher(change.getControlNewText()).matches()) {
                return change;
            } else {
                return null;
            }

        };
        txt.setTextFormatter(new TextFormatter(textLimitFilter));
        TextFormatter<String> formatter = new TextFormatter<>(textLimitFilter);
        txt.setTextFormatter(formatter);

    }

    public int tamanioPalabra(TextField txt[][], int posicion) {
        String palabra = "";

        for (int j = 0; j < 5; j++) {
            palabra = palabra + txt[posicion][j].getText();
        }
        return palabra.length();
    }

    public ArrayList comparar(TextField txt[][], int posicion) throws SQLException {
        PalabraDao pa = new PalabraDao();
        Palabra pl = pa.cargarPalabra();

        ArrayList<Object> palabraOculta = new ArrayList();
        for (char cr : pl.getDescripcion().toCharArray()) {
            palabraOculta.add(String.valueOf(cr));
        }

        ArrayList<Object> palabraIngresada = new ArrayList();
        for (int j = 0; j < 5; j++) {
            palabraIngresada.add(txt[posicion][j].getText());
        }

        for (int i = 0; i < palabraIngresada.size(); i++) {
            String letra = palabraIngresada.get(i).toString();
            if (palabraOculta.contains(letra)) {
                int posicion1 = palabraOculta.indexOf(letra);
                int posicion2 = palabraIngresada.indexOf(letra);
                if (posicion1 == posicion2) {

                    palabraIngresada.set(i, 0);
                    palabraOculta.set(i, 0);
                } else if (posicion1 != posicion2) {
                    palabraIngresada.set(i, 1);
                    palabraOculta.set(i, 1);
                }

            } else {
                palabraIngresada.set(i, 9);
                palabraOculta.set(i, 9);
            }

        }

        return palabraOculta;
    }

}
