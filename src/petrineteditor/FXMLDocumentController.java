/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package petrineteditor;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.GroupLayout.Group;

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
    int i = 0;
    @FXML
    private AnchorPane a;
    @FXML
    private AnchorPane elements;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Place p = new Place(60, 80, 30);
        elements.getChildren().addAll(p);
    }    

    @FXML
    private void handleNew(ActionEvent event) {
        Place p = new Place(0, 0, 30);
        a.getChildren().add(p);
    }

    @FXML
    private void handleOpen(ActionEvent event) {
                         
                Label secondLabel = new Label("Hello");
                 
                StackPane secondaryLayout = new StackPane();
                secondaryLayout.getChildren().add(secondLabel);
                 
                Scene secondScene = new Scene(secondaryLayout, 200, 100);
 
                Stage secondStage = new Stage();
                secondStage.setTitle("Second Stage");
                secondStage.setScene(secondScene);
                 
                //Set position of second window, related to primary window.
               // secondStage.setX(primaryStage.getX() + 250);
               // secondStage.setY(primaryStage.getY() + 100);
  
                secondStage.show();
    }

    @FXML
    private void handleClose(ActionEvent event) {
    }

    @FXML
    private void handleSave(ActionEvent event) {
    }

    @FXML
    private void handleSaveAs(ActionEvent event) {
    }

    @FXML
    private void handleRevert(ActionEvent event) {
    }

    @FXML
    private void handlePreferences(ActionEvent event) {
    }

    @FXML
    private void handleQuit(ActionEvent event) {
    }

    @FXML
    private void handleUndo(ActionEvent event) {
    }

    @FXML
    private void handleRedo(ActionEvent event) {
    }

    @FXML
    private void handleCut(ActionEvent event) {
    }

    @FXML
    private void handleCopy(ActionEvent event) {
    }

    @FXML
    private void handlePast(ActionEvent event) {
    }

    @FXML
    private void handleDelete(ActionEvent event) {
    }

    @FXML
    private void handleSelectAll(ActionEvent event) {
    }

    @FXML
    private void handleUnselectAll(ActionEvent event) {
    }

    @FXML
    private void handleAcout(ActionEvent event) {
    }
    
}
