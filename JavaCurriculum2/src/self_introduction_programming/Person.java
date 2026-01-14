package self_introduction_programming;

public class Person {
    // インスタンスフィールド
	String name;
	int age;
	double height;
	double weight;
	
	// staticフィールド（人数カウント）
	static int count = 0;
	
	// コンストラクタ
	public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        count++; // 人数カウント

	}

	// BMI計算メソッド
	public double bmi() {
		return weight / (height * height);
		
	}
	// 自己紹介メソッド
	public void print() {
	System.out.println("名前は" + this.name + "です");
	System.out.println("年は"+this.age + "です");
	System.out.printf("BMIは%.2fです\n",this.bmi());
    
	}

	// 人数表示メソッド
	public static void printCount() {
		System.out.println("合計" + count + "人です");
	}
}	
	