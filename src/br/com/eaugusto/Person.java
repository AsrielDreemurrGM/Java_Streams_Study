package br.com.eaugusto;

import java.util.List;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 16, 2025
 */
public class Person {

	private String name;
	private String id;
	private String nationality;
	private int age;

	public Person(String id, String name, String nationality, int age) {
		this.id = id;
		this.name = name;
		this.nationality = nationality;
		this.age = age;
	}

	public Person() {

	}

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

	public List<Person> populatePeople() {
		Person person1 = new Person("p1", "José Augusto", "Brazil", 23);
		Person person2 = new Person("p2", "Hernandez", "Mexico", 21);
		Person person3 = new Person("p3", "Neymar", "Brazil", 30);
		Person person4 = new Person("p4", "Mario", "Canada", 22);
		return List.of(person1, person2, person3, person4);
	}
}
