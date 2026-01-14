package 基本概念;

// Q1: 基本概念
// Mainクラス
public class Main {
    public static void main(String[] args) {
    	Employee emp = new Employee(); // オブジェクトを作る
    	emp.name = "山田太郎";         // 名前をセットする
    	emp.work();                    // 働くメソッドを呼び出す
	}
}
