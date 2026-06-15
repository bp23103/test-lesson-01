package vending;

import java.util.HashMap;
import java.util.Map;

/**
 * 自販機本体。読むだけ・完成済み（テストされる側）。
 *  - 水       150円（在庫あり）
 *  - お茶     120円（在庫あり）
 *  - コーヒー 130円（在庫0 = 売切れ）
 */
public class VendingMachine {
    private final Map<String, Integer> price = new HashMap<>();
    private final Map<String, Integer> stock = new HashMap<>();
    private int balance = 0; // 投入された金額
    private int change = 0;   // 直前の購入のおつり

    public VendingMachine() {
        price.put("水", 150);      stock.put("水", 5);
        price.put("お茶", 120);    stock.put("お茶", 5);
        price.put("コーヒー", 130); stock.put("コーヒー", 0); // 売切れ
    }

    /** お金を入れる */
    public void insert(int yen) {
        balance += yen;
    }

    /** いまの投入金額 */
    public int getBalance() {
        return balance;
    }

    /** 直前の購入で出たおつり */
public int change() {
    return change;
}

    /** その商品を今すぐ買えるか（在庫があり、かつ投入金額が足りる） */
    public boolean canBuy(String name) {
        Integer p = price.get(name);
        if (p == null) return false;            // 存在しない商品
        if (stock.getOrDefault(name, 0) <= 0) return false; // 売切れ
        return balance >= p;                    // お金が足りるか
    }

    /** 購入する。買えたら在庫を1つ減らし、おつりを計算して飲み物を返す */
    public Drink buy(String name) {
        if (!canBuy(name)) {
            throw new IllegalStateException(name + " は今は買えません");
        }
        change = balance - price.get(name);
        stock.put(name, stock.get(name) - 1);
        balance = 0;
        return new Drink(name);
    }
}
