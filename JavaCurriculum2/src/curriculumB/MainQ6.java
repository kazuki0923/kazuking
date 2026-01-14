package curriculumB;

// Q6 インターフェイスと抽象クラス
// Mainクラス
import java.util.ArrayList;
import java.util.List;

public class MainQ6 {
	public static void main(String[] args) {
		List<Billable> employees = new ArrayList<>();
		
		employees.add(new FullTimeEmployeeQ6("FT001","佐藤"));
		employees.add(new FullTimeEmployeeQ6("FT002","鈴木"));
		employees.add(new ContractEmployeeQ6("CT001", "田中"));
	    employees.add(new ContractEmployeeQ6("CT002", "高橋"));
	    
	    int hoursWorked = 9;
	    
	    for (Billable emp : employees) {
	    	// Billable型なので、costForDayだけ呼べる
	    	System.out.println(((EmployeeQ6) emp).name + "の日給: " + emp.costForDay(hoursWorked) + "円");
	    	
	    }
	}
}
