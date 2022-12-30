package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

public class ClsService {
	// 클래스 접근제한자 확인하기
	
	public void ex1() {
		Student std = new Student();
		// public class인 Student는 import 가능
		
		
		//TextVo test = new TestVo();
		// default class인 TestVO는 import 불가 (다른 패키지여서)
		
		System.out.println(std.v1);
		// 다른 패키지에서도 접근 가능한 public만 에러가 없다
	}
	
	public void ex2() {
		// static 필드 확인 예제
		
		//학생 객체 2개 생성
		Student std1 = new Student();
		Student std2 = new Student();
		
		System.out.println(std1.schooLName);
		//public이기 때문에 직접 접근 가능
		
		//System.out.println(std1.name); // name이 private되어있어서 이건 불가
		
		System.out.println("변경 전 : " + std1.getName());
		std1.setName("김은진");
		System.out.println("변경 후 : " + std1.getName()); // getter setter 사용해서 불러온거
		
		
		System.out.println(std2.schooLName);
		//public이기 때문에 직접 접근 가능
		System.out.println("변경 전: " + std1.schooLName);
		std1.schooLName = "KH고등학교!";
		System.out.println("변경 후: " + std1.schooLName);
		
		// schooLName에 노란줄이 뜨는 이유! -> 제대로 작성 안돼서
		
		/// *** static이 붙은 필드(변수)는 클래스병.변수명으로 사용함.
		
		Student.schooLName = "KH";
		System.out.println("Student.schooLName: " + Student.schooLName);
		
		/* static
		 * 
		 * 1) 공유 메모리 영역 (또는 정적 메모리 영역) 이라고 함.
		 *  => 프로그램 시작 시 static이 붙은 코드들이 모두 static 영역에 생성되고,
		 *     프로그램이 종료될 때 까지 사라지지않음.(정적)
		 *     그리고 static 영역에 생성된 변수는 어디서든 공유가능(공유)
		 *     
		 * 2) 사용 법 : 클래스명.변수명    
		 * */
	}
		public void ex3() {
			//생성자 확인 테스트
			
			Student s1 = new Student();
						// 기본 생성자
			
			// User 기본 생성자를 이용해 객체 생성
			User u1 = new User();
			User u2 = new User();
			
			// User 객체 필드 초기화 확인
			System.out.println(u1.getUserId() );
			System.out.println(u1.getUserPw() );
			System.out.println(u1.getUserName() );
			System.out.println(u1.getUserAge() );
			System.out.println(u1.getUserGender() );
			
			
			//클래스에서 메서드에 getter/setter 미작성시 간접 접근 불가능
			
			
			
			System.out.println("======================================");
			
			// 현재의 문제점: u1이 참조하고 있는 User객체와 
			// u2가 참조하고 있는 User객체가 필드의 값이 모두 동일.
			// 같은 기본생성자로 User객체 생성했기 때문
			
			// 해결방법 1 : setter를 이용한 새로운 값 대입
			
			u2.setUserId("newID"); // 바꿔줄값을 매개변수로 전달
			u2.setUserPw("newPw");
			u2.setUserName("김영희");
			u2.setUserAge(19);
			u2.setUserGender('F');
			
			System.out.println(u2.getUserId() );
			System.out.println(u2.getUserPw() );
			System.out.println(u2.getUserName() );
			System.out.println(u2.getUserAge() );
			System.out.println(u2.getUserGender() );
			
			//해결방법 2 : 매개변수 사용
			
			User u3 = new User("test33", "pwrd23r23");
			
		}			
}
