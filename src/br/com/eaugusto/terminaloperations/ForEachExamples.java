package br.com.eaugusto.terminaloperations;

import java.util.List;

import br.com.eaugusto.Person;

/**
 * Demonstrates the use of the terminal operation forEach on streams. Shows how
 * to print all names, filter by nationality, and map to ages.
 * 
 * @author: Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since: Jun 17, 2025
 */
public class ForEachExamples {

	public static void main(String[] args) {

		// Creates and populates a list of Person objects.
		List<Person> list = new Person().populatePeople();

		// Prints all names from the list using forEach.
		System.out.println("All Names From The List: ");
		list.stream().forEach(person -> System.out.println(person.getName()));

		// Prints names of persons whose nationality is Brazil.
		System.out.println("Brazilians From The List: ");
		list.stream()
				.filter(person -> person.getNationality().equals("Brazil"))
				.forEach(person -> System.out.println(person.getName()));

		// Prints the age of persons from Brazil by mapping Person to age.
		System.out.println("Age Of The Brazilians: ");
		list.stream()
				.filter(person -> person.getNationality().equals("Brazil"))
				.map(Person::getAge)
				.forEach(age -> System.out.println(age));
	}
}
