package curriculumB;

// Q7 オブジェクト指向の設計原則（SOLID）
// Mainクラス
import java.util.ArrayList;
import java.util.List;

public class MainQ7 {
	public static void main(String[] args) {
	    List<Payable>employees = new ArrayList<>();
	    employees.add(new FullTimeEmployeeQ7("佐藤"));
	    employees.add(new ContractEmployeeQ7("田中"));
	    
	    SalaryReporter reporter = new SalaryReporter();
	    int hoursWorked = 9;
	    
	    for (Payable emp : employees) {
	    	reporter.report(emp,  hoursWorked);
	    	
	    }
	}

}
