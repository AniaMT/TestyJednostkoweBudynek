package cku.sopot;
/**To jest klasa Blok {@code public class Blok}
 * Służy do przechowywania <b>adresów bloków</b>
 * oraz ilości klatek,
 * szerokości i ilości pieter
 * @version 1.0
 * @author Ania Marcińczyk-Tur
 */
public class Blok {
    /**
     * nazwa miasta
     */
    private String miasto;
    /**
     * nazwa ulicy
     */
    private String ulica;
    /**
     * numer bloku
     */
    private String nr;
    /**
     * ilość klatek w bloku
     */
    private int klatki;
    /**
     * szerokość bloku
     */
    private int szerokosc;
    /**
     * ilość pięter
     */
    private int pietra;

    /**
     * Konstruktor klasy Blok, pozwala na wprowadzenie
     * nazwy miasta, ulicy oraz numeru ulicy
     * a także ustawia początkowe wartości dla ilości
     * klatek, szerokości i ilości pięter. <br>
     * W konstruktorze nie ma ustawionego miasta, ulicy i nr bloku
     * należy to zrobić za pomocą odpowiednio: setMiasto(), setUlica() i serNr()
     * @param miasto nazwa miasta
     * @see cku.sopot.Blok#miasto
     * @param ulica nazwa ulicy
     * @see cku.sopot.Blok#ulica
     * @param nr numer bloku
     * @see cku.sopot.Blok#nr
     */

    public Blok(String miasto, String ulica, String nr) {
        setMiasto(miasto);
        setUlica(ulica);
        setNr(nr);
        this.klatki = 0;
        this.szerokosc = 0;
        this.pietra = 0;
    }

    public Blok(String miasto, String ulica, String nr, int klatki, int szerokosc, int pietra) {
        setMiasto(miasto);
        setUlica(ulica);
        setNr(nr);
        setKlatki(klatki);
        setSzerokosc(szerokosc);
        setPietra(pietra);
    }

    /**
     * Getter do pobierania nazwy miasta
     * @return nazwa miasta
     * @see cku.sopot.Blok#miasto
     */
    public String getMiasto() {
        return miasto;
    }

    /**
     * @deprecated
     * pobiera nazwę miasta, zalecamy użycie {@link cku.sopot.Blok#getMiasto}
     * @see cku.sopot.Blok#getMiasto
     * @return zwraca nazwę miasta
     */
    public String pobierzMiasto(){
        return miasto;
    }

    /**
     * Ustawia nazwę miasta, sprawdza czy nazwa miasta
     * nie jest dłuższa niż 20 znaków
     * @param miasto nazwa miasta
     * @see cku.sopot.Blok#getMiasto
     */
    public void setMiasto(String miasto) {
        if(miasto.length()>20)
            this.miasto = miasto.substring(0, 20);
        else this.miasto = miasto;
            }
    /**
     * Getter do pobierania nazwy ulicy
     * @return nazwa ulicy
     * @see cku.sopot.Blok#ulica
     */
    public String getUlica() {
        return ulica;
    }

    /**
     * Ustawia nazwę ulicy, sprawdza czy nazwa miasta
     * nie jest dłuższa niż 20 znaków
     * @param ulica nazwa ulicy
     * @see cku.sopot.Blok#getUlica
     */
    public void setUlica(String ulica) {
        if(ulica.length()>30)
            this.ulica = ulica.substring(0, 30);
        else this.ulica = ulica;
    }
    /**
     * Getter do pobierania numeru bloku
     * @return numer bloku
     * @see cku.sopot.Blok#nr
     */
    public String getNr() {
        return nr;
    }
    /**
     * Ustawia numer bloku, sprawdza czy numer bloku
     * nie jest dłuższy niż 5 znaków
     * @param nr numer bloku
     * @see cku.sopot.Blok#getNr
     */
    public void setNr(String nr) {
        if(nr.length()>5)
            this.nr = nr.substring(0, 5);
        else this.nr = nr;
    }

    /**Getter do pobierania ilości klatek
     * @return ilość klatek
     * @see cku.sopot.Blok#klatki
     */
    public int getKlatki() {
        return klatki;
    }
    /**
     * Ustawia ilość klatek, sprawdza czy ilość klatek
     * nie jest większa niż 10
     * @param klatki ilość klatek
     * @see cku.sopot.Blok#getKlatki
     */
    public void setKlatki(int klatki) {
        if(klatki<1) this.klatki=1;
        else if(klatki>10) this.klatki=10;
        else this.klatki = klatki;
    }

    /**Getter do pobierania szerokości budynku w metrach
     * @return szerokość budynku w metrach
     * @see cku.sopot.Blok#szerokosc
     */
    public int getSzerokosc() {
        return szerokosc;
    }
    /**
     * Ustawia szerokość bloku, sprawdza czy szerokość bloku
     * nie jest mniejsza niż 10 i większa niż 20
     * @param szerokosc szerokość bloku
     * @see cku.sopot.Blok#getSzerokosc
     */
    public void setSzerokosc(int szerokosc) {
        if(szerokosc<10) this.szerokosc=10;
        else if(szerokosc>20) this.szerokosc=20;
        else this.szerokosc = szerokosc;
    }
    /**Getter do pobierania szerokości budynku w metrach
     * @return {@link cku.sopot.Blok#pietra} w budynku
     * @see cku.sopot.Blok#pietra
     */
    public int getPietra() {
        return pietra;
    }
    /**
     * Ustawia ilość pięter w bloku, sprawdza czy ilość pięter
     * nie jest mniejsza niż 1 i większa niż 10
     * @param pietra ilość pięter w bloku
     * @see cku.sopot.Blok#getPietra
     */
    public void setPietra(int pietra) {
        if(pietra<1) this.pietra=1;
        else if(pietra>10) this.pietra=10;
        else this.pietra = pietra;
    }
    public int obliczPowierzchnieDzialki(){
        return klatki*20*szerokosc;
    }
    public int obliczKubature(){
        return obliczPowierzchnieDzialki()*(pietra+1)*3;
    }
    public int obliczPowierzchnieUzyt(){
        return obliczKubature()/3;
    }

    /**
     * nadpisana metoda toString
     * @return podaje adres bloku wraz z obliczoną powierzchnią, kubaturą
     * i powierzchnią użytkową bloku
     */

    @Override
    public String toString() {
        return "Blok = " + miasto+" "+ulica+" "+nr+" Powierzchnia działki: "+
                obliczPowierzchnieDzialki() +" kubatura: "+obliczKubature()+
                " powierzchnia użytkowa: "+obliczPowierzchnieUzyt();
    }
}
