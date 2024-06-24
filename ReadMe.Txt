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
	-For the current design of my project, I believe that storing multiple workout sessions for each username is sufficient


*MAJOR FEATURES*
*Note*
-It says that major features are features which have taken from 2-3 hours to complete (all of these features have took more than this)

~Major Features 1 (From Demo 1):

1. My Tracker takes in Data and uses it in a significant way
	- Tracks the type of exercise, the number of reps, intensity level, weight...etc	
2. Performing non-trivial verification of user input
	- Has basic input checking on some of these values 
	- Ensures that #of reps are realistic, weight is realistic, intensity is from 1-10...etc, and reprompts user if values are unrealistic 


~Major Features 2 (From Demo 2):

1. My Tracker incorporates inheritance in a meaningful way into my class design
	-Workout Information is a parent class, Gym and Cardio are the subclasses
	-While I don't use polymorphism explicitly, I do have simple inheritance that is very useful, especially when I incorporate more types of workouts into the future. 

2. Re-design your project to include more Data collection or analysis 
	-Created additional classes and separated everything into (gym, cardio, and workoutinformation)
	-Created a method for a BMI calculator
	-Created a method for a Recommended exercise calculator
	- Added a Method for Workout Length
	- Added Method for Workout productivity


~Major Features 3 (From Demo 3):

1. Implementation of one or several additional JavaFx controls which makes sense for your app
	-Implemented a Slider to gage the overall workout productivity 
	-Overall, I used Buttons, TextFields and Slider

2. Implemented 7 eventHandlers where only 1 was necessary 
	-Each event Handler is connected to the other classes, and passes in data to the project, and receives data back from the other classes
	-Some of the methods used also print out figures to the console
		-Whether your BMI is healthy
		-Whether your workout was productive









	