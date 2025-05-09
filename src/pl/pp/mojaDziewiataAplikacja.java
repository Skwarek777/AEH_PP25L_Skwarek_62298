package pl.pp;

public class mojaDziewiataAplikacja {
    public static void main(String[] args) {
        Magazyn magazyn1 = new Magazyn(601,10000,"benz","lalalala",500202303);
        magazyn1.dodajTowar(200);
        //magazyn1.sprawdzZajetosc();
        magazyn1.aktualizujKontakt("essa@ggg.pl", 500400300);
        magazyn1.usunTowar(52);


    }
}