package com.tw.liujie.bookshelf.domain;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by jjliu on 8/15/14.
 */
public class EBook extends Book {
    private String location;

    public EBook(String isbn, String name, BigDecimal price, List<String> authors, String location){
        super(isbn,name,price,authors);
        this.location = location;
    }
    @Override
    String getLocation() {
        return null;
    }
}
