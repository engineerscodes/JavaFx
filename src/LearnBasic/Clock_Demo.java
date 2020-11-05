package LearnBasic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Clock_Demo extends Application
{  public void init()
{
    System.out.println("BEGIN");
}
    @Override
    public void start(Stage primaryStage) throws Exception
    {
         Pane p =new StackPane();
         p.getChildren().add(new Circle(50, Color.RED));
         Label l= new Label();
         p.getChildren().add(l);
        LocalTime time = LocalTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");

        String t = time.format(dateTimeFormatter);
        l.setText(t);
        primaryStage.setScene(new Scene(p));
        primaryStage.show();



    }
    public void stop()
    {
       System.out.println("Finshed");
    }
    public static void main(String ...strings)
    {
        launch(strings);
    }
}
