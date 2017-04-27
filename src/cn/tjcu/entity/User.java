package cn.tjcu.entity;

import java.util.Set;

public class User {

	private int uid; // �û�id
	private String username; // �û���
	private String password; // ����
	private String sex; // �Ա�
	private int type; // ���� 0���û���1������Ա
	private String qq; // qq��ϵ��ʽ
	private String nickname; // �ǳ�
	private Set<Food> setFood; // ��ʳ

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Set<Food> getSetFood() {
		return setFood;
	}

	public void setSetFood(Set<Food> setFood) {
		this.setFood = setFood;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", sex=" + sex + ", type="
				+ type + ", qq=" + qq + ", nickname=" + nickname + ", setFood=" + setFood + "]";
	}
}
