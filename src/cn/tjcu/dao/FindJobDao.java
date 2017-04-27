package cn.tjcu.dao;

import java.util.List;

import cn.tjcu.entity.FindJob;


public interface FindJobDao {
	public void save(FindJob job);					//添加工作
	public List<FindJob> getJob(String jname);			//按工作名查找工作
	public void delete(int jid);					//删除工作
	public void update(FindJob job);				//更新工作
	public FindJob findById(int jid);				//按id查找工作
	public List<FindJob> findAll();					//查找全部工作

}
