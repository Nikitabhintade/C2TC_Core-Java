package dao;
import java.util.List;

import entities.Book;


public interface BookDao {
	void commitTranscation();
	void beginTranscation();
	void addBook(Book book);
	Book getBookById(int id);
	List<Book> getBookByTitle(String title);
	Long getBookCount();
	List<Book> getAuthorBooks(String author);
	List<Book> getAllBooks();
	List<Book> getBooksInPriceRange(double low, double high);
}