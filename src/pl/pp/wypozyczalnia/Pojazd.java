package pl.pp.wypozyczalnia;

public abstract class Pojazd {
    String nrRejestracyjny;
    String numerVin;
    String kolor;
    double cena;
    double spalanie;
    double poziomPaliwa;
    double przebieg;

    public Pojazd(String nrRejestracyjny, String numerVin, String kolor, double cena,
                  double spalanie, double poziomPaliwa, double przebieg) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.numerVin = numerVin;
        this.kolor = kolor;
        this.cena = cena;
        this.spalanie = spalanie;
        this.poziomPaliwa = poziomPaliwa;
        this.przebieg = przebieg;
    }

    public abstract void prowadz(double km);

    public void zatankuj(double litry) {
        poziomPaliwa += litry;
        System.out.println("Zatankowano " + litry + " litrów paliwa.");
    }

    public void pokazInfo() {
        System.out.println("Pojazd: " + nrRejestracyjny + ", kolor: " + kolor + ", przebieg: " + przebieg + " km");
    }
}
