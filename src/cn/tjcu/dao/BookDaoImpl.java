package cn.tjcu.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.tjcu.entity.Book;



public class BookDaoImpl implements BookDao {
	
	
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(Book book) {
		hibernateTemplate.save(book);
		
	}

	@Override
	public void delete(int bid) {
		hibernateTemplate.delete(findById(bid));
		
	}

	@Override
	public void update(Book book) {
		hibernateTemplate.update(book);
		
	}

	@Override
	public Book findById(int bid) {
		Book book = hibernateTemplate.get(Book.class, bid);
		return book;
	}

	@Override
	public List<Book> findAll() {
		String query = "from Book";
		List<Book> list = (List<Book>) hibernateTemplate.find(query);
		return list;
	}

	

}
