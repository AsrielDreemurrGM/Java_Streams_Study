package br.com.eaugusto;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Demonstrates various ways to create Streams in Java. Shows how to create
 * streams from List, Set, Map keys and values, as well as directly from
 * Stream.of().
 * 
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 15, 2025
 */
public class CreatingStreams {

	public static void main(String[] args) {
		// Creates a Stream from a List of Strings.
		Stream<String> stream = List.of("Eduardo", "Augusto", "Test").stream();

		System.out.println("Stream - List Of Strings:");
		stream.forEach(index -> System.out.println(index));

		// Creates a Stream directly from values using Stream.of().
		Stream<Integer> streamInt = Stream.of(1, 2, 3, 4);

		System.out.println("Stream - Stream Of Integers:");
		streamInt.forEach(value -> System.out.println(value));

		// Creates a Stream from a Set of Strings.
		Stream<String> set = Set.of("Eduardo", "Augusto", "Test").stream();

		System.out.println("Stream - Set Of Strings:");
		set.forEach(index -> System.out.println(index));

		// Creates a Map with one key-value pair.
		Map<String, String> map = Map.of("Eduardo", "Augusto");

		// Creates a Stream from the keys of the Map.
		Stream<String> mapKeys = map.keySet().stream();

		System.out.println("Stream - Keys Of The Map:");
		mapKeys.forEach(index -> System.out.println(index));

		// Creates a Stream from the values of the Map.
		Stream<String> mapValues = map.values().stream();

		System.out.println("Stream - Values Of The Map:");
		mapValues.forEach(index -> System.out.println(index));
	}
}
