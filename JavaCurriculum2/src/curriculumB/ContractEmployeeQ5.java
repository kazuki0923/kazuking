package curriculumB;

// Q5 ポリモーフィズム
// ContractEmployeeクラス
public class ContractEmployeeQ5 extends EmployeeQ5{
	public ContractEmployeeQ5(String id,String name) {
		super(id,name);
	}
	
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1000;
		return hoursWorked * hourlyRate;
		
	}

}
