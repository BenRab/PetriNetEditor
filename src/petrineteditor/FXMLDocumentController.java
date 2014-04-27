/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package petrineteditor;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 *
 * @author ben
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private Font x1;
    @FXML
    private Color x2;
    @FXML
    private Font x3;
    @FXML
    private Color x4;
    @FXML
    private Label label1;
    @FXML
    private MenuBar editm;
    @FXML
    private AnchorPane a;

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleNew(ActionEvent event) {
        label1.setText("geaendert");
        Label l = new Label("asdasd");
        l.setLayoutX(100);
        a.getChildren().add(l);
    }

    @FXML
    private void handleOpen(ActionEvent event) {
        label1.setText("Hallo");
    }
    
}
