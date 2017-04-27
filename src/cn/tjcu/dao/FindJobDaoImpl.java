package cn.tjcu.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.tjcu.entity.FindJob;

import cn.tjcu.utils.HibernateUtils;

public class FindJobDaoImpl implements FindJobDao {
	
	
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Override
	public void save(FindJob job) {
		hibernateTemplate.save(job);
		
	}
	
	//条件查询
	@Override
	public List<FindJob> getJob(String jname) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		try {
			sessionFactory = hibernateTemplate.getSessionFactory();
			session = sessionFactory.openSession();
			
			tx = session.beginTransaction();
			
			//1 创建对象
			Criteria criteria = session.createCriteria(FindJob.class);			
			//排序查询
			criteria.add(Restrictions.like("jname", "%"+jname+"%"));		
			//调用方法得到结果
			List<FindJob> list = criteria.list();
			for (FindJob job : list) {
				System.out.println( "shuchu"+job.getJid()+"::"+job.getJname());
			}
			
			tx.commit();
			return list;
		} catch (Exception e) {
			tx.rollback();
		}finally{
			session.close();
			sessionFactory.close();
	
		}
		return null;
	}
	
	@Override
	public void delete(int jid) {
		hibernateTemplate.delete(findById(jid));
		
	}
	@Override
	public void update(FindJob job) {
		hibernateTemplate.update(job);
		
	}
	@Override
	public FindJob findById(int jid) {
		FindJob job = hibernateTemplate.get(FindJob.class, jid);
		return job;
	}
	@Override
	public List<FindJob> findAll() {
		String queryString = "from FindJob";
		List<FindJob> list = (List<FindJob>) hibernateTemplate.find(queryString);
		return list;
	}




}
