package web.util;

public class MemberVO {
	private String id;
	private String pw;
	private String name;
	private String sex;
	private int age;
	
	public MemberVO(String id, String pw, String name, String sex, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.sex = sex;
		this.age = age;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
