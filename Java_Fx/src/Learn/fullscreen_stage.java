/**
 * 
 */
package Learn;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class fullscreen_stage extends Application{

	public static void main(String[] args) 
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception 
	{
           primaryStage.setFullScreen(true);
           primaryStage.setTitle("Full Screen");
           Scene root =new Scene(new Group());
           root.setFill(Color.MAGENTA);
           primaryStage.setScene(root);
           primaryStage.show();
	}

}

