package cn.tjcu.dao;

import java.util.List;

import cn.tjcu.entity.EnglishLearning;
import cn.tjcu.entity.FindJob;


public interface EnglishLearningDao {
	public void save(EnglishLearning english);					//���Ӣ����Ϣ
	public void delete(int eid);					//ɾ������
	public void update(EnglishLearning english);				//����Ӣ����Ϣ
	public EnglishLearning findById(int eid);				//��id����Ӣ����Ϣ
	public List<EnglishLearning> findAll();					//����ȫ��Ӣ����Ϣ

}
