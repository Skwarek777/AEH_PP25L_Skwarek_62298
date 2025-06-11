package pl.pp.wypozyczalnia;

public class Ciezarowka extends Pojazd {
    double ladownosc;

    public Ciezarowka(String nrRejestracyjny, String numerVin, String kolor, double cena,
                      double spalanie, double poziomPaliwa, double przebieg, double ladownosc) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.ladownosc = ladownosc;
    }

    @Override
    public void prowadz(double km) {
        przebieg += km;
        poziomPaliwa -= (km / 100) * spalanie;
        System.out.println("Ciężarówka przejechała " + km + " km.");
    }
}
