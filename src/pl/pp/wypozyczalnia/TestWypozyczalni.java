package pl.pp.wypozyczalnia;

public class TestWypozyczalni {
    public static void main(String[] args) {
        TypPaliwa diesel = new Diesel();
        TypPaliwa benzyna = new Benzyna();
        TypPaliwa elektryk = new Elektryk();

        SamochodOsobowy auto = new SamochodOsobowy("XYZ123", "VIN123", "Czerwony", 40000, 7.5, 50, 120000, 5);
        Ciezarowka tir = new Ciezarowka("TRK456", "VIN456", "Biały", 120000, 15, 200, 300000, 10000);
        Motocykl moto = new Motocykl("MOT789", "VIN789", "Czarny", 15000, 3.5, 10, 20000, true);
        SprzetBudowlany koparka = new SprzetBudowlany("BU123", "VIN987", "Żółty", 250000, 10, 100, 8000, 300);

        auto.pokazInfo();
        auto.prowadz(100);
        auto.zatankuj(20);
        System.out.println("Paliwo: " + diesel.getTypPaliwa());

        System.out.println("----------");

        tir.pokazInfo();
        tir.prowadz(50);
        System.out.println("Paliwo: " + diesel.getTypPaliwa());

        System.out.println("----------");

        moto.pokazInfo();
        moto.prowadz(30);
        System.out.println("Paliwo: " + benzyna.getTypPaliwa());

        System.out.println("----------");

        koparka.pokazInfo();
        koparka.prowadz(20);
        System.out.println("Paliwo: " + elektryk.getTypPaliwa());
    }
}
