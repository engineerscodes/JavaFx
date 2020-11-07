package Shapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Curves extends Application {


    public void init()
    {
        System.out.println("START");
    }

    public void stop()
    {
        System.out.println("Ending");
    }
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        VBox vb=new VBox();
        Ellipse ep=new Ellipse();
        ep.setRadiusX(40);
        ep.setRadiusY(60);
        ep.setFill(Color.YELLOW);

        Arc rc=new Arc();
        rc.setRadiusX(60);
        rc.setRadiusY(40);
        rc.setLength(180);
        rc.setStartAngle(45);
        rc.setFill(Color.RED);

        vb.getChildren().addAll(ep,rc);

        primaryStage.setScene(new Scene(vb));
        primaryStage.show();
    }
}
