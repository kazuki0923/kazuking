package curriculumB;

// Q6 インターフェイスと抽象クラス
// FullTimeEmployeeクラス

public class FullTimeEmployeeQ6 extends EmployeeQ6{
	public FullTimeEmployeeQ6(String id,String name) {
		super(id,name);
		
	}
    @Override
    public int costForDay(int hoursWorked) {
    	int hourlyRate = 1250;
    	int overtime = Math.max(0, hoursWorked - 8);
    	int regularHours = hoursWorked - overtime;
    	return (regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25);
    }
}
