/**
 * 
 */
package Event;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.event.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class button extends Application
{
    Button b1;
    Label l1;
	public static void main(String[] args) 
	{
           launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		b1=new Button();
		l1=new Label();
		l1.setText("Label");
		b1.setText("Donot Click");
		b1.setOnAction(event->{
			System.out.print("NEW Java Lamda expression ");
		});
		HBox root=new HBox();
		root.getChildren().add(b1);
		root.getChildren().add(l1);
		l1.setMinSize(100.0, 100);
		Scene scene=new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("First JavaFX Application");
		primaryStage.show();
	}

}

