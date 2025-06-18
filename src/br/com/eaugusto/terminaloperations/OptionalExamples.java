package br.com.eaugusto.terminaloperations;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import br.com.eaugusto.Person;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 18, 2025
 */
public class OptionalExamples {

	public static void main(String[] args) {

		List<Person> list = new Person().populatePeople();

		// If two people happen to have the same age it returns the first that was found
		// on the list
		System.out.println("Getting The Oldest Person From The List");
		Optional<Person> oldestPerson = list.stream().max(Comparator.comparing(Person::getAge));

		if (oldestPerson.isPresent()) {
			System.out.println(oldestPerson.get());
		}

		System.out.println("Getting The Youngest Person From The List");
		Optional<Person> youngestPerson = list.stream().min(Comparator.comparing(Person::getAge));

		if (youngestPerson.isPresent()) {
			System.out.println(youngestPerson.get());
		}
	}
}
