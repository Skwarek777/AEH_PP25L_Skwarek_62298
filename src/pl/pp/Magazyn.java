package pl.pp;

public class Magazyn {

    private int numerMagazynu;
    private int przestrzenMagazynu; // całkowita pojemność
    private int zajetaPrzestrzen = 0; // aktualnie zajęta przestrzeń
    private String nazwaWlasciciela;
    private String email;
    private int numerTelefonu;

    public Magazyn() {
    }

    public Magazyn(int numerMagazynu, int przestrzenMagazynu, String nazwaWlasciciela, String email, int numerTelefonu) {
        this.numerMagazynu = numerMagazynu;
        this.przestrzenMagazynu = przestrzenMagazynu;
        this.nazwaWlasciciela = nazwaWlasciciela;
        this.email = email;
        this.numerTelefonu = numerTelefonu;
    }

    public void hiToAll() {
        System.out.println("Twój numer magazynu: " + numerMagazynu + "\nDostępna przestrzeń wynosi: " + przestrzenMagazynu + "\nZajęta przestrzeń wynosi: " + zajetaPrzestrzen + "\nWłascicielem jest: " + nazwaWlasciciela + "\nPrzypisany email: " + email + "\nPrzypisany numer telefonu: " + numerTelefonu);
    }

    // metody
    public void dodajTowar(int ilosc) {
        if (zajetaPrzestrzen + ilosc <= przestrzenMagazynu) {
            zajetaPrzestrzen += ilosc;
            System.out.println("Dodano " + ilosc + " jednostek towaru. Pozostała przestrzeń magazynowa: " + (przestrzenMagazynu - zajetaPrzestrzen) + " jednostek.");
        } else {
            System.out.println("Za mało miejsca w magazynie. Pozostała przestrzeń magazynowa: " + (przestrzenMagazynu - zajetaPrzestrzen) + " jednostek.");
        }
    }

    public void usunTowar(int ilosc) {
        if (ilosc <= zajetaPrzestrzen) {
            zajetaPrzestrzen -= ilosc;
            System.out.println("Usunięto " + ilosc + " jednostek towaru. Pozostała przestrzeń magazynowa: " + (przestrzenMagazynu - zajetaPrzestrzen) + " jednostek.");
        } else {
            System.out.println("Nie można usunąć więcej towaru niż znajduje się w magazynie. Aktualna zajęta przestrzeń: " + zajetaPrzestrzen + " jednostek.");
        }
    }

    public void sprawdzZajetosc() {
        System.out.println("Zajęta przestrzeń magazynowa: " + zajetaPrzestrzen + " jednostek.");
        System.out.println("Dostępna przestrzeń magazynowa: " + (przestrzenMagazynu - zajetaPrzestrzen) + " jednostek.");
    }

    public void aktualizujKontakt(String nowyEmail, int nowyNumerTelefonu) {
        this.email = nowyEmail;
        this.numerTelefonu = nowyNumerTelefonu;
        System.out.println("Zaktualizowano dane kontaktowe właściciela.");
        System.out.println("Nowy email: " + email);
        System.out.println("Nowy numer telefonu: " + numerTelefonu);
    }

    // Gettery i settery

    public int getNumerMagazynu() {
        return numerMagazynu;
    }

    public void setNumerMagazynu(int numerMagazynu) {
        this.numerMagazynu = numerMagazynu;
    }

    public int getPrzestrzenMagazynu() {
        return przestrzenMagazynu;
    }

    public void setPrzestrzenMagazynu(int przestrzenMagazynu) {
        this.przestrzenMagazynu = przestrzenMagazynu;
    }

    public String getNazwaWlasciciela() {
        return nazwaWlasciciela;
    }

    public void setNazwaWlasciciela(String nazwaWlasciciela) {
        this.nazwaWlasciciela = nazwaWlasciciela;
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
}
