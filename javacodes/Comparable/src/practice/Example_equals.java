package practice;

class Example_equals {
	private String name;
	private int age;

	// Constructor
	public Example_equals(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter methods
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// Override equals method
	@Override
	public boolean equals(Object obj) {
		// Checking if the object references are equal
		if (this == obj) {
			return true;
		}
		// Checking if the object is null
		if (obj == null) {
			return false;
		}
		// Checking if the object belongs to the same class
		if (getClass() != obj.getClass()) {
			return false;
		}
		// Casting the object to Person class and comparing fields
		Example_equals other = (Example_equals) obj;
		return age == other.age && (name == null ? other.name == null : name.equals(other.name));
	}

	public static void main(String[] args) {
		// Creating two Person objects
		Example_equals person1 = new Example_equals("Alice", 30);
		Example_equals person2 = new Example_equals("Alice", 30);
		Example_equals person3 = new Example_equals("Bob", 25);

		// Testing the equals method
		System.out.println("person1 equals person2: " + person1.equals(person2)); // Should print true
		System.out.println("person1 equals person3: " + person1.equals(person3)); // Should print false
	}
}
