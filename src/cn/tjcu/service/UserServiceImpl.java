package cn.tjcu.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.tjcu.dao.UserDao;
import cn.tjcu.entity.User;
@Transactional
public class UserServiceImpl implements UserService {
	
	//用于UserDao的注入
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	@Override
	public void saveUser(User user) {
		userDao.save(user);

	}

	@Override
	public User getUser(String name) {
		User u = userDao.getUser(name);
		return u;
	}

	@Override
	public void deleteUser(int id) {
	 userDao.delete(id);

	}

	@Override
	public void updateUser(User user) {
		userDao.update(user);

	}

	@Override
	public User findUserById(int id) {
		User u = userDao.findById(id);
		return u;
	}

	@Override
	public List<User> findAll() {
		List<User> list = userDao.findAll();
		return list;
	}

}
