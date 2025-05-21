package pl.pp;
import java.util.*;
public class mojaDziesiataAplikacja {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("12345", "Michał", "Nowakowski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Robert", "Lewandowski", Arrays.asList(1, 1, 6, 4)),
                new Student("54321", "Kylian", "Mbappe", Arrays.asList(2, 2, 1, 5)),
                new Student("09876", "Czarek", "Mucha", Arrays.asList(5, 4, 4, 5))
        );
        students.sort(Comparator.comparing(Student::getNazwisko));

        System.out.println("Studenci posortowani według nazwisk:");
        for (Student s : students) {
            System.out.printf("%s %s (%s) - Srednia: %.2f\n",
                    s.getImie(),
                    s.getNazwisko(),
                    s.getIndeks(),
                    s.getSrednia());
        }
        double suma = 0;
        for (Student s : students) {
            suma += s.getSrednia();
        }
        double sredniaWszystkich = suma / students.size();

        System.out.printf("\nŚrednia ocen wszystkich studentów: %.2f\n", sredniaWszystkich);






    }
}
