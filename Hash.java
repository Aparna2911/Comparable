package practice;
class Temp {
    private String name;
    private int age;

    public Temp(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override hashCode() method
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age; // Using prime number 31 for better distribution
        return result;
    }

    // Override toString() method for printing object details
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Hash {
    public static void main(String[] args) {
        // Creating Person objects
    	Temp person1 = new Temp("Alice", 30);
        Temp person2 = new Temp("Bob", 25);
        Temp person3 = new Temp("Alice", 30); // Duplicate of person1

        // Printing hash codes
        System.out.println("HashCode of person1: " + person1.hashCode());
        System.out.println("HashCode of person2: " + person2.hashCode());
        System.out.println("HashCode of person3: " + person3.hashCode());

        // Comparing hash codes
        System.out.println("HashCode of person1 equals hashCode of person3: " + (person1.hashCode() == person3.hashCode()));
    }
}

