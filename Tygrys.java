public class Tygrys extends Kot{



    private String kolorOczu;

    public  Tygrys(int waga, int dlugoscOgona, String kolorOczu){
        super(waga,dlugoscOgona);
        this.kolorOczu = kolorOczu;
        System.out.println("Konstruktor Tygrysa");
    }
    @Override
    public String toString() {
        return "Tygrys{" +
                "kolorOczu='" + kolorOczu + '\'' +
                '}';
    }

    public String getKolorOczu() {
        return kolorOczu;
    }

    public void setKolorOczu(String kolorOczu) {
        this.kolorOczu = kolorOczu;
    }
}
