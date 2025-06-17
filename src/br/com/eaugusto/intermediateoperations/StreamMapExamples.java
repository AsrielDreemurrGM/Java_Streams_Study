package br.com.eaugusto.intermediateoperations;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import br.com.eaugusto.Person;

/**
 * Demonstrates how to transform (map) elements of a stream. Here, we filter
 * only Brazilians and then extract their ages using map and mapToInt.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 16, 2025
 */
public class StreamMapExamples {

	public static void main(String[] args) {

		// Creates and populates a list of Person objects.
		List<Person> list = new Person().populatePeople();

		// Example 1: Filters Brazilians and uses map() to extract ages as Stream<Integer>.
		Stream<Integer> stream1 = list.stream()
			.filter(person -> person.getNationality().equals("Brazil"))
			.map(Person::getAge);

		// Example 2: Same filter, but uses mapToInt() for primitive int stream (IntStream).
		IntStream stream2 = list.stream()
			.filter(person -> person.getNationality().equals("Brazil"))
			.mapToInt(Person::getAge);
	}
}
