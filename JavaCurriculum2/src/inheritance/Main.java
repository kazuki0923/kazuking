package inheritance;

// Q4 継承
// Mainクラス
public class Main {

	public static void main(String[] args) {
		Employee fullTime = new FullTimeEmployee("FT001", "佐藤");
		Employee partTime = new PartTimeEmployee("PT001", "鈴木");
		
		int hoursWorked = 9;
		
		System.out.println("正社員の給与: " + fullTime.calculateDailyWage(hoursWorked) + "円");
		System.out.println("パート社員の給与: " + partTime.calculateDailyWage(hoursWorked) + "円");
		
	}

}
