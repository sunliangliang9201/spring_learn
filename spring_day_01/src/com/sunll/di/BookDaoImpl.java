package com.sunll.di;

public class BookDaoImpl implements BookDao {

	@Override
	public void save() {
		System.out.println("di  add book");
	}

}
