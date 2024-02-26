package practice;
import java.util.Arrays;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person other) {
        return this.age - other.age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
public class Main {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        };

        Arrays.sort(people); 

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
