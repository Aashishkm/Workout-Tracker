/**
 * @author Aashish
 * This Class is responsible for having methods and data pertaining to the workout information
 * It is a parent class to gym and cardio, so all its methods can be inherited by those classes
 *
 *
 *
 */
 public class WorkoutInformation{ 
	 private double height;
	 private double weight; 
	 private double bmi;
	 private int age;
	 private String dailyexercise; 
	 private int workoutLength;
	 private double productivity;
	 
	public WorkoutInformation() {
		// TODO Auto-generated constructor stub
		height = 1.75;
		weight = 65;
		bmi = 22;
		age = 18;
		dailyexercise = "60 minutes";
		workoutLength = 60;
		productivity = 5;
				
	}
	public void Bmi(double height, double weight) {
		 
		 setHeight(height);
		 setWeight(weight);
		 
		 bmi =  weight/(height*height);
		 setBmi(bmi);
		 
		
	}
	public void recommendedDailyexercise(int age) {
	//data for this taken from:
	//http://www.csep.ca/CMFiles/Guidelines/CSEP_PAGuidelines_0-65plus_en.pdf
		
		setAge(age);
		if (5 > age)
		{
			dailyexercise = "180 minutes low intensity (crawling)";
		}
		
		else if (5 <= age && age < 19)
		{
			dailyexercise = "60 minutes moderate-vigorous intensity";
		}
		else if (19 <= age && age <= 65)
		{
			dailyexercise = "21 minutes moderate-vigorous intensity";
		}
		else if (age > 65)
		{
			dailyexercise = "attempt up to 21 minutes";
		}
		
		setDailyexercise(dailyexercise);
		
	}
	
	
	public double getHeight () {
		return height;
	}
	public double getWeight() {
		return weight;
	} 
	
	public void setHeight(double height) {
		
		this.height = height;
		
	}
	public void setWeight(double weight) {
		this.weight = weight;
		
	}
	//output information through getter
	public double getBMI() 
	{
		if ((bmi > 24.9) || (bmi < 18.5)) {
			System.out.print("You don't have a healthy BMI\n");	
		} 
		else {
		System.out.print("You have a healthy BMI\n");
			
		}
		return bmi;
	
	}
	
	public void setBmi(double bmi) {
		
		this.bmi = bmi;
		
	}
	public int getAge() {
		return age;
	} 
	
	public void setAge(int age) {
		
		this.age = age;
	
	}
	
	public String getDailyexercise() {
		return dailyexercise;
	} 
	
	public void setDailyexercise(String dailyexercise) {
		
		this.dailyexercise = dailyexercise;
	}
	
	public void setWorkoutLength(int length) {
		this.workoutLength = length;
	}
	public int getWorkoutLength() {
		return workoutLength;
	}
	
	
	public void setWorkoutProductivity(Double productivity) {
		this.productivity = productivity;
		
	}
	//output information through getter 
	public Double getWorkoutProductivity() {
		if (productivity >= 7.5) {
			System.out.print("Your workout was very productive\n");
		}
		else if (productivity < 7.5 && productivity > 4)
		{
			System.out.print("Your workout was average productivity\n");
		}
		else if (productivity <= 4)
		{
			System.out.print("Your workout was not productive\n");
		}
		return productivity;
	}
 }
		


 
 
 
