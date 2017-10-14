package com.epam.wl.services;

import com.epam.wl.DBHelper;
import com.epam.wl.dao.BookDAO;
import com.epam.wl.entities.Book;
import com.epam.wl.entities.User;
import com.epam.wl.enums.UserRole;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestBookService {
    static DataSource dataSource = DBHelper.getEmbeddedDatabase();
    static BookDAO bookDAO = new BookDAO(dataSource);

    public static List<Book> getBooks() {
        List<Book> bookList = null;
        try {
            bookList = bookDAO.getAllBooks();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookList;
    }

}