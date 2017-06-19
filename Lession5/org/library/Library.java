package org.library;

/**
 * Created by ss on 19.06.2017.
 */
//Класс Библиотека – адрес (String), название (String), список книг (Book[])
public class Library {

    String name = null;
    String adress = null;
    Integer lenghtArray = Main.lenghtArray;

    Book[] books = new Book[lenghtArray];


    @Override
    public String toString()
    {
        return "Название библиотеки: " + this.name+" Адрес: "+this.adress;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }


}
