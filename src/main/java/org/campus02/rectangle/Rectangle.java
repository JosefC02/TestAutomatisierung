package org.campus02.rectangle;

public class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculateArea() {
        return a * b;
    }

    public int calculateCircumference() {
        return 2 * (a + b);
    }
}
