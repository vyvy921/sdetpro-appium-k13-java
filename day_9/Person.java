package day_9;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        //Data validation
        validateAgeValue(age);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        validateAgeValue(age);
        this.age = age;
    }

    //support method

    private void validateAgeValue(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
