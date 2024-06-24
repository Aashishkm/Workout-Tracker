## Workout Tracker ##
Aashish Mehra

The development environment for this project was Eclipse
 


*UPDATES*
Since the last demo these are the major additions that I did:

- reformatted/reorganized my classes (made all the scanner input data be in 1 class)
	- WorkoutTracker is the text-based interface
	- WorkoutTrackerGUI is the graphical interface
 
-Included new methods in the WorkoutInformation Class (parent class for gym and cardio)
	- Method that calculates BMI
	- Method that calculates Recommended daily exercise
	- Method for Workout Length
	- Method for Workout productivity

-Added 4 more event Handlers to WorkoutTracker.GUI
	- Connected the GUI to the project
	- Every input in the GUI is taken in by methods in the project (not all of the data is transformed, but the values are assigned to method variables)
	
-File I/O in the text based interface 
	-Inputs and saves all of the workoutData for a respective user into a file,
	-Reads all the data as a report for the user back in the console 

	-File Format:
	<Name>
	<Height(m)>
	<Weight(kg)>
	<Age>
	<Recommended Daily Exercise>
	<Workout1 Date>
	<Workouttype1 (gym or cardio), Workout1 information>
	//Number of workouts based on user input
	<Workout2 Date> 
	<Workouttype2 (gym or cardio), Workout2 information>  
	--
	--
	<Workoutx Date>
	<WorkouttypeX (gym or Cardio), WorkoutX information>
	
-Ability to switch between Text and Graphical if you run the WorkoutTrackerGUI class 
	-Based on user input
	-Type G for graphical, T for text-based

-In the process of making an arrayList useful for storing multiple data entries (UserInfoRecords Class)
	-However, at the moment please disregard this class as it is does not affect the functionality, and I didn't want to delete it. 




	
