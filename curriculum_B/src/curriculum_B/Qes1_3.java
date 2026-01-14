package curriculum_B;

import java.util.Scanner;

/*
【概要】
ユーザー名の入力を受け取り、ルールに従ってチェックを行うプログラム。

【詳細説明】
・Scannerを使ってユーザーに名前を入力させる。
・入力値に対して以下の条件を判定：
　① 何も入力していない → 「名前を入力してください」
　② 10文字を超えている → 「名前を10文字以内にしてください」
　③ 半角英数字以外が含まれる → 「半角英数字のみで入力してください」
　④ 条件をすべて満たす → 「登録しました」と表示
・最後にScannerを閉じる。
*/
public class Qes1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ユーザー名を入力してください：");
        String name = sc.nextLine();

        if (name == null || name.length() == 0) {
            System.out.println("名前を入力してください");
        } else if (name.length() > 10) {
            System.out.println("名前を10文字以内にしてください");
        } else if (!name.matches("[A-Za-z0-9]+")) {
            System.out.println("半角英数字のみで名前を入力してください");
        } else {
            System.out.println("ユーザー名「" + name + "」を登録しました");
        }

        sc.close();
    }
}
