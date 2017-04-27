package cn.tjcu.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.tjcu.entity.User;

public class UserDaoImpl implements UserDao {
	private HibernateTemplate hibernateTemplate;
	private UserDao userDao;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(User user) {
		hibernateTemplate.save(user);	

	}

	@Override
	public User getUser(String username) {
		
		return null;
		
	}

	@Override
	public void delete(int id) {
		hibernateTemplate.delete(findById(id));

	}

	@Override
	public void update(User user) {
		hibernateTemplate.update(user);

	}

	@Override
	public User findById(int id) {
		User user=(User)hibernateTemplate.get(User.class, id);
		return user;
	}

	@Override
	public List<User> findAll() {
		String queryString = "from User";
		List<User> list = (List<User>) hibernateTemplate.find(queryString);
		return list;
	}


}
