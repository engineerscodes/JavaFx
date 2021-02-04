package FAT;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.text.Text;



public class stickman extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
              AnchorPane ac=new AnchorPane();
              ac.setMaxSize(700,700);
             // ac.setBackground(new Background(new BackgroundFill(Color.BLACK,null,null)));
        Polyline pn =new Polyline();
        pn.getPoints().addAll(10.0,10.0,
                680.0,10.0,
                680.0,680.0,
                10.0,680.0,10.0,10.0);

         //pn.setFill(Color.RED);
             pn.setStroke(Color.RED);
             pn.setStrokeWidth(10);
             Text t1=new Text("Hi there");
             t1.setFont(Font.font("Arial",30));
             t1.setFill(Color.RED);
           // t1.setStroke(Color.RED);
             t1.setLayoutY(650);
             t1.setLayoutX(50);

        Circle cr=new Circle(50);
        cr.setCenterX(350);
        cr.setCenterY(200);
        cr.setStroke(Color.RED);
        cr.setStrokeWidth(5);
        Line line=new Line(350,250,350,500);
        line.setStroke(Color.RED);

        line.setStrokeWidth(5);
        Line hand =new Line(350,375.5,250,375.5);
        hand.setStrokeWidth(5);
        hand.setStroke(Color.RED);
        Line lefthand=new Line(350,375.5,450,250);
        lefthand.setStrokeWidth(5);
        lefthand.setStroke(Color.RED);

        Line leftLeg =new Line(350,500,250,600);
        leftLeg.setStroke(Color.RED);
        leftLeg.setStrokeWidth(5);
        Line RigthLeg =new Line(350,500,450,600);

        RigthLeg.getStrokeDashArray().addAll(350d,355d,358d,400d,450d);
        RigthLeg .setStroke(Color.RED);
        RigthLeg .setStrokeWidth(5);

        ac.getChildren().addAll(pn,t1,cr,line,hand,lefthand,leftLeg,RigthLeg);
               Scene sc=new Scene(ac,Color.BLACK);

               primaryStage.setScene(sc);
              primaryStage.show();
    }
}
