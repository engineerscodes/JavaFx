/**
 * 
 */
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 * @author M.NAVEEN
   RANDOM CODER'S
   Tech/Project Lead Android Club
 * */
public class Button_fx extends Application{


	public static void main(String[] args) 
	{
              launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		Button b1 =new Button("button ");
		
         b1.setOnAction(new EventHandler<ActionEvent>() {
        	 int count=0;
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				System.out.println(++count);
			}
		});
		StackPane root=new StackPane ();
		root.getChildren().add(b1);
		Scene scene=new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("First JavaFX Application");
		primaryStage.show();
	}
}
