package LearnBasic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;

public class Flow_layout extends Application {
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
        FlowPane fp=new FlowPane(5,5);
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                double size=5+30*Math.random();
                Rectangle r=new Rectangle(size,size,(i+j)%2==0?Color.RED:Color.BLACK);
                fp.getChildren().add(r);
            }
        }
        primaryStage.setScene(new Scene(fp));
        primaryStage.show();

    }
    public static void main(String ...arg)
    {
        launch(arg);
    }
}
