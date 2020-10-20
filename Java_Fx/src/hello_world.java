/**
 * 
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
 *
 */
public class hello_world extends Application{

	public hello_world() 
	{
		
	}

	public static void main(String[] args) 
	{
              launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		Button b1 =new Button("button ");
		StackPane root=new StackPane ();
		root.getChildren().add(b1);
		Scene scene=new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("First JavaFX Application");
		primaryStage.show();
	}
}
