package pl.pp;

import java.util.Scanner;

public class mojaDrugaAplikacja {
    public static void main(String[] args) {

         /* int x = 10; // Przypisanie wartości 10 do zmiennej x
         int doubleX = 2 * x; // Obliczenie dwukrotności liczby x
         int squareX = x * x; // Obliczenie x²

         //Wyświetlenie wyników
         System.out.println("x = " + x);
         System.out.println("Dwukrotność x = " + doubleX);
         System.out.println("x^2 = " + squareX);
    }
}
*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Proszę podać swój wiek: ");
        int lata = scanner.nextInt();

        long sekundy  = (long) lata * 365 * 24 * 60 * 60;

        System.out.println("Twój wiek w sekundach to: " + sekundy);
    }
}