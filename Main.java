package com.company;

public class Main {

    public static class Zwierze {
        public String nazwa;
        public int wiek;
        public double waga;

        public Zwierze(String nazwa, int wiek, double waga) {
            this.nazwa = nazwa;
            this.wiek = wiek;
            this.waga = waga;
        }
    }

    public static class Lew extends Zwierze {
        public boolean bieganie;

        public Lew(String nazwa, int wiek, double waga, boolean bieganie) {
            super(nazwa, wiek, waga);
            this.bieganie = bieganie;
        }

        public void biegnij() {
            bieganie = true;
        }

        public void zatrzymajSie() {
            bieganie = false;
        }

        public void wypisz() {
            System.out.printf("Czy biegnie?: %s\n", bieganie ? "tak" : "nie");
        }
    }

    public static class Orzel extends Zwierze {
        public boolean leci;

        public Orzel(String nazwa, int wiek, double waga, boolean leci) {
            super(nazwa, wiek, waga);
            this.leci = leci;
        }

        public void lec() {
            leci = true;
        }

        public void wyladuj() {
            leci = false;
        }

        public void wypisz() {
            System.out.printf("Czy leci?: %s\n", leci ? "tak" : "nie");
        }
    }

    public static void main(String[] args) {
        Orzel orzel = new Orzel("Bielik", 5, 4.7, false);
        Lew lew = new Lew("Joe", 8, 190.2, false);

        orzel.lec();
        orzel.wypisz();
        lew.biegnij();
        lew.wypisz();
    }
}
