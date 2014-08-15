package com.tw.liujie.bookshelf.service.impl;

import com.tw.liujie.bookshelf.domain.Book;
import com.tw.liujie.bookshelf.service.BookShelfService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by jjliu on 8/15/14.
 */
public class BookShelfServiceImpl implements BookShelfService{

    private List<Book> bookRepos=new ArrayList<Book>();

    public Book borrowBook(String bookIsbn) {
        return null;
    }

    public List<Book> queryBookByName(String bookName) {
        //
        return null;
    }

    public boolean addBook(Book book) {
        return false;
    }

    public Map<String, Book> queryAllEBookNames() {
        return null;
    }
}
