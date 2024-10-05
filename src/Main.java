//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Info Auto1=new Info("Merc", "Gle", 13000, 2019,"Tak");
Info Auto2=new Info("Audi", "Q5", 15000, 2020, "Nie");
Info Auto3=new Info("BMW", "X5", 11000, 2018, "Tak");
        System.out.println("Auta w naszym warsztacie");
        System.out.println(Auto1);
        System.out.println(Auto2);
        System.out.println(Auto3);

Naprawa naprawa=new Naprawa();
naprawa.dodajNaprawione(Auto1);
naprawa.dodajNaprawione(Auto2);
naprawa.dodajNaprawione(Auto3);
        System.out.println("Auta do naprawy: ");
System.out.println(naprawa.Donaprawy);
        System.out.println("Auta naprawione: ");
System.out.println(naprawa.Naprawione);

Warsztat warsztat=new Warsztat();
warsztat.iloscAut.add(Auto1);
warsztat.iloscAut.add(Auto2);
warsztat.iloscAut.add(Auto3);

System.out.println("ilosc Aut w warsztacie: ");
System.out.println(warsztat.ileAut());
    }
}