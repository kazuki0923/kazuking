package curriculumB;

// Q5 ポリモーフィズム
// Employeeクラス
public abstract class EmployeeQ5 {
    protected String id;
    protected String name;

    public EmployeeQ5(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract int calculateDailyWage(int hoursWorked);
}

