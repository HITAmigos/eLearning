package cn.tjcu.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.tjcu.dao.FindJobDao;
import cn.tjcu.dao.QuestionDao;
import cn.tjcu.dao.UserDao;
import cn.tjcu.entity.FindJob;
import cn.tjcu.entity.Question;
import cn.tjcu.entity.User;
@Transactional
public class QuestionServiceImpl implements QuestionService {
	
	
	private QuestionDao questionDao;
	

	public void setQuestionDao(QuestionDao questionDao) {
		this.questionDao = questionDao;
	}

	@Override
	public void saveQuestion(Question question) {
		questionDao.save(question);
		
	}

	@Override
	public void deleteQuestion(int qid) {
		questionDao.delete(qid);
		
	}

	@Override
	public void updateQuestion(Question question) {
		questionDao.update(question);
		
	}

	@Override
	public Question findQuestionById(int qid) {
	Question question =	questionDao.findById(qid);
		return question;
	}

	@Override
	public List<Question> findAll() {
		List<Question> list = questionDao.findAll();
		return list;
	}


	



}
