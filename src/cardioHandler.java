/* @author Aashish
 * This class is an action event that just prompts user for cardio specific information
 * if the cardio button is clicked 
*/



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
	
//action event for the "cardio" button
public class cardioHandler implements EventHandler<ActionEvent> {
	Label messageLabel;
	Label messageLabel2;
	Label messageLabel3;
	public cardioHandler( Label output, Label output2, Label output3) 
	{
		 
		messageLabel = output;
		messageLabel2 = output2;
		messageLabel3 = output3;
			 
	}
	
	public void handle(ActionEvent buttonAction) 
	{

		messageLabel.setText("How long did you run? (enter a number in minutes)");
		messageLabel2.setText("");
		messageLabel3.setText("");
		
	}
		
}



