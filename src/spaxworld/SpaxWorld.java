/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaxworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Kelvin Wong
 */
public class SpaxWorld extends Application {
    Pane textBox;
    BorderPane root;
    Image textBack = new Image(SpaxWorld.class.getResourceAsStream("/images/textBack.png"));
    

    public void start(Stage primaryStage) {
        textBox = new Pane();
        root = new BorderPane();
        root.getChildren().add(textBox);
        
        Scene scene = new Scene(root, 800, 800);
        
        primaryStage.setTitle("SpaxWorld");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
