package cku.sopot;

import java.util.Scanner;

/**
 * Klasa uruchomieniowa do sprawdzania klasy {@link cku.sopot.Blok}. <br>
 * Tworzy dwa adresy bloków i testuje działanie klasy.
 */
public class TestyJednostkoweBudynek {

    static String miasto;
    static String ulica;
    static String nr;
    static int klatki;
    static int szerokosc;
    static int pietra;

    /**
     * Główna metoda uruchamiająca program
     * @param args tablica parametrów uruchomieniowych przekazywanych
     * z wiersza poleceń programu
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę miasta: ");
        miasto = scanner.nextLine();
        System.out.print("Podaj nazwę ulicy: ");
        ulica = scanner.nextLine();
        System.out.print("Podaj numer bloku: ");
        nr = scanner.nextLine();
        System.out.print("Podaj liczbę klatek: ");
        klatki = scanner.nextInt();
        System.out.print("Podaj szerokość budynku: ");
        szerokosc = scanner.nextInt();
        System.out.print("Podaj liczbę pięter: ");
        pietra = scanner.nextInt();

        Blok blok1 = new Blok(miasto, ulica, nr, klatki, szerokosc, pietra);
        System.out.println(blok1.toString());

        Blok blok2 = new Blok("Ełk", "Gdańska", "13");
        blok2.setKlatki(5);
        blok2.setSzerokosc(15);
        blok2.setPietra(6);
        System.out.println(blok2.toString());


    }

}
