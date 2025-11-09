package curriculum_A;

public class Qes1_13 {
    public static void main(String[] args) {

        // Q1 各型の変数を宣言・初期化
        byte byteNum = 0;
        short shortNum = 0;
        int intNum = 0;
        long longNum = 0L;
        float floatNum = 0.0f;
        double doubleNum = 0.0;
        char letter = ' ';
        String letters = "";
        boolean isBoolean = false;

        // Q2 各変数に値を代入
        byteNum = 10;
        shortNum = 100;
        intNum = 1000;
        longNum = 10000L;
        floatNum = 9.5f;
        doubleNum = 10.5;
        letter = 'a';
        letters = "ハロー";
        isBoolean = true;

        // Q3 コンソール出力
        System.out.println(byteNum + shortNum + intNum + longNum);        // 11110
        System.out.println(byteNum * 2);                                  // 20
        System.out.println(letter + " " + letters + " " + isBoolean);     // a ハロー true
        System.out.println(byteNum + shortNum + intNum + longNum + 20);   // 11130
        System.out.println(byteNum * shortNum * intNum * longNum);        // 10000000000
        System.out.println(doubleNum / 100);                              // 0.105
        System.out.println(byteNum - shortNum);                           // -90

        // Q4 文字列と数値の結合修正
        String num = "20";
        int num1 = 23;
        System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1)); // ハローJAVA43

        // Q5 自己紹介（山田太郎）
        String name = "山田太郎";
        int age = 18;
        double height = 170.5;
        double weight = 62.2;
        String food = "寿司";

        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + food + "です");

        // Q6 BMI計算（数値直書き禁止）
        double bmi = weight / ((height / 100) * (height / 100));
        System.out.println("BMIは" + Math.round(bmi * 10) / 10.0 + "です");

        // Q7 再代入（鈴木一郎）
        name = "鈴木一郎";
        age = 24;
        height = 168.5;
        weight = 64.2;
        food = "オムライス";
        bmi = weight / ((height / 100) * (height / 100));

        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + food + "です");
        System.out.println("BMIは" + Math.round(bmi * 10) / 10.0 + "です");

        // Q8 自己代入（年齢・身長・体重の加算）
        age += 24;
        height += 168.5;
        weight += 64.2;
        bmi = weight / ((height / 100) * (height / 100));

        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + food + "です");
        System.out.println("BMIは" + Math.round(bmi * 100) / 100.0 + "です");

        // Q9 if文を使わずに25歳以上ならtrue
        System.out.println(age >= 25);

        // Q10 型変換：年齢・身長・体重を文字列に変換して結合
        String strAge = String.valueOf(age);
        String strHeight = String.valueOf(height);
        String strWeight = String.valueOf(weight);
        System.out.println(strAge + strHeight + strWeight);

        // Q11 文字列型から整数型に変換
        int ageInt = Integer.parseInt(strAge);
        int heightInt = (int) Double.parseDouble(strHeight);
        System.out.println(ageInt);
        System.out.println(heightInt);

        // Q12 条件式（if文禁止）: 年齢が25以上または身長が160以上ならtrue
        System.out.println(ageInt >= 25 || heightInt >= 160);
    }
}


