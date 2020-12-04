package Shapes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class shapes01 extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        HBox hb=new HBox(20);
        Rectangle r=new Rectangle(50,50);
        hb.getChildren().addAll(r);
        primaryStage.setScene(new Scene(hb));
        primaryStage.show();

    }


}
