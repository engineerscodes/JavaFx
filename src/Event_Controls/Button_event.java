package Event_Controls;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.event.*;

public class Button_event extends Application
{   int count=0;
    public  static void main(String ...args)
{
    launch("");
}
    @Override
    public void start(Stage primaryStage) throws Exception
    {
         VBox sp=new VBox();
        Label l=new Label("Hi=============================================================");
        l.setPadding(new Insets(100,20,50,60));
        l.setWrapText(true);
         Button b=new Button("Click me");
         b.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent e)
             { count++;

                 l.setText("Clicked :"+count);

             }
         });
        sp.getChildren().add(b);

        sp.getChildren().add(l);
        primaryStage.setScene(new Scene(sp));
      primaryStage.show();
    }
}
