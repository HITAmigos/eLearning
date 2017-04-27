package cn.tjcu.dao;

import java.util.List;

import cn.tjcu.entity.Food;


public interface FoodDao {
	public void save(Food food);			//添加美食信息
	public void delete(int fid);			//删除美食信息
	public void update(Food food);			//更新美食信息
	public Food findById(int fid);			//按id查找美食信息
	public List<Food> findAll();			//查找全部美食信息

}
