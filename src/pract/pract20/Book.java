package pract.pract20;

import java.io.Serializable;

//Управление списком книг.
//Файл books.txt содержит список книг в бинарном формате. Необходимо прочитать этот список книг из файла в классе BookManager и
// добавить в этот класс следующие методы:
//фильтрация книг по определенным критериям (по автору, по количеству страниц)
//сортировка книг по различным параметрам (по названию, по автору, по количеству страниц)
//создание подсписков книг (например, список книг определенного автора или список книг с количеством страниц больше определенного значения)
public class Book implements Serializable {
    private String author;
    private String title;
    private int yearWrite;

    public Book(String author, String title, int yearWrite) {
        this.author = author;
        this.title = title;
        this.yearWrite = yearWrite;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearWrite() {
        return yearWrite;
    }

    public void setYearWrite(int yearWrite) {
        this.yearWrite = yearWrite;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearWrite=" + yearWrite +
                '}';
    }
}
