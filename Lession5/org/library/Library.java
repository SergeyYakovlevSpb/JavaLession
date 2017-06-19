package org.library;

/**
 * Created by ss on 19.06.2017.
 */
//Класс Библиотека – адрес (String), название (String), список книг (Book[])
public class Library {

    private String name = null;
    private String adress = null;
    private Book[] books;


    @Override
    public String toString()
    {
        String textLibrary = "Название библиотеки: " + this.name+" Адрес: "+this.adress;

          for(int index = 0; index < books.length;index++) {
              textLibrary += "\n" + books[index].toString();
          }
        return textLibrary;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
