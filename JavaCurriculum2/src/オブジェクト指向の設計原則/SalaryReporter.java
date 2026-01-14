package オブジェクト指向の設計原則;

// Q7 オブジェクト指向の設計原則（SOLID）
// SalaryReporterクラス

public class SalaryReporter {
    public void report(Payable p) {
        System.out.println(p.getName() + " の給料は " + p.calculateSalary() + " 円");
    }
}
