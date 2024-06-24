/*
Author: Aashish
This class is the class responsible for the text based interface for this project
It takes in user information through the console and calls methods to store the data, and transform it
This class is also where File I/0 occurs
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

 
 

public class WorkoutTracker
{
	 
	 
	
	public WorkoutTracker() throws IOException 
	{
		 
		Scanner myScanner = new Scanner(System.in);
		UserInformation myRecord = new UserInformation();
		WorkoutInformation myWorkout = new WorkoutInformation(); 
		String workoutType = ""; 
		int reps = 10;
		int liftingweight = 50;
		String exercisetype = "";
		int intensity = 5;
		String workoutLength = "";
		int workoutCounter = 0;
		double bodyweight = 0;
		double height = 0;
		int age = 0;

		
		System.out.println("What is your name?");
		myRecord.setUserName(myScanner.nextLine());
		 
		String outputFilename = myRecord.getUserName().toLowerCase() + ".txt";
			 
		File outputFile = new File(outputFilename);
		BufferedWriter workoutinfowriter = new BufferedWriter(new FileWriter(outputFile));
		
	 
		
		workoutinfowriter.write(myRecord.getUserName() + "\n");
		
		
		System.out.println("What is your bodyweight(kg)?");
		bodyweight = (myScanner.nextDouble());
		myScanner.nextLine();
		
		
		
		System.out.println("What is your Height(m)?");
		height = (myScanner.nextDouble());
		myScanner.nextLine();
		myWorkout.Bmi(height, bodyweight);
		System.out.print("\nBMI = " + myWorkout.getBMI()+"\n");
		
		System.out.println("What is your age?");
		age = (myScanner.nextInt());
		myScanner.nextLine();
		myWorkout.recommendedDailyexercise(age);
		System.out.print("Recommended daily exercise: " + myWorkout.getDailyexercise() +"\n");
		
		workoutinfowriter.write(String.valueOf(myWorkout.getHeight())+ "\n");
		workoutinfowriter.write(String.valueOf(myWorkout.getWeight())+ "\n");
		workoutinfowriter.write(String.valueOf(myWorkout.getBMI())+ "\n");
		workoutinfowriter.write(myWorkout.getAge()+ "\n");
		workoutinfowriter.write(myWorkout.getDailyexercise()+ "\n");
		 
		 
		/* boolean flag loop that enables the user to be prompted again 
		if they have additional information */
		boolean hasMoreWorkouts = false;
		while (!hasMoreWorkouts) {
			
			String YES = "yes";
			String additionalInfo = "";
			
			System.out.println("Do you have any workout data?");
			additionalInfo = myScanner.nextLine();
			
			if (additionalInfo.equals(YES)){
			 
				
				System.out.println("What type of workout did you do? (gym or cardio)");
				workoutType = myScanner.nextLine();	
				
				if (workoutType.equals("gym")) 
				{
					Gym gymWorkout = new Gym(exercisetype, reps, liftingweight);
					
					System.out.println("What date did you workout?");
					myRecord.setDate(myScanner.nextLine());	
					
					System.out.println("What exercise did you do?");
					gymWorkout.setExerciseType(myScanner.nextLine());
		

					System.out.println("How much weight did you lift? (pounds)");
					gymWorkout.setWeightCount(myScanner.nextInt());
					myScanner.nextLine();
					
					System.out.println("How many reps did you do?");
					gymWorkout.setRepCount(myScanner.nextInt());
					myScanner.nextLine();
	
					
					
					workoutinfowriter.write(myRecord.getDate()+"\n");
					workoutinfowriter.write("Gym,"+ gymWorkout.getExerciseType()+"," + gymWorkout.getWeightCount()+","+ gymWorkout.getRepCount()+ "\n");
				 
				}
				
				else 
				{
					Cardio cardioWorkout = new Cardio(intensity);
					
					System.out.println("What date did you workout?");
					myRecord.setDate(myScanner.nextLine());	
					
					System.out.println("On a scale of 1-10, how intense was it?");
					cardioWorkout.setIntensity(myScanner.nextInt());
					myScanner.nextLine();
					
					System.out.println("How long did you train for? (mins)");
					cardioWorkout.setWorkoutLength((Integer.parseInt(myScanner.nextLine())));
					
					workoutinfowriter.write(myRecord.getDate()+"\n");
					workoutinfowriter.write("Cardio," + cardioWorkout.getIntensity()+ "," + cardioWorkout.getWorkoutLength()+"\n");

					
				}
			
				workoutCounter++;				
			}
			else {
				 
				hasMoreWorkouts = true;
			}
		}
  
		System.out.println("Hello " + myRecord.getUserName() +", " + "you worked out last on " + myRecord.getDate());
		System.out.println("You have worked out " + workoutCounter + " time(s)!");
		if (workoutCounter > 2) {
			System.out.println("you are getting a good amount of exercise!");
		}
		workoutinfowriter.close();
		
		 //File output 
		BufferedReader br = new BufferedReader(new FileReader(myRecord.getUserName()+".txt"));
		
		String line = br.readLine();
		while (line != null)
		{	
			System.out.println(line);
			line = br.readLine();
		}
			
		br.close();
		
		// TODO Auto-generated constructor stub
	}
	/**
	 *  
	 * @throws IOException 
	 */
	
 
 
		
	public static void main(String [] args) throws IOException  

	{
		 
		WorkoutTracker myTracker = new WorkoutTracker();
		 
		 
	}
	
}
		
 
	



