package cn.tjcu.service;

import java.util.List;

import cn.tjcu.entity.FindJob;
public interface FindJobService {
	public void saveJob(FindJob job);			//��ӹ���
	public List<FindJob> getJob(String jname);		//�������������û�
	public void deleteJob(int jid);				//ɾ���û�
	public void updateJob(FindJob job);		//���¹���
	public FindJob findJobById(int jid);		//��id���ҹ���
	public List<FindJob> findAll();				//����ȫ��������Ϣ
}
