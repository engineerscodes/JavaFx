package FAT;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionListener;

public class HumanFace extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        AnchorPane ac=new AnchorPane();
        ac.setMaxSize(520,720);
        ac.setPrefWidth(520);
        ac.setPrefHeight(630);
        Scene sc=new Scene(ac, Color.GRAY);
        Circle circle = new Circle(260, 360, 250);
          circle.setFill(Color.YELLOW);


        Ellipse leftEye =new Ellipse(120,350,40,80);
        Ellipse RightEye =new Ellipse(380,350,40,80);
        Rectangle r=new Rectangle(520,100);
        r.setFill(Color.WHEAT);
        Button b1=new Button("Awake");
        b1.setLayoutX(180);
        b1.setMinSize(70,50);
        b1.setLayoutY(30);
        b1.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {
                leftEye.setRadiusY(80);
                leftEye.setRadiusX(40);
                RightEye.setRadiusX(40);
                RightEye.setRadiusY(80);
            }
        });
        Button b2=new Button("Sleep");
        b2.setLayoutX(280);
        b2.setMinSize(70,50);
        b2.setLayoutY(30);
        b2.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {
                leftEye.setRadiusY(2);
                leftEye.setRadiusX(100);
                RightEye.setRadiusX(100);
                RightEye.setRadiusY(2);


            }
        });

        ac.getChildren().addAll(circle,leftEye,RightEye,r,b1,b2);

        primaryStage.setScene(sc);
        primaryStage.setTitle("Sleepy");
        primaryStage.show();
    }
}
