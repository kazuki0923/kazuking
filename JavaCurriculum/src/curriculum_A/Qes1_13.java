package curriculum_A;

public class Qes1_13 {
    public static void main(String[] args) {

        // 1. 各種の変数宣言
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        char c;
        String str;
        boolean bool;

        // 2. 各変数を初期化
        b = 10;
        s = 100;
        i = 1000;
        l = 10000L;
        f = 9.5f;
        d = 10.5;
        c = 'A';
        str = "こんにちは";
        bool = true;

        // 3. 出力して確認
        System.out.println(b + s + i + l);
        System.out.println(f + d);
        System.out.println(str + " " + bool);
        System.out.println(b + s + i + l + 20);
        System.out.println((long)b * s * i * l);
        System.out.println(d / 100);
        System.out.println(b - s);

        // 4. 文字列と数値の足し算
        String num = "20";
        int num1 = 23;
        System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));

        // 5. 山田太郎の情報を代入
        String name = "山田太郎";
        int age = 18;
        double height = 170.5;
        double weight = 62.2;
        String food = "寿司";

        System.out.println("初めまして " + name + " です。");
        System.out.println("年齢は " + age + " 歳です。");
        System.out.println("身長は " + height + " cm です。");
        System.out.println("体重は " + weight + " kg です。");
        System.out.println("好きな食べ物は " + food + " です。");

        // 6. BMIを計算して出力
        double bmi = weight / (height * height / 10000);
        System.out.println("BMIは " + bmi + " です。");

        // 7. 再代入して鈴木一郎に変更（好きな食べ物はオムライス）
        name = "鈴木一郎";
        age = 24;
        height = 168.5;
        weight = 64.2;
        food = "オムライス";

        bmi = weight / (height * height / 10000);
        System.out.println("初めまして " + name + " です。");
        System.out.println("年齢は " + age + " 歳です。");
        System.out.println("身長は " + height + " cm です。");
        System.out.println("体重は " + weight + " kg です。");
        System.out.println("好きな食べ物は " + food + " です。");
        System.out.println("BMIは " + Math.round(bmi * 10.0) / 10.0 + " です。");

        // 8. 条件文の例（年齢が25歳以上ならtrue）
        System.out.println(age < 25);
    }
}

