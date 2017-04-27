package cn.tjcu.service;

import java.util.List;
import cn.tjcu.entity.Question;
public interface QuestionService {
	public void saveQuestion(Question question);		//添加问题
	public void deleteQuestion(int qid);				//删除问题
	public void updateQuestion(Question question);		//更新问题
	public Question findQuestionById(int qid);			//按id查找问题
	public List<Question> findAll();					//查找全部问题信息
}
