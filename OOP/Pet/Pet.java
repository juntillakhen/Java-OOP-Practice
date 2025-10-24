package Pet;

public class Pet {
    protected String name;
    protected String species;
    protected int age; 

    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public double calculateHumanAge() {
        return age * 7.0; 
    }

    public void displayDetails() {
        System.out.println("Pet Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years (" + calculateHumanAge() + " in human years)");
    }
}

class Dog extends Pet {
    private String favoriteToy;

    public Dog(String name, int age, String favoriteToy) {
        super(name, "Dog", age);
        this.favoriteToy = favoriteToy;
    }

    public double calculateHumanAge() {
        if (age <= 2) {
            return age * 10.5; 
        } else {
            return 21 + (age - 2) * 4;  
        }
    }

    public void displayDetails() {
        System.out.println("🐶 Dog Details:");
        super.displayDetails();
        System.out.println("Favorite Toy: " + favoriteToy);
    }
}

class Bird extends Pet {
    private double wingspan; 

    public Bird(String name, int age, double wingspan) {
        super(name, "Bird", age);
        this.wingspan = wingspan;
    }

    public double calculateHumanAge() {
        return age * 5.0; 
    }

    public void displayDetails() {
        System.out.println("🐦 Bird Details:");
        super.displayDetails();
        System.out.println("Wingspan: " + wingspan + " cm");
    }
}
