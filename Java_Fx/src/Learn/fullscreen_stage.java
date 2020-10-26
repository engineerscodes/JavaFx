/**
 * 
 */
package Learn;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
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
           primaryStage.initStyle(StageStyle.DECORATED);
           primaryStage.setTitle("Full Screen");
          // primaryStage.setIconified(true);
           Scene root =new Scene(new Group());
           root.setFill(Color.MAGENTA);
           primaryStage.setScene(root);
           primaryStage.show();
           System.out.print(Double.MAX_VALUE);
	}

}

