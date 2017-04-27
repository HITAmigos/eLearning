package cn.tjcu.service;

import java.util.List;

import cn.tjcu.entity.Food;
public interface FoodService {
	public void saveFood(Food food);		//添加美食信息
	public void deleteFood(int fid);		//删除美食信息
	public void updateFood(Food food);		//更新美食信息学
	public Food findFoodById(int fid);		//按id查找美食信息
	public List<Food> findAll();			//查找全部美食信息
}
