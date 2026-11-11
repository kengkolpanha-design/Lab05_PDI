import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Student {
    String name, id, gender;
    int age;

    public Student(String name, String id, int age, String gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " (" + id + ")";
    }
}

//sum of 1..n 
class SumTask implements Runnable {
    private final int n1;

    public SumTask(int n1) {
        this.n1 = n1;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= n1; i++) {
            sum += i;
        }
        System.out.println("SumTask: Sum from 1 to " + n1 + " = " + sum);
    }
}

//prime numbers between 1-100
class PrimeTask implements Runnable {
    @Override
    public void run() {
        StringBuilder sb = new StringBuilder("PrimeTask: Primes between 1 and 100: ");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }
}

//read students from a csv file
class CsvReaderTask implements Runnable {
    private final String filename;

    public CsvReaderTask(String filename) {
        this.filename = filename;
    }

    @Override
    public void run() {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    students.add(new Student(data[0].trim(), data[1].trim(),
                            Integer.parseInt(data[2].trim()), data[3].trim()));
                }
            }
            System.out.println("CsvReaderTask: Successfully loaded " + students.size() + " students.");
        } catch (IOException | NumberFormatException e) {
            System.out.println("CsvReaderTask: Could not read file - " + e.getMessage());
        }
    }
}

public class Exercise8 {
    public static void main(String[] args) {
        //Each runnable task is wrapped in a Thread, then started
        Thread thread1 = new Thread(new SumTask(50));
        Thread thread2 = new Thread(new PrimeTask());
        Thread thread3 = new Thread(new CsvReaderTask("data.csv")); // Ensure this file exists

        thread1.start();
        thread2.start();
        thread3.start();
    }
}