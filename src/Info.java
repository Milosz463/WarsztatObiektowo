public class Info {
    String marka;
    String model;
    int przebieg;
    int rocznik;
    int numerAuta;
    String czyNaprawione;

    public Info(String marka, String model, int przebieg, int rocznik, String czyNaprawione) {
        this.marka = marka;
        this.model = model;
        this.przebieg = przebieg;
        this.rocznik = rocznik;
        this.czyNaprawione = czyNaprawione;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public int getNumerAuta() {
        return 1;
    }

    public void setNumerAuta(int numerAuta) {
        this.numerAuta = numerAuta;
    }

    public String getCzyNaprawione() {
        return czyNaprawione;
    }

    public void setCzyNaprawione(String czyNaprawione) {
        this.czyNaprawione = czyNaprawione;
    }

    @Override
    public String toString() {
        return "Info{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", przebieg=" + przebieg +
                ", rocznik=" + rocznik +
                ", numerAuta=" + numerAuta +
                ", czyNaprawione='" + czyNaprawione + '\'' +
                '}';
    }
}
