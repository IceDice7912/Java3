package web.vo;

import java.util.Date;

public class MemberVO {
	
	private String id,pw,name,subject;
	
	
		
	public MemberVO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public MemberVO(String id, String pw, String name, String subject) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.subject = subject;
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

	
	
	

}
