package cn.tjcu.service;

import java.util.List;

import cn.tjcu.entity.Food;
public interface FoodService {
	public void saveFood(Food food);		//�����ʳ��Ϣ
	public void deleteFood(int fid);		//ɾ����ʳ��Ϣ
	public void updateFood(Food food);		//������ʳ��Ϣѧ
	public Food findFoodById(int fid);		//��id������ʳ��Ϣ
	public List<Food> findAll();			//����ȫ����ʳ��Ϣ
}
