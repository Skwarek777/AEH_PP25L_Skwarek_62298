package pl.pp;
import java.util.Scanner;
import java.util.InputMismatchException;

public class mojaCzwartaAplikacja {
    public static void main(String[] args) {
      /* Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Podaj dolny i górny limit (oddzielone spacją): ");
            int dolny = scanner.nextInt();
            int gorny = scanner.nextInt();

            if (gorny <= dolny) {
                System.out.println("Dolna granica nie może być wyższa niż górna");
                break;
            }

            int suma = 0;
            for (int i = dolny; i <= gorny; i++) {
                suma += i * i;
            }

            System.out.println("Suma kwadratów od " + (dolny * dolny) +
                    " do " + (gorny * gorny) + " wynosi " + suma);
        }

        scanner.close();
    }
} */

            Scanner scanner = new Scanner(System.in);
        int wybor;
        double liczba1, liczba2, wynik;
        boolean kontynuuj = true;

        while (kontynuuj) {
            System.out.println("Wybierz operację:");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Zakończ");

            try {
                wybor = scanner.nextInt();

                switch (wybor) {
                    case 1:
                        System.out.println("Podaj pierwszą liczbę:");
                        liczba1 = scanner.nextDouble();
                        System.out.println("Podaj drugą liczbę:");
                        liczba2 = scanner.nextDouble();
                        wynik = liczba1 + liczba2;
                        System.out.println("Wynik: " + wynik);
                        break;
                    case 2:
                        System.out.println("Podaj pierwszą liczbę:");
                        liczba1 = scanner.nextDouble();
                        System.out.println("Podaj drugą liczbę:");
                        liczba2 = scanner.nextDouble();
                        wynik = liczba1 - liczba2;
                        System.out.println("Wynik: " + wynik);
                        break;
                    case 3:
                        System.out.println("Podaj pierwszą liczbę:");
                        liczba1 = scanner.nextDouble();
                        System.out.println("Podaj drugą liczbę:");
                        liczba2 = scanner.nextDouble();
                        wynik = liczba1 * liczba2;
                        System.out.println("Wynik: " + wynik);
                        break;
                    case 4:
                        System.out.println("Podaj pierwszą liczbę:");
                        liczba1 = scanner.nextDouble();
                        System.out.println("Podaj drugą liczbę:");
                        liczba2 = scanner.nextDouble();
                        if (liczba2 == 0) {
                            System.out.println("Nie można dzielić przez zero!");
                        } else {
                            wynik = liczba1 / liczba2;
                            System.out.println("Wynik: " + wynik);
                        }
                        break;
                    case 5:
                        kontynuuj = false;
                        break;
                    default:
                        System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Nieprawidłowe dane. Wprowadź liczbę.");
                scanner.next(); // Czyści bufor wejścia
            }
        }

        System.out.println("Koniec programu.");
        scanner.close();
    }
}