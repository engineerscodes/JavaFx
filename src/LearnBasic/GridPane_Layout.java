package LearnBasic;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GridPane_Layout extends Application
{    Stage window;
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
    public void start(Stage primaryStage) throws Exception
    {
            window=primaryStage;
            GridPane gp=new GridPane();
            gp.setPadding(new Insets(10,10,10,10));
            //creating r0l Z&col
        for(int i=0;i<5;i++)
        {
            gp.getColumnConstraints().add(new ColumnConstraints(50));
            gp.getRowConstraints().add(new RowConstraints(60));
        }
        /*
        Row/Column Sizing
        By default, rows and columns will be sized to fit their content; a column will be wide enough to accommodate
        the widest child, a row tall enough to fit the tallest child.However, if an application needs to explicitly control
        the size of rows or columns, it may do so by adding RowConstraints and ColumnConstraints objects to specify those metrics.
        For example, to create a grid with two fixed-width columns:

        GridPane gridpane = new GridPane();
        gridpane.getColumnConstraints().add(new ColumnConstraints(100)); // column 0 is 100 wide
        gridpane.getColumnConstraints().add(new ColumnConstraints(200)); // column 1 is 200 wide
         */

        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
            {
                if((i+j)%2==0)
                    gp.add(new Rectangle(50,60, Color.BLACK),i,j);
            }
            window.setScene(new Scene(gp));
            window.setTitle("GRID PANE -");
            window.show();

    }
}
