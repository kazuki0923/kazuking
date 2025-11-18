package クラスとオブジェクト;

// Q2 クラスとオブジェクト 
// Mainクラス
public class Main {
    public static void main(String[] args) {
    	// EmployeeQ2 クラスのインスタンスを生成
        Employee emp = new Employee();
       
     // フィールドに値を設定
        emp.employeeId = "E001";
        emp.name = "佐藤太郎";
        
     // メソッドを呼び出して情報を表示
        emp.showInfo();
    }
}

