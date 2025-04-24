package pl.pp;

public class mojaOsmaAplikacja {
    public static void main(String[] args) {

        /*
        Person person1 = new Person("Test", "Testowy", 25);

        person1.growOld(10);

        person1.setForename("ZmienionyTest");

        String personName = person1.getForename();
        int personAge = person1.getAge();
        System.out.println("PObrane imie to " + personName + " z wiekiem = " + personAge);

        Circle circle1 = new Circle(1.2);
        circle1.getInfo();
        circle1.setRadius(2.6);
        circle1.getInfo();
    */
      Konto konto1 = new Konto();
      konto1.setNumerKonta(1111);
      konto1.setWlasciciel("abcd");
      konto1.setEmail("aaaaaaaaaa@gmail.com");
      konto1.setNumerTelefonu(222555999);
      konto1.setSaldo(2005.22);


            konto1.wplata(50000);
            konto1.wyplata(25000);
            konto1.hiToAll();










    }
}