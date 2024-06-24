/**
 * @author Aashish
 * This Class is a subclass for Workoutnformation
 * This class is responsible for collecting the respective data for the "gym workout"
 *
 *
 * 
 */
import java.util.Scanner;



public class Gym extends WorkoutInformation {
	
	private String exerciseType;
	private int weightCount;
	private int repCount;
	public int highestWeightCounter;
	//standard constructor values
	public Gym() {
		exerciseType = "Benchpress" ;
		weightCount = 40;
		repCount = 10;
	}
		
	public Gym(String exercise, int reps, int weight) 
	{
		setExerciseType(exercise);
		setRepCount(reps);
		setWeightCount(weight);	
	 
	}
	//getters and setters for the private variables defined above 	
	public String getExerciseType() {
		return exerciseType;
	}

	public void setExerciseType(String exerciseType) {
		this.exerciseType = exerciseType;
	}

	public int getWeightCount() {
		
		return weightCount;
	}
	//regulating input through the setter
	public void setWeightCount(int weightCount) {
		Scanner myScanner = new Scanner(System.in);
		if ((weightCount > 1000) || (weightCount < 1)) {
			System.out.println("How much weight did you lift");
			setWeightCount(myScanner.nextInt());
		}
		this.weightCount = weightCount;
		//int weightLifted = getWeightCount();
		//if (weightLifted > highestWeightCounter) {
			//highestWeightCounter = weightLifted;
		//}
			
	}

	public int getRepCount() {
		return repCount;
	}
	//regulating input through the setter
	public void setRepCount(int repCount) {
		Scanner myScanner = new Scanner(System.in);
		if ((repCount > 50) || (repCount < 1)) {
			
			System.out.println("How many reps did you do?");
			setRepCount(myScanner.nextInt());	
		}
		this.repCount = repCount;
		
	}
}
