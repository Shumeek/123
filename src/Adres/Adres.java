package Adres;

public class Adres {

    private String adres;

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getAdres() {
        return adres;
    }

    Adres(){

    }

    public Adres(String address){
        this.adres = adres;
    }
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append(" Address: " + this.adres);
        return string.toString();
    }

    public void print() {
        System.out.println(this.toString());
    }
}
