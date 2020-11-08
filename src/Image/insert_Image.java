package Image;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class insert_Image extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane sp=new StackPane();
        sp.getChildren().addAll(new Circle(100,new ImagePattern(new Image("nav.jpg"))));

        primaryStage.setScene(new Scene(sp));
        primaryStage.show();
    }
}
