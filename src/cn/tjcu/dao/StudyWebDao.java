package cn.tjcu.dao;

import java.util.List;

import cn.tjcu.entity.EnglishLearning;
import cn.tjcu.entity.FindJob;
import cn.tjcu.entity.StudyWeb;


public interface StudyWebDao {
	public void save(StudyWeb studyWeb);			//添加学习网站
	public void delete(int wid);					//删除学习网站
	public void update(StudyWeb studyWeb);			//更新学习网站
	public StudyWeb findById(int wid);				//按id查找学习网站
	public List<StudyWeb> findAll();				//查找全部学习网站

}
