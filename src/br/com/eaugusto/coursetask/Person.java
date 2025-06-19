package br.com.eaugusto.coursetask;

/**
 * Represents a person with a name and gender. Used to demonstrate filtering
 * with Java Streams based on gender.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 19, 2025
 */
public class Person {

	private String name;
	private String gender;

	/**
	 * Constructs a new Person with the specified name and gender.
	 *
	 * @param name   The name of the person.
	 * @param gender The gender of the person (M or F).
	 */
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	/**
	 * Gets the person's name.
	 *
	 * @return The name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the person's gender.
	 *
	 * @return The gender.
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the person's name.
	 *
	 * @param name The new name.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the person's gender.
	 *
	 * @param name The new gender.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
}
