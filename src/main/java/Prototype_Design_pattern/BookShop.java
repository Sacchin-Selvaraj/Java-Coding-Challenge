package Prototype_Design_pattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{

    private String bookShop;
    List<Book> books=new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getBookShop() {
        return bookShop;
    }

    public void setBookShop(String bookShop) {
        this.bookShop = bookShop;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "bookShop='" + bookShop + '\'' +
                ", books=" + books +
                '}';
    }

    public void loadData(){
        for (int i = 0; i < 5; i++) {
            Book book=new Book();
            book.setBookId(i);
            book.setBookName("book "+i);
            getBooks().add(book);
        }
    }
    @Override
    public BookShop clone() {
        try {
            return (BookShop) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
