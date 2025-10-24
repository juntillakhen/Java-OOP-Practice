package Pet;

public class PetMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Bruno", 4, "Stick");
        Bird bird = new Bird("Maya", 3, 25.5);

        dog.displayDetails();
        System.out.println("\n-------------------------------\n");
        bird.displayDetails();
    }
}
