package cn.tjcu.service;

import java.util.List;

import cn.tjcu.entity.StudyWeb;
public interface StudyWebService {
	public void saveStudyWeb(StudyWeb studyWeb);		//添加学习网站信息
	public void deleteStudyWeb(int wid);				//删除学习网站
	public void updateStudyWeb(StudyWeb studyWeb);		//更新学习网站
	public StudyWeb findStudyWebById(int wid);			//按id查找学习网站
	public List<StudyWeb> findAll();					//查找全部学习网站
}
