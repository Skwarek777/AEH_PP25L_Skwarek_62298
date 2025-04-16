package pl;
import java.util.Scanner;
    public class mojaSzostaAplikacja {
        public static void main(String[] args) {


            int N = 20;

            // Iteracyjna wersja
            long startIterative = System.nanoTime();
            long resultIterative = factorialIterative(N);
            long endIterative = System.nanoTime();
            System.out.println("Silnia iteracyjnie (" + N + ") = " + resultIterative);
            System.out.println("Czas wykonania iteracyjnie: " + (endIterative - startIterative) + " ns");

            // Rekurencyjna wersja
            long startRecursive = System.nanoTime();
            long resultRecursive = factorialRecursive(N);
            long endRecursive = System.nanoTime();
            System.out.println("Silnia rekurencyjnie (" + N + ") = " + resultRecursive);
            System.out.println("Czas wykonania rekurencyjnie: " + (endRecursive - startRecursive) + " ns");
        }

        // Metoda iteracyjna
        private static long factorialIterative(int n) {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }

        // Metoda rekurencyjna
        private static long factorialRecursive(int n) {
            if (n <= 1) {
                return 1;
            }
            return n * factorialRecursive(n - 1);

        }
    }



