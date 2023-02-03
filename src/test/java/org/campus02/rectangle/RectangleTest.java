package org.campus02.rectangle;

import org.campus02.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

class RectangleTest {

    Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(3,2);
    }

    @Test
    void calculateArea() {
        Assertions.assertEquals(6, rectangle.calculateArea());
    }

    @Test
    void calculateCircumference() {
        Assertions.assertEquals(10, rectangle.calculateCircumference());
    }
}