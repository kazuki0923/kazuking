package object_oriented_design_principle;

// Q7 オブジェクト指向の設計原則（SOLID）
// Mainクラス
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Payable> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("FT001", "鈴木太郎", 10));
        employees.add(new ContractEmployee("CT001", "佐藤次郎", 6));

        SalaryReporter reporter = new SalaryReporter();

        for (Payable e : employees) {
            reporter.report(e); // Payable型で統一的に扱う
        }
    }
}
