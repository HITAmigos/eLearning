package cn.tjcu.dao;

import java.util.List;

import cn.tjcu.entity.Question;



public interface QuestionDao {
	public void save(Question question);					//添加问题
	public void delete(int qid);							//删除问题
	public void update(Question question);					//更新问题
	public Question findById(int qid);						//按id查找问题
	public List<Question> findAll();						//查找全部问题

}
