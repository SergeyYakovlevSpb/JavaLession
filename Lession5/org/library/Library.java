package org.library;

/**
 * Created by ss on 19.06.2017.
 */
//Класс Библиотека – адрес (String), название (String), список книг (Book[])
public class Library {

    String name = null;
    String adress = null;

    Book[] books = new Book[5];


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
