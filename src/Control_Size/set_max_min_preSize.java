package Control_Size;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class set_max_min_preSize extends Application
{   public static void main(String ...args){launch("");}
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        VBox v=new VBox(10);
        v.setPadding( new Insets(20,20,20,20));
        Button btn1=new Button("Setmin");
                btn1.setMinWidth(150);
                btn1.setPrefWidth(200);
                btn1.setMinHeight(50);
        v.getChildren().addAll(new Button("Hi"),new Button("Mind_Hack"),btn1,new Button("==========="));
        primaryStage.setScene(new Scene(v));
        primaryStage.show();
    }
}
