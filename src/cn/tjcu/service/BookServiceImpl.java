package cn.tjcu.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.tjcu.dao.BookDao;
import cn.tjcu.dao.FoodDao;
import cn.tjcu.entity.Book;
import cn.tjcu.entity.Food;

@Transactional
public class BookServiceImpl implements BookService {
	
	
	private BookDao bookDao;
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	@Override
	public void saveBook(Book book) {
		bookDao.save(book);
		
	}
	@Override
	public void deleteBook(int bid) {
		bookDao.delete(bid);
		
	}
	@Override
	public void updateBook(Book book) {
		bookDao.update(book);
		
	}
	@Override
	public Book findBookById(int bid) {
		Book book = bookDao.findById(bid);
		return book;
	}
	@Override
	public List<Book> findAll() {
		List<Book> list = bookDao.findAll();
		return list;
	}
	
	


}
