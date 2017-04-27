package cn.tjcu.dao;

import java.util.List;

import cn.tjcu.entity.Book;
import cn.tjcu.entity.Food;


public interface BookDao {
	public void save(Book book);			//添加书籍信息
	public void delete(int bid);			//删除书籍信息
	public void update(Book book);			//更新书籍信息
	public Book findById(int bid);			//按id查找书籍信息
	public List<Book> findAll();			//查找全部书籍信息

}
