package cn.tjcu.service;

import java.util.List;

import cn.tjcu.entity.StudyWeb;
public interface StudyWebService {
	public void saveStudyWeb(StudyWeb studyWeb);		//���ѧϰ��վ��Ϣ
	public void deleteStudyWeb(int wid);				//ɾ��ѧϰ��վ
	public void updateStudyWeb(StudyWeb studyWeb);		//����ѧϰ��վ
	public StudyWeb findStudyWebById(int wid);			//��id����ѧϰ��վ
	public List<StudyWeb> findAll();					//����ȫ��ѧϰ��վ
}
