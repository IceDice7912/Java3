package test2.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import my.service.MemberService;

public class TestMember {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("member.xml"));
		MemberService service=(MemberService) factory.getBean("memberService");
		service.listMembers();
	} 
}
