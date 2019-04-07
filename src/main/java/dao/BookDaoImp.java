package dao;

import connection.ConnectionManager;
import model.Book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static connection.ConnectionManager.getConnection;

public class BookDaoImp implements BookDAO {
    @Override
    public List<Book> find() {

        try(Connection con = getConnection();
            Statement statement = con.createStatement()) {
           ResultSet resultSet= statement.executeQuery("SELECT id, title, pages_number," +
                   " category_id, publisher_id from books");
            List<Book> booklist = new ArrayList<>();
            while (resultSet.next()){
                Book book = new Book();
                book.setId(resultSet.getInt("id"));
                book.setTitle(resultSet.getString("title"));
                book.setPageNumbeer(resultSet.getInt("pages_number"));
                book.setCategoryId(resultSet.getInt("category_id"));
                book.setPublisherId(resultSet.getInt("publisher_id"));
                booklist.add(book);
            }
            return booklist;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    @Override
    public Book findById(int id) {
        return null;
    }

    @Override
    public List<Book> findByAuthorFullName(String authorName) {
        return null;
    }

    @Override
    public List<Book> findByCategoryCode(String category) {

        try (Connection con = ConnectionManager.getConnection();
             Statement statement = con.createStatement()) {

            String select = "select b.id as id, b.title as title, c.code as code from books b" +
                    "from books b" +
                    "inner join categories c" +
                    "on b.category_id = c.id" +
                    "where c.code = "+category;
            ResultSet resultSet = statement.executeQuery(select);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void insert(Book book) {

    }

    @Override
    public void delete(int id) {

    }
}
