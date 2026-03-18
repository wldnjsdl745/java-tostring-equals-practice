package test;

import java.util.Objects;

public class Rectangle {

    int rect1;
    int rect2;

    public Rectangle(int rect1, int rect2) {
        this.rect1 = rect1;
        this.rect2 = rect2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + rect1 +
                ", height=" + rect2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return rect1 == rectangle.rect1 && rect2 == rectangle.rect2;
    }

}
