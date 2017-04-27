package cn.tjcu.service;

import java.util.List;
import cn.tjcu.entity.User;

public interface UserService {
	public void saveUser(User user);		//添加用户
	public User getUser(String name);		//按用户名查找用户
	public void deleteUser(int id);			//删除用户
	public void updateUser(User user);		//更新用户
	public User findUserById(int id);		//按id查找用户
	public List<User> findAll();			//查找全部用户
}
