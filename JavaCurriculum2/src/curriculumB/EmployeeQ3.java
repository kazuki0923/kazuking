package curriculumB;

// Q3: カプセル化
// Employeeクラス
public class EmployeeQ3 {
    // プライベートフィールド(外部から直接アクセスできない）
    private String employeeId;
    private String name;
    
    // 社員IDのsetter
    public void setEmployeeId(String id) {
    	this.employeeId = id;
	}

    // 社員IDのgetter
    public String getEmployeeId() {
    	return employeeId;
    }

    // 名前のsetter
    public void setName(String name) {
    	this.name = name;
    }

    // 名前のgetter
    public String getName() {
    	return name;
    	
    }
}    