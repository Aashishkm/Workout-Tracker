/* @author Aashish
 * This class is responsible for the submit button in response to the gym related questions
 * It takes in the input and gives it to the gym class, 
 * whereby the data is stored, then taken from that class for output
*/

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//action event for the "submit" button
public class Workout2Handler implements EventHandler<ActionEvent> {
	
	TextField messageinput1;
	TextField messageinput2;
	Label messageoutput1;
	Label messageoutput2;
	Gym gymInfo = new Gym();
	
	public Workout2Handler(TextField input1, TextField input2, Label output1, Label output2) 
	{
		
		messageinput1 = input1;
		messageinput2 = input2; 
		messageoutput1 = output1;
		messageoutput2 = output2;
			 
	}

	public void handle(ActionEvent buttonAction) 
	{
		gymInfo.setWeightCount(Integer.parseInt(messageinput1.getText()));
		gymInfo.setRepCount(Integer.parseInt(messageinput2.getText()));
		
		messageoutput1.setText("Congrats, you lifted " + gymInfo.getWeightCount() + " pounds");
		messageoutput2.setText("Congrats, you did " + gymInfo.getRepCount() + " reps");
	}
}
		
