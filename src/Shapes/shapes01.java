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
        Rectangle r=new Rectangle(50,50, Color.RED);
        r.setArcHeight(10);
        r.setArcWidth(10);
        Circle c=new Circle(50,Color.MAGENTA);
        Ellipse ep=new Ellipse();
        ep.setRadiusX(40);
        ep.setRadiusY(60);
        ep.setFill(Color.GOLDENROD);

        Polygon pg=new Polygon();
        pg.setFill(Color.BLACK);
        pg.getPoints().addAll(0.0,0.0,50.0,30.0,10.0,60.5);
        hb.setPadding(new Insets(10,10,10,10));
      /*  hb.getChildren().add(r);
        hb.getChildren().add(c);
        hb.getChildren().add(ep);
        */
        hb.getChildren().addAll(r,c,ep,pg);
        primaryStage.setScene(new Scene(hb));
        primaryStage.show();

    }


}
