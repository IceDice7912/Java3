package web.vo;

public class MemberVO {
	
	private String id, name, subject, pw;

	public MemberVO() {
		super();
		this.id=id;
		this.name=name;
		this.subject=subject;
		this.pw=pw;
	}
	
	
	

	public MemberVO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}




	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	
}
