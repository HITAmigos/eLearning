package cn.tjcu.entity;

public class Book {
	private int bid;			//�鼮id
	private String bname;		//�鼮��
	private String bdescription;//�鼮����
	private String bimg;		//�鼮ͼƬ
	private String author;		//�鼮����
	private float price;		//�鼮����
	private String address;		//�����ַ
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBdescription() {
		return bdescription;
	}
	public void setBdescription(String bdescription) {
		this.bdescription = bdescription;
	}
	
	
	
	public String getBimg() {
		return bimg;
	}
	public void setBimg(String bimg) {
		this.bimg = bimg;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
