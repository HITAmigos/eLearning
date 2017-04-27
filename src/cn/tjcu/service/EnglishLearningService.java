package cn.tjcu.service;

import java.util.List;

import cn.tjcu.entity.EnglishLearning;
public interface EnglishLearningService {
	public void saveEnglish(EnglishLearning english);		//添加英语信息
	public void deleteEnglish(int eid);						//删除英语信息
	public void updateEnglish(EnglishLearning english);		//更新英语信息
	public EnglishLearning findEnglishById(int eid);		//按id查找英语信息
	public List<EnglishLearning> findAll();					//查找全部英语信息
}
