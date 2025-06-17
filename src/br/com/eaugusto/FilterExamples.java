package br.com.eaugusto;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Demonstrates different ways of filtering elements from a list using Java
 * Streams. The filter condition used in all cases is: "nationality equals
 * Brazil".
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 16, 2025
 */
public class FilterExamples {

	public static void main(String[] args) {

		// Creates and populates a list of Person objects.
		List<Person> list = new Person().populatePeople();

		// Example 1: Inline lambda expression passed directly to the filter method.
		Stream<Person> stream1 = list.stream().filter(person -> person.getNationality().equals("Brazil"));

		// Example 2: Lambda expression stored in a Predicate variable, then passed to
		// filter.
		Predicate<Person> predicate1 = person -> person.getNationality().equals("Brazil");
		Stream<Person> stream2 = list.stream().filter(predicate1);

		// Example 3: Anonymous class implementing Predicate interface passed to filter.
		Predicate<Person> predicate2 = new Predicate<Person>() {
			@Override
			public boolean test(Person person) {
				return person.getNationality().equals("Brazil");
			}
		};
		Stream<Person> stream3 = list.stream().filter(predicate2);
	}
}
