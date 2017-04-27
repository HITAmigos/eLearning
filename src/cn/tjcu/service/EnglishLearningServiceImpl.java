package cn.tjcu.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.tjcu.dao.EnglishLearningDao;
import cn.tjcu.entity.EnglishLearning;

@Transactional
public class EnglishLearningServiceImpl implements EnglishLearningService {
	
	
	private EnglishLearningDao englishLearningDao;
	public void setEnglishLearningDao(EnglishLearningDao englishLearningDao) {
		this.englishLearningDao = englishLearningDao;
	}


	@Override
	public void saveEnglish(EnglishLearning english) {
		englishLearningDao.save(english);
		
	}


	@Override
	public void deleteEnglish(int eid) {
		englishLearningDao.delete(eid);
		
	}


	@Override
	public void updateEnglish(EnglishLearning english) {
		englishLearningDao.update(english);
		
	}


	@Override
	public EnglishLearning findEnglishById(int eid) {
		EnglishLearning english = englishLearningDao.findById(eid);
		return english;
	}


	@Override
	public List<EnglishLearning> findAll() {
		List<EnglishLearning> list = englishLearningDao.findAll();
		return list;
	}

	

	



}
