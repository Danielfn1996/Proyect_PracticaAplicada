/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.function.UnaryOperator;
import java.util.regex.Pattern;
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
    
    
 

}
