package pl.pp;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class mojaDwunastaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Podaj ścieżkę do pliku wejściowego: ");
            String inputPathStr = scanner.nextLine();
            System.out.print("Podaj ścieżkę do pliku wyjściowego: ");
            String outputPathStr = scanner.nextLine();

            Path inputPath = Paths.get(inputPathStr);
            Path outputPath = Paths.get(outputPathStr);


            long lineCount = Files.lines(inputPath).count();


            System.out.println("Liczba linii w pliku: " + lineCount);



            try (FileWriter writer = new FileWriter(outputPath.toFile())) {
                writer.write("Plik: " + inputPath.getFileName() + "\n");
                writer.write("Liczba linii: " + lineCount + "\n");
            }



            System.out.println("Zapisano wynik do pliku: " + outputPath);




        } catch (IOException e) {
            System.out.println("Błąd podczas odczytu lub zapisu pliku: " + e.getMessage());
        }
    }
}
