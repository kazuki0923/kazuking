package curriculumB;

// Q5 ポリモーフィズム
// Mainクラス
import java.util.ArrayList;
import java.util.List;

public class MainQ5 {
    public static void main(String[] args) {
        List<EmployeeQ5> employees = new ArrayList<>();

        employees.add(new FullTimeEmployeeQ5("FT001", "佐藤"));
        employees.add(new FullTimeEmployeeQ5("FT002", "田中"));
        employees.add(new ContractEmployeeQ5("CT001", "鈴木"));
        employees.add(new ContractEmployeeQ5("CT002", "高橋"));

        int hoursWorked = 9;

        for (EmployeeQ5 emp : employees) {
            System.out.println(emp.name + " の給与: " + emp.calculateDailyWage(hoursWorked) + "円");
        }
    }
}