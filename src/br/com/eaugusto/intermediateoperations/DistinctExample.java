package br.com.eaugusto.intermediateoperations;

import java.util.List;
import java.util.stream.Stream;

import br.com.eaugusto.Person;

/**
 * Demonstrates the use of the distinct() method on a Stream. The distinct()
 * method filters out duplicate elements, keeping only unique ones. The
 * resulting streams are consumed with forEach to print person names.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 17, 2025
 */
public class DistinctExample {

	public static void main(String[] args) {

		// Creates a list with duplicate Person objects (based on id and name).
		Person person1 = new Person("p1", "José Augusto", "Brazil", 23);
		Person person2 = new Person("p2", "Hernandez", "Mexico", 21);
		Person person3 = new Person("p1", "José Augusto", "Brazil", 23);
		Person person4 = new Person("p2", "Hernandez", "Mexico", 21);
		List<Person> list = List.of(person1, person2, person3, person4);

		System.out.println("List With Duplicated Names:");
		list.forEach(person -> System.out.println(person.getName()));

		System.out.println("List Without Duplicated Names Using Distinct:");
		// Creates a stream of Person objects, removes duplicates and then prints the
		// unique names.
		Stream<Person> stream = list.stream().distinct();

		stream.forEach(person -> System.out.println(person.getName()));
	}
}
