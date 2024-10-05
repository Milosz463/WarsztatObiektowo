import java.util.ArrayList;

public class Warsztat {
    ArrayList<Info>iloscAut=new ArrayList<>();

    public Warsztat(ArrayList<Info> iloscAut) {
        this.iloscAut = iloscAut;
    }

    Warsztat() {}

    public void dodajAuta(Info info){
        iloscAut.add(info);
    }

    public int ileAut(){
        int ilosc=0;
        for (int i = 0; i < iloscAut.size(); i++) {
            ilosc=ilosc+iloscAut.get(i).getNumerAuta();
        }
        return ilosc;


    }


}


