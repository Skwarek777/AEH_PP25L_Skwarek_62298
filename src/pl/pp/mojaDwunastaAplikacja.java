package pl.pp;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class mojaDwunastaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path sciezkaWejsciowa;
        Path sciezkaWyjsciowa;

        while (true) {
            System.out.print("Podaj ścieżkę do pliku wejściowego: ");
            String wejscie = scanner.nextLine();
            sciezkaWejsciowa = Paths.get(wejscie);
            if (Files.exists(sciezkaWejsciowa)) {
                break;
            } else {
                System.out.println("Plik nie istnieje. Spróbuj ponownie.");
            }
        }

        System.out.print("Podaj ścieżkę do pliku wyjściowego: ");
        String wyjscie = scanner.nextLine();
        sciezkaWyjsciowa = Paths.get(wyjscie);

        try {

            String tekst = Files.readString(sciezkaWejsciowa);


            String[] slowa = tekst.toLowerCase().split("\\W+"); // podział po przecinkach, spacjach, itd.
            int liczbaSlow = 0;
            Map<String, Integer> mapaSlow = new HashMap<>();

            for (String slowo : slowa) {
                if (!slowo.isEmpty()) {
                    liczbaSlow++;
                    mapaSlow.put(slowo, mapaSlow.getOrDefault(slowo, 0) + 1);
                }
            }


            System.out.println("Liczba słów w pliku: " + liczbaSlow);
            System.out.println("Wystąpienia słów:");
            for (String slowo : mapaSlow.keySet()) {
                System.out.println(slowo + ": " + mapaSlow.get(slowo));
            }


            BufferedWriter writer = Files.newBufferedWriter(sciezkaWyjsciowa);
            writer.write("Plik: " + sciezkaWejsciowa.getFileName() + "\n");
            writer.write("Liczba słów: " + liczbaSlow + "\n");
            writer.write("Wystąpienia słów:\n");
            for (String slowo : mapaSlow.keySet()) {
                writer.write(slowo + ": " + mapaSlow.get(slowo) + "\n");
            }
            writer.close();

            System.out.println("Wynik zapisano do pliku: " + sciezkaWyjsciowa);

        } catch (IOException e) {
            System.out.println("Błąd przy odczycie lub zapisie pliku.");
        }
    }
}