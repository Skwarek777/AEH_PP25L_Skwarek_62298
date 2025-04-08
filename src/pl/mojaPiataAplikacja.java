package pl;
import java.util.Scanner;
public class mojaPiataAplikacja {

    public static void wypiszZnak(char znak, int szerokosc, int wysokosc) {

        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < szerokosc; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj znak: ");
        char znak = scanner.next().charAt(0);

        System.out.print("Podaj szerokość (ile znaków w wierszu): ");
        int szerokosc = scanner.nextInt();

        System.out.print("Podaj wysokość (ile wierszy): ");
        int wysokosc = scanner.nextInt();

        wypiszZnak(znak, szerokosc, wysokosc);

        scanner.close();
    }
}

