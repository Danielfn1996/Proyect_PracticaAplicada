/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package aplicacionescritorio;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

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


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }  
    
    @FXML
    public void ButtonJugar(ActionEvent event ){
     tp.getSelectionModel().select(PesJuego);
    }
    
    
    public void btnCerrar(ActionEvent event ){
     tp.getSelectionModel().select(PesJuego);
    }

    
    
}
