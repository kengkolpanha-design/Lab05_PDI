import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise9 {

    static final Function<Integer, Integer> cube = n -> n * n * n;
    static final Predicate<Integer> isPositive = n -> n > 0;

    public static void main(String[] args) {
        List<Integer> numbers = List.copyOf(Arrays.asList(5, 2, 9, -1, 3, -8, 20, -50));

        // a) Cube of each number (higher-order function: map takes a function)
        List<Integer> cubes = numbers.stream()
                .map(cube)
                .collect(Collectors.toList());
        System.out.println("a) Cubes: " + cubes);

        // b) Filter out the positive numbers (higher-order function: filter takes a predicate)
        List<Integer> positives = numbers.stream()
                .filter(isPositive)
                .collect(Collectors.toList());
        System.out.println("b) Positive numbers: " + positives);

        // c) Sort the data (sorted() returns a new sorted list; original stays unchanged)
        List<Integer> sorted = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("c) Sorted: " + sorted);

        System.out.println("Original: " + numbers);
    }
}