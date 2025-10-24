package Shape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape r = new Rectangle(5, 10);
        Shape c = new Circle(7);
        Shape t = new Triangle(3, 4, 5);

        System.out.println("Rectangle area: " + r.calculateArea());
        System.out.println("Rectangle perimeter: " + r.calculatePerimeter());

        System.out.println("Circle area: " + c.calculateArea());
        System.out.println("Circle perimeter: " + c.calculatePerimeter());

        System.out.println("Triangle area: " + t.calculateArea());
        System.out.println("Triangle perimeter: " + t.calculatePerimeter());
    }
}
