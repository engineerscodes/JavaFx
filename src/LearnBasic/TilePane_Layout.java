package LearnBasic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TilePane_Layout extends Application {
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
   // https://www.geeksforgeeks.org/javafx-flowpane-class/
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        TilePane tp=new TilePane(5,5);
        tp.setPrefRows(4);
        tp.setPrefColumns(4);
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
            {
                double size=5+30*Math.random();
                System.out.println(size);
                Rectangle r=new Rectangle(size,size, (i + j) % 2 == 0 ? Color.YELLOW : Color.RED);
                tp.getChildren().add(r);
            }
        primaryStage.setScene(new Scene(tp));
        primaryStage.show();  //it adjusts it self if window size is incresed & cannot decrease window size than 4 x 4 matrix size;
    }
}
