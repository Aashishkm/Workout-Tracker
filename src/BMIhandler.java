/* @author Aashish
 * This class is an action event that uses the WorkoutInformation class 
 * to calculate BMI based on graphical input
*/

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//action event for the "submit" button
public class BMIhandler implements EventHandler<ActionEvent> {
	TextField heightinput;
	TextField weightinput;
	Label messageoutput;
	WorkoutInformation workoutInfo = new WorkoutInformation();
	
	public BMIhandler(TextField input, TextField input2,  Label output) 
	{
		
		heightinput = input;
		weightinput = input2;
		messageoutput = output;
			 
	}

	public void handle(ActionEvent buttonAction) 
	{
		workoutInfo.Bmi(Double.parseDouble(heightinput.getText()), Double.parseDouble(weightinput.getText())); 
		messageoutput.setText("Your BMI is: "+ workoutInfo.getBMI());	
	}
}
		


 