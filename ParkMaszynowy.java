package com.company;

import java.util.ArrayList;

public class ParkMaszynowy {
    public static class Maszyna {
        String marka;
        String nazwa;
        int pojemnoscSilnika;
        String rodzajSilnika;
    }

    public static class Kosiarka extends Maszyna {
        boolean czyMelekser;
        boolean czyNaped;
        int liczbaOstrzy;

        public Kosiarka(boolean czyMelekser, boolean czyNaped, int liczbaOstrzy,
                        String marka, String nazwa, int pojemnoscSilnika, String rodzajSilnika) {
            this.marka = marka;
            this.nazwa = nazwa;
            this.pojemnoscSilnika = pojemnoscSilnika;
            this.rodzajSilnika = rodzajSilnika;
            this.czyMelekser = czyMelekser;
            this.czyNaped =czyNaped;
            this.liczbaOstrzy = liczbaOstrzy;
        }

        public void setCzyMelekser(boolean czyMelekser) {
            this.czyMelekser = czyMelekser;
        }

        public void setCzyNaped(boolean czyNaped) {
            this.czyNaped = czyNaped;
        }

        public void setLiczbaOstrzy(int liczbaOstrzy) {
            this.liczbaOstrzy = liczbaOstrzy;
        }

        public void wyswietl() {
            System.out.println("Marka: " + marka);
            System.out.println("Nazwa: " + nazwa);
            System.out.println("Pojemność silnika: " + pojemnoscSilnika);
            System.out.println("Rodzaj silnika: " + rodzajSilnika);
            System.out.println("Czy melekser: " + czyMelekser);
            System.out.println("Czy napęd: " + czyNaped);
            System.out.println("Liczba ostrzy: " + liczbaOstrzy);
        }
    }

    public static class Lokomotywa extends Maszyna {
        boolean czyRadziecka;
        int maxLiczbaWagonow;

        public Lokomotywa(boolean czyRadziecka, int maxLiczbaWagonow,
                          String marka, String nazwa, int pojemnoscSilnika, String rodzajSilnika) {
            this.marka = marka;
            this.nazwa = nazwa;
            this.pojemnoscSilnika = pojemnoscSilnika;
            this.rodzajSilnika = rodzajSilnika;
            this.czyRadziecka = czyRadziecka;
            this.maxLiczbaWagonow = maxLiczbaWagonow;
        }

        public void wyswietl() {
            System.out.println("Marka: " + marka);
            System.out.println("Nazwa: " + nazwa);
            System.out.println("Pojemność silnika: " + pojemnoscSilnika);
            System.out.println("Rodzaj silnika: " + rodzajSilnika);
            System.out.println("Czy radziecka: " + czyRadziecka);
            System.out.println("Max liczba wagonów: " + maxLiczbaWagonow);
        }
    }

    public static class Pojazd extends Maszyna {
        int maxLiczbaPojazdow;
        int moc;
        int momentObrotowy;
        int nrPojazdu;

        public Pojazd(String marka, String nazwa, int pojemnoscSilnika, String rodzajSilnika,
                      int maxLiczbaPojazdow, int moc, int momentObrotowy, int nrPojazdu) {
            this.marka = marka;
            this.nazwa = nazwa;
            this.pojemnoscSilnika = pojemnoscSilnika;
            this.rodzajSilnika = rodzajSilnika;
            this.maxLiczbaPojazdow = maxLiczbaPojazdow;
            this.moc = moc;
            this.momentObrotowy = momentObrotowy;
            this.nrPojazdu = nrPojazdu;
        }

        public void wyswietl() {
            System.out.println("Marka: " + marka);
            System.out.println("Nazwa: " + nazwa);
            System.out.println("Pojemność silnika: " + pojemnoscSilnika);
            System.out.println("Rodzaj silnika: " + rodzajSilnika);
            System.out.println("Max liczba pojazdów: " + maxLiczbaPojazdow);
            System.out.println("Moc: " + moc);
            System.out.println("Moment obrotowy: " + momentObrotowy);
            System.out.println("Nr pojazdu: " + nrPojazdu);
        }
    }

    public static class Samochod extends Pojazd {
        String model;
        String VIN;

        public Samochod(String model, String VIN,
                        String marka, String nazwa, int pojemnoscSilnika, String rodzajSilnika,
                        int maxLiczbaPojazdow, int moc, int momentObrotowy, int nrPojazdu) {
            super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, maxLiczbaPojazdow, moc, momentObrotowy, nrPojazdu);
            this.model = model;
            this.VIN = VIN;
        }

        public void wyswietl() {
            System.out.println("Marka: " + marka);
            System.out.println("Nazwa: " + nazwa);
            System.out.println("Pojemność silnika: " + pojemnoscSilnika);
            System.out.println("Rodzaj silnika: " + rodzajSilnika);
            System.out.println("Max liczba pojazdów: " + maxLiczbaPojazdow);
            System.out.println("Moc: " + moc);
            System.out.println("Moment obrotowy: " + momentObrotowy);
            System.out.println("Nr pojazdu: " + nrPojazdu);
            System.out.println("Model: " + model);
            System.out.println("VIN: " + VIN);
        }
    }

    public static class Jednoslad extends Pojazd {
        String typ;

        public Jednoslad(String typ,
                         String marka, String nazwa, int pojemnoscSilnika, String rodzajSilnika,
                         int maxLiczbaPojazdow, int moc, int momentObrotowy, int nrPojazdu) {
            super(marka, nazwa, pojemnoscSilnika, rodzajSilnika, maxLiczbaPojazdow, moc, momentObrotowy, nrPojazdu);
            this.typ = typ;
        }

        public void wyswietl() {
            System.out.println("Marka: " + marka);
            System.out.println("Nazwa: " + nazwa);
            System.out.println("Pojemność silnika: " + pojemnoscSilnika);
            System.out.println("Rodzaj silnika: " + rodzajSilnika);
            System.out.println("Max liczba pojazdów: " + maxLiczbaPojazdow);
            System.out.println("Moc: " + moc);
            System.out.println("Moment obrotowy: " + momentObrotowy);
            System.out.println("Nr pojazdu: " + nrPojazdu);
            System.out.println("Typ: " + typ);
        }
    }

    public static void main(String[] args) {
        ArrayList<Maszyna> maszyny = new ArrayList<Maszyna>();
        maszyny.add(new Kosiarka(false, true, 2, "VIKING", "3000", 2, "benzynowy"));
        maszyny.add(new Kosiarka(true, true, 4, "HONDA", "1000", 5, "benzynowy"));
        maszyny.add(new Lokomotywa(true, 4, "Lokomotix", "409Da", 500, "parowy"));
        maszyny.add(new Lokomotywa(false, 8, "Polomotywa", "134Hq", 600, "benzynowy"));
        maszyny.add(new Pojazd("HONDA", "Civic", 400, "diesel", 1, 200, 3000, 12345));
        maszyny.add(new Pojazd("VOLVO", "xc60", 500, "benzynowy", 2, 180, 4000, 56751));
        maszyny.add(new Samochod("Fabia", "457854879665558841", "SKODA", "Fabia 2008", 300, "benzynowy", 4, 300, 3000, 42344));
        maszyny.add(new Samochod("GT", "48777452135485488", "FORD", "Mustang", 500, "benzynowy", 10, 400, 1000, 77485));
        maszyny.add(new Jednoslad("motor", "HONDA", "CBR", 150, "benzynowy", 4, 180, 2000, 55092));
        maszyny.add(new Jednoslad("motor", "SUZUKI", "Katana", 160, "benzynowy", 7, 180, 2500, 445279));
    }
}
