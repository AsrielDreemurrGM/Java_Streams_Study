package br.com.eaugusto.intermediateoperations;

import java.util.List;
import java.util.stream.Stream;

import br.com.eaugusto.Person;

/**
 * Demonstrates the use of the distinct() method on a Stream. The distinct()
 * method filters out duplicate elements, keeping only unique ones.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 17, 2025
 */
public class DistinctExample {

	public static void main(String[] args) {

		// Creates and populates a list of Person objects.
		List<Person> list = new Person().populatePeople();

		// Creates a stream of Person objects and removes duplicates.
		Stream<Person> stream = list.stream().distinct();
	}
}
