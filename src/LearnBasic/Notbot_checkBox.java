package LearnBasic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Notbot_checkBox extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        CheckBox cb=new CheckBox("I'm not a robot");
        Rectangle rc=new Rectangle();
        rc.setWidth(400);
        rc.setHeight(400);

        rc.setFill(Color.RED);
        StackPane sp=new StackPane();
        sp.getChildren().add(rc);
        sp.getChildren().add(cb);

        Scene root=new Scene(sp,500,500);
        primaryStage.setScene(root);
        primaryStage.setTitle("NOT A BOT");
        primaryStage.show();
    }
}
