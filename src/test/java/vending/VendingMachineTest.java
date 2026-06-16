package vending;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VendingMachineTest {
    // 【ケース1】ちょうどの金額で買える（正常系）／仕様書No.1
    @Test
    void ちょうどの金額で買える() {
        VendingMachine vm = new VendingMachine();
        vm.insert(0);                   // ← 仕様書No.1：いくら入れる？
        Drink d = vm.buy("水");
        assertEquals("水", d.name());
        assertEquals(0, vm.change());   // ← 仕様書No.1：お釣りは？
    }

    // 【ケース2】お釣りが正しく出る（正常系）／仕様書No.2
    @Test
    void お釣りが正しく出る() {
        VendingMachine vm = new VendingMachine();
        vm.insert(0);                   // ← 仕様書No.2：いくら入れる？
        Drink d = vm.buy("水");
        assertEquals("水", d.name());
        assertEquals(0, vm.change());   // ← 仕様書No.2：お釣りは？
    }

    // ----- ケース3・4（異常系）は assertThrows を使うので、コマ2で扱う -----

    // 【ケース5】境界のすぐ下では買えない（境界値）／140円
    @Test
    void 境界の下では買えない() {
        VendingMachine vm = new VendingMachine();
        vm.insert(140);
        assertEquals(true, vm.canBuy("水"));   // ← 仕様書No.5：買える？買えない？（true/false を直す）
    }

    // 【ケース6】境界の上側なら買える（境界値）／150円
    @Test
    void 境界の上なら買える() {
        VendingMachine vm = new VendingMachine();
        vm.insert(150);
        assertEquals(false, vm.canBuy("水"));  // ← 仕様書No.6：買える？買えない？（true/false を直す）
    }
}