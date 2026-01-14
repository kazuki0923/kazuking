package curriculumB;

// Q4 継承
// Employeeクラス
public abstract class  EmployeeQ4 {
    private String employeeId;
    private String name;
    
    public EmployeeQ4(String id, String name) {
    	this.employeeId = id;
    	this.name = name;
    	
	}

    public String getEmployeeId() {
    	return employeeId;
    	
    }
    
    public String getName() {
    	return name;
    	
    }

    public abstract int calculateDailyWage(int hoursWorked);
    
}   