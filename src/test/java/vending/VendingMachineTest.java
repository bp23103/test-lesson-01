package vending;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VendingMachineTest {
    // 【ケース1】ちょうどの金額で買える（正常系）
    @Test
    void ちょうどの金額で買える() {
        VendingMachine vm = new VendingMachine();
        vm.insert(150);
        Drink d = vm.buy("水");
        assertEquals("水", d.name());
        assertEquals(0, vm.change());
    }

    // 【ケース2】お釣りが正しく出る（正常系）
    @Test
    void お釣りが正しく出る() {
        VendingMachine vm = new VendingMachine();
        vm.insert(200);
        Drink d = vm.buy("水");
        assertEquals("水", d.name());
        assertEquals(50, vm.change());
    }

    // 【ケース5】境界のすぐ下では買えない（境界値）
    @Test
    void 境界の下では買えない() {
        VendingMachine vm = new VendingMachine();
        vm.insert(140);
        assertEquals(false, vm.canBuy("水"));
    }

    // 【ケース6】境界の上側なら買える（境界値）
    @Test
    void 境界の上なら買える() {
        VendingMachine vm = new VendingMachine();
        vm.insert(150);
        assertEquals(true, vm.canBuy("水"));
    }
}