package cn.tjcu.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import cn.tjcu.entity.StudyWeb;


public class StudyWebDaoImpl implements StudyWebDao {
	
	
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}



	@Override
	public void save(StudyWeb studyWeb) {
		hibernateTemplate.save(studyWeb);
		
	}



	@Override
	public void delete(int wid) {
		hibernateTemplate.delete(findById(wid));
		
	}



	@Override
	public void update(StudyWeb studyWeb) {
		hibernateTemplate.update(studyWeb);
		
	}



	@Override
	public StudyWeb findById(int wid) {
		StudyWeb studyWeb = hibernateTemplate.get(StudyWeb.class, wid);
		return studyWeb;
	}



	@Override
	public List<StudyWeb> findAll() {
		String query = "from StudyWeb";
		List<StudyWeb> list =  (List<StudyWeb>) hibernateTemplate.find(query);
		return list;
	}

	


}
