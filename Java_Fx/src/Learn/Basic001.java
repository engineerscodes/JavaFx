/**
 * 
 */
package Learn;
import java.util.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.Color;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
import javafx.application.Platform;
public class Basic001  extends Application
{
   public void init()
   {  
	   System.out.println("Before");
   }
   public static void main(String ...strings)
   {
	   launch(strings);
   }
   
@Override
	 public void start(Stage primaryStage) throws Exception 
	{   //javafx.application.Platform.exit();
		//Platform x=new Platform();
		Scene new_scene=new Scene(new Group(),500,500);
		new_scene.setFill(Color.DARKSLATEGREY);
		primaryStage.setTitle("BASIC_01");
		primaryStage.setScene(new_scene);
		primaryStage.show();
	}
		/*Note that you don't need the main() method to run JavaFX. For example, this code can be
compiled and run from the command line:*/
//	//	javafx.application.Platform.setImplicitExit(true);
//	} 
        
	public void stop()
	{
		System.out.println("After");
	}

}

