package cn.tjcu.dao;

import java.util.List;

import cn.tjcu.entity.FindJob;


public interface FindJobDao {
	public void save(FindJob job);					//��ӹ���
	public List<FindJob> getJob(String jname);			//�����������ҹ���
	public void delete(int jid);					//ɾ������
	public void update(FindJob job);				//���¹���
	public FindJob findById(int jid);				//��id���ҹ���
	public List<FindJob> findAll();					//����ȫ������

}
