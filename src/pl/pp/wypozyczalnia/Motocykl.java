package pl.pp.wypozyczalnia;

public class Motocykl extends Pojazd {
    boolean posiadaDostawke;

    public Motocykl(String nrRejestracyjny, String numerVin, String kolor, double cena,
                    double spalanie, double poziomPaliwa, double przebieg, boolean posiadaDostawke) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.posiadaDostawke = posiadaDostawke;
    }

    @Override
    public void prowadz(double km) {
        przebieg += km;
        poziomPaliwa -= (km / 100) * spalanie;
        System.out.println("Motocykl przejechał " + km + " km.");
    }
}
