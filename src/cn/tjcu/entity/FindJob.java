package cn.tjcu.entity;

import java.util.Date;

public class FindJob {
	
	private int jid;			//工作信息id
	private String jname;		//工作信息标题
	private String jcontent;	//工作信息内容
	private Date jdate;			//发布日期
	public int getJid() { 
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	public String getJcontent() {
		return jcontent;
	}
	public void setJcontent(String jcontent) {
		this.jcontent = jcontent;
	}
	public Date getJdate() {
		return jdate;
	}
	public void setJdate(Date jdate) {
		this.jdate = jdate;
	}			
	
	
	

}
