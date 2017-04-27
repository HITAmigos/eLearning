package cn.tjcu.service;

import java.util.List;
import cn.tjcu.entity.User;

public interface UserService {
	public void saveUser(User user);		//����û�
	public User getUser(String name);		//���û��������û�
	public void deleteUser(int id);			//ɾ���û�
	public void updateUser(User user);		//�����û�
	public User findUserById(int id);		//��id�����û�
	public List<User> findAll();			//����ȫ���û�
}
