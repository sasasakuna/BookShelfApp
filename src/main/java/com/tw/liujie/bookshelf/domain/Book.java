package com.tw.liujie.bookshelf.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by jjliu on 8/15/14.
 */
public abstract class Book implements Serializable{
    private String isbn;
    private String name;
    private BigDecimal price;
    private List<String> authors;
    private BookStatus status;

    abstract String getLocation();

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }
}
