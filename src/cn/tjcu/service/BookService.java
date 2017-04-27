package cn.tjcu.service;

import java.util.List;

import cn.tjcu.entity.Book;
public interface BookService {
	public void saveBook(Book book);		//�����ʳ��Ϣ
	public void deleteBook(int bid);		//ɾ����ʳ��Ϣ
	public void updateBook(Book book);		//������ʳ��Ϣѧ
	public Book findBookById(int bid);		//��id������ʳ��Ϣ
	public List<Book> findAll();			//����ȫ����ʳ��Ϣ
}
