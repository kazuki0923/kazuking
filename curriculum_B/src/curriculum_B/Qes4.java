package curriculum_B;

import java.util.Random;
import java.util.Scanner;

/*
【概要】
ユーザーとコンピュータがじゃんけんを行うプログラム。

【詳細説明】
・ユーザー名を入力して登録。
・じゃんけんの手（0：グー、1：チョキ、2：パー）を選択。
・ランダムでCPUの手を生成。
・勝敗を判定し、勝つまで繰り返す。
・CPUが勝った場合は手ごとに違うセリフを表示。
・勝利したら「やるやん」と表示して終了。
・最後に何回で勝てたかを表示。
*/
public class Qes4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("ユーザー名を入力してください：");
        String name = sc.nextLine();
        System.out.println("ユーザー名「" + name + "」を登録しました");

        int count = 0;
        boolean win = false;

        while (!win) {
            System.out.print("自分の手を入力してください（0：グー、1：チョキ、2：パー）：");
            int user = sc.nextInt();
            int cpu = rand.nextInt(3);
            count++;

            String[] hands = {"グー", "チョキ", "パー"};
            System.out.println(name + "の手は「" + hands[user] + "」");
            System.out.println("相手の手は「" + hands[cpu] + "」");

            if (user == cpu) {
                System.out.println("DRAW あいこ もう一回しましょう！");
            } else if ((user == 0 && cpu == 1) || (user == 1 && cpu == 2) || (user == 2 && cpu == 0)) {
                System.out.println("やるやん。");
                System.out.println("次は俺にリベンジさせて");
                win = true;
            } else {
                System.out.println("俺の勝ち！");
                switch (cpu) {
                    case 0:
                        System.out.println("負けは次につながるチャンスです！");
                        System.out.println("ネバーギブアップ！");
                        break;
                    case 1:
                        System.out.println("たかがじゃんけん、そう思ってないですか？");
                        System.out.println("それやったら次も、俺が勝ちますよ");
                        break;
                    case 2:
                        System.out.println("なんで負けたか、明日まで考えといてください。");
                        System.out.println("そしたら何かが見えてくるはずです");
                        break;
                }
            }
        }

        System.out.println("勝つまでにかかった合計回数は" + count + "回です");
        sc.close();
    }
}
