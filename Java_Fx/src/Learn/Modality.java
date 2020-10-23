/**
 * 
 */
package Learn;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Modality extends Application {

	private static final javafx.stage.Modality NONE = null;
	private static final javafx.stage.Modality APPLICATION_MODAL = null;
	private static final javafx.stage.Modality WINDOW_MODAL = null;

	public static void main(String[] args) 
	{
          launch(args);
	}

	@Override
	public void start(Stage stage1) throws Exception 
	{
		Scene scene = new Scene(new Group(), 300, 250);
		stage1.setTitle("Main Window");
		stage1.setScene(scene);
		stage1.show();
		// this window doesn't block mouse and keyboard events
		Stage stage2 = new Stage();
		stage2.setTitle("I don't block anything");
		stage2.initModality(Modality.NONE);
		stage2.show();
		// this window blocks everything - you can't interact
		// with other windows while it's open
		Stage stage3 = new Stage();
		stage3.setTitle("I block everything");
		stage3.initModality(Modality.APPLICATION_MODAL);
		stage3.show();
		// this window blocks only interaction with it's owner window
		//(stage1)
		Stage stage4 = new Stage();
		stage4.setTitle("I block only clicks to main window");
		stage4.initOwner(stage1);
		stage4.initModality(Modality.WINDOW_MODAL);
		stage4.show();	
		
	}

}

