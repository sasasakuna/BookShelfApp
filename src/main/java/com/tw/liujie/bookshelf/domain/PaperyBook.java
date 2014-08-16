package com.tw.liujie.bookshelf.domain;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by jjliu on 8/15/14.
 */
public class PaperyBook extends Book {


    private BookStatus status;

    public PaperyBook(String isbn, String name, BigDecimal price, List<String> authors, BookStatus status){
        super(isbn,name,price,authors);
        this.status = status;
    }

    @Override
    String getLocation() {
        return null;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }
}
