package 継承;

// Q4　継承
// FullTimeEmployeeクラス
public class FullTimeEmployee extends Employee {
    private static final int HOURLY_RATE = 1200;
    
	public FullTimeEmployee(String id, String name) {
		super(id, name);

	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		if (hoursWorked <= 8 ) {
			return hoursWorked * HOURLY_RATE;	
		} else {
			int regularHours = 8;
			int overtimeHours = hoursWorked - regularHours;
			return (regularHours * HOURLY_RATE) + (int)(overtimeHours * HOURLY_RATE * 1.25);
			
		}
	}
}
