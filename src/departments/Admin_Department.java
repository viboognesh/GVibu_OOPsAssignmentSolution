package departments;

public class Admin_Department extends Super_Department{
	public String departmentName() {
		return "Admin Department";
	}
	
	public String getTodaysWork() {
		return "Complete your documents submission";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
