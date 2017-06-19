package org.library;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ss on 19.06.2017.
 */
public class Book extends Library{
    //isbn
    private String name = null;
    private String autor = null;
    private Date dateMade = new Date();
    private String dateMadePrint = null;


    @Override
    public String toString()
    {
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        String dateMadePrint = format1.format(this.dateMade);

        return "Название книги: "+ this.name+" Автор: "+this.autor+" Дата печати: "+ dateMadePrint;
    }


    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public Date getDateMade() {
        return dateMade;
    }

    public void setDateMade(Date dateMade) {
        this.dateMade = dateMade;
    }

    public void setAutor(String autor) {

        this.autor = autor;
    }

    public void setName(String name) {

        this.name = name;
    }
}


  /*  *//*Имеет набор полей – номер ISBN (идентификатор), название (String), автор (String), год выпуска (Date).
        Класс Библиотека – адрес (String), название (String), список книг (Book[])
        Также переопределите метод toString() у обоих классов.
        Учтите*//*, для того, чтобы отобразить массив, вам нужно у каждого элемента массива вызвать toString().
        Т.е. для отображения массива нужен цикл.
*/