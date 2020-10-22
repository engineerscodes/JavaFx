/**
 * 
 */
package Learn;
import java.util.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
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
	{
		Scene new_scene=new Scene(new Group(),500,500);
		primaryStage.setTitle("BASIC_01");
		primaryStage.setScene(new_scene);
		primaryStage.show();
		/*Note that you don't need the main() method to run JavaFX. For example, this code can be
compiled and run from the command line:*/
	}
	public void stop()
	{
		System.out.println("After");
	}

}

