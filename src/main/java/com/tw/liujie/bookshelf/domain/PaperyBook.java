package com.tw.liujie.bookshelf.domain;

/**
 * Created by jjliu on 8/15/14.
 */
public class PaperyBook extends Book {
    private BookStatus status;

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
