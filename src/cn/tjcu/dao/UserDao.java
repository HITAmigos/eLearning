package cn.tjcu.dao;

import java.util.List;

import cn.tjcu.entity.User;

public interface UserDao {
	public void save(User user);				//����û�
	public User getUser(String username);	//���û��������û�
	public void delete(int id);					//ɾ���û�
	public void update(User user);				//�����û�
	public User findById(int id);				//��id�����û�
	public List<User> findAll();				//����ȫ���û�

}
