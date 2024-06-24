/*
Author: Aashish
This class is the class responsible for the graphical based interface for this project
It takes in user information through the GUI and calls methods to store the data, and transform it

*/
import java.io.IOException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
  
public class WorkoutTrackerGUI extends Application {
	UserInformation userinfo = new UserInformation();
	
	public WorkoutTrackerGUI() 
	{
		super();
		userinfo.setUserName("Aashish");
		userinfo.setDate("March 29");
		
	}
	
	
	public static void main(String [] args) throws IOException
	{
		Scanner myScanner = new Scanner(System.in);
		String flag = "hello";
		System.out.println("Do you want to use Grapical or text based interface (G/T)?");
		flag = myScanner.nextLine();
		flag.toUpperCase();
		 
		
		if (flag.equals("T"))
		{
			WorkoutTracker myTracker = new WorkoutTracker();
		}
		else 
		{
			WorkoutTrackerGUI thisGui = new WorkoutTrackerGUI();
			launch(args);
		}
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		//define all the controls we will be using 
		VBox root = new VBox();
		HBox exercise1box = new HBox();
		HBox exercise2box = new HBox();
		HBox exercise3box = new HBox();
		HBox exercise4box = new HBox();
		HBox weightrow = new HBox();
		HBox heightrow = new HBox();
		HBox exerciserow = new HBox();
		HBox sliderbox = new HBox();
		Scene scene = new Scene(root, 400, 600);
		Label welcomemessage = new Label("Welcome to the WorkoutTracker");
		//format the welcome message
		welcomemessage.setAlignment(Pos.CENTER);
		welcomemessage.setStyle(" -fx-font: bold 22pt 'Times'; -fx-text-fill: black;");
		
		 
		Label bmimessage = new Label("What is your height and weight? (in m and kg)");
		TextField heightinput = new TextField("1.75");
		TextField weightinput = new TextField("66");
		Button weightButton = new Button("submit");
		Button heightButton = new Button("submit");
		Label bmiOutput = new Label();
		
		Label agemessage = new Label("What is your age?");
		TextField ageinput = new TextField("18");
		Button agebutton = new Button("submit");
		Label exerciseOutput = new Label();
		
		
		Label workoutmessage = new Label("What type of workout did you do?");
		Label workoutmessage2 = new Label(); //if gym --> what exercise?
		Label workoutmessage3 = new Label(); //if gym --> weight
		Label workoutmessage4 = new Label(); //if gym --> reps
		
		Label output2message = new Label();
		Label output3message = new Label();
		Label output4message = new Label();
		TextField workout1 = new TextField();
		TextField workout2 = new TextField();
		TextField workout3 = new TextField();
		
		Button gymButton = new Button("gym");
		Button cardioButton = new Button("cardio");
		Button workoutbutton1 = new Button("submit");
		Button workoutbutton2 = new Button("submit");
		Button workoutbutton3 = new Button("submit");
		
		
		Label slidermessage = new Label("How productive/good was the overall workout?");
		Button sliderbutton = new Button("submit");
		Label slideroutput = new Label();
		
		//format the slider
		Slider productivity = new Slider(1, 10, 5);
	    productivity.setShowTickMarks(true);
		productivity.setShowTickLabels(true);
		productivity.setMajorTickUnit(1f);
		productivity.setBlockIncrement(0.25f);
			
		//action events for the buttons
		gymButton.setOnAction(new gymHandler(workoutmessage2, workoutmessage3, workoutmessage4));
		cardioButton.setOnAction(new cardioHandler(workoutmessage2, workoutmessage3, workoutmessage4));
		workoutbutton1.setOnAction(new Workout1Handler(workout1, output2message));
		
		weightButton.setOnAction(new BMIhandler(heightinput, weightinput, bmiOutput));
		agebutton.setOnAction(new exerciseHandler(ageinput, exerciseOutput));
		workoutbutton3.setOnAction(new Workout2Handler(workout2, workout3, output3message, output4message));
		
		sliderbutton.setOnAction(new SliderHandler(productivity, slideroutput));
		
		 
		
		//Add our controls to the respective hbox and vbox's
		root.getChildren().add(welcomemessage);
		
		root.getChildren().add(bmimessage);
		heightrow.getChildren().add(heightinput);
		//this button is just for aesthetic purposes
		heightrow.getChildren().add(heightButton);
		root.getChildren().add(heightrow);
		weightrow.getChildren().add(weightinput);
		weightrow.getChildren().add(weightButton);
		root.getChildren().add(weightrow);
		root.getChildren().add(bmiOutput);
		
		root.getChildren().add(agemessage);
		exerciserow.getChildren().add(ageinput);
		exerciserow.getChildren().add(agebutton);
		root.getChildren().add(exerciserow);
		root.getChildren().add(exerciseOutput);
		
		
		root.getChildren().add(workoutmessage);
		exercise1box.getChildren().add(gymButton);
		exercise1box.getChildren().add(cardioButton);
		root.getChildren().add(exercise1box);
		root.getChildren().add(workoutmessage2);
		
		//add our controls to the respective hbox and vbox's
		exercise2box.getChildren().add(workout1);
		exercise2box.getChildren().add(workoutbutton1);
		root.getChildren().add(exercise2box);
		root.getChildren().add(output2message);
		
		
		root.getChildren().add(workoutmessage3);
		exercise3box.getChildren().add(workout2);
		
		//this button is just for aesthetic purposes
		exercise3box.getChildren().add(workoutbutton2);
		root.getChildren().add(exercise3box);
		root.getChildren().add(output3message);
		
		root.getChildren().add(workoutmessage4);
		exercise4box.getChildren().add(workout3);
		exercise4box.getChildren().add(workoutbutton3);
		root.getChildren().add(exercise4box);
		root.getChildren().add(output4message);
		
		
		
		root.getChildren().add(slidermessage);
		sliderbox.getChildren().add(productivity);
		sliderbox.getChildren().add(sliderbutton);
		root.getChildren().add(sliderbox);
		root.getChildren().add(slideroutput);
		
		//display the controls
		primaryStage.setScene(scene);
		primaryStage.setTitle("TimeTracker for " + userinfo.getUserName() + ": " +  userinfo.getDate() );
		primaryStage.show();
		 
	}
	
}
