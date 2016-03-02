/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clone2;


import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

/**
 *
 * @author Kevin
 */
public class Create extends Application{
    
    
    @Override
    public void start(Stage primaryStage) {
        
        double widthPic = primaryStage.getWidth() / 6;
        double heightPic = primaryStage.getHeight() / 1.5;
        double opacity = 0.6;
        double sceneWidth = primaryStage.getWidth();
        double sceneHeight = primaryStage.getHeight();
        
        HBox View = new HBox();
        StackPane title = new StackPane();
        HBox Stat = new HBox();
        
        Label name = new Label();
        Label hp = new Label();
        Label def = new Label();
        Label power = new Label();
        Label force = new Label();
        Label intelligence = new Label();
        
        
        Label titleTop = new Label("Choissisez votre personnage");
        titleTop.setStyle("-fx-font: 50px Impact, serif");
        title.setStyle("-fx-background-image: url(\"fond-bleu.png\"); -fx-opacity: 0.8;");
        title.getChildren().add(titleTop);
        
        Insets inset = new Insets(50, 0, 0, 0);
        
        Stat.setStyle("-fx-background-image: url(\"fond-bleu.png\"); -fx-opacity: 0.8;");
        Stat.setSpacing(50);
        Stat.setAlignment(Pos.CENTER);
        View.setAlignment(Pos.CENTER);
                
        Image perso1 = new Image("jedi.png");
        ImageView vPerso1 = new ImageView(perso1);
        vPerso1.setStyle("-fx-opacity: " + opacity + "");
        vPerso1.setFitWidth(widthPic);
        vPerso1.setFitHeight(heightPic);
        
        Image perso2 = new Image("sith.png");
        ImageView vPerso2 = new ImageView(perso2);
        vPerso2.setStyle("-fx-opacity: " + opacity + "");
        vPerso2.setFitWidth(widthPic);
        vPerso2.setFitHeight(heightPic);
        
        Image perso3 = new Image("bountyhunter.png");
        ImageView vPerso3 = new ImageView(perso3);
        vPerso3.setStyle("-fx-opacity: " + opacity + "");
        vPerso3.setFitWidth(widthPic);
        vPerso3.setFitHeight(heightPic);
        
        Image perso4 = new Image("ImperialAgent.png");
        ImageView vPerso4 = new ImageView(perso4);
        vPerso4.setStyle("-fx-opacity: " + opacity + "");
        vPerso4.setFitWidth(widthPic);
        vPerso4.setFitHeight(heightPic);
        
        Image perso5 = new Image("mercenary.png");
        ImageView vPerso5 = new ImageView(perso5);
        vPerso5.setStyle("-fx-opacity: " + opacity + "");
        vPerso5.setFitWidth(widthPic);
        vPerso5.setFitHeight(heightPic);
        
        Image perso6 = new Image("Jawa1.png");
        ImageView vPerso6 = new ImageView(perso6);
        vPerso6.setStyle("-fx-opacity: " + opacity + "");
        vPerso6.setFitWidth(widthPic);
        vPerso6.setFitHeight(heightPic);
        vPerso6.opacityProperty();
        
        vPerso1.setOnMouseEntered((MouseEvent me) -> {
            vPerso1.setStyle("-fx-opacity: 1");
            name.setText("Jedi");
            hp.setText("hp : 100");
            def.setText("def: 200");
            power.setText("power: 100");
            force.setText("force: 200");
            intelligence.setText("intelligence: 200");
        });
        vPerso1.setOnMouseExited((MouseEvent me) -> {
            vPerso1.setStyle("-fx-opacity: " + opacity + "");
        });
        vPerso1.setOnMouseClicked((MouseEvent me) -> {
            Jedi pj = new Jedi();
            Donjon donjon = new Donjon(pj);
            donjon.start(primaryStage);
        });
        
        vPerso2.setOnMouseEntered((MouseEvent me) -> {
            vPerso2.setStyle("-fx-opacity: 1");
            name.setText("Sith");
            hp.setText("hp : 100");
            def.setText("def: 100");
            power.setText("power: 200");
            force.setText("force: 200");
            intelligence.setText("intelligence: 200");
        });
        vPerso2.setOnMouseExited((MouseEvent me) -> {
            vPerso2.setStyle("-fx-opacity: " + opacity + "");
        });
        vPerso2.setOnMouseClicked((MouseEvent me) -> {
            Sith pj = new Sith();
            Donjon donjon = new Donjon(pj);
            donjon.start(primaryStage);
        });
        
        vPerso3.setOnMouseEntered((MouseEvent me) -> {
            vPerso3.setStyle("-fx-opacity: 1");
            name.setText("BountyHunters");
            hp.setText("hp : 100");
            def.setText("def: 100");
            power.setText("power: 100");
            force.setText("force: 0");
            intelligence.setText("intelligence: 350");
        });
        vPerso3.setOnMouseExited((MouseEvent me) -> {
            vPerso3.setStyle("-fx-opacity: " + opacity + "");
        });
        vPerso3.setOnMouseClicked((MouseEvent me) -> {
            BountyHunter pj = new BountyHunter();
            Donjon donjon = new Donjon(pj);
            donjon.start(primaryStage);
        });
        
        vPerso4.setOnMouseEntered((MouseEvent me) -> {
            vPerso4.setStyle("-fx-opacity: 1");
            name.setText("Imperial Agent");
            hp.setText("hp : 350");
            def.setText("def: 100");
            power.setText("power: 100");
            force.setText("force: 0");
            intelligence.setText("intelligence: 100");
        });
        vPerso4.setOnMouseExited((MouseEvent me) -> {
            vPerso4.setStyle("-fx-opacity: " + opacity + "");
        });
        vPerso4.setOnMouseClicked((MouseEvent me) -> {
            ImperialAgent pj = new ImperialAgent();
            Donjon donjon = new Donjon(pj);
            donjon.start(primaryStage);
        });
        
        vPerso5.setOnMouseEntered((MouseEvent me) -> {
            vPerso5.setStyle("-fx-opacity: 1");
            name.setText("Mercenary");
            hp.setText("hp : 100");
            def.setText("def: 350");
            power.setText("power: 100");
            force.setText("force: 0");
            intelligence.setText("intelligence: 100");
        });
        vPerso5.setOnMouseExited((MouseEvent me) -> {
            vPerso5.setStyle("-fx-opacity: " + opacity + "");
        });
        vPerso5.setOnMouseClicked((MouseEvent me) -> {
            Mercenary pj = new Mercenary();
            Donjon donjon = new Donjon(pj);
            donjon.start(primaryStage);
        });
        
        vPerso6.setOnMouseEntered((MouseEvent me) -> {
            vPerso6.setStyle("-fx-opacity: 1");
            name.setText("Jawa");
            hp.setText("hp : 400");
            def.setText("def: 400");
            power.setText("power: 400");
            force.setText("force: 0");
            intelligence.setText("intelligence: 400");
        });
        vPerso6.setOnMouseExited((MouseEvent me) -> {
            vPerso6.setStyle("-fx-opacity: " + opacity + "");
        });
        vPerso6.setOnMouseClicked((MouseEvent me) -> {
            Jawa pj = new Jawa();
            Donjon donjon = new Donjon(pj);
            donjon.start(primaryStage);
        });
        
        View.getChildren().add(vPerso1);
        View.getChildren().add(vPerso2);
        View.getChildren().add(vPerso3);
        View.getChildren().add(vPerso4);
        View.getChildren().add(vPerso5);
        View.getChildren().add(vPerso6);
    
        Stat.getChildren().add(name);
        Stat.getChildren().add(hp);
        Stat.getChildren().add(def);
        Stat.getChildren().add(power);
        Stat.getChildren().add(force);
        Stat.getChildren().add(intelligence);
        
        name.setStyle("-fx-font: 30px Impact, serif; -fx-color: black;");
        hp.setStyle("-fx-font: 25px Impact, serif; -fx-color: black;");
        def.setStyle("-fx-font: 25px Impact, serif; -fx-color: black;");
        power.setStyle("-fx-font: 25px Impact, serif; -fx-color: black;");
        force.setStyle("-fx-font: 25px Impact, serif; -fx-color: black;");
        intelligence.setStyle("-fx-font: 25px Impact, serif; -fx-color: black;");
        
        Stage st = new Stage();
    
        BorderPane bpCreate = new BorderPane();
        bpCreate.setStyle("-fx-background-image: url(\"HondoHangar.png\");-fx-background-size: cover;-fx-background-repeat: no-repeat;");
        bpCreate.setCenter(View);
        bpCreate.setTop(title);
        bpCreate.setBottom(Stat);
        
        
        Scene scene = new Scene(bpCreate, sceneWidth, sceneHeight);
        primaryStage.setScene(scene);
    }
}
