package Event_Controls;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import javafx.event.*;
/*
There are also 4 more classes that share a common ancestor (ButtonBase) and most
functionality with Button:
ToggleButton saves state clicked/unclicked and changes visuals accordingly. Its
state can be retrieved by calling the isSelected() method.
CheckBox has the same behavior as ToggleButton but different visuals and
API. CheckBox state is controlled by the getState() method.
Hyperlink is a button with no extra decorations, which also remembers if it was
already clicked.
MenuButton is a part of the Menu API that allows you to create user and context
menus.
 */
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
        Label l=new Label("Hi=============================================================!!!!!");
        l.setPadding(new Insets(100,20,50,60));
        l.setWrapText(true);
         Button b=new Button("Click me");
         b.setGraphic(new Circle(10, Color.RED));
         b.setCancelButton(true); //if u press Cancel Button the it will be counted has clicked (ESC)
         b.setDefaultButton(true);//if u press Cancel Button the it will be counted has clicked (enter)
         b.setOnAction(new EventHandler<ActionEvent>(){
             @Override
             public void handle(ActionEvent e)
             { count++;

                 l.setText("Clicked :"+count);
                 l.setGraphic(new Rectangle(50,50,Color.YELLOW));
             }
         });
        sp.getChildren().add(b);

        sp.getChildren().add(l);
        primaryStage.setScene(new Scene(sp));
      primaryStage.show();
    }
}
