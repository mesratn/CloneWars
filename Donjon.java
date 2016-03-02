/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clone2;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
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
    
    private int sizeMaze = 6;
    private Personnage pj = null;
    private Personnage ennemy;
    private BorderPane bp;
    private HBox Action;
    private VBox Stat;
    private HBox Center;
    private Zone zone;
    GridPane actionMove;
    
    public Donjon(Jedi player) {
        pj = player;
        this.actionMove = new GridPane();
        this.zone = new Zone(sizeMaze, pj.getCurrentZone());
        this.Center = new HBox();
        this.Stat = new VBox();
        this.Action = new HBox();
        this.bp = new BorderPane();
        this.ennemy = null;
    }
    
    public Donjon(Sith player)
    {
        pj = player;
        this.actionMove = new GridPane();
        this.zone = new Zone(sizeMaze, pj.getCurrentZone());
        this.Center = new HBox();
        this.Stat = new VBox();
        this.Action = new HBox();
        this.bp = new BorderPane();
        this.ennemy = null;
    }
    
    public Donjon(BountyHunter player) {
        pj = player;
        this.actionMove = new GridPane();
        this.zone = new Zone(sizeMaze, pj.getCurrentZone());
        this.Center = new HBox();
        this.Stat = new VBox();
        this.Action = new HBox();
        this.bp = new BorderPane();
        this.ennemy = null;
    }
    
    public Donjon(ImperialAgent player)
    {
        pj = player;
        this.actionMove = new GridPane();
        this.zone = new Zone(sizeMaze, pj.getCurrentZone());
        this.Center = new HBox();
        this.Stat = new VBox();
        this.Action = new HBox();
        this.bp = new BorderPane();
        this.ennemy = null;
    }
    
    public Donjon(Mercenary player) {
        pj = player;
        this.actionMove = new GridPane();
        this.zone = new Zone(sizeMaze, pj.getCurrentZone());
        this.Center = new HBox();
        this.Stat = new VBox();
        this.Action = new HBox();
        this.bp = new BorderPane();
        this.ennemy = null;
    }
    
    public Donjon(Jawa player)
    {
        pj = player;
        this.actionMove = new GridPane();
        this.zone = new Zone(sizeMaze, pj.getCurrentZone());
        this.Center = new HBox();
        this.Stat = new VBox();
        this.Action = new HBox();
        this.bp = new BorderPane();
        this.ennemy = null;
    }
        
    @Override
    public void start(Stage primaryStage) {
        zone.solve();
        System.out.println(zone);
        System.out.println(zone.getLvl());
        
        pj.setPosX(zone.getGridDimensionX() - 2);
        pj.setPosY(zone.getGridDimensionY() - 1);
      
        this.showStat();
        this.showAction();
        
        Image img = new Image(pj.getPicture());
        ImageView imgView = new ImageView(img);
        
        Center.getChildren().add(imgView);
        imgView.setFitHeight(primaryStage.getHeight() / 1.2);
        imgView.setFitWidth(primaryStage.getWidth() / 3);
        Center.setAlignment(Pos.CENTER_LEFT);
        
        Action.setStyle("-fx-background-image: url(\"fond-bleu.png\"); -fx-opacity: 0.8;-fx-border-style: solid; -fx-border-color: white;");
        Action.setAlignment(Pos.CENTER);
        
        bp.setStyle("-fx-background-image: url(\"couloir.jpg\");-fx-background-size: cover;-fx-background-repeat: no-repeat;");     
        bp.setCenter(Center);
        
        Scene scene = new Scene(bp, 1900, 960);
        primaryStage.setScene(scene);
    }
    
    public void showStat() {
        String fontCSS = "-fx-font: 40px Impact, serif";
        
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
           
        bp.setLeft(Stat);        
    }
    
    public void showAction() {
        Image save = new Image("Save.png");
        ImageView saveView = new ImageView(save);
        saveView.setFitHeight(50);
        saveView.setFitWidth(100);
        Action.getChildren().add(saveView);
        
        saveView.setOnMouseClicked((MouseEvent me) -> {
            saveView.setStyle("-fx-opacity: 0.5;");
            pj.saveVerif();
        });
        this.refresh();
        Action.getChildren().add(actionMove);
        
        bp.setBottom(Action);
    }
    
    public void changeBG() {
        Random rand = new Random();
        int choice = rand.nextInt(8) + 1;
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
    
    public void refresh() {
        try {
            actionMove.getChildren().clear();
        } catch(Exception e) {}
        try {
            Image up = new Image("up.png");
            ImageView upV = new ImageView(up);
            Image down = new Image("Down.png");
            ImageView downV = new ImageView(down);
            Image left = new Image("Left.png");
            ImageView leftV = new ImageView(left);
            Image right = new Image("Right.png");
            ImageView rightV = new ImageView(right);
            Image empty = new Image("Vide.png");
            ImageView emptyV = new ImageView(empty);
            
            upV.setFitHeight(50);
            upV.setFitWidth(100);
            downV.setFitHeight(50);
            downV.setFitWidth(100);
            leftV.setFitHeight(50);
            leftV.setFitWidth(100);
            rightV.setFitHeight(50);
            rightV.setFitWidth(100);
            emptyV.setFitHeight(50);
            emptyV.setFitWidth(100);
                        
            try {         
                if (zone.getContent(pj.getPosX(), pj.getPosY() - 1) != 'X' && pj.getPosY() > 0)
                    actionMove.add(upV, 2, 1);
                if (zone.getContent(pj.getPosX() - 1, pj.getPosY()) != 'X' && pj.getPosX() > 0)
                    actionMove.add(leftV, 1, 2);
                if (zone.getContent(pj.getPosX() + 1, pj.getPosY()) != 'X' && pj.getPosX() < zone.getGridDimensionX())
                    actionMove.add(rightV, 3, 2);
                if (zone.getContent(pj.getPosX(), pj.getPosY() + 1) != 'X' && pj.getPosY() < zone.getGridDimensionY())
                    actionMove.add(downV, 2, 3);
            } catch (Exception e) {}
            
            upV.setOnMouseClicked((MouseEvent eventUp) -> {
                this.Move(3);
            });
            downV.setOnMouseClicked((MouseEvent eventDown) -> {
                this.Move(4);
            });
            leftV.setOnMouseClicked((MouseEvent eventLeft) -> {
                this.Move(1);
            });
            rightV.setOnMouseClicked((MouseEvent eventRight) -> {
                this.Move(2);
            });
            
        } catch(Exception e) {}
    }
    
    public void Move(int pos) {
        this.changeBG();
                System.out.println(pj.getHp());
        switch (pos) {
            case 1 :
                pj.setPosX(pj.getPosX() - 1);
                break;
            case 2:
                pj.setPosX(pj.getPosX() + 1);
                break;
            case 3:
                pj.setPosY(pj.getPosY() - 1);
                break;
            case 4:
                pj.setPosY(pj.getPosY() + 1);
                break;
        }
        if (pj.getPosX() == 1 && pj.getPosY() == 0)
        {
            this.zone = new Zone(sizeMaze, zone.getLvl() + 1);   
            zone.solve();
            System.out.println(zone);
            
            pj.setPosX(zone.getGridDimensionX() - 2);
            pj.setPosY(zone.getGridDimensionY() - 1);
        }
        else {
            ennemy = zone.makeEnnemy();
            this.inFight();
        }
        this.refresh();
    }
    
    public void inFight() {
        if (ennemy != null) {
            this.FightMenu();
            try {
                Thread.sleep(500);
            } catch(Exception e) {}
            while (ennemy.estVivant() && pj.estVivant())
            {
                ennemy.armedAttack(pj);
                pj.armedAttack(ennemy);
            }
            if (!ennemy.estVivant())
            {
                pj.setXp(ennemy.getXpValue());
                ennemy = null;
                pj.Heal();
                pj.checkLvl();
                System.out.println(pj.getXp() + "<-");
            }
            else
                System.out.println("Game Over");
        }
    }
    
    public void FightMenu() {
        try {
            actionMove.getChildren().clear();
        } catch(Exception e) {}
        try {
            Image attack = new Image("Attack.png");
            ImageView attackV = new ImageView(attack);
            Image force = new Image("Force.png");
            ImageView forceV = new ImageView(force);
            Image empty = new Image("Vide.png");
            ImageView emptyV = new ImageView(empty);
            
            attackV.setFitHeight(50);
            attackV.setFitWidth(100);
            forceV.setFitHeight(50);
            forceV.setFitWidth(100);
            emptyV.setFitHeight(50);
            emptyV.setFitWidth(100);
                        
            try {
                actionMove.add(attackV, 1, 1);
                if (pj.getForce() > 0)
                    actionMove.add(forceV, 2, 1);
            } catch (Exception e) {}
            
            attackV.setOnMouseClicked((MouseEvent eventUp) -> {
                pj.armedAttack(ennemy);
            });
            forceV.setOnMouseClicked((MouseEvent eventDown) -> {
                pj.forceAttack(ennemy);
            });
            
        } catch(Exception e) {}
    }
}