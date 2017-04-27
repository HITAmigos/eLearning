package cn.tjcu.service;

import java.util.List;

import cn.tjcu.entity.FindJob;
public interface FindJobService {
	public void saveJob(FindJob job);			//添加工作
	public List<FindJob> getJob(String jname);		//按工作名查找用户
	public void deleteJob(int jid);				//删除用户
	public void updateJob(FindJob job);		//更新工作
	public FindJob findJobById(int jid);		//按id查找工作
	public List<FindJob> findAll();				//查找全部工作信息
}
