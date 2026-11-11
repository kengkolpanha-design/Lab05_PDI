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

class SumThread extends Thread {
    private int n1;

    public SumThread(int n1) {
        this.n1 = n1;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= n1; i++) {
            sum += i;
        }
        System.out.println("SumThread: Sum from 1 to " + n1 + " = " + sum);
    }
}

class PrimeThread extends Thread {
    @Override
    public void run() {
        System.out.print("PrimeThread: Primes between 1 and 100: ");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

class CsvReaderThread extends Thread {
    private String filename;

    public CsvReaderThread(String filename) {
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
            System.out.println("CsvReaderThread: Successfully loaded " + students.size() + " students.");
        } catch (IOException e) {
            System.out.println("CsvReaderThread: Could not read file - " + e.getMessage());
        }
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        SumThread thread1 = new SumThread(50);
        PrimeThread thread2 = new PrimeThread();
        CsvReaderThread thread3 = new CsvReaderThread("data.csv"); // Ensure this file exists

        thread1.start();
        thread2.start();
        thread3.start();
    }
}