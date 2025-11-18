package curriculumB;

// Q3: カプセル化
// Mainクラス
public class MainQ3 {
	public static void main(String[] args) {
		// Employee オブジェクトを生成
		EmployeeQ3 emp = new EmployeeQ3();
        
		emp.setEmployeeId("E002");
		emp.setName("田中花子");
		
		 System.out.println("社員ID: " + emp.getEmployeeId() + ", 名前: " + emp.getName());
		

	}

}
