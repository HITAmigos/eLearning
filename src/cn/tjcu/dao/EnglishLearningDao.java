package cn.tjcu.dao;

import java.util.List;

import cn.tjcu.entity.EnglishLearning;
import cn.tjcu.entity.FindJob;


public interface EnglishLearningDao {
	public void save(EnglishLearning english);					//添加英语信息
	public void delete(int eid);					//删除工作
	public void update(EnglishLearning english);				//更新英语信息
	public EnglishLearning findById(int eid);				//按id查找英语信息
	public List<EnglishLearning> findAll();					//查找全部英语信息

}
