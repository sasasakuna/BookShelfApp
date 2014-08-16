package com.tw.liujie.bookshelf.service.impl;

import com.tw.liujie.bookshelf.domain.Book;
import com.tw.liujie.bookshelf.domain.BookStatus;
import com.tw.liujie.bookshelf.domain.EBook;
import com.tw.liujie.bookshelf.domain.PaperyBook;
import com.tw.liujie.bookshelf.service.BookShelfService;

import java.util.*;

/**
 * Created by jjliu on 8/15/14.
 */
public class BookShelfServiceImpl implements BookShelfService{

    private List<Book> bookRepos=new ArrayList<Book>();

    public Book borrowBook(String bookIsbn) {
        Book result = null;
        for(Book book : bookRepos){
            if(book.getIsbn().equals(bookIsbn)){
                if((book instanceof PaperyBook && ((PaperyBook) book).getStatus().equals(BookStatus.BORROWABLE)))
                {
                    ((PaperyBook)book).setStatus(BookStatus.BORROWED);
                }
                result = book;

                break;
            }
        }
        return result;
    }


    public List<Book> queryBookByName(String bookName) {
        List<Book> bookList = new ArrayList<Book>();
        for(Book book : bookRepos){
            if(book.getName().contains(bookName)){
                bookList.add(book);
            }
        }
        Collections.sort(bookList, new Comparator<Book>(){
            public int compare(Book o1, Book o2) {
                return o1.getIsbn().compareTo(o2.getIsbn());
            }
        });
        return bookList;
    }

    public boolean addBook(Book book) {
        boolean result = false;
        result = bookRepos.add(book);
        return result;
    }

    public Map<String, Book> queryAllEBookNames() {
        Map<String,Book> bookMap = new HashMap<String, Book>();
        for(Book book : bookRepos){
            if(book instanceof EBook){
                bookMap.put(book.getName(),book);
            }
        }
        return bookMap;
    }
}
