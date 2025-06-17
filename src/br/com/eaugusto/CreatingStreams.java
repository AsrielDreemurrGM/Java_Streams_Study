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

		// Creates a Stream directly from values using Stream.of().
		Stream<Integer> streamInt = Stream.of(1, 2, 3, 4);

		// Creates a Stream from a Set of Strings.
		Stream<String> set = Set.of("Eduardo", "Augusto", "Test").stream();

		// Creates a Map with one key-value pair.
		Map<String, String> map = Map.of("Eduardo", "Augusto");

		// Creates a Stream from the keys of the Map.
		Stream<String> mapKeys = map.keySet().stream();

		// Creates a Stream from the values of the Map.
		Stream<String> mapValues = map.values().stream();
	}
}
