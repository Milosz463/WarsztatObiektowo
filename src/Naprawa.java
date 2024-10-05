import java.util.ArrayList;

public class Naprawa {
    ArrayList<Info>Naprawione=new ArrayList<>();
    ArrayList<Info>Donaprawy=new ArrayList<>();


    public void dodajNaprawione(Info info){
        if(info.getCzyNaprawione().equals("Tak")){
            Naprawione.add(info);
        } else if (info.getCzyNaprawione().equals("Nie")) {
            Donaprawy.add(info);
        }else{
            System.out.println("Brak danych");
        }
    }

}
