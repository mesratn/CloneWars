/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clone2;

import java.io.File;
import java.util.Scanner;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Kevin
 */
public class Load {
    
    public void start(Stage primaryStage) {
        
        Label perso1 = new Label();
        Label zone1 = new Label();
        Label level1 = new Label();
        
        Label perso2 = new Label();
        Label zone2 = new Label();
        Label level2 = new Label();
        
        Label perso3 = new Label();
        Label zone3 = new Label();
        Label level3 = new Label();
        
        String sPerso = "";
        String sZone = "";
        String sLevel = "";
        String sSave = "";
        String sHp = "";
        String sDef = "";
        String sPow = "";
        String sFor = "";
        String sIntel ="";
        String sXp = "";
        
        double sceneWidth = primaryStage.getWidth();
        double sceneHeight = primaryStage.getHeight();
        Scanner scanner1;
        Scanner scanner2;
        Scanner scanner3;
        
        BorderPane bpLoad = new BorderPane();
        bpLoad.setStyle("-fx-background-image: url(\"HondoHangar.png\");-fx-background-size: cover;-fx-background-repeat: no-repeat;");
                
        StackPane sp1 = new StackPane();  
        StackPane sp2 = new StackPane();        
        StackPane sp3 = new StackPane();        
        VBox vb1 = new VBox();
        VBox vb2 = new VBox();
        VBox vb3 = new VBox();
        
        File s1 = new File("./Save/sv1.txt");
        File s2 = new File("./Save/sv2.txt");
        File s3 = new File("./Save/sv3.txt");
        
        Image delete = new Image("Delete.png");
        ImageView deleteV = new ImageView(delete);
        deleteV.setFitHeight(50);
        deleteV.setFitWidth(50);
        deleteV.setStyle("-fx-opacity: 0.7;");
        deleteV.setOnMouseEntered((MouseEvent me) -> {
            deleteV.setStyle("-fx-opacity: 0.9;");
        });
        deleteV.setOnMouseExited((MouseEvent me) -> {
            deleteV.setStyle("-fx-opacity: 0.7");
        });
        deleteV.setOnMouseClicked((MouseEvent me) -> {
            Delete oDelete = new Delete();
        });
        
        if (s1.exists())
        {
            Image img1 = new Image("Empty2.png");
            ImageView img1V = new ImageView(img1);
            img1V.setStyle("-fx-opacity: 0.7;");
            
            try {
                scanner1 = new Scanner(s1);
                
                sZone = scanner1.next();
                sSave = scanner1.next();
                sHp = scanner1.next();
                sDef = scanner1.next();
                sPow = scanner1.next();
                sFor = scanner1.next();
                sIntel = scanner1.next();
                sLevel = scanner1.next();
                sXp = scanner1.next();
                sPerso = scanner1.next();
                
                perso1.setText(sPerso);
                zone1.setText("Zone : " + sZone);
                level1.setText("Level : " + sLevel);
                
                perso1.setStyle("-fx-text-fill: white;");
                zone1.setStyle("-fx-text-fill: white;");
                level1.setStyle("-fx-text-fill: white;");
                               
                vb1.getChildren().add(perso1);
                vb1.getChildren().add(level1);
                vb1.getChildren().add(zone1);
                vb1.getChildren().add(deleteV);
                
                vb1.setStyle("-fx-font-size: 30px;");
                vb1.setSpacing(20);
                vb1.setAlignment(Pos.CENTER);
                
                img1V.setOnMouseClicked((MouseEvent me) -> {
                    this.recup(s1, primaryStage);
                });
               
                                
            } catch(Exception e) {}
        
            sp1.getChildren().add(vb1);
            sp1.setAlignment(Pos.CENTER);
            img1V.setOnMouseEntered((MouseEvent me) -> {
                img1V.setStyle("-fx-opacity: 0.9;");
            });
            img1V.setOnMouseExited((MouseEvent me) -> {
                img1V.setStyle("-fx-opacity: 0.7");
            });
            sp1.getChildren().add(img1V);
        }
        else
        {
            Image img1 = new Image("Empty.png");
            ImageView img1V = new ImageView(img1);
            img1V.setStyle("-fx-opacity: 0.7;");
            img1V.setOnMouseEntered((MouseEvent me) -> {
                img1V.setStyle("-fx-opacity: 0.9;");
            });
            img1V.setOnMouseExited((MouseEvent me) -> {
                img1V.setStyle("-fx-opacity: 0.7");
            });
            sp1.getChildren().add(img1V);
        }
        
        if (s2.exists())
        {
            Image img2 = new Image("Empty2.png");
            ImageView img2V = new ImageView(img2);
            img2V.setStyle("-fx-opacity: 0.7;");
            
            try {
                scanner2 = new Scanner(s2);
                sZone = scanner2.next();
                for (int i = 0; i < 7; i++)
                    sLevel = scanner2.next();
                sPerso = scanner2.next();
                sPerso = scanner2.next();
            
                perso2.setText(sPerso);
                zone2.setText("Zone : " + sZone);
                level2.setText("Level : " + sLevel);
                
                perso2.setStyle("-fx-text-fill: white;");
                zone2.setStyle("-fx-text-fill: white;");
                level2.setStyle("-fx-text-fill: white;");
                     
                vb2.getChildren().add(perso2);
                vb2.getChildren().add(level2);
                vb2.getChildren().add(zone2);
                
                vb2.setStyle("-fx-font-size: 30px;");
                vb2.setSpacing(20);
                vb2.setAlignment(Pos.CENTER);
                
                img2V.setOnMouseClicked((MouseEvent me) -> {
                    this.recup(s2, primaryStage);
                });
            } catch(Exception e) {}
            
            sp2.getChildren().add(vb2);
            sp2.setAlignment(Pos.CENTER);
            img2V.setOnMouseEntered((MouseEvent me) -> {
                img2V.setStyle("-fx-opacity: 0.9;");
            });
            img2V.setOnMouseExited((MouseEvent me) -> {
                img2V.setStyle("-fx-opacity: 0.7");
            });
            sp2.getChildren().add(img2V);
        }
        else
        {
            Image img2 = new Image("Empty.png");
            ImageView img2V = new ImageView(img2);
            img2V.setStyle("-fx-opacity: 0.7;");
            img2V.setOnMouseEntered((MouseEvent me) -> {
                img2V.setStyle("-fx-opacity: 0.9;");
            });
            img2V.setOnMouseExited((MouseEvent me) -> {
                img2V.setStyle("-fx-opacity: 0.7");
            });
            sp2.getChildren().add(img2V);
        }
        
        if (s3.exists())
        {
            Image img3 = new Image("Empty2.png");
            ImageView img3V = new ImageView(img3);
            img3V.setStyle("-fx-opacity: 0.7;");
            
            try {
                scanner3 = new Scanner(s3);
                sZone = scanner3.next();
                for (int i = 0; i < 7; i++)
                    sLevel = scanner3.next();
                sPerso = scanner3.next();
                sPerso = scanner3.next();
                          
                perso3.setText(sPerso);
                zone3.setText("Zone : " + sZone);
                level3.setText("Level : " + sLevel);
                
                perso3.setStyle("-fx-text-fill: white;");
                zone3.setStyle("-fx-text-fill: white;");
                level3.setStyle("-fx-text-fill: white;");
                               
                vb3.getChildren().add(perso3);
                vb3.getChildren().add(level3);
                vb3.getChildren().add(zone3);
                
                vb3.setStyle("-fx-font-size: 30px;");
                vb3.setSpacing(20);
                vb3.setAlignment(Pos.CENTER);
                
                img3V.setOnMouseClicked((MouseEvent me) -> {
                    this.recup(s3, primaryStage);
                });
                               
            } catch(Exception e) {}
        
            sp3.getChildren().add(vb3);
            sp3.setAlignment(Pos.CENTER);
            
            img3V.setOnMouseEntered((MouseEvent me) -> {
                img3V.setStyle("-fx-opacity: 0.9;");
                
            });
            img3V.setOnMouseExited((MouseEvent me) -> {
                img3V.setStyle("-fx-opacity: 0.7");
            });
            sp3.getChildren().add(img3V);
        }
        else
        {
            Image img3 = new Image("Empty.png");
            ImageView img3V = new ImageView(img3);
            img3V.setStyle("-fx-opacity: 0.7;");
           
            img3V.setOnMouseEntered((MouseEvent me) -> {
                img3V.setStyle("-fx-opacity: 0.9;");
            });
            img3V.setOnMouseExited((MouseEvent me) -> {
                img3V.setStyle("-fx-opacity: 0.7");
            });
            
            sp3.getChildren().add(img3V);
        }
        
        Image retour = new Image("Back.png");
        ImageView retourV = new ImageView(retour);
        
        HBox bottom = new HBox();
        bottom.getChildren().add(retourV);
        bottom.getChildren().add(deleteV);
        retourV.setStyle("-fx-opacity: 0.7;");
        retourV.setOnMouseEntered((MouseEvent me) -> {
            retourV.setStyle("-fx-opacity: 0.9;");
        });
        retourV.setOnMouseExited((MouseEvent me) -> {
            retourV.setStyle("-fx-opacity: 0.7");
        });
        retourV.setOnMouseClicked((MouseEvent me) -> {
            Menu menu = new Menu();
            menu.start(primaryStage);
        });
        
        HBox save = new HBox();
        save.getChildren().add(sp1);
        save.getChildren().add(sp2);
        save.getChildren().add(sp3);
        save.setSpacing(30);
        
        save.setAlignment(Pos.CENTER);
        bottom.setAlignment(Pos.CENTER);
                
        bpLoad.setCenter(save);
        bpLoad.setBottom(bottom);
        
        Scene scene = new Scene(bpLoad, sceneWidth, sceneHeight);
        primaryStage.setScene(scene);
    }
    
    public void recup(File file, Stage primaryStage) {
        
        try {
            Scanner scanner = new Scanner(file);
        
            String sZone = scanner.next();
            String sSave = scanner.next();
            String sHp = scanner.next();
            String sDef = scanner.next();
            String sPow = scanner.next();
            String sFor = scanner.next();
            String sIntel = scanner.next();
            String sLevel = scanner.next();
            String sXp = scanner.next();
            String sPerso = scanner.next();
            
            
            int intZone = Integer.parseInt(sZone);
            int intSave = Integer.parseInt(sSave);
            int intHp = Integer.parseInt(sHp);
            int intDef = Integer.parseInt(sDef);
            int intPow = Integer.parseInt(sPow);
            int intFor = Integer.parseInt(sFor);
            int intIntel = Integer.parseInt(sIntel);
            int intLevel = Integer.parseInt(sLevel);
            int intXp = Integer.parseInt(sXp);

            
            System.out.println(400 + 200);
            
            if (null != sPerso)
            switch (sPerso) {
                case "jedi.png":{
                    Jedi pj = new Jedi(intZone, intSave, intHp, intDef, intPow, intFor, intIntel, intLevel, intXp, sPerso);
                    Donjon donjon = new Donjon(pj);
                    donjon.start(primaryStage);
                        break;
                    }
                case "sith.png":{
                    Sith pj = new Sith(intZone, intSave, intHp, intDef, intPow, intFor, intIntel, intLevel, intXp, sPerso);
                    Donjon donjon = new Donjon(pj);
                    donjon.start(primaryStage);
                        break;
                    }
                case "ImperialAgent.png":{
                    ImperialAgent pj = new ImperialAgent(intZone, intSave, intHp, intDef, intPow, intFor, intIntel, intLevel, intXp, sPerso);
                    Donjon donjon = new Donjon(pj);
                    donjon.start(primaryStage);
                        break;
                    }
                case "bountyhunter.png":{
                    BountyHunter pj = new BountyHunter(intZone, intSave, intHp, intDef, intPow, intFor, intIntel, intLevel, intXp, sPerso);
                    Donjon donjon = new Donjon(pj);
                    donjon.start(primaryStage);
                        break;
                    }
                case "mercenary.png":{
                    Mercenary pj = new Mercenary(intZone, intSave, intHp, intDef, intPow, intFor, intIntel, intLevel, intXp, sPerso);
                    Donjon donjon = new Donjon(pj);
                    donjon.start(primaryStage);
                        break;
                    }
                case "Jawa1.png":{
                    Jawa pj = new Jawa(intZone, intSave, intHp, intDef, intPow, intFor, intIntel, intLevel, intXp, sPerso);
                    Donjon donjon = new Donjon(pj);
                    donjon.start(primaryStage);
                        break;
                    }
                default:
                    break;
            }
        } catch (Exception e) {
            
        }
    }
}
