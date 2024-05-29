package com.pojo;

public class Book {
    private String isbn;
    private String bname;
    private String author;

    public Book() {
    }

    public Book(String isbn, String bname, String author) {
        super();
        this.isbn = isbn;
        this.bname = bname;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
