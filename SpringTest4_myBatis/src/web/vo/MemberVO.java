package web.vo;

import java.util.Date;

public class MemberVO {
	
	private String id, name, subject, pw;
		
	public MemberVO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public MemberVO(String id, String pw, String sb, String pw1) {
		super();
		this.id = id;
		this.name = name;
		this.subject = sb;
		this.pw = pw1;
	}
	
	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public MemberVO(String name2) {
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
	public String pw() {
		return pw;
	}
	public void setpw(String pw) {
		this.pw = pw;
	}
}