package curriculumB;

// Q7 オブジェクト指向の設計原則（SOLID）
// SalaryReporterクラス
public class SalaryReporter {
	public void report(Payable employee, int hoursWorked) {
		System.out.println(employee.getName() + "の給料は"+ employee.costForDay(hoursWorked) + "円");
		
	}

}
