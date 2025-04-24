package pl.pp;

public class Konto {
    // Pola prywatne
    private int numerKonta;
    private double saldo;
    private String wlasciciel;
    private String email;
    private int numerTelefonu;

    // Konstruktor domyślny
    public Konto() {
    }

    // Konstruktor z parametrami
    public Konto(int numerKonta, double saldo, String wlasciciel, String email, int numerTelefonu) {
        this.numerKonta = numerKonta;
        this.saldo = saldo;
        this.wlasciciel = wlasciciel;
        this.email = email;
        this.numerTelefonu = numerTelefonu;
    }

// metody klasy określające akcje możliwe do wykonania przez obiekt
    public void hiToAll(){
        System.out.println("Twój numer konta to: " + numerKonta  + "\n Wlasicielem jest " + wlasciciel + "\n Twoj email to " + email + "\n Twoj numer telefonu to " + numerTelefonu + "\n Twoje saldo wynosi: " + saldo);
    }


    // Gettery i settery
    public int getNumerKonta() {
        return numerKonta;
    }

    public void setNumerKonta(int numerKonta) {
        this.numerKonta = numerKonta;
    }



    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getWlasciciel() {
        return wlasciciel;
    }



    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumerTelefonu() {
        return numerTelefonu;
    }


    public void setNumerTelefonu(int numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    // Metoda do wpłaty środków
    public void wplata(double kwota) {
        if (kwota > 0) {
            saldo += kwota;
            System.out.println("Wpłata PLN " + kwota + " została wykonana. Nowe saldo PLN " + saldo);
        } else {
            System.out.println("Podana kwota jest nieprawidłowa.");
        }
    }

    // Metoda do wypłaty środków
    public void wyplata(double kwota) {
        if (kwota <= saldo) {
            saldo -= kwota;
            System.out.println("Pobrano PLN " + kwota + " z konta, Pozostałe saldo = PLN " + saldo);
        } else {
            System.out.println("Brak środków. Masz PLN " + saldo + " na koncie.");
        }
    }
}