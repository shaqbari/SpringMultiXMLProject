package com.sist.multi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.user.UserMain;

/**
 * @author user
 *	main에서는 userMain에서 조립한걸 실행만 시킨다.
 *main에 로직이 들어가는 순간 재사용성이 떨어진다.
 *
 *	분리를 시켜야 객체지향적이 된다.	
 *
 *	달력
 *	====================
 *	1) 총날수(1.1.1.~현재)%7 요일
 *		   ============
 *		      윤년 
 *	둘의 기느을 다른 클래스에 따로 만든다.
 */
public class MainClass {
	private UserMain um;
	
	public void setUm(UserMain um) {
		this.um = um;
	}
	
	public static void main(String[] args) {
		String[] xml={"application-context.xml", "application-datasource.xml", "application-security.xml"};
		ApplicationContext app=new ClassPathXmlApplicationContext(xml);
		MainClass mc=(MainClass) app.getBean("mc");
		mc.um.display();
	
	}
}







