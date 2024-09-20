package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void fizzbuzz() {
        assertEquals("fizz", Main.fizzbuzz(25));  // 25 делится на 5;
        assertEquals("buzz", Main.fizzbuzz(49));  // 49 делится на 7
        assertEquals("fizzbuzz", Main.fizzbuzz(70));  // 70 делится на 5 и 7
        assertEquals("52", Main.fizzbuzz(52));  // 52 не делится ни на 5, ни на 7
    }

    @Test
    void reverseStr() {
        assertEquals("llatsni ekam", Main.reverseStr("make install"));
    }

    @Test
    void quadraticEquation() throws Exception {
        try {
            Main.quadraticEquation(1, -5, 9);
        } catch (Exception ex) {
            assertEquals("Нет вещественных корней.", ex.getMessage());
        }

        try {
            Main.quadraticEquation(0, -3, 4);
        } catch (Exception ex) {
            assertEquals("Это не квадратное уравнение.", ex.getMessage());
        }

        assertEquals(2, Main.quadraticEquation(1, -4, 4)[0]);
        assertArrayEquals(new double[] { 1, -4 }, Main.quadraticEquation(1, 3, -4));
    }

    @Test
    void sumSerias() {
        assertEquals(0.6101121094474383, Main.sumSeries());
    }

    @Test
    void polindrom() {
        assertTrue(Main.isPalindrome("madam"));
        assertFalse(Main.isPalindrome("hello"));
    }
}