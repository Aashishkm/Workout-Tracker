/* @author Aashish
 * This class is still in the works, and is a class that will eventually be able to store
 * user info inn an arrayList
 * Its presence does not affect the functionality of the project so please disregard it
 * I just did not want to delete it yet 
 * 
*/


import java.util.ArrayList;

/**
 * 
 */

/**
 * @author aashish
 *
 */
public class UserInfoRecords {
	ArrayList<UserInformation> userRecords;
	private String userName;
	private String workoutdate;
	
	
	public UserInfoRecords(String userName, String workoutdate )
	{
		super();
		this.userName = userName;
		this.workoutdate = workoutdate;
		
	}
	public UserInfoRecords(ArrayList<UserInformation> userRecords)
	{
		super();
		this.userRecords = new ArrayList<UserInformation>();
		
		
		for (UserInformation ur: userRecords)
		{
			this.userRecords.add(new UserInformation(ur));
		}
	}
	//copy constructor
	public UserInfoRecords(UserInfoRecords toCopy)
	{
		super();
		this.workoutdate = toCopy.workoutdate;
		this.userRecords = new ArrayList<UserInformation>();
		
		
		for (UserInformation ur: toCopy.userRecords)
		{
			this.userRecords.add(new UserInformation(ur));
		}
	}
	
	
	
	
	public ArrayList<UserInformation> getUserRecords() {
		ArrayList<UserInformation> Clone = new ArrayList<UserInformation>();
		
		
		for (UserInformation ur: userRecords)
		{
			Clone.add(new UserInformation(ur));
		}
		return Clone;
	}
	
	
	
	
	public void setUserRecords(ArrayList<UserInformation> userRecords) {
		this.userRecords = userRecords;
	}

	
	public String getUserName() {
		return userName;
	}
	
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getworkoutDate() {
		return workoutdate;
	}
	
	public void setworkoutDate(String workoutdate) {
		this.workoutdate = workoutdate;
	}
	
}
