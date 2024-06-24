/* @author Aashish
 * This Class is responsible for the submit button in response to the question about workout length
 * It takes in the input and gives it to the WorkoutInformation class, 
 * whereby the data is stored, then taken from that class for output
*/

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//action event for the "submit" button
public class Workout1Handler implements EventHandler<ActionEvent> {
	Label messageLabel;
	TextField messageinput;
	WorkoutInformation workoutInfo = new WorkoutInformation();

	public Workout1Handler(TextField input, Label output) 
	{
		
		messageinput = input;
		messageLabel = output;
			 
	}

	public void handle(ActionEvent buttonAction) 
	{
		workoutInfo.setWorkoutLength(Integer.parseInt(messageinput.getText()));
		messageLabel.setText("Congrats, you exercised for " +  workoutInfo.getWorkoutLength() + " minutes");	
	}
}
		


 