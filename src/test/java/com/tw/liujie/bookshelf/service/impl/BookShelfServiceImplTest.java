package com.tw.liujie.bookshelf.service.impl;

import com.tw.liujie.bookshelf.domain.Book;
import com.tw.liujie.bookshelf.domain.BookStatus;
import com.tw.liujie.bookshelf.domain.EBook;
import com.tw.liujie.bookshelf.domain.PaperyBook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BookShelfServiceImplTest {
private BookShelfServiceImpl bookShelfService;
    @Before
    public void setUp() throws Exception {
     bookShelfService = new BookShelfServiceImpl();
    }
    @After
    public void tearDown() throws Exception{

    }

    @Test
    public void should_borrow_book_by_isbn() throws Exception {
        //GIVEN
        List<String> authorList = new ArrayList<String>();
        authorList.add("author_1");
        bookShelfService.addBook(new EBook("isbn_1","title_1",new BigDecimal(23.5),authorList,"/EBook/Computer/title_1"));
        //WHEN
        Book borrowBook = bookShelfService.borrowBook("isbn_1");
        //THEN
        assertThat(borrowBook.getIsbn(),is("isbn_1"));
    }

    @Test
    public void should_borrowed_PaperyBook_and_change_status() throws Exception {
        //GIVEN
        List<String> authorList = new ArrayList<String>();
        authorList.add("author_1");
        bookShelfService.addBook(new PaperyBook("isbn_1","title_1",new BigDecimal(23.5),authorList,BookStatus.BORROWABLE));
        //WHEN
        Book borrowBook = bookShelfService.borrowBook("isbn_1");
        //THEN
        assertThat(((PaperyBook)borrowBook).getStatus(),is(BookStatus.BORROWED));
    }

    @Test
    public void should_borrowed_EBook_multiTimes() throws Exception {
        //GIVEN
        List<String> authorList = new ArrayList<String>();
        authorList.add("author_1");
        bookShelfService.addBook(new EBook("isbn_1","title_1",new BigDecimal(23.5),authorList,"/EBook/Computer/title_1"));
        //WHEN
        bookShelfService.borrowBook("isbn_1");
        //THEN
        assertNotNull(bookShelfService.borrowBook("isbn_1"));
    }

    @Test
    public void should_query_book_by_name() throws Exception {
        //GIVEN
        String bookName = "title";
        List<String> authorList = new ArrayList<String>();
        authorList.add("author_1");
        bookShelfService.addBook(new EBook("isbn_1","title_1",new BigDecimal(23.5),authorList,"/EBook/Computer/title_1"));
        //WHEN
        List<Book> bookList = bookShelfService.queryBookByName(bookName);
        //THEN
        boolean result = true;
        for(Book book  :bookList){
            if(!book.getName().contains("title")){
                result = false;
                break;
            }
        }
        assertThat(result,is(true));
    }

    @Test
    public void should_add_book() throws Exception {
        //GIVEN
        List<String> authorList = new ArrayList<String>();
        authorList.add("author_1");
        Book book = new EBook("isbn_1","title_1",new BigDecimal(23.5),authorList,"/EBook/Computer/title_1");
        //WHEN
        boolean result = bookShelfService.addBook(book);
        //THEN
        assertThat(result,is(true));
    }

    @Test
    public void should_query_all_ebook_names() throws Exception {
        //GIVEN
        List<String> authorList = new ArrayList<String>();
        authorList.add("author_1");
        bookShelfService.addBook(new EBook("isbn_1","title_1",new BigDecimal(23.5),authorList,"/EBook/Computer/title_1"));
        //WHEN
        Map<String,Book> bookMap = bookShelfService.queryAllEBookNames();
        //THEN
        Set<Map.Entry<String,Book>> entrySet = bookMap.entrySet();
        Iterator<Map.Entry<String,Book>> iterator =  entrySet.iterator();
        boolean result = true;
        while(iterator.hasNext()){
            Map.Entry<String,Book> entry = iterator.next();
            Book book = entry.getValue();
            if(!(book instanceof EBook)){
                result = false;
                break;
            }
        }
        assertThat(result,is(true));
    }

}