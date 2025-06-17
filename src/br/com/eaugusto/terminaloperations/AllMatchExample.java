package br.com.eaugusto.terminaloperations;

import java.util.List;

import br.com.eaugusto.Person;

/**
 * Demonstrates the use of the allMatch() terminal operation on a Stream. The
 * allMatch() method returns true if all elements in the stream match the given
 * predicate, otherwise false.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 17, 2025
 */
public class AllMatchExample {

	public static void main(String[] args) {
		// Creates and populates a list of Person objects.
		List<Person> list = new Person().populatePeople();

		// Checks whether all persons in the list are from Mexico.
		boolean isEveryoneFromMexico = list.stream().allMatch(person -> person.getNationality().equals("Mexico"));

		// Prints the result of the allMatch check.
		System.out.println(isEveryoneFromMexico);
	}
}
