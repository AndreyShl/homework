package pract.pract20;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


//Управление списком книг.
//Файл books.txt содержит список книг в бинарном формате. Необходимо прочитать этот список книг из файла в классе
//BookManager и добавить в этот класс следующие методы:
//фильтрация книг по определенным критериям (по автору, по количеству страниц)
//сортировка книг по различным параметрам (по названию, по автору, по количеству страниц)
//создание подсписков книг (например, список книг определенного автора или список книг с количеством страниц больше определенного значения)
public class Main {
    public static void main (String[] args) throws IOException, ClassNotFoundException {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Оруэлл", "1984", 2021));
        books.add(new Book("Караткевич", "Дзiкае паляванне караля Стаха", 2020));
        books.add(new Book("Толкиен", "Хоббит", 2024));

        writeBooksToFile(books);
        List<Book> bookList = readBooksToFile("resources/books.txt");
        System.out.println(bookList);

        Predicate<Book> filterByAuthor = book -> book.getAuthor().equals("Оруэлл");
        Predicate<Book> filterByYear = book -> book.getYearWrite()<2024;
        List<Book> bookByYear = filterList("resources/books.txt",filterByYear);
        List<Book> bookByAuthor = filterList("resources/books.txt", filterByAuthor);
        System.out.println("book by author"+bookByAuthor);
        System.out.println("book by year"+bookByYear);


    }
    private static List<Book> filterList(String filePath, Predicate<Book> predicate) throws IOException, ClassNotFoundException {
        List<Book> bookList = readBooksToFile(filePath);
        List<Book> filtredBook = bookList.stream().
                filter(predicate).toList();
        return filtredBook;
    }

    private static List<Book> readBooksToFile(String filePath) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream =new FileInputStream(filePath);
        ObjectInputStream objectInputStream =new ObjectInputStream(fileInputStream);


        List<Book> readBooks = (List<Book>) objectInputStream.readObject();
        return readBooks;

    }

    private static void writeBooksToFile(List<Book> books) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("resources/books.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(books);

        objectOutputStream.close();

    }
}
