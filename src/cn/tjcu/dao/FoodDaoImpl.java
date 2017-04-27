package cn.tjcu.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.tjcu.entity.Food;



public class FoodDaoImpl implements FoodDao {
	
	
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(Food food) {
		hibernateTemplate.save(food);
		
	}

	@Override
	public void delete(int fid) {
		hibernateTemplate.delete(findById(fid));
		
	}

	@Override
	public void update(Food food) {
		hibernateTemplate.update(food);
		
	}

	@Override
	public Food findById(int fid) {
		Food food = hibernateTemplate.get(Food.class, fid);
		return food;
	}

	@Override
	public List<Food> findAll() {
		String query = "from Food";
		List<Food> list = (List<Food>) hibernateTemplate.find(query);
		return list;
	}




	


}
