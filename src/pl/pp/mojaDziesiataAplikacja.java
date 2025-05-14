package pl.pp;

public class mojaDziesiataAplikacja {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, -3, -2, -1};
        int[] wynik = countAndSumElements(input);
        for (int i = 0; i < wynik.length; i++) {
            System.out.print(wynik[i] + " ");
        }
    }

    public static int[] countAndSumElements(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int ujemne = 0;
        int suma = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                ujemne++;
            } else if (input[i] > 0) {
                suma += input[i];
            }
        }

        return new int[] {ujemne, suma};
    }
}