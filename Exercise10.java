import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exercise10 {

    // Reads the first column (name) of each CSV line into an ArrayList
    static ArrayList<String> readNames(String filename) throws IOException {
        ArrayList<String> names = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.isBlank()) continue;
                String[] data = line.split(",");
                names.add(data[0].trim());
            }
        }
        return names;
    }

    public static void main(String[] args) {
        try {
            ArrayList<String> names = readNames("data.csv"); // Ensure this file exists
            System.out.println("Loaded " + names.size() + " students.");

            // Functional style: sort A-Z with a stream, original list stays unchanged
            List<String> sortedNames = names.stream()
                    .sorted(String.CASE_INSENSITIVE_ORDER)
                    .toList();

            System.out.println("Students (A-Z):");
            sortedNames.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Could not read file - " + e.getMessage());
        }
    }
}