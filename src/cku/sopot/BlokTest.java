package cku.sopot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Klasa testująca klasę Blok.<br>
 * Zawiera testy jednostkowe większości metod
 */
class BlokTest {
    /**
     * Sprawdza poprawność nazwy miasta
     * Czy zbyt długa {@link cku.sopot.Blok#miasto} jest obcinana do 20 znaków
     */
    @Test
    void poprawneMiasto() {
        Blok blok = new Blok("GdańskGdańskGdańskGdańsk", "długa", "5", 5, 15, 5);
        Assertions.assertEquals("GdańskGdańskGdańskGd", blok.getMiasto());
    }
    /**
     * Sprawdza poprawność nazwy ulicy
     * Czy zbyt długa {@link cku.sopot.Blok#ulica} jest obcinana do 30 znaków
     */
    @Test
    void poprawnaUlica() {
        Blok blok = new Blok("Gdańsk", "długadługadługadługadługadługadługa", "5", 5, 15, 5);
        Assertions.assertEquals("długadługadługadługadługadługa", blok.getUlica());
    }
    /**
     * Sprawdza poprawność numeru bloku
     * Czy zbyt długi {@link cku.sopot.Blok#nr} jest obcinany do 5 znaków
     */
    @Test
    void poprawnyNr() {
        Blok blok = new Blok("Gdańsk", "długa", "123456", 5, 15, 5);
        Assertions.assertEquals("12345", blok.getNr());
    }
    /**
     * Sprawdza poprawność ilości klatek
     * Czy zbyt duża ilość {@link cku.sopot.Blok#klatki} jest zamieniana na 10 i czy ujemna
     * ilość klatek zamieniana jest na 1
     */
    @Test
    void poprawnaIloscKlatek() {
        Blok blok = new Blok("Gdańsk", "długa", "5", 5, 15, 5);
        blok.setKlatki(0);
        Assertions.assertEquals(1, blok.getKlatki());
        blok.setKlatki(15);
        Assertions.assertEquals(10, blok.getKlatki());

    }
    /**
     * Sprawdza poprawność szerokość bloku
     * Czy zbyt duża {@link cku.sopot.Blok#szerokosc} jest zamieniana na 20 i czy ujemna
     * szerokość zamieniana jest na 10
     */
    @Test
    void poprawnaSzerokosc() {
        Blok blok = new Blok("Gdańsk", "długa", "5", 5, 15, 5);
        blok.setSzerokosc(0);
        Assertions.assertEquals(1, blok.getSzerokosc());
        blok.setSzerokosc(25);
        Assertions.assertEquals(20, blok.getSzerokosc());

    }
    /**
     * Sprawdza poprawność ilości pięter
     * Czy zbyt duża ilość {@link cku.sopot.Blok#pietra} jest zamieniana na 10 i czy ujemna
     * ilość klatek zamieniana jest na 1
     */
    @Test
    void poprawnaIloscPieter() {
        Blok blok = new Blok("Gdańsk", "długa", "5", 5, 15, 15);
        blok.setPietra(0);
        Assertions.assertEquals(1, blok.getPietra());
        blok.setPietra(11);
        Assertions.assertEquals(10, blok.getPietra());

    }

    /**
     * Sprawdza poprawność konstruktora
     * czy zbyt długa nazwa {@link cku.sopot.Blok#miasto} jest obcinana do 20 znaków<br>
     * czy zbyt długa nazwa {@link cku.sopot.Blok#ulica} jest obcinana do 30 znaków<br>
     * czy zbyt długi {@link cku.sopot.Blok#nr} jest obcinany do 5 znaków<br>
     * czy zbyt duża ilość {@link cku.sopot.Blok#klatki} jest zamieniana na 10 i czy ujemna
     * ilość klatek zamieniana jest na 1 <br>
     * czy zbyt duża {@link cku.sopot.Blok#szerokosc} jest zamieniana na 20 i czy ujemna
     * szerokość zamieniana jest na 10 <br>
     * czy zbyt duża ilość {@link cku.sopot.Blok#pietra} jest zamieniana na 10 i czy ujemna
     * ilość klatek zamieniana jest na 1
     *
     */
    @Test
    void poprawnyKonstruktor() {
        Blok blok = new Blok("GdańskGdańskGdańskGdańsk", "długadługadługadługadługadługadługa", "555566", 0, 30, 15);
        Assertions.assertEquals("GdańskGdańskGdańskGd", blok.getMiasto());
        Assertions.assertEquals("długadługadługadługadługadługa", blok.getUlica());
        Assertions.assertEquals("55556", blok.getNr());
        Assertions.assertEquals(1, blok.getKlatki());
        Assertions.assertEquals(20, blok.getSzerokosc());
        Assertions.assertEquals(10, blok.getPietra());
    }

    /**
     * Sprawdza poprawność obliczenia powierzchni działki
     * Czy powiechnia = 1500 odpowiada blokowi o szerokości 15 i złożonemu z 5 klatek
     */
    @Test
    void poprawneObliczaniePowierzchniDzialki() {
        Blok blok = new Blok("Gdańsk", "długa", "5", 5, 15, 5);
        Assertions.assertEquals(1500, blok.obliczPowierzchnieDzialki() );
    }
    /**
     * Sprawdza poprawność obliczenia kubatury
     * Czy powiechnia = 27000 odpowiada 5-piętrowemu blokowi o szerokości 15, złożonemu z 5 klatek
     */
    @Test
    void poprawnePbliczanieKubatury() {
        Blok blok = new Blok("Gdańsk", "długa", "5", 5, 15, 5);
        Assertions.assertEquals(27000, blok.obliczKubature() );
    }
    /**
     * Sprawdza poprawność obliczenia powierzchni użytkowej
     * Czy powiechnia = 27000 odpowiada 5-piętrowemu blokowi o szerokości 15, złożonemu z 5 klatek
     */
    @Test
    void obliczPowierzchnieUzyt() {
        Blok blok = new Blok("Gdańsk", "długa", "5", 5, 15, 5);
        Assertions.assertEquals(9000, blok.obliczPowierzchnieUzyt() );
    }

    /**
     * Sprawdza poprawność metody toString
     * Czy {@link Blok#toString()} zwróci
     */
    @Test
    void poprawnyToString() {
        Blok blok = new Blok("Gdańsk", "długa", "5", 5, 15, 5);
        Assertions.assertEquals("Blok = Gdańsk długa 5 Powierzchnia działki: 1500 kubatura: 27000 powierzchnia użytkowa: 9000", blok.toString());

    }
}