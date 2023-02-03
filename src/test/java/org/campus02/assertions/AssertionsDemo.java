package org.campus02.assertions;

import org.junit.jupiter.api.*;

public class AssertionsDemo {
    // Step 1: Setup
    int a;
    String s;

    // Wird von jedem Testcase (@Test) aufgerufen
    @BeforeEach
    void setUp() {
        a = 1;
        s = "Hallo Welt";
        System.out.println("Before each");
    }

    // Step 2: Exercise
    @Test
    @DisplayName("Test assertEquals") // Text ändern der bei diesen Text angezeigt wird
    void assertEqualsTest() {
        // Es werden zwei Werte miteinander verglichen
        int actual = 1;
        Assertions.assertEquals(a, actual);
    }

    @Test
    void assertTrueTest() {
        String helloWorld = "Hallo Welt";
        Assertions.assertTrue(helloWorld.equals(s)); // String immer mit .equals
        Assertions.assertTrue(a > 0);
    }

    @Test
    void assertFalse() {
        Assertions.assertFalse(a == 0);
    }

    @Test
    void asserThrowsTest() {
        int[] array = new int[1];
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int i = array[1];
        });
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each");
    }

}
