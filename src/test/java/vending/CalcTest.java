package vending;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//用意されたテストを実行して確認する

class CalcTest {

    @Test
    void add_2と3で5になる() {
        Calc calc = new Calc(); 
        assertEquals(5, calc.add(2, 3));     
    }
}