package practice;
import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {
        // Creating a HashMap to store key-value pairs of String keys and Integer values
        Map<String, Integer> ages = new HashMap<>();

        // Adding key-value pairs to the HashMap
        ages.put("Pratham", 30);
        ages.put("Ananya", 25);
        ages.put("Anjali", 35);

        // Accessing elements using keys
        System.out.println("Age of Pratham: " + ages.get("Pratham"));
        System.out.println("Age of Ananya: " + ages.get("Ananya"));
        System.out.println("Age of Anjali: " + ages.get("Anjali"));
    }
}
