package cn.tjcu.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	static Configuration cfg = null;
	static SessionFactory sessionFactory = null;
	//静态代码块实现,只在该类加载时 加载一次
	static {
		//加载核心配置文件
		cfg = new Configuration();
		cfg.configure();
		sessionFactory = cfg.buildSessionFactory();
		
	}
	
	//提供返回与本地线程绑定的session方法
	public static Session getSessionObject(){
		
		return sessionFactory.getCurrentSession();
	}
	
	//提供方法放sessionFactory
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
		
	}
	public static void main(String[] args) {
		
	}
}
