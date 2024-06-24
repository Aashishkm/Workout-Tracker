/* @author Aashish
 * This class is an action event that just prompts user for gym specific information
 * if the gym button is clicked 
*/
 


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
//action event for the "gym" button
public class gymHandler implements EventHandler<ActionEvent> {
	Label messageLabel1;
	Label messageLabel2;
	Label messageLabel3;
	
	public gymHandler( Label output1, Label output2, Label output3) 
	{
		  
		 messageLabel1 = output1;
		 messageLabel2 = output2;
		 messageLabel3 = output3;
	}
	
	public void handle(ActionEvent buttonAction) 
	{
		messageLabel1.setText("How long did you lift for? (enter a number in minutes)");
		messageLabel2.setText("How much weight did you lift?");
		messageLabel3.setText("How many reps did you do?");
		
		
		
		
	}
	
}
