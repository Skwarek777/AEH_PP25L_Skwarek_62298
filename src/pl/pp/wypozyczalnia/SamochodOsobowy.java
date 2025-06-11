package pl.pp.wypozyczalnia;

public class SamochodOsobowy extends Pojazd {
    int liczbaDrzwi;

    public SamochodOsobowy(String nrRejestracyjny, String numerVin, String kolor, double cena,
                           double spalanie, double poziomPaliwa, double przebieg, int liczbaDrzwi) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.liczbaDrzwi = liczbaDrzwi;
    }

    @Override
    public void prowadz(double km) {
        przebieg += km;
        poziomPaliwa -= (km / 100) * spalanie;
        System.out.println("Samochód osobowy przejechał " + km + " km.");
    }
}
