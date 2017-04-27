package cn.tjcu.dao;

import java.util.List;

import cn.tjcu.entity.User;

public interface UserDao {
	public void save(User user);				//添加用户
	public User getUser(String username);	//按用户名查找用户
	public void delete(int id);					//删除用户
	public void update(User user);				//更新用户
	public User findById(int id);				//按id查找用户
	public List<User> findAll();				//查找全部用户

}
