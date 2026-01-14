package curriculumB;

// Q5 ポリモーフィズム
// FullTimeEmployeeクラス
public class FullTimeEmployeeQ5 extends EmployeeQ5{
    public FullTimeEmployeeQ5(String id,String name) {
    	super(id, name);
	}
    @Override
    public int calculateDailyWage(int hoursWorked) {
    	int hourlyRate = 1250;
    	int overtime = Math.max(0,  hoursWorked - 8);
    	int regularHours = hoursWorked - overtime;
    	return ( regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25);
    	
    }
}
