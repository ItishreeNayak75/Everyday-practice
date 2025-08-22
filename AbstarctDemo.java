// Abstract class
abstract class Shape {
    // Abstract method (no body)
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Subclass 1
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Subclass 2
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Main class
 class AbstractDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle();    // Upcasting
        Shape s2 = new Rectangle(); // Upcasting

        s1.display();
        s1.draw();

        s2.display();
        s2.draw();
    }
}
