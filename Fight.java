/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clone2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Kevin
 */
public class Fight extends Application{
    
    private Personnage pj;
    
    public Fight(Personnage pj) {
        
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Personnage ennemy;
        Factory factory = new Factory(pj.getCurrentZone());
        ennemy = factory.generate();
        
        Button btn = new Button("Attaquer");
        btn.setOnAction((ActionEvent event) -> {
            pj.armedAttack(ennemy);
            if (ennemy.estVivant())
                ennemy.armedAttack(pj);
            if (!pj.estVivant()) {
                StackPane go = new StackPane();
                go.setStyle("-fx-background-image: url(\"gameOver.jpg\");-fx-background-size: cover;-fx-background-repeat: no-repeat;");
                Scene gameOver = new Scene(go, primaryStage.getWidth(), primaryStage.getHeight());
                primaryStage.setScene(gameOver);
            }
        });
        
        BorderPane bpFight = new BorderPane();
        bpFight.setStyle("-fx-background-image: url(\"couloir.jpg\");-fx-background-size: cover;-fx-background-repeat: no-repeat;"); 
    }
}
