package polymorphism;

// Q5 ポリモーフィズム
// ContractEmployeeクラス
public class ContractEmployee extends Employee {
    // 定数化（時給）
    private static final int HOURLY_RATE = 1000;

    public ContractEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int calculateDailyWage(int hoursWorked) {
        return hoursWorked * HOURLY_RATE;
    }
}
