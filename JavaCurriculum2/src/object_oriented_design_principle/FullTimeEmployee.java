package object_oriented_design_principle;

// Q7 オブジェクト指向の設計原則（SOLID）
// FullTimeEmployeeクラス
public class FullTimeEmployee extends Employee {
    private static final int HOURLY_RATE = 1200;

    public FullTimeEmployee(String id, String name, int hoursWorked) {
        super(id, name, hoursWorked);
    }

    @Override
    public int calculateSalary() {
        int overtime = Math.max(0, getHoursWorked() - 8);
        int regularHours = getHoursWorked() - overtime;
        return (regularHours * HOURLY_RATE) + (int)(overtime * HOURLY_RATE * 1.25);
    }
}
