package LearnBasic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Notbot_checkBox extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        CheckBox cb=new CheckBox("clickme");
        StackPane sp=new StackPane();
        sp.getChildren().add(cb);
        Scene root=new Scene(sp,500,500);
        primaryStage.setScene(root);
        primaryStage.show();
    }
}
