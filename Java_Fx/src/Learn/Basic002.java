/**
 * 
 */
package Learn;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.*;
import javafx.stage.Stage;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Basic002 extends Application{

	/**
	 *  closing Window using Platform.exit();
	 */
	public static void main(String[] args)
	{
       launch(args);
	}
public void start()
{
	System.out.println("Before");
}
public void stop()
{
	System.out.println("After");
}
	@Override
	public void start(Stage primaryStage) throws Exception
	{
         // Platform.exit();
          Scene root=new Scene(new Group(),500,500);
          primaryStage.setTitle("closing Window using Platform.exit()");
          primaryStage.setScene(root);
          primaryStage.show();
          Platform.setImplicitExit(false);//to stop from exiting 
          /*
           * If you don't want your application to automatically close, add the following code at the
             beginning of your program:
           */
	}

}

