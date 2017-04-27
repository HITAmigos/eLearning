package cn.tjcu.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import cn.tjcu.entity.Question;

public class QustionDaoImpl implements QuestionDao {
	
	
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(Question question) {
		hibernateTemplate.save(question);
		
	}

	@Override
	public void delete(int qid) {
		hibernateTemplate.delete(findById(qid));
		
	}

	@Override
	public void update(Question question) {
		hibernateTemplate.update(question);
		
	}

	@Override
	public Question findById(int qid) {
		Question question = hibernateTemplate.get(Question.class, qid);
		return question;
	}

	@Override
	public List<Question> findAll() {
		String queryString = "from Question";
		List<Question> list = (List<Question>) hibernateTemplate.find(queryString);
		return list;
	}



}
