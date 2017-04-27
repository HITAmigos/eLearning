package cn.tjcu.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import cn.tjcu.entity.EnglishLearning;


public class EnglishLearningDaoImpl implements EnglishLearningDao {
	
	
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(EnglishLearning english) {
		hibernateTemplate.save(english);
		
	}


	@Override
	public void delete(int eid) {
		hibernateTemplate.delete(findById(eid));
		
	}

	@Override
	public void update(EnglishLearning english) {
		hibernateTemplate.update(english);
		
	}

	@Override
	public EnglishLearning findById(int eid) {
	EnglishLearning english = hibernateTemplate.get(EnglishLearning.class, eid);
		return english;
	}

	@Override
	public List<EnglishLearning> findAll() {
		String query = "from EnglishLearning";
		List<EnglishLearning> list = (List<EnglishLearning>) hibernateTemplate.find(query);
		return list;
	}

	


}
