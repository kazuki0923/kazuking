package curriculum_B;

import java.util.Random;

/*
【概要】
商品リストをもとに、ランダムで残り台数を表示するプログラム。

【詳細説明】
・指定された商品名をカンマや読点で分割して配列化。
・Randomを使って在庫数を0〜11台でランダムに設定。
・特定の商品は残数を11から引いた値で表示。
・それ以外の商品は「指定外」としてメッセージを表示。
*/
public class Qes6 {
    public static void main(String[] args) {
        String input = "パソコン,冷蔵庫,扇風機,洗濯機,加湿器,テレビ,ディスプレイ,その他商品";
        String[] products = input.split("、|,");
        Random rand = new Random();

        for (String item : products) {
            item = item.trim();
            int stock = rand.nextInt(12);

            switch (item) {
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    System.out.println(item + "の残り台数は" + stock + "台です");
                    break;
                case "テレビ":
                case "ディスプレイ":
                    int remain = 11 - rand.nextInt(12);
                    System.out.println(item + "の残り台数は" + remain + "台です");
                    break;
                default:
                    System.out.println("『 " + item + " 』は指定の商品ではありません");
                    break;
            }
        }
    }
}
