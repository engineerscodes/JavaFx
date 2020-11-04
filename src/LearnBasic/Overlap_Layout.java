package LearnBasic;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Overlap_Layout extends Application
{
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
        Pane p=new StackPane();
        Circle c=new Circle(40,Color.YELLOW);
         // c.toFront(); will not work here need to put it after adding to pane
        p.getChildren().addAll(c,new Rectangle(100,100, Color.RED));
        c.toFront();
        primaryStage.setScene(new Scene(p));
        primaryStage.show();// circle will be overlapped by rectangle

    }

    public static void main(String ...args)
    {
        launch(args);
    }
}
