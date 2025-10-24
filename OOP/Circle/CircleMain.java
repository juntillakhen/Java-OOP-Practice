package Circle;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle(10);

        
        System.out.println("Circle result:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getCircumference());
    }
}
