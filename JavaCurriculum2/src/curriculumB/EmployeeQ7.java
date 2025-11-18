package curriculumB;

// Q7 オブジェクト指向の設計原則（SOLID）
// Employeeクラス
public abstract class  EmployeeQ7 implements Payable {
    protected String name;
    
    public EmployeeQ7(String name) {
    	this.name = name;
	}

    @Override
    public String getName() {
    	return name;
    }
}
