package members;

import java.sql.Date;

public class MemberVO {
	private String id;
	private String pwd;
	private String name;
	private String sex;
	private int age;
	
	
	public MemberVO() {
		System.out.println("MemberVO 생성자 호출");
	}



	public MemberVO(String id, String pwd, String name, String sex, int age) {
		super();
		this.id = id;
		this.pwd = pwd;
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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
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
