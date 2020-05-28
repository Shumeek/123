package Person;

import Adres.Adres;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

    private String name;
    private String seCname;
    private Date dateBirth;
    private Adres adres;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSeCname(String surname) {
        this.seCname = surname;
    }

    public String getSeCname() {
        return seCname;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setAddress(Adres address) {
        this.adres = adres;
    }

    public Adres getAddress() {
        return adres;
    }

    Person(){

    }

    public Person(String name, String surname, String dateBirth, Adres adres){
        this.name= name;
        this.seCname = surname;
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        //  = null; Date dateOne


        try {
            this.dateBirth = format.parse(String.valueOf(dateBirth));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //this.dateBirth = dateBirth;
        this.adres = adres;
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append( "Имя: " + this.name + " Фамилия: " + this.seCname + " Его адрес: " + this.adres + " День рожденья: " + this.dateBirth);
        return string.toString();
    }

    public void print() {
        System.out.println(this.toString());
    }
}
