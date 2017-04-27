package cn.tjcu.service;

import java.util.List;

import cn.tjcu.entity.Book;
public interface BookService {
	public void saveBook(Book book);		//添加美食信息
	public void deleteBook(int bid);		//删除美食信息
	public void updateBook(Book book);		//更新美食信息学
	public Book findBookById(int bid);		//按id查找美食信息
	public List<Book> findAll();			//查找全部美食信息
}
