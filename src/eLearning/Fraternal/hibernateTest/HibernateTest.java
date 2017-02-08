package eLearning.Fraternal.hibernateTest;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import eLearning.Fraternal.entity.User;
import eLearning.Fraternal.utils.HibernateUtils;

public class HibernateTest {
	//���һ������
	@Test
	public void add(){
		
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		
		try {
			//��ʼ����
			sessionFactory = HibernateUtils.getSessionFactory();
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
			//ҵ�����
			User user = new User();
			user.setUserNmae("kuang");
			user.setAccount("123");
			user.setPassword("110");
			
			session.save(user);
			
			
			
			
			//�ύ����
			tx.commit();
			
		} catch (Exception e) {
			tx.rollback();
		}
		
	}

}
