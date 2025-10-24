public class PersonMain {
    public static void main(String[] args) {
        
        Person person1 = new Person("Ken", 24);
        Person person2 = new Person("Juntilla", 21);

        
        System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}
