package インターフェイスと抽象クラス;

// Q6 インターフェイスと抽象クラス
// FullTimeEmployeeクラス
public class ContractEmployee extends Employee {
    private static final int HOURLY_RATE = 1000; // 定数化

    public ContractEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int costForDay(int hoursWorked) {
        return hoursWorked * HOURLY_RATE;
    }
}

