package service;

import dao.BookDAO;
import model.Book;

import java.util.List;

public class BookServiceIMPL implements Bookservice {

    private BookDAO bookDAO;

    public BookServiceIMPL(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    public List<Book> find() {
        return bookDAO.find();
    }
}
