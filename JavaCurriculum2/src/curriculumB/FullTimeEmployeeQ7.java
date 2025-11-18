package curriculumB;

// Q7 オブジェクト指向の設計原則（SOLID）
// FullTimeEmployeeクラス
public class FullTimeEmployeeQ7 extends EmployeeQ7{
	public FullTimeEmployeeQ7(String name) {
		super(name);
	}
    
	@Override
	public int costForDay(int hoursWorked) {
		int hourlyRate = 1200;
		int overtime = Math.max(0, hoursWorked - 8);
		int regularHours = hoursWorked - overtime;
		return (regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25);
		
	}
}
