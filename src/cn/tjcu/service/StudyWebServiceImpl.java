package cn.tjcu.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.tjcu.dao.EnglishLearningDao;
import cn.tjcu.dao.StudyWebDao;
import cn.tjcu.entity.EnglishLearning;
import cn.tjcu.entity.StudyWeb;

@Transactional
public class StudyWebServiceImpl implements StudyWebService {
	
	
	private StudyWebDao studyWebDao;

	public void setStudyWebDao(StudyWebDao studyWebDao) {
		this.studyWebDao = studyWebDao;
	}

	@Override
	public void saveStudyWeb(StudyWeb studyWeb) {
		studyWebDao.save(studyWeb);
		
	}

	@Override
	public void deleteStudyWeb(int wid) {
		studyWebDao.delete(wid);
		
	}

	@Override
	public void updateStudyWeb(StudyWeb studyWeb) {
		studyWebDao.update(studyWeb);
		
	}

	@Override
	public StudyWeb findStudyWebById(int wid) {
		StudyWeb studyWeb = studyWebDao.findById(wid);
		return studyWeb;
	}

	@Override
	public List<StudyWeb> findAll() {
		List<StudyWeb> list = studyWebDao.findAll();
		return list;
	}


}
