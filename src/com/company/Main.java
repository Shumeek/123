package com.company;

import Adres.Adres;
import Person.Person;

public class Main {

    public static void main(String[] args) {

        Adres adres1 = new Adres("Cherepina 3/1");
        Adres adres2 = new Adres("Pokrovskaya 1/3");
        Adres adres3 = new Adres("Kharkovskaya 17/45 ");
        Adres adres4 = new Adres("Khreshatyk 1/80 ");
        Adres adres5 = new Adres("Romenskaya str 34 ");

        Person[] person = new Person[5];

        person[0] = new Person("Yehor", "Shum", "13.11.2000", adres1);
        person[1] = new Person("Artyem", "Menya","23.09.1999", adres2);
        person[2] = new Person("Max", "Basow", "18.13.1996", adres3);
        person[3] = new Person("Vlad","Skripka", "13.05.2001",adres4);
        person[4] = new Person("Svyat","Lots", "33.07.2003",adres5);

        for(int i=0;i<person.length; i++){
            person[i].print();
        }


    }
}

