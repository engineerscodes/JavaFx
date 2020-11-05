package LearnBasic;

import javafx.application.Application;
import javafx.stage.Stage;

public class Clock_Demo extends Application
{  public void init()
{
    System.out.println("BEGIN");
}
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        
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
