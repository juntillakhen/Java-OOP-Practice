package TrafficLight;

public class TrafficLightMain {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("red", 30);

        System.out.println("Initial traffic light color: " + light.getColor());
        System.out.println("Is the light red? " + light.isRed());
        System.out.println("Is the light green? " + light.isGreen());

        light.changeColor("green", 45);

        System.out.println("Current traffic light color: " + light.getColor());
        System.out.println("Is the light red? " + light.isRed());
        System.out.println("Is the light green? " + light.isGreen());
    }
}
