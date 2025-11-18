package curriculumB;

// Q4 継承
// PartTimeEmployeeクラス
public class PartTimeEmployee extends EmployeeQ4 {
    private static final int HOURLY_RATE = 1000;

    public PartTimeEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int calculateDailyWage(int hoursWorked) {
        return hoursWorked * HOURLY_RATE;
    }
}

