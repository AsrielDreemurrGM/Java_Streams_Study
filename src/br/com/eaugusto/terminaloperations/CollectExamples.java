package br.com.eaugusto.terminaloperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import br.com.eaugusto.Person;

/**
 * Demonstrates the use of the collect() terminal operation in Java Streams. The
 * collect() method is used to transform the elements of a stream into different
 * data structures such as List, Set, ArrayList, and Map.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 17, 2025
 */
public class CollectExamples {

	public static void main(String[] args) {

		// Creates and populates a list of Person objects.
		List<Person> list = new Person().populatePeople();

		System.out.println("List Of All Brazilians Using Collect And Saving Them In A New List");
		// Collects all Brazilians into a new List.
		List<Person> listOfBrazilians = list.stream()
				.filter(person -> person.getNationality().equals("Brazil"))
				.collect(Collectors.toList());

		listOfBrazilians.forEach(System.out::println);

		System.out.println("\nList Of All Brazilians Printed Directly Without Saving A New List");
		// Collects Brazilians and prints them directly without saving the list.
		list.stream()
		.filter(person -> person.getNationality().equals("Brazil"))
		.collect(Collectors.toList())
		.forEach(System.out::println);

		System.out.println("\nSet Of All Brazilians Using Collect And Saving Them In A Set");
		// Collects all Brazilians into a Set to eliminate duplicates.
		Set<Person> set = list.stream()
				.filter(person -> person.getNationality().equals("Brazil"))
				.collect(Collectors.toSet());

		set.forEach(System.out::println);

		System.out.println("\nArray List Of All Canadians Using Collect And Saving Them In A New ArrayList");
		// Collects all Canadians into a new ArrayList.
		ArrayList<Person> arrayList = list.stream()
				.filter(person -> person.getNationality().equals("Canada"))
				.collect(Collectors.toCollection(ArrayList::new));

		arrayList.forEach(System.out::println);

		System.out.println("\nMap Of All Mexicans Using Collect And Saving Them In A Map");
		// Collects all Mexicans into a Map using their ID as key and a new Person as value.
		Map<String, Object> map = list.stream()
				.filter(person -> person.getNationality().equals("Mexico"))
				.collect(Collectors.toMap(Person::getId, Person::new));

		map.forEach((key, value) -> System.out.println("Map Key (Person Id): " + key + " | "
				+ "Map Value (Person object): " + value));

		System.out.println("\nMap Of Everyone Grouped By Age");
		// Groups all persons by age, resulting in a Map where the key is age and value is list of people.
		Map<Integer, List<Person>> groupingByAge = list.stream()
				.collect(Collectors.groupingBy(Person::getAge));

		groupingByAge.forEach((key, value) -> System.out.println("Map Key (Age): " + key + " | "
				+ "Map Value (List of Persons): " + value));
	}
}
