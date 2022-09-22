package aplicacionescritorio;

import Modelo.Juego;
import Modelo.Palabra;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
<<<<<<< HEAD
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import java.awt.*;
import java.util.function.UnaryOperator;
import java.util.regex.Pattern;
import javafx.beans.value.ChangeListener;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.TextFormatter.Change;
=======
import javafx.scene.input.KeyEvent;
>>>>>>> origin

/**
 * FXML Controller class
 *
 * @author User
 */
public class Controller implements Initializable{
  

    @FXML
    private Tab PesIntro;
    @FXML
    private Button buttonJugar;
    @FXML
    private Tab PesJuego;
    @FXML
    private TabPane tp;
<<<<<<< HEAD

    @FXML
    private Button btnCerrar;
    @FXML
    private Image BtnCerrar;

    @FXML
    private TextField txt_00, txt_01;
    @FXML
    private TextField txt_08;
    @FXML
    private TextField txt_03;
    @FXML
    private TextField txt_04;
    @FXML
    private TextField txt_09;
    @FXML
    private TextField txt_13;
    @FXML
    private TextField txt_18;
    @FXML
    private TextField txt_23;
    @FXML
    private TextField txt_28;
    @FXML
    private TextField txt_14;
    @FXML
    private TextField txt_19;
    @FXML
    private TextField txt_24;
    @FXML
    private TextField txt_29;
    @FXML
    private TextField txt_06;
    @FXML
    private TextField txt_11;
    @FXML
    private TextField txt_16;
    @FXML
    private TextField txt_21;
    @FXML
    private TextField txt_26;
    @FXML
    private TextField txt_02;
    @FXML
    private TextField txt_07;
    @FXML
    private TextField txt_12;
    @FXML
    private TextField txt_17;
    @FXML
    private TextField txt_22;
    @FXML
    private TextField txt_05;
    @FXML
    private TextField txt_10;
    @FXML
    private TextField txt_15;
    @FXML
    private TextField txt_20;
    @FXML
    private TextField txt_25;
    @FXML
    private TextField txt_27;

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
    private void ValidarPalabra(KeyEvent evt) {
        Palabra palabra = new Palabra();

        palabra.tamanioTextField(txt_00, 1);
        palabra.tamanioTextField(txt_01, 1);
        palabra.tamanioTextField(txt_02, 1);
        palabra.tamanioTextField(txt_03, 1);
        palabra.tamanioTextField(txt_04, 1);
        palabra.tamanioTextField(txt_05, 1);
        palabra.tamanioTextField(txt_06, 1);
        palabra.tamanioTextField(txt_07, 1);
        palabra.tamanioTextField(txt_08, 1);
        palabra.tamanioTextField(txt_09, 1);
        palabra.tamanioTextField(txt_10, 1);
        palabra.tamanioTextField(txt_11, 1);
        palabra.tamanioTextField(txt_12, 1);
        palabra.tamanioTextField(txt_13, 1);
        palabra.tamanioTextField(txt_14, 1);
        palabra.tamanioTextField(txt_15, 1);
        palabra.tamanioTextField(txt_16, 1);
        palabra.tamanioTextField(txt_17, 1);
        palabra.tamanioTextField(txt_18, 1);
        palabra.tamanioTextField(txt_19, 1);
        palabra.tamanioTextField(txt_20, 1);
        palabra.tamanioTextField(txt_21, 1);
        palabra.tamanioTextField(txt_22, 1);
        palabra.tamanioTextField(txt_23, 1);
        palabra.tamanioTextField(txt_24, 1);
        palabra.tamanioTextField(txt_25, 1);
        palabra.tamanioTextField(txt_26, 1);
        palabra.tamanioTextField(txt_27, 1);
        palabra.tamanioTextField(txt_28, 1);
        palabra.tamanioTextField(txt_29, 1);

    }

    @FXML
    private void ValidarCaracter(KeyEvent evt) {
        Palabra palabra = new Palabra();

        palabra.ValidarCaracter(txt_00, 1);
        palabra.ValidarCaracter(txt_01, 1);
        palabra.ValidarCaracter(txt_02, 1);
        palabra.ValidarCaracter(txt_03, 1);
        palabra.ValidarCaracter(txt_04, 1);
        palabra.ValidarCaracter(txt_05, 1);
        palabra.ValidarCaracter(txt_06, 1);
        palabra.ValidarCaracter(txt_07, 1);
        palabra.ValidarCaracter(txt_08, 1);
        palabra.ValidarCaracter(txt_09, 1);
        palabra.ValidarCaracter(txt_10, 1);
        palabra.ValidarCaracter(txt_11, 1);
        palabra.ValidarCaracter(txt_12, 1);
        palabra.ValidarCaracter(txt_13, 1);
        palabra.ValidarCaracter(txt_14, 1);
        palabra.ValidarCaracter(txt_15, 1);
        palabra.ValidarCaracter(txt_16, 1);
        palabra.ValidarCaracter(txt_17, 1);
        palabra.ValidarCaracter(txt_18, 1);
        palabra.ValidarCaracter(txt_19, 1);
        palabra.ValidarCaracter(txt_20, 1);
        palabra.ValidarCaracter(txt_21, 1);
        palabra.ValidarCaracter(txt_22, 1);
        palabra.ValidarCaracter(txt_23, 1);
        palabra.ValidarCaracter(txt_24, 1);
        palabra.ValidarCaracter(txt_25, 1);
        palabra.ValidarCaracter(txt_26, 1);
        palabra.ValidarCaracter(txt_27, 1);
        palabra.ValidarCaracter(txt_28, 1);
        palabra.ValidarCaracter(txt_29, 1);

=======
    @FXML
    private Button btnCerrar;
     @FXML
    private Button btnInterrog;
     @FXML
    private TextField txt00;
     
         @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }
      
    @FXML
    private void eventButton(ActionEvent event ){
     tp.getSelectionModel().select(PesJuego);
    }
     @FXML  
    public void btnCerrar(ActionEvent event ){
     tp.getSelectionModel().select(PesJuego);
>>>>>>> origin
    }
      @FXML  
    public void btnInterrog(ActionEvent event ){
     tp.getSelectionModel().select(PesIntro);
    }
    
@FXML    
       private void eventKey(KeyEvent event){
           Object evt = event.getSource();
           if(evt.equals(txt00)){
               if(!Character.isLetter(event.getCharacter().charAt(0)) && !event.getCharacter().equals(" ")); // no permite numeros
               else if(evt.equals(txt00)){
                   if(txt00.getText().length() >= 1){
                       event.consume();
                   }
               }
        }
       }
 

<<<<<<< HEAD
}
=======
}
>>>>>>> origin
