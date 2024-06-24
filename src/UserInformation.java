
/**
 * @author aashish
 *This class is responsible for the collection of user information such as Name and date
 */
public class UserInformation {
	private String userName;
	
	private String workoutDate;
	//standard constructor information
	public UserInformation() {
		userName = "Aashish";
		workoutDate = "Feb 15";
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	//Another constructer class that will be used in the future for storing the data
	public UserInformation  (String name, String workoutdate) {
		super();
		this.userName = name;
		this.workoutDate = workoutdate;
		
	}
	//Constructor for the arraylist(not neccesary for current functionality)
	public UserInformation(UserInformation record) {
		super();
		this.userName = record.userName;
		this.workoutDate = record.workoutDate;
		
	}
	
	//setters and getters for the private variables above
	public String getDate () {
		return workoutDate;
	}
	public String getUserName() {
		return userName;
	} 
	
	public void setDate(String workoutDate) {
		
		this.workoutDate = workoutDate;
		
	}
	public void setUserName(String userName) {
		this.userName = userName;
		
	}
}
 
