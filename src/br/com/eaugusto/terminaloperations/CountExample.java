package br.com.eaugusto.terminaloperations;

import java.util.List;

import br.com.eaugusto.Person;

/**
 * Demonstrates the use of the count() terminal operation on a Stream. The
 * count() method returns the number of elements that match a given condition.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 17, 2025
 */
public class CountExample {

	public static void main(String[] args) {

		// Creates and populates a list of Person objects.
		List<Person> list = new Person().populatePeople();

		// Filters the stream to include only persons whose name starts with "M",
		// then counts how many such persons exist in the list.
		long count = list.stream().filter(person -> person.getName().startsWith("M")).count();

		// Prints the number of persons with names starting with "M" (1 in the hardcoded list).
		System.out.println(count);
	}
}
