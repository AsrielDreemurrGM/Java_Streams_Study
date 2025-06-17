package br.com.eaugusto.intermediateoperations;

import java.util.List;
import java.util.stream.Stream;

import br.com.eaugusto.Person;

/**
 * Demonstrates the use of the limit() method on a Stream. The limit() method
 * limits the size of the stream to contain no more than the specified number of
 * elements. The resulting streams are consumed with forEach to print names.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 17, 2025
 */
public class LimitExample {

	public static void main(String[] args) {

		// Creates and populates a list of Person objects.
		List<Person> list = new Person().populatePeople();

		System.out.println("Stream With All Elements:");
		// Creates a stream with everyone from the list.
		Stream<Person> nonLimitedStream = list.stream();

		nonLimitedStream.forEach(person -> System.out.println(person.getName()));

		System.out.println("Limited Stream To The First Two Elements:");
		// Creates a stream of Person objects limited to the first 2 elements.
		Stream<Person> stream = list.stream().limit(2);

		stream.forEach(person -> System.out.println(person.getName()));
	}
}
