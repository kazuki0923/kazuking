package polymorphism;

// Q5 ポリモーフィズム
// FullTimeEmployeeクラス
public class FullTimeEmployee extends Employee {
    // 定数化（時給）
    private static final int HOURLY_RATE = 1250;

    public FullTimeEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int calculateDailyWage(int hoursWorked) {
        int overtime = Math.max(0, hoursWorked - 8);
        int regularHours = hoursWorked - overtime;
        return (regularHours * HOURLY_RATE) + (int)(overtime * HOURLY_RATE * 1.25);
    }
}
