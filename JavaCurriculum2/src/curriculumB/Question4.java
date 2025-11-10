package curriculumB; // パッケージ名がcurriculum_Bになっているか確認！

import java.util.Scanner; // Q7でユーザー入力を受け付けるために必要です

public class Question4 {
    public static void main(String[] args) {

        System.out.println("--- Q1: 配列の全要素を順番に表示 ---");
        // Q1: int型配列 {1, 2, 3, 4, 5} を作成し、全要素を順番に表示
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.print("Q1 結果: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + (i < array1.length - 1 ? ", " : ""));
        }
        System.out.println("\n");

        // ----------------------------------------------------------------

        System.out.println("--- Q2: 配列の要素を逆順に表示 ---");
        // Q2: int型配列 {10, 20, 30, 40, 50} を用意し、要素を逆順に表示
        int[] array2 = {10, 20, 30, 40, 50};
        System.out.print("Q2 結果: ");
        // array2.length - 1 (配列の最後のインデックス) から 0 まで i を減らしていく
        for (int i = array2.length - 1; i >= 0; i--) { 
            System.out.print(array2[i] + (i > 0 ? ", " : ""));
        }
        System.out.println("\n");

        // ----------------------------------------------------------------

        System.out.println("--- Q3: 全要素の合計値を計算し表示 ---");
        // Q3: int型配列 {3, 5, 7, 9, 11} を用意し、全要素の合計値を計算し表示
        int[] array3 = {3, 5, 7, 9, 11};
        int sum3 = 0; // 合計値を格納する変数を0で初期化
        for (int value : array3) { // 拡張for文で各要素を取り出し
            sum3 += value; // 合計に加算
        }
        System.out.println("Q3 結果: 合計値: " + sum3 + "\n");

        // ----------------------------------------------------------------

        System.out.println("--- Q4: 最大値と最小値を求めて表示 ---");
        // Q4: int型配列 {12, 7, 9, 21, 5, 18} を用意し、最大値と最小値を求めて表示
        int[] array4 = {12, 7, 9, 21, 5, 18};
        int max = array4[0]; // 最初の要素を仮の最大値とする
        int min = array4[0]; // 最初の要素を仮の最小値とする

        for (int value : array4) {
            if (value > max) {
                max = value; // もし現在の最大値より大きければ更新
            }
            if (value < min) {
                min = value; // もし現在の最小値より小さければ更新
            }
        }
        System.out.println("Q4 結果: 最大値: " + max);
        System.out.println("Q4 結果: 最小値: " + min + "\n");

        // ----------------------------------------------------------------

        System.out.println("--- Q5 & Q6: 全要素を2倍にし、拡張for文で表示 ---");
        // Q5: int型配列 {1, 2, 3, 4, 5} を用意し、すべての要素を2倍にする
        int[] array5 = {1, 2, 3, 4, 5};
        int[] doubledArray = new int[array5.length]; 
        
        for (int i = 0; i < array5.length; i++) {
            doubledArray[i] = array5[i] * 2; // 2倍した値を新しい配列に格納
        }

        // Q6: 結果を表示する際の処理に拡張for文を使用
        System.out.print("Q5 & Q6 結果 (2倍後の要素): ");
        int count = 0;
        for (int value : doubledArray) {
            System.out.print(value + (count < doubledArray.length - 1 ? ", " : ""));
            count++;
        }
        System.out.println("\n");

        // ----------------------------------------------------------------

        // Q7 のために Scanner を準備
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Q7: ユーザー入力が配列に含まれているか判定 ---");
        // Q7: int型配列 {4, 7, 10, 15, 20} を用意し、ユーザー入力した数が配列に含まれているか判定
        int[] array7 = {4, 7, 10, 15, 20};
        System.out.print("判定したい数を入力してください: ");
        int inputNum = scanner.nextInt();
        boolean found = false; // 見つかったかどうかのフラグ

        for (int value : array7) {
            if (value == inputNum) {
                found = true;
                break; // 見つかったらすぐにループを抜ける
            }
        }

        System.out.print("Q7 結果: ");
        if (found) {
            System.out.println(inputNum + "は配列に含まれています\n");
        } else {
            System.out.println(inputNum + "は配列に含まれていません\n");
        }
        
        // ----------------------------------------------------------------

        System.out.println("--- Q8: 2次元配列のすべての要素を表示 ---");
        // Q8: 2次元配列 int[][] array = {{1, 2}, {3, 4}, {5, 6}}; を用意し、すべての要素を表示
        int[][] array8 = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println("Q8 結果:");
        for (int i = 0; i < array8.length; i++) { // 行 (i) を回す
            for (int j = 0; j < array8[i].length; j++) { // 列 (j) を回す
                System.out.print(array8[i][j] + " ");
            }
            System.out.println(); // 1行終わったら改行
        }
        System.out.println();
        
        // ----------------------------------------------------------------

        // Q9: 配列を使うメリットに関するメッセージを表示
        System.out.println("Q9: 配列を使うと、複数のデータをまとめて管理できます。\n");
        
        // ----------------------------------------------------------------

        System.out.println("--- Q10: 2次元配列のすべての要素の合計値を表示 ---");
        // Q10: 2次元配列 int[][] array = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}; の合計値
        int[][] array10 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        int sum10 = 0;
        for (int[] row : array10) { // 各行を取り出す
            for (int value : row) { // 各行の要素を取り出す
                sum10 += value;
            }
        }
        System.out.println("Q10 結果: 合計値: " + sum10 + "\n");

        // ----------------------------------------------------------------

        System.out.println("--- Q11: 2次元配列内の最大値と最小値を表示 ---");
        // Q11: 2次元配列 int[][] array = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}}; の最大値と最小値
        int[][] array11 = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}};
        // 初期値は配列の最初の要素
        int max2D = array11[0][0]; 
        int min2D = array11[0][0];

        for (int[] row : array11) {
            for (int value : row) {
                if (value > max2D) {
                    max2D = value;
                }
                if (value < min2D) {
                    min2D = value;
                }
            }
        }
        System.out.println("Q11 結果: 最大値: " + max2D);
        System.out.println("Q11 結果: 最小値: " + min2D + "\n");

        // ----------------------------------------------------------------

        System.out.println("--- Q12: 3次元配列内のすべての要素を表示 ---");
        // Q12: 3次元配列 int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}; の全要素を表示
        int[][][] array12 = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        System.out.println("Q12 結果:");
        for (int i = 0; i < array12.length; i++) { // 1次元目
            for (int j = 0; j < array12[i].length; j++) { // 2次元目
                for (int k = 0; k < array12[i][j].length; k++) { // 3次元目 (要素)
                    System.out.print(array12[i][j][k] + " ");
                }
                System.out.print("| "); // 2次元目の区切り
            }
            System.out.println(); // 1次元目の区切り
        }
        System.out.println();

        // ----------------------------------------------------------------

        // Q13: 多次元配列のメリットに関するメッセージを表示
        System.out.println("Q13: 多次元配列を理解できると、表データ、ゲームの盤面、画像データなど、応用範囲が広がります");

        // Scannerを使い終わったので閉じます
        scanner.close(); 
    }
}