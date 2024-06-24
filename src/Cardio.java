/**
* @author Aashish
* This Class is a subclass for WorkoutInformation
* This class is responsible for collecting the respective data for the "Cardio workout"
* At the moment, it only takes in the intensity because it can inherit workout length,
* and other methoods from WorkoutInformation.
* 
*/

import java.util.Scanner;

public class Cardio extends WorkoutInformation {



	private int intensity;
	 
	//standard constructor values 
	public Cardio() {
		intensity = 5;
	 
	}
	
	public Cardio(int intensity)
	{
	 
	setIntensity(intensity);
	
	}
	//Getters and setters for our private variables listed above
	public int getIntensity() {
		return intensity;
	}

	//regulating input through the setter
	public void setIntensity(int intensity) {
		
		if ((intensity > 10) || (1 > intensity )) {
			Scanner myScanner = new Scanner(System.in);
			System.out.println("On a scale of 1-10, how intense was it?");
			setIntensity(myScanner.nextInt());
			
		}
		this.intensity = intensity;
		
	}
}
 


