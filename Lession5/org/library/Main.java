package org.library;

import java.util.Date;

/**
 * Created by ss on 19.06.2017.
 */
public class Main {



    public static void main (String[] args){





      Book book1 = new Book();
        book1.setName("Name1");
        book1.setAutor("Autor1");
        book1.setDateMade(new Date());

      Book book2 = new Book();
        book2.setName("Name1");
        book2.setAutor("Autor1");
        book2.setDateMade(new Date());

      Book book3 = new Book();
        book3.setName("Name1");
        book3.setAutor("Autor1");
        book3.setDateMade(new Date());

      Book[] books = {book1, book2, book3};


        Library library = new Library();
        library.setName("Central Library");
        library.setAdress("street Nevskay 40-100");
        library.setBooks(books);

        System.out.println(library.toString());

     /* for (int index = 0;index < lenghtArray; index++){
          Date dateBook = new Date();

          Book bookSet = new Book();
          bookSet.setName("Book" + index);
          bookSet.setAutor("Autor"+index);
          bookSet.setDateMade(new Date());
          books[index] = bookSet;

       }

       library.setBooks(books);

      System.out.println(library.toString());

    for (int index = 0;index < lenghtArray; index++){
         System.out.println(library.getBooks()[index].toString());
    }

     System.out.println();*/

    }
}
