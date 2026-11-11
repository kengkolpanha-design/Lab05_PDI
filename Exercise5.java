public class Exercise5 {

    // Procedural approach
    public static long factorialProcedural(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive approach
    public static long factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int[] inputs = {3, 6, 10, 50};

        System.out.printf("%-10s %-25s %-25s%n", "Input", "Procedural", "Recursive");
        System.out.println("---------------------------------------------------------------");
        
        for (int n : inputs) {
            System.out.printf("%-10d %-25d %-25d%n", n, factorialProcedural(n), factorialRecursive(n));
        }
    }
}
