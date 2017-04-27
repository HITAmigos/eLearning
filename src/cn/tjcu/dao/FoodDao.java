package cn.tjcu.dao;

import java.util.List;

import cn.tjcu.entity.Food;


public interface FoodDao {
	public void save(Food food);			//�����ʳ��Ϣ
	public void delete(int fid);			//ɾ����ʳ��Ϣ
	public void update(Food food);			//������ʳ��Ϣ
	public Food findById(int fid);			//��id������ʳ��Ϣ
	public List<Food> findAll();			//����ȫ����ʳ��Ϣ

}
