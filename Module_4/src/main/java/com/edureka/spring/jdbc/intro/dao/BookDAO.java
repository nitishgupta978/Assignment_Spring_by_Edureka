package com.edureka.spring.jdbc.intro.dao;


import com.edureka.spring.jdbc.intro.bean.Book;

/**
 * @author nitish.gupta_spicemo
 */
public interface BookDAO {
	public void saveBook(Book book);
	public void modifyBook(Book book);
	public void removeBook(Book book);
}
