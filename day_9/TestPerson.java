package day_9;

public class TestPerson {
    public static void main(String[] args) {

        Person person = new Person("teo", 19);
        System.out.println(person);
        person.setAge(9);
        System.out.println(person);
    }
}
