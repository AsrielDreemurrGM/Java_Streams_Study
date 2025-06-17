package br.com.eaugusto;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Demonstrates how to sort streams of Person objects using different criteria.
 * Shows sorting by name and age, using Comparator and lambda expressions.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 17, 2025
 */
public class SortedExamples {

	public static void main(String[] args) {

		// Creates and populates a list of Person objects.
		List<Person> list = new Person().populatePeople();

		// Example 1: Filter persons from Brazil, then sort by name (alphabetically).
		Stream<Person> stream1 = list.stream()
			.filter(person -> person.getNationality().equals("Brazil"))
			.sorted(Comparator.comparing(Person::getName));

		// Example 2: Sort all persons by age in ascending order using Comparator.comparing.
		Stream<Person> stream2 = list.stream()
			.sorted(Comparator.comparing(Person::getAge));

		// Example 3: Sort all persons by age in ascending order using a lambda expression.
		Stream<Person> stream3 = list.stream()
			.sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
	}
}
