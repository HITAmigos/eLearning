package cn.tjcu.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.tjcu.dao.FindJobDao;
import cn.tjcu.dao.UserDao;
import cn.tjcu.entity.FindJob;
import cn.tjcu.entity.User;
@Transactional
public class FindJobServiceImpl implements FindJobService {
	
	//用于FindJobDao的注入
	private FindJobDao findJobDao;

	public void setFindJobDao(FindJobDao findJobDao) {
		this.findJobDao = findJobDao;
	}

	@Override
	public void saveJob(FindJob job) {
		findJobDao.save(job);
		
	}

	@Override
	public List<FindJob> getJob(String jname) {
		List<FindJob> list = findJobDao.getJob(jname);
		return list;
	}

	@Override
	public void deleteJob(int jid) {
		findJobDao.delete(jid);
		
	}

	@Override
	public void updateJob(FindJob job) {
		findJobDao.update(job);
		
	}

	@Override
	public FindJob findJobById(int jid) {
		FindJob job = findJobDao.findById(jid);
		return job;
	}

	@Override
	public List<FindJob> findAll() {
		List<FindJob> list = findJobDao.findAll();
		return list;

	}
	



}
