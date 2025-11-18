package polymorphism;

// Q5 ポリモーフィズム
// Mainクラス
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 社員リスト（Employee型）
        List<Employee> employees = new ArrayList<>();

        // 社員追加（サブクラスをEmployee型で扱う）
        employees.add(new FullTimeEmployee("FT001", "鈴木太郎"));
        employees.add(new FullTimeEmployee("FT002", "田中花子"));
        employees.add(new ContractEmployee("CT001", "佐藤次郎"));
        employees.add(new ContractEmployee("CT002", "山本美咲"));

        // 勤務時間（仮設定）
        int hoursWorked = 10;

        // 給与出力（ポリモーフィズム）
        for (Employee e : employees) {
            int wage = e.calculateDailyWage(hoursWorked);
            System.out.println("ID: " + e.getId() + " / 名前: " + e.getName() + " / 給与: " + wage + "円");
        }
    }
}
