package Bog;

/*
* Bog
Skriv en klasse kaldet Bog, der indeholder ISBN-nummer, titel og udgivelsesår.
Skriv flg. metoder:
•	Konstruktør metode
•	Get og set metoder
•	toString metode
•	Skriv en equals metode baseret på ISBN

Skriv en klasse kaldet Bibliotek, der indeholder en liste af Bog objekter.
•	Skriv en metode i Bibliotek klassen, som tager et Bog objekt som parameter,
* og returnerer true, hvis listen indeholder et Bog objekt med samme ISBN.

*/

import java.util.Objects;

public class Bog {
    private static int ISBNnr;
    private static String title;
    private static int publishYear;

    public Bog(int ISBNnr, String title, int publishYear) {
        this.ISBNnr = ISBNnr;
        this.title = title;
        this.publishYear = publishYear;
    }

    public int getISBNnr() {
        return ISBNnr;
    }

    public void setISBNnr(int ISBNnr) {
        this.ISBNnr = ISBNnr;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Bog: ISBN nr: " + ISBNnr +
                ". Title: " + title +
                ". Udgivelsesår: " + publishYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bog bog = (Bog) o;
        return ISBNnr == bog.ISBNnr &&
                publishYear == bog.publishYear &&
                Objects.equals(title, bog.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBNnr, title, publishYear);
    }
}

