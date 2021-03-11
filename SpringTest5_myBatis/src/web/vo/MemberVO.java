package web.vo;

import java.util.Date;

public class MemberVO {
	
	private String id, pw, name, subject;
	private Date date;
	
	
	public MemberVO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	

	
	public MemberVO(String id, String pw, String name, String subject, Date date) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.subject = subject;
		this.date = date;
	}



	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", subject=" + subject + ", date=" + date
				+ ", getId()=" + getId() + ", getPw()=" + getPw() + ", getName()=" + getName() + ", getSubject()="
				+ getSubject() + ", getDate()=" + getDate() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
