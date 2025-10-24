package Dog;

public class DogMain {
    public static void main(String[] args){
        Dog d1 = new Dog("Bruno", "Bisang Iro");
        Dog d2 = new Dog("Mars", "Askal");
        System.out.println("Dog 1 - Name: " + d1.getName() + ", Breed: " + d1.getBreed());
        System.out.println("Dog 2 - Name: " + d2.getName() + ", Breed: " + d2.getBreed());


        
        d1.setName("Super Dog");
        d1.setBreed("Space Dog");
        System.out.println("DOg Name is :" + d1.getName() + d1.getBreed());
        d2.setName("Scooby Doo");
        d2.setBreed("Agent Dog");
        System.out.println("DOg Name is :" + d2.getName() + d2.getBreed());

        
    }
}
