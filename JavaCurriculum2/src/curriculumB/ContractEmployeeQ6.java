package curriculumB;

// Q6 インターフェイスと抽象クラス
// FullTimeEmployeeクラス

public class ContractEmployeeQ6 extends EmployeeQ6 {
	public ContractEmployeeQ6(String id, String name) {
		super(id,name);
	}

	@Override
	public int costForDay(int hoursWorked) {
		int hourlyRate = 1000;
		return hoursWorked * hourlyRate;
	}
}
