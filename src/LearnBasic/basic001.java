package LearnBasic;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class basic001 extends Application
{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Button btn1=new Button();
       // btn1.wrapTextProperty();
        btn1.setText("NAVEEN");
        //btn1.setAlignment(Pos.CENTER);
        HBox layout=new HBox();
        layout.setMaxHeight(500f);
        layout.setMaxWidth(500f);
        layout.getChildren().add(btn1);
        Scene root=new Scene(layout);
        primaryStage.setScene(root);
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("EXIT ON CTRL+E");
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("Ctrl+E")); //exits full screen on press of ctrl +e
          primaryStage.show();
    }
}
