/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusoselector;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import selectordeslizamiento.SelectorDeslizamiento;

/**
 *
 * @author jose
 */
public class FXMLUsoSelectorController implements Initializable {
    
    // Elementos del apartado visual
    @FXML
    private SelectorDeslizamiento selectorUno;
    @FXML
    private SelectorDeslizamiento selectorDos;
    @FXML
    private Label lbDeslizador;
    
    // Metodo que se ejecutará al iniciar la aplicacion
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // Creamos un ArrayList y le añadimos objetos de tipo String
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Cero");
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        lista.add("Cuatro");
        lista.add("Cinco");
        lista.add("Seis");
        
        // Establecemos la lista como los elementos de ambos selectores
        selectorUno.setItems(lista);
        selectorDos.setItems(lista);
        
        selectorUno.setRepetitive(true); // Le damos al selector uno la propiedad de carrusel, al llegar al ultimo elemento, si clickamos en sifuiente, pasará al primero
        selectorDos.setRepetitive(false); // Se lo quitamos al selector 2, no es necesario, ya que por defecto está desactivado.
        
    }
    
    // Accion a realizar cuando se haga click en el selector uno, independientemente de si es siguiente o anterior
    public void accionSelectUno() {
        lbDeslizador.setText("Clicado selector arriba");
    }
    
    // Accion a realizar cuando se haga click en el selector dos, independientemente de si es siguiente o anterior
    public void accionSelectDos(){
        lbDeslizador.setText("Clicado selector abajo");
    }
    
}
