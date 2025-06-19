package br.com.eaugusto.coursetask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Reads a list of people from the console in the format "Name-Gender",
 * separated by commas, and filters them into separate lists of women and men.
 * Prints each group to the console using lambda expressions and streams.
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 19, 2025
 */
public class FilterByGender {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Insert A List Of Names And Genders Separated By Commas (Ex: Maria-F, Eduardo-M): ");
		String input = scanner.nextLine();

		scanner.close();

		String[] arrayWithEveryone = input.split(",");

		List<Person> listOfPeople = new ArrayList<>();

		for (String eachPersonAndGender : arrayWithEveryone) {
			String[] nameAndGenderSplit = eachPersonAndGender.split("-");

			if (nameAndGenderSplit.length == 2) {
				String name = nameAndGenderSplit[0].trim();
				String gender = nameAndGenderSplit[1].trim().toUpperCase();

				if (gender.equals("M") || gender.equals("F")) {
					listOfPeople.add(new Person(name, gender));
				} else {
					System.out.println("Invalid gender: " + gender);
				}
			} else {
				System.out.println("Invalid entry format: " + eachPersonAndGender);
			}
		}

		List<Person> women = listOfPeople.stream()
				.filter(person -> person.getGender().equals("F"))
				.toList();

		System.out.println("\nList of Women: ");
		if (women.isEmpty()) {
			System.out.println("No women found.");
		} else {
			women.forEach(woman -> System.out.println(woman.getName()));
		}
		
		List<Person> men = listOfPeople.stream()
				.filter(person -> person.getGender().equals("M"))
				.toList();
		
		System.out.println("\nList of Men: ");
		if (men.isEmpty()) {
			System.out.println("No men found.");
		} else {
			men.forEach(man -> System.out.println(man.getName()));
		}
	}
}
