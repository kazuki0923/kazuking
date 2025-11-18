package オブジェクト指向の設計原則;

// Q7 オブジェクト指向の設計原則（SOLID）
// Payableクラス
public interface Payable {
    int calculateSalary(); // 給与計算だけに責務を限定
    String getName();
}

