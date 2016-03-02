/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clone2;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Kevin
 */
public class Menu extends Application {
    @Override
    public void start(Stage primaryStage) {
                
        VBox choice = new VBox();
        choice.setAlignment(Pos.CENTER);
        choice.setSpacing(10);
        
        Button btn = new Button();
        btn.setText("New game");
        btn.setStyle("-fx-color: rgba(0, 0, 0, 0.2)");
        btn.setOnAction((ActionEvent event) -> {
            try {
                URL url = new URL("http://www.starwars-universe.com/images/multimedia/Sons/Sabres-Laser/Allumages/01-%20sabre%20laser%201.wav");
                AudioClip ac = Applet.newAudioClip(url);
                ac.play(); 
            } catch (Exception e) {
                
            }
            btn.setStyle("-fx-color: rgba(0, 0, 0, 0.4)");
            Create test = new Create();
            test.start(primaryStage);
        });
        
        Button btnLoad = new Button();
        btnLoad.setText("Load");
        btnLoad.setStyle("-fx-color: rgba(0, 0, 0, 0.2)");
        btnLoad.setOnAction((ActionEvent event) -> {
            try {
                URL url = new URL("http://www.starwars-universe.com/images/multimedia/Sons/Sabres-Laser/Allumages/01-%20sabre%20laser%201.wav");
                AudioClip ac = Applet.newAudioClip(url);
                ac.play(); 
            } catch (Exception e) {
                
            }
            Load load = new Load();
            load.start(primaryStage);
        });
        
        choice.getChildren().add(btn);
        choice.getChildren().add(btnLoad);
        
        StackPane bp = new StackPane(); 
        bp.setStyle("-fx-background-image: url(\"bg.jpg\");-fx-background-size: cover;-fx-background-repeat: no-repeat;");
        bp.getChildren().add(choice);
        bp.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(bp, 1900, 960);
        
        primaryStage.setTitle("Clone Wars");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
