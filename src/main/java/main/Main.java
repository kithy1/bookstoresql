package main;

import connection.ConnectionManager;
import dao.BookDaoImp;
import model.Book;
import service.BookServiceIMPL;
import service.Bookservice;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        Bookservice bookservice = new BookServiceIMPL(new BookDaoImp());
        List<Book> books = bookservice.find();
        System.out.println(books.toString());
    }
}
