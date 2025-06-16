package br.com.eaugusto;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 15, 2025
 */
public class Streams {

	public static void main(String[] args) {
		Stream<String> stream = List.of("Eduardo", "Augusto", "Test").stream();

		Stream<Integer> streamInt = Stream.of(1, 2, 3, 4);

		Stream<String> set = Set.of("Eduardo", "Augusto", "Test").stream();

		Map<String, String> map = Map.of("Eduardo", "Augusto");
		Stream<String> mapKeys = map.keySet().stream();
		Stream<String> mapValues = map.values().stream();

	}
}
