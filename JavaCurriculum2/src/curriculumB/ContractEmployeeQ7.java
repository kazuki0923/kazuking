package curriculumB;

// Q7 オブジェクト指向の設計原則（SOLID）
// ContractEmployeeクラス
public class ContractEmployeeQ7 extends EmployeeQ7 {
    public ContractEmployeeQ7(String name) {
        super(name);
    }
     
    @Override
    public int costForDay(int hoursWorked) {
    	int hourlyRate = 1000;
    	return hoursWorked * hourlyRate;
	}

}
