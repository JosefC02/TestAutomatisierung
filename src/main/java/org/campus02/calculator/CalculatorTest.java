package org.campus02.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    // Step 2: exercise
    @Test
    void add() {
        // Methode ausführen
        int result = Calculator.add(2,3);

        // erwartetes ergebnis
        int expected = 5;

        // Step 3: verify
        // Vergleich erwartetes mit berechnetem Ergebnis
        Assertions.assertEquals(expected, result);
    }

    @Test
    void sub() {
        int result = Calculator.sub(3,2);
        int expected = 1;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void mul() {
        int result = Calculator.mul(3,2);
        int expected = 6;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void div() {
        int result = Calculator.div(6,2);
        int expected = 3;
        Assertions.assertEquals(expected, result);
    }
}