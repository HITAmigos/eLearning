package cn.tjcu.service;

import java.util.List;

import cn.tjcu.entity.EnglishLearning;
public interface EnglishLearningService {
	public void saveEnglish(EnglishLearning english);		//���Ӣ����Ϣ
	public void deleteEnglish(int eid);						//ɾ��Ӣ����Ϣ
	public void updateEnglish(EnglishLearning english);		//����Ӣ����Ϣ
	public EnglishLearning findEnglishById(int eid);		//��id����Ӣ����Ϣ
	public List<EnglishLearning> findAll();					//����ȫ��Ӣ����Ϣ
}
