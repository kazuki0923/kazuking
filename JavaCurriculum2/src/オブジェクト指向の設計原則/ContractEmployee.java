package オブジェクト指向の設計原則;

// Q7 オブジェクト指向の設計原則（SOLID）
// ContractEmployeeクラス
public class ContractEmployee extends Employee {
    private static final int HOURLY_RATE = 1000;

    public ContractEmployee(String id, String name, int hoursWorked) {
        super(id, name, hoursWorked);
    }

    @Override
    public int calculateSalary() {
        return getHoursWorked() * HOURLY_RATE;
    }
}
