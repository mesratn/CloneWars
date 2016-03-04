/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clone2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Kevin
 */
public class GameOver extends Application{

    @Override
    public void start(Stage primaryStage){
        StackPane spGameOver = new StackPane();
        spGameOver.setStyle("-fx-background-image: url(\"gameOver.bmp\");-fx-background-size: cover;-fx-background-repeat: no-repeat;");
        
        Scene scene = new Scene(spGameOver, 1900, 960);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
