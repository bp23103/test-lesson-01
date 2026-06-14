package vending;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 演習①-3：自販機の単体テスト（穴埋め）
 *
 * テストケース仕様書（スライド）の各ケースを、テストコードに「転記」していきます。
 *   _____ を、仕様書の値で1つずつ埋めてください（穴は1行に1つ）。
 *   ぜんぶ埋めて保存(Ctrl+S) → ターミナルで  mvn test  → 4本 Green を目指す。
 */
class VendingMachineTest {

    // 【ケース1：完成例】お茶(120円)を、ちょうど120円で買える
    //   ↓ これは書き方の見本。ケース2からは自分で _____ を埋める。
    @Test
    void canBuy_お茶_ちょうど120円() {
        VendingMachine vm = new VendingMachine();
        vm.insert(120);
        assertTrue(vm.canBuy("お茶"));
    }

    // 【ケース2：穴埋め】水(150円)を 200円で買うと、おつりは 50円
    @Test
    void buy_水_200円入れたらおつり50() {
        VendingMachine vm = new VendingMachine();
        vm.insert(_____);                     // 仕様書No.2「入力・操作」：いくら入れる？
        Drink d = vm.buy("水");
        assertEquals("水", d.getName());
        assertEquals(_____, vm.getChange());  // 仕様書No.2「期待される結果」：おつりは何円？
    }

    // 【ケース5：穴埋め】売切れのコーヒーは、お金が足りても買えない
    @Test
    void canBuy_コーヒーは売切れ() {
        VendingMachine vm = new VendingMachine();
        vm.insert(200);
        assertEquals(_____, vm.canBuy("コーヒー")); // 仕様書No.5「期待される結果」：買える？買えない？
    }

    // 【ケース6：穴埋め】150円入れれば、水は買える
    @Test
    void canBuy_水は150円で買える() {
        VendingMachine vm = new VendingMachine();
        vm.insert(150);
        assertEquals(_____, vm.canBuy("水"));       // 仕様書No.6「期待される結果」：買える？買えない？
    }

    // 【ケース3・4：異常系】お金が足りない／存在しない商品を買おうとした…
    //   は assertThrows を使うので、コマ2（モック・例外）で扱います。今回はこのまま。
}
