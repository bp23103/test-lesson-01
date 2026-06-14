package vending;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 演習①-3：自販機の単体テスト（穴埋め）
 *
 * ★演習①-2のあいだは、下の「=====」で囲まれた部分はコメントのまま（まだ動きません）。
 *   演習①-3に入ったら、「=====」の行を 2本とも“行ごと”削除して有効化し、
 *   _____ を仕様書の値で埋めてください。
 */
class VendingMachineTest {

    // 【ケース1：完成例】お茶(120円)を、ちょうど120円で買える（最初から動く・見本）
    @Test
    void canBuy_お茶_ちょうど120円() {
        VendingMachine vm = new VendingMachine();
        vm.insert(120);
        assertTrue(vm.canBuy("お茶"));
    }

    /* ===== 演習①-3：この行を「行ごと」削除して、下の穴埋めを有効にする =====

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
        assertEquals(_____, vm.canBuy("コーヒー")); // 仕様書No.5：買える？買えない？
    }

    // 【ケース6：穴埋め】150円入れれば、水は買える
    @Test
    void canBuy_水は150円で買える() {
        VendingMachine vm = new VendingMachine();
        vm.insert(150);
        assertEquals(_____, vm.canBuy("水"));       // 仕様書No.6：買える？買えない？
    }

    ===== 演習①-3：この行も「行ごと」削除する ===== */
}