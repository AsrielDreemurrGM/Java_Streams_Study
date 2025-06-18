package br.com.eaugusto;

import java.util.List;
import java.util.Objects;

/**
 * Represents a person with basic attributes and provides a method to populate a
 * list of (4) sample people.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 16, 2025
 */
public class Person {

	// Unique identifier for the person
	private String id;

	// Name of the person
	private String name;

	// Nationality of the person (e.g., Brazil, Mexico)
	private String nationality;

	// Age of the person in years
	private int age;

	/**
	 * Constructs a new Person with all attributes initialized.
	 * 
	 * @param id          Unique ID
	 * @param name        Full name
	 * @param nationality Country of origin
	 * @param age         Age in years
	 */
	public Person(String id, String name, String nationality, int age) {
		this.id = id;
		this.name = name;
		this.nationality = nationality;
		this.age = age;
	}

	public Person(Person person) {
		this(person.getId(), person.getName(), person.getNationality(), person.getAge());
	}

	/**
	 * Default constructor (required for certain frameworks or manual population).
	 */
	public Person() {
	}

	// Getters
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getNationality() {
		return nationality;
	}

	public int getAge() {
		return age;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Creates and returns a list of sample Person objects. Useful for testing
	 * filtering and mapping operations.
	 * 
	 * @return A list of hardcoded Person instances.
	 */
	public List<Person> populatePeople() {
		Person person1 = new Person("p1", "José Augusto", "Brazil", 23);
		Person person2 = new Person("p2", "Hernandez", "Mexico", 21);
		Person person3 = new Person("p3", "Neymar", "Brazil", 30);
		Person person4 = new Person("p4", "Mario", "Canada", 21);
		return List.of(person1, person2, person3, person4);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Person other = (Person) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Person [Id: " + id + ", Name: " + name + ", Nationality: " + nationality + ", Age: " + age + "]";
	}

}
