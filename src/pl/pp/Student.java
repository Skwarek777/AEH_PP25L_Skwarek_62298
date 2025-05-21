package pl.pp;

import java.util.List;

public class Student {
    private String indeks;
    private String imie;
    private String nazwisko;
    private List<Integer> oceny;

    public Student(String indeks, String imie, String nazwisko, List<Integer> oceny) {
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = oceny;
    }

    public String getIndeks() {
        return indeks;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public List<Integer> getOceny() {
        return oceny;
    }

    public double getSrednia() {
        if (oceny.isEmpty()) return 0.0;
        int suma = 0;
        for (int ocena : oceny) {
            suma += ocena;
        }
        return (double) suma / oceny.size();
    }
}


