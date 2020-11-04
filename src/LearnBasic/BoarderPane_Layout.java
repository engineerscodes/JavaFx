package LearnBasic;
import  javafx.application.Application;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.border.Border;

public class BoarderPane_Layout extends Application {
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

    //https://www.geeksforgeeks.org/javafx-borderpane-class/
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        BorderPane bp=new BorderPane();
        bp.setBottom(new Text("BOTTOM"));
        Text t=new Text("TOP"); // this will be in left top so u must adjust it
        bp.setTop(t);

        bp.setCenter(new Text("CENTER"));
        bp.setLeft(new Text("LEFT"));
        bp.setRight(new Text("nothing"));
        bp.setRight(new Text("RIGHT")); //it will overwritre nothing
        primaryStage.setScene(new Scene(bp));
        BorderPane.setAlignment(t, Pos.CENTER);
        primaryStage.show();
    }
}
