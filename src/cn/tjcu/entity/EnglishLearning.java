package cn.tjcu.entity;

import java.util.Date;

public class EnglishLearning {
	private int eid;		//Ӣ����Ϣid
	private String econtent;//Ӣ����Ϣ����
	private String ename;	//Ӣ����Ϣ����
	private Date edate;		//Ӣ����Ϣ����ʱ��
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEcontent() {
		return econtent;
	}
	public void setEcontent(String econtent) {
		this.econtent = econtent;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getEdate() {
		return edate;
	}
	public void setEdate(Date edate) {
		this.edate = edate;
	}

	
	

}
