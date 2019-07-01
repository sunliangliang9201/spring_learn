package com.sunll.di;

public class BookServiceImpl implements BookService{

    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void add() {
        bookDao.add();
    }
}
