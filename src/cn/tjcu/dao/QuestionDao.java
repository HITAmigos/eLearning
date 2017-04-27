package cn.tjcu.dao;

import java.util.List;

import cn.tjcu.entity.Question;



public interface QuestionDao {
	public void save(Question question);					//�������
	public void delete(int qid);							//ɾ������
	public void update(Question question);					//��������
	public Question findById(int qid);						//��id��������
	public List<Question> findAll();						//����ȫ������

}
