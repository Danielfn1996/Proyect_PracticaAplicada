package aplicacionescritorio;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

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
 

}