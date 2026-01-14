package ポリモーフィズム;

// Q5 ポリモーフィズム
// Employeeクラス
public abstract class Employee {
    private String id;
    private String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    // 抽象メソッド（サブクラスで実装）
    public abstract int calculateDailyWage(int hoursWorked);
}


