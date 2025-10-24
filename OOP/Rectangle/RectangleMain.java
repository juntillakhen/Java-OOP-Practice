package Rectangle;
public class RectangleMain {
    public static void main(String[] args) {
        
        Rectangle rect1 = new Rectangle(5.0, 3.0);

        
        System.out.println("Rectangle Result:");
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getParameter());
    }
}

