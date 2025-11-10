package curriculum_B;

import java.util.Scanner;

/*
【概要】
複数の生徒の点数を入力し、各生徒・各教科・全体の平均点を計算するプログラム。

【詳細説明】
・生徒の人数を入力。
・4教科（英語、数学、理科、社会）の点数を2次元配列に格納。
・各生徒の平均点、各教科の平均点、全体の平均点を順に出力。
・平均点は小数点2桁まで表示。
*/
public class Qes7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("生徒の人数を入力してください（2以上）：");
        int n = sc.nextInt();

        double[][] scores = new double[n][4];
        String[] subjects = {"英語", "数学", "理科", "社会"};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください:");
                scores[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += scores[i][j];
            }
            System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), sum / 4);
        }

        double[] subjectAvg = new double[4];
        for (int j = 0; j < 4; j++) {
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += scores[i][j];
            }
            subjectAvg[j] = sum / n;
            System.out.printf("%sの平均点は%.2f点です。\n", subjects[j], subjectAvg[j]);
        }

        double totalSum = 0;
        for (double avg : subjectAvg) totalSum += avg;
        System.out.printf("全体の平均点は%.2f点です。\n", totalSum / 4);

        sc.close();
    }
}
