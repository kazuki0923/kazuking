package interface_and_abstract_class;

// Q6 インターフェイスと抽象クラス
// Mainクラス
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Billable型の社員リスト
        List<Billable> employees = new ArrayList<>();

        // 社員追加（サブクラスをBillable型で扱う）
        employees.add(new FullTimeEmployee("FT001", "鈴木太郎"));
        employees.add(new FullTimeEmployee("FT002", "田中花子"));
        employees.add(new ContractEmployee("CT001", "佐藤次郎"));
        employees.add(new ContractEmployee("CT002", "山本美咲"));

        // 勤務時間（仮設定）
        int[] hoursWorkedList = {10, 8, 6, 12};

        // 給与出力（Billable型で統一）
        for (int i = 0; i < employees.size(); i++) {
            Billable b = employees.get(i);
            int wage = b.costForDay(hoursWorkedList[i]);

            // Employee型にキャストせずにBillableだけで動作
            System.out.println("社員" + (i+1) + "の日給: " + wage + "円");
        }
    }
}

