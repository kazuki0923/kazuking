package interface_and_abstract_class;

// Q6 インターフェイスと抽象クラス
// FullTimeEmployeeクラス

public class FullTimeEmployee extends Employee {
    private static final int HOURLY_RATE = 1250; // 定数化

    public FullTimeEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int costForDay(int hoursWorked) {
        int overtime = Math.max(0, hoursWorked - 8);
        int regularHours = hoursWorked - overtime;
        return (regularHours * HOURLY_RATE) + (int)(overtime * HOURLY_RATE * 1.25);
    }
}

