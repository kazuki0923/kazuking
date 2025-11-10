package curriculum_B;

/*
【概要】
九九（かけ算表）を表示するプログラム。

【詳細説明】
・for文の二重ループを使って、1〜9の掛け算の結果を表形式で出力。
・内側のforで掛け算を計算、外側のforで行を制御。
・\t（タブ）を使って見やすく整列。
*/
public class Qes5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
