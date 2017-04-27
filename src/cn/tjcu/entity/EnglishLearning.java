package cn.tjcu.entity;

import java.util.Date;

public class EnglishLearning {
	private int eid;		//英语信息id
	private String econtent;//英语信息内容
	private String ename;	//英语信息标题
	private Date edate;		//英语信息发布时间
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
