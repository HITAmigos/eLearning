package cn.tjcu.service;

import java.util.List;
import cn.tjcu.entity.Question;
public interface QuestionService {
	public void saveQuestion(Question question);		//�������
	public void deleteQuestion(int qid);				//ɾ������
	public void updateQuestion(Question question);		//��������
	public Question findQuestionById(int qid);			//��id��������
	public List<Question> findAll();					//����ȫ��������Ϣ
}
