package curriculumB;

// Q6 インターフェイスと抽象クラス
// Employeeクラス
public abstract class EmployeeQ6 implements Billable {
    protected String id;
    protected String name;
	
    public EmployeeQ6(String id, String name) {
    	this.id = id;
    	this.name = name;
    	
    }	
     // costForDay はここでは実装しない（サブクラスでオーバーライド） 
}
