package Shapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class lines  extends Application {
    /**
     * The main entry point for all JavaFX applications.
     * The start method is called after the init method has returned,
     * and after the system is ready for the application to begin running.
     *
     * <p>
     * NOTE: This method is called on the JavaFX Application Thread.
     * </p>
     *
     * @param primaryStage the primary stage for this application, onto which
     *                     the application scene can be set. The primary stage will be embedded in
     *                     the browser if the application was launched as an applet.
     *                     Applications may create other stages, if needed, but they will not be
     *                     primary stages and will not be embedded in the browser.
     */
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        HBox hb=new HBox(5);
        Line l=new Line(200,10,130,555);
        l.setFill(Color.RED); //does not work

        Polyline pl=new Polyline();
        pl.setFill(Color.RED); //with Filling
        pl.getPoints().addAll(100.0,0.0,0.5,30.0,10.5,60.999);
        hb.getChildren().addAll(l,pl);
        primaryStage.setScene(new Scene(hb));
        primaryStage.show();
    }
}
