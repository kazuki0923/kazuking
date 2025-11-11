package curriculumB;

public class Question5 {

    // Q1 : 次の条件を満たすメソッド helloWorld を作成してください。
    // ・引数なし
    // ・戻り値なし
    // ・"Hello, World!" を表示
    // 実行例：
    // Hello, World!
    public static void helloWorld() {
        System.out.println("Hello, World!");
    }

    // Q2 : 次の条件を満たすメソッド doubleValue を作成してください。
    // ・引数：整数 (int num)
    // ・戻り値：整数（引数の2倍の値）
    // ・戻り値をもとに実行例のように表示
    // 実行例：
    // 10 を 2 倍すると 20 です。
    public static int doubleValue(int num) {
        return num * 2;
    }

    // Q3 : 次の条件を満たすメソッド isEven を作成してください。
    // ・引数：整数 (int num)
    // ・戻り値：true（偶数なら）、false（奇数なら）
    // ・num1に7、num2に10を設定し、以下の実行例になるように表示
    // 実行例：
    // 10 は偶数です。
    // 7 は奇数です。
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Q4 : 次の2つのクラスを作成し、Main クラスから Greeting クラスのメソッドを呼び出すようにしてください。
    // ・Greeting.java（別クラス）→ sayHello() メソッドで "こんにちは！" を表示
    // ・Main.java → Greeting クラスを使って sayHello() を呼び出す
    static class Greeting {
        public void sayHello() {
            System.out.println("こんにちは！");
        }
    }

    // Q5 : 次の2つのクラスを作成し、以下の出力になるように作成してください。
    // ・this と setter と getter とフィールドを使う
    // ・Animal.java（別クラス）→ 動物名、体長、速度の変数を持ち、getter/setterを作成
    // ・Main.java → 変数の中身を設定し、出力処理を行う
    // 実行例：
    // 動物名：ライオン
    // 体長：2.1m
    // 速度：80km/h
    static class Animal {
        private String name;
        private double length;
        private int speed;

        public void setName(String name) {
            this.name = name;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public String getName() {
            return this.name;
        }

        public double getLength() {
            return this.length;
        }

        public int getSpeed() {
            return this.speed;
        }
    }

    // メインメソッド：Q1〜Q5の処理を順番に呼び出す
    public static void main(String[] args) {
        // Q1
        helloWorld();

        // Q2
        int result = doubleValue(10);
        System.out.println("10 を 2 倍すると " + result + " です。");

        // Q3
        int num1 = 7;
        int num2 = 10;

        if (isEven(num2)) {
            System.out.println(num2 + " は偶数です。");
        } else {
            System.out.println(num2 + " は奇数です。");
        }

        if (isEven(num1)) {
            System.out.println(num1 + " は偶数です。");
        } else {
            System.out.println(num1 + " は奇数です。");
        }

        // Q4
        Greeting g = new Greeting();
        g.sayHello();

        // Q5
        Animal lion = new Animal();
        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80);

        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
    }
}
   
	 
            
		   