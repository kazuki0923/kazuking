package インターフェイスと抽象クラス;

// Q6 インターフェイスと抽象クラス
// Employeeクラス
public abstract class Employee implements Billable {
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

    // costForDayはここでは実装しない（サブクラスでオーバーライド）
}

