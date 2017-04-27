package cn.tjcu.dao;

import java.util.List;

import cn.tjcu.entity.EnglishLearning;
import cn.tjcu.entity.FindJob;
import cn.tjcu.entity.StudyWeb;


public interface StudyWebDao {
	public void save(StudyWeb studyWeb);			//���ѧϰ��վ
	public void delete(int wid);					//ɾ��ѧϰ��վ
	public void update(StudyWeb studyWeb);			//����ѧϰ��վ
	public StudyWeb findById(int wid);				//��id����ѧϰ��վ
	public List<StudyWeb> findAll();				//����ȫ��ѧϰ��վ

}
