/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clone2;

import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Kevin
 */
public class Donjon extends Application{
    
    private BorderPane bp = new BorderPane();
    private boolean fight = false;
    private Personnage pj = null;
    private Personnage target = null;
    private int zoneLevel = 1;
    private Zone zone = new Zone(6, zoneLevel);
    // add currentZone attribut
    // add current Romme Attribut
    
    public Donjon(Jedi player) {
        pj = player;
    }
    
    public Donjon(Sith player)
    {
        pj = player;
    }
    
    public Donjon(BountyHunter player) {
        pj = player;
    }
    
    public Donjon(ImperialAgent player)
    {
        pj = player;
    }
    
    public Donjon(Mercenary player) {
        pj = player;
    }
    
    public Donjon(Jawa player)
    {
        pj = player;
    }
        
    @Override
    public void start(Stage primaryStage) {
        zone.solve();
        System.out.println(zone);
        
        pj.setPosX(zone.getGridDimensionX() - 2);
        pj.setPosX(zone.getGridDimensionY() - 1);
      
        Personnage ennemy = null;
        String fontCSS = "-fx-font: 40px Impact, serif";
        VBox Stat = new VBox();
        HBox Center = new HBox();
        HBox Action = new HBox();
        GridPane actionMove = new GridPane();
        
        Label level = new Label();
        Label xp = new Label();
        Label hp = new Label();
        Label def = new Label();
        Label power = new Label();
        Label force = new Label();
        Label intelligence = new Label();
        
        level.setText("Level : " + pj.getLvl());
        xp.setText("xp : " + pj.getXp());
        hp.setText("hp : " + pj.getHp());
        def.setText("def : " + pj.getDef());
        power.setText("power : " + pj.getPower());
        force.setText("force : " + pj.getForce());
        intelligence.setText("intel : " + pj.getIntelligence());
        
        level.setStyle(fontCSS);
        xp.setStyle(fontCSS);
        hp.setStyle(fontCSS);
        def.setStyle(fontCSS);
        power.setStyle(fontCSS);
        force.setStyle(fontCSS);
        intelligence.setStyle(fontCSS);
        
        Stat.getChildren().add(level);
        Stat.getChildren().add(xp);
        Stat.getChildren().add(hp);
        Stat.getChildren().add(def);
        Stat.getChildren().add(power);
        Stat.getChildren().add(force);
        Stat.getChildren().add(intelligence);
        
        Stat.setSpacing(20);
        Stat.setPadding(new Insets(50, 0, 0, 0));
        Stat.setStyle("-fx-background-image: url(\"fond-bleu.png\"); -fx-opacity: 0.8;-fx-border-style: solid; -fx-border-color: white");
        
        Image img = new Image(pj.getPicture());
        ImageView imgView = new ImageView(img);
        
        Center.getChildren().add(imgView);
        imgView.setFitHeight(primaryStage.getHeight() / 1.2);
        imgView.setFitWidth(primaryStage.getWidth() / 3);
        Center.setAlignment(Pos.CENTER_LEFT);
        
        Image move = new Image("Move.png");
        ImageView moveView = new ImageView(move);
        moveView.setFitHeight(50);
        moveView.setFitWidth(100);
                
        Image save = new Image("Save.png");
        ImageView saveView = new ImageView(save);
        saveView.setFitHeight(50);
        saveView.setFitWidth(100);
        Action.getChildren().add(saveView);
        
        saveView.setOnMouseClicked((MouseEvent me) -> {
            saveView.setStyle("-fx-opacity: 0.5;");
            pj.saveVerif();
        });
        
        
        try {
            Image up = new Image("Up.png");
            ImageView upV = new ImageView(up);
            Image down = new Image("Down.png");
            ImageView downV = new ImageView(down);
            Image left = new Image("Left.png");
            ImageView leftV = new ImageView(left);
            Image right = new Image("Right.png");
            ImageView rightV = new ImageView(right);

            actionMove.add(upV, 2, 1);
            actionMove.add(downV, 2, 3);
            actionMove.add(leftV, 1, 2);
            actionMove.add(rightV, 3, 2);
            
        } catch(Exception e) {
            
        }
        
        Action.getChildren().add(actionMove);
        Action.setStyle("-fx-background-image: url(\"fond-bleu.png\"); -fx-opacity: 0.8;-fx-border-style: solid; -fx-border-color: white;");
        Action.setAlignment(Pos.CENTER);
        
        bp.setStyle("-fx-background-image: url(\"couloir.jpg\");-fx-background-size: cover;-fx-background-repeat: no-repeat;");        
        bp.setLeft(Stat);
        bp.setCenter(Center);
        bp.setBottom(Action);
        
        Scene scene = new Scene(bp, 1900, 960);
        primaryStage.setScene(scene);
    }
    
    public void changeBG() {
        Random rand = new Random();
        int choice = rand.nextInt(8) + 1;
        System.out.println(choice);
        switch (choice){
            case 1: 
                bp.setStyle("-fx-background-image: url(\"couloir.jpg\");-fx-background-size: cover;-fx-background-repeat: no-repeat;");
                break;
            case 2:
                bp.setStyle("-fx-background-image: url(\"couloir1.jpg\");-fx-background-size: cover;-fx-background-repeat: no-repeat;");
                break;
            case 3:
                bp.setStyle("-fx-background-image: url(\"couloir2.jpg\");-fx-background-size: cover;-fx-background-repeat: no-repeat;");
                break;
            case 4:
                bp.setStyle("-fx-background-image: url(\"couloir3.jpg\");-fx-background-size: cover;-fx-background-repeat: no-repeat;");
                break;
            case 5:
                bp.setStyle("-fx-background-image: url(\"couloir7.jpg\");-fx-background-size: cover;-fx-background-repeat: no-repeat;");
                break;
            case 6:
                bp.setStyle("-fx-background-image: url(\"couloir4.jpg\");-fx-background-size: cover;-fx-background-repeat: no-repeat;");
                break;
            case 7:
                bp.setStyle("-fx-background-image: url(\"couloir5.jpg\");-fx-background-size: cover;-fx-background-repeat: no-repeat;");
                break;
            case 8:
                bp.setStyle("-fx-background-image: url(\"couloir6.jpg\");-fx-background-size: cover;-fx-background-repeat: no-repeat;");
                break;
            }
    }
}