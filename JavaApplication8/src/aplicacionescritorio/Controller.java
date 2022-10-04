package aplicacionescritorio;

import Modelo.Palabra;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.Alert;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

/**
 * FXML Controller class
 *
 * @author User
 */
public class Controller implements Initializable {

    @FXML
    private Tab PesIntro;
    @FXML
    private Button buttonJugar;
    @FXML
    private Tab PesJuego;
    @FXML
    private TabPane tp;

    @FXML
    private Button btnCerrar;
    @FXML
    private Image BtnCerrar;
    @FXML
    private TextField txt_02;
    @FXML
    private TextField txt_07;
    @FXML
    private TextField txt_03;
    @FXML
    private TextField txt_04;
    @FXML
    private TextField txt_08;
    @FXML
    private TextField txt_09;
    @FXML
    private TextField txt_18;
    @FXML
    private TextField txt_01;
    @FXML
    private TextField txt_06;
    @FXML
    private TextField txt_17;
    @FXML
    private TextField txt_05;
    @FXML
    private TextField txt_10;
    @FXML
    private TextField txt_15;
    @FXML
    private TextField txt_11;
    @FXML
    private TextField txt_20;
    @FXML
    private TextField txt_25;
    @FXML
    private TextField txt_16;
    @FXML
    private TextField txt_21;
    @FXML
    private TextField txt_26;
    @FXML
    private TextField txt_13;
    @FXML
    private TextField txt_12;
    @FXML
    private TextField txt_14;
    @FXML
    private TextField txt_00;
    @FXML
    private TextField txt_22;
    @FXML
    private TextField txt_29;
    @FXML
    private TextField txt_28;
    @FXML
    private TextField txt_27;
    @FXML
    private TextField txt_24;
    @FXML
    private TextField txt_19;
    @FXML
    private TextField txt_23;
    @FXML
    private Button BtnEnviar;
    @FXML
    private GridPane gvLetras;
    @FXML
    private RowConstraints Row1;

    public int posicion = 0;
    @FXML
    private Button btnInterrog;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    public void ButtonJugar(ActionEvent event) {
        tp.getSelectionModel().select(PesJuego);
    }

    @FXML
    public void btnCerrar(ActionEvent event) {
        tp.getSelectionModel().select(PesJuego);
    }

    @FXML
    private void validarCaracteres(KeyEvent event) {
        Palabra palabra = new Palabra();

        palabra.validarCaracteres(txt_00, 1);
        palabra.validarCaracteres(txt_01, 1);
        palabra.validarCaracteres(txt_02, 1);
        palabra.validarCaracteres(txt_03, 1);
        palabra.validarCaracteres(txt_04, 1);
        palabra.validarCaracteres(txt_05, 1);
        palabra.validarCaracteres(txt_06, 1);
        palabra.validarCaracteres(txt_07, 1);
        palabra.validarCaracteres(txt_08, 1);
        palabra.validarCaracteres(txt_09, 1);
        palabra.validarCaracteres(txt_10, 1);
        palabra.validarCaracteres(txt_11, 1);
        palabra.validarCaracteres(txt_12, 1);
        palabra.validarCaracteres(txt_13, 1);
        palabra.validarCaracteres(txt_14, 1);
        palabra.validarCaracteres(txt_15, 1);
        palabra.validarCaracteres(txt_16, 1);
        palabra.validarCaracteres(txt_17, 1);
        palabra.validarCaracteres(txt_18, 1);
        palabra.validarCaracteres(txt_19, 1);
        palabra.validarCaracteres(txt_20, 1);
        palabra.validarCaracteres(txt_21, 1);
        palabra.validarCaracteres(txt_22, 1);
        palabra.validarCaracteres(txt_23, 1);
        palabra.validarCaracteres(txt_24, 1);
        palabra.validarCaracteres(txt_25, 1);
        palabra.validarCaracteres(txt_26, 1);
        palabra.validarCaracteres(txt_27, 1);
        palabra.validarCaracteres(txt_28, 1);
        palabra.validarCaracteres(txt_29, 1);
    }

    @FXML
    private void btnEnviar(ActionEvent event) throws SQLException {
        Palabra pl = new Palabra();
        if (posicion <= 5) {
            TextField matriz[][] = {
                {txt_00, txt_01, txt_02, txt_03, txt_04},
                {txt_05, txt_06, txt_07, txt_08, txt_09},
                {txt_10, txt_11, txt_12, txt_13, txt_14},
                {txt_15, txt_16, txt_17, txt_18, txt_19},
                {txt_20, txt_21, txt_22, txt_23, txt_24},
                {txt_25, txt_26, txt_27, txt_28, txt_29},};

            int tamanio = pl.tamanioPalabra(matriz, posicion);
            if (tamanio != 5) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Diálogo de error...");
                alert.setHeaderText(null);
                alert.setContentText("No hay suficientes letras");
                alert.showAndWait();
            } else {

                ArrayList<Object> validacion = pl.comparar(matriz, posicion);

                for (int i = 0; i < 5; i++) {
                    if (validacion.get(i).equals(0)) {
                        matriz[posicion][i].setStyle("-fx-background-color: green");
                    } else if (validacion.get(i).equals(1)) {
                        matriz[posicion][i].setStyle("-fx-background-color: yellow");
                    } else {
                        matriz[posicion][i].setStyle("-fx-background-color: Gray");
                    }

                }
                for (int i = 0; i < 5; i++) {
                    matriz[posicion][i].disableProperty().set(true);
                }
                posicion++;

                for (int i = 0; i < 5; i++) {
                    matriz[posicion][i].disableProperty().set(false);
                    matriz[posicion][i].editableProperty().set(true);
                }

            }
        }
    }

    @FXML
    private void btnInterrog(ActionEvent event) {

        tp.getSelectionModel().select(PesIntro);
    }

}
