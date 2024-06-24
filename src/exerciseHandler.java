/* @author Aashish
 * This class is an action event that uses the WorkoutInformation class 
 * to calculate recommended Daily exercise based on graphical input
*/


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//action event for the "submit" button
public class exerciseHandler implements EventHandler<ActionEvent> {
	Label exerciseOutput;
	TextField ageinput;
	WorkoutInformation workoutInfo = new WorkoutInformation();

	public exerciseHandler(TextField input, Label output) 
	{
		
		ageinput = input;
		exerciseOutput = output;
			 
	}

	public void handle(ActionEvent buttonAction) 
	{
		 workoutInfo.recommendedDailyexercise(Integer.parseInt(ageinput.getText()));
		 exerciseOutput.setText("Your recommended daily excersise time is: " + workoutInfo.getDailyexercise());
		 
	}
}
		