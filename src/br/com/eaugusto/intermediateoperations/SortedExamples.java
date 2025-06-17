package br.com.eaugusto.intermediateoperations;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import br.com.eaugusto.Person;

/**
 * Demonstrates how to sort streams of Person objects using different criteria.
 * Shows sorting by name and age, using Comparator and lambda expressions. The
 * resulting streams are consumed with forEach to print person names.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 17, 2025
 */
public class SortedExamples {

	public static void main(String[] args) {

		// Creates and populates a list of Person objects.
		List<Person> list = new Person().populatePeople();

		System.out.println("Brazilians In Alphabetical Order: ");
		// Example 1: Filter persons from Brazil, then sort by name (alphabetically).
		Stream<Person> stream1 = list.stream().filter(person -> person.getNationality().equals("Brazil"))
				.sorted(Comparator.comparing(Person::getName));

		stream1.forEach(person -> System.out.println(person.getName()));

		System.out.println("Sorting Everyone From Younger To Older: ");
		// Example 2: Sort all persons by age in ascending order using
		// Comparator.comparing.
		Stream<Person> stream2 = list.stream().sorted(Comparator.comparing(Person::getAge));

		stream2.forEach(person -> System.out.println(person.getName()));

		System.out.println("Sorting Everyone From Younger To Older, But Using A Lambda: ");
		// Example 3: Sort all persons by age in ascending order using a lambda
		// expression.
		Stream<Person> stream3 = list.stream().sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));

		stream3.forEach(person -> System.out.println(person.getName()));
	}
}
