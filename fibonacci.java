import java.util.Scanner;

public class fibonacci {

    // Method to calculate Fibonacci sequence up to a given number of terms
    public static void printFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int first = 0, second = 1;

        System.out.print("Fibonacci sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms for the Fibonacci Sequence:");
        int n = scanner.nextInt();

        printFibonacci(n);

        scanner.close();
    }
}
