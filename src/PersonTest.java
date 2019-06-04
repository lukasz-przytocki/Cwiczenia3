public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", "88122112345", 31);
        Person person2 = new Person("Jan", "Kowalski", "88122112345", 31);
        Person person3 = new Person("Karol ", "Kowalski", "88122112345", 31);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        System.out.println(person1.equals(person2));

//        System.out.println(person1 instanceof Person);


    }
}
