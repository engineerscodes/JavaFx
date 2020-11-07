package Paint;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class colors_paint extends Application {
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
        Group hb=new Group();
        hb.getChildren().addAll(new Circle(150,80,70, Color.rgb(255,0,0,0.3)) ,
                new Circle(100,180,70,Color.hsb(120,1.0,1.0,0.3)),
                new Circle(200,180,70,Color.web("0X0000FF",0.5)));
        primaryStage.setScene(new Scene(hb));
        primaryStage.show();
    }
}
