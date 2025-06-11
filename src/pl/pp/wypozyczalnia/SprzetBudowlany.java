package pl.pp.wypozyczalnia;

public class SprzetBudowlany extends Pojazd {
    double przepracowaneGodziny;

    public SprzetBudowlany(String nrRejestracyjny, String numerVin, String kolor, double cena,
                           double spalanie, double poziomPaliwa, double przebieg, double przepracowaneGodziny) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.przepracowaneGodziny = przepracowaneGodziny;
    }

    @Override
    public void prowadz(double km) {
        przebieg += km;
        przepracowaneGodziny += km / 10;
        poziomPaliwa -= (km / 100) * spalanie;
        System.out.println("Sprzęt budowlany przejechał " + km + " km (około " + (km / 10) + " h pracy).");
    }
}
