package cn.tjcu.entity;

import java.util.Date;

public class Food {
	private int fid;				//��ʳid
	private String fname;			//��ʳ��
	private String fimg;			//��ʳͼƬ·��
	private String fdescription;	//��ʳ����
	private int uid;				//�������û�id
	private Date fdate;				//��������
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFimg() {
		return fimg;
	}
	public void setFimg(String fimg) {
		this.fimg = fimg;
	}
	
	public String getFdescription() {
		return fdescription;
	}
	public void setFdescription(String fdescription) {
		this.fdescription = fdescription;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public Date getFdate() {
		return fdate;
	}
	public void setFdate(Date fdate) {
		this.fdate = fdate;
	}
	
	
	
}
