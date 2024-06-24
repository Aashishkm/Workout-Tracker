/* @author Aashish
 * This class is an action event for the Slider
 * Uses the workoutInformation class in order to store workout productivity based oof graphiicial user input, 
 * and output the productivity back from this class 
*/

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
 
//action event for the "submit" button
public class SliderHandler implements EventHandler<ActionEvent> {
	Label messageLabel;
	Slider productivity;
	
	WorkoutInformation workoutInfo = new WorkoutInformation();

	public SliderHandler(Slider input, Label output) 
	{
		
		productivity = input;
		messageLabel = output;
			 
	}

	public void handle(ActionEvent buttonAction) 
	{
		workoutInfo.setWorkoutProductivity(productivity.getValue());
		messageLabel.setText("Congrats, your productivity was a " +  workoutInfo.getWorkoutProductivity());	
	}
}
		

