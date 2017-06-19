package org.library;

import java.util.Date;

/**
 * Created by ss on 19.06.2017.
 */
public class Main {


    public static void main (String[] args){



     Library library = new Library();
     library.name = "Central Library";
     library.adress = "street Nevskay 40-100";

     Book[] books = new Book[5];

      for (int index = 0;index < 5; index++){
          Date dateBook = new Date();

          Book bookSet = new Book();
          bookSet.setName("Book" + index);
          bookSet.setAutor("Autor"+index);
          bookSet.setDateMade(new Date());
          books[index] = bookSet;

       }

       library.setBooks(books);

      System.out.println(library.toString());

    for (int index = 0;index < 5; index++){
         System.out.println(library.getBooks()[index].toString());
    }

     System.out.println();

    }
}
