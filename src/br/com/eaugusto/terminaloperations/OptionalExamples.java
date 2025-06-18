package br.com.eaugusto.terminaloperations;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import br.com.eaugusto.Person;

/**
 * Demonstrates the use of Optional with terminal operations max() and min().
 * Shows how to retrieve the oldest and youngest persons from a list using
 * Streams.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 18, 2025
 */
public class OptionalExamples {

	public static void main(String[] args) {

		// Creates and populates a list of Person objects.
		List<Person> list = new Person().populatePeople();

		System.out.println("Getting The Oldest Person From The List");
		// Finds the person with the maximum age using Comparator.comparing.
		// If multiple people have the same age, returns the first match found.
		Optional<Person> oldestPerson = list.stream().max(Comparator.comparing(Person::getAge));

		// Checks if the result is present and prints it.
		if (oldestPerson.isPresent()) {
			System.out.println(oldestPerson.get());
		}

		System.out.println("Getting The Youngest Person From The List");
		// Finds the person with the minimum age using Comparator.comparing.
		Optional<Person> youngestPerson = list.stream().min(Comparator.comparing(Person::getAge));

		// Checks if the result is present and prints it.
		if (youngestPerson.isPresent()) {
			System.out.println(youngestPerson.get());
		}
	}
}
