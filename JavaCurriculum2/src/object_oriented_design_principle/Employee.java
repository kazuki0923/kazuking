package object_oriented_design_principle;

// Q7 オブジェクト指向の設計原則（SOLID）
// Employeeクラス
public abstract class Employee implements Payable {
    private String id;
    private String name;
    private int hoursWorked;

    public Employee(String id, String name, int hoursWorked) {
        this.id = id;
        this.name = name;
        this.hoursWorked = hoursWorked;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int getHoursWorked() {
        return this.hoursWorked;
    }

    // 給与計算はサブクラスでオーバーライド
}


