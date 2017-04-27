package cn.tjcu.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.tjcu.dao.FoodDao;
import cn.tjcu.entity.Food;

@Transactional
public class FoodServiceImpl implements FoodService {
	
	
	private FoodDao foodDao;
	public void setFoodDao(FoodDao foodDao) {
		this.foodDao = foodDao;
	}
	@Override
	public void saveFood(Food food) {
		foodDao.save(food);
		
	}
	@Override
	public void deleteFood(int fid) {
		foodDao.delete(fid);
		
	}
	@Override
	public void updateFood(Food food) {
		foodDao.update(food);
		
	}
	@Override
	public Food findFoodById(int fid) {
	Food food =	foodDao.findById(fid);
		return food;
	}
	@Override
	public List<Food> findAll() {
		List<Food> list = foodDao.findAll();
		return list;
	}

	


}
