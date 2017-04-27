package cn.tjcu.dao;

import java.util.List;

import cn.tjcu.entity.Book;
import cn.tjcu.entity.Food;


public interface BookDao {
	public void save(Book book);			//����鼮��Ϣ
	public void delete(int bid);			//ɾ���鼮��Ϣ
	public void update(Book book);			//�����鼮��Ϣ
	public Book findById(int bid);			//��id�����鼮��Ϣ
	public List<Book> findAll();			//����ȫ���鼮��Ϣ

}
