package edu.kh.oop.cls.model.vo;

public class User {
	
		// 필드 == 속성
		// 아이디, 비밃번호, 이름, 나이 , 성별 (추상화)
	
		private String userId;
		private String userPw;
		private String userName;
		private int userAge;
		private char userGender;
		
		// 생성자
		// 기본 생성자
		public User() {
			// 기능
			System.out.println("기본 생성자로 User 객체 생성");
			
			// 필드 초기화
			userId = "user01";
			userPw = "pass01";
			userName = "홍길동";
			userAge = 20;
			userGender = 'M';
		}
		
		//매개변수 생성자
		// ** 사용되는 기술, 변수: 매개변수, Overloading(오버로딩), this
		
		// ** 매개변수 : 생성자나 메서드 호출 시 ()안에 작성되어
		//			   전달되어지는 값을 저장하는 변수
		//			-> 전달 받은 값을 저장하고 있는 매개체(지니고있는) 역할의 변수
		
		 public User( String userId, String userPw) {
			 		this.userId = userId;
			 		this.userPw = userPw;
			 	    // 매개 변수로 전달받은 값을 필드에 초기화(this 참조변수)
			 		
			 		// *** this 참조변수 ***
			 		//- 객체가 자기 자신을 참조할 수 있도록 하는 변수
			 		// - 모든 객체 내부에 숨겨져있다.
			 		// ?? 왜 사용 ??
			 		// -> 필드명과 매개변수명이 같을 경우 (위에 userPw = uwerPw;)
			 		//    이를 구분하기 위해서 주로 사용.
		 } 
		 
		 // 필드를 전부 초기화 하는 목적의 매개변수 생성자
		 // 위에 만들어 놓은 인스턴스 변수를 다 적으면 됨
		 public User (String userId, String userPw, String userName, int userAge, char userGender) {
			 //오버로딩 적용되서 메서드 이름 같아도 됨
			 
			 //this.userId = userId;
			 //this.userPw = userPw;
			 // User(userId, userPw); // 이건x User는 본인을 3인칭으로 부르는걸 싫어함
			 this(userId, userPw); // 위에 만들어 놓은 애들은 이렇게 적어도 됨
			 // - 같은 클래스의 다른 생성자를 호출할 때 사용 (두번째 매개변수 생성자에서 첫번째 매개변수 생성자 부른거)
			 // - 생성자내에 반드시 첫째줄에 작성되어야 한다!!
			 // 왜사용??
			 // 코드길이 감소, 재사용성 증가, 가독성의 문제로 잘 사용하지는 않음
			 
			 this.userName = userName;
			 this.userAge = userAge;
			 this.userGender = userGender;
		 }
		 
		 // ** 자바 **
		 // 자바는 기본적으로 필드명, 생성자명, 메소드명, 변수명의 중복을 허용하지 않음
		 // 중복으로 만들 수 있는 이유는 오버로딩 때문!
		 
		 // *** 오버로딩(Over Loading) ***
		 // - 클래스 내에 동일한 이름의 메서드 (생성자도 포함)를 여러개 작성하는 기법
		 // -> 하나의 이름으로 여러 기능을 수행할 수 있게 한다!
		 
		 //[오버로딩 조건]
		 // 1) 메서드 (생성자 포함)의 이름이 동일
		 // 2) 매개변수의 개수, 타입, 순서 중 1개라도 달라야 함.
		 
		 //public user() {} // 기본 생성자가 이미 작성되어있어 중복으로 인식
		 
		 public User(String userId) {} // 매개변수의 개수가 같은 생성자 없음
		 							// -> 오버로딩 성립
		 
		 public User(int userAge) {} // 매개변수의 개수는 같지만 타입이 다름
		 							// -> 오버로딩 성립
		 
		 public User(String userId, int userAge) {}
		 // 매개변수의 개수가 위에 같은 것이 있으나, 매개변수의 타입이 다름.
		 // -> 오버로딩 성립
		 
		 public User(int userAge, String userId) {}
		 // 매개변수의 개수와 타입은 같으나, 순서가 다름 -> 오버로딩 성립
		 
		 //public User(int userAge, String userName) {}
		 // 위에 메서드도 오류가남, 매개벼수의 개수, 타입, 순서가 모두 같아서 오버로딩 불가
		 // -> 변수명은 신경쓰지 않는다!!
		 
		 public User(String userId, String userPw, String userName) {}
		// public User(String userName, String userId, String User Pw) {}
		 //위와 같은 이유로 오버로딩 불가
		 
		
		// 메서드
		// 캡슐화로 인한 간접 접근 기능(getter/setter)
		// getter는 접근자 쓰고 자료형쓰고(반환하기위해 반환할값의 자료형 쓰는거)
		public String getUserId() { // userId의 getter
			return userId;
		}
		// ()안에는 매개변수 적어줘야함 
		public void setUserId(String userId) { // userId의 setter
			this.userId = userId;
		}
		
		public String getUserPw() {
			return userPw;
		}
		public void setUserPw(String userPw) {
			this.userPw = userPw;
		}
		
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		
		public int getUserAge() {
			return userAge;
		}
		public void setUserAge(int userAge) {
			this.userAge = userAge;
		}
		
		public char getUserGender() {
			return userGender;
		}
		public void setUserGender(char userGender) {
			this.userGender = userGender;
		}
		
		// getter/setter 자동 완성
		// alt + shift + s -> Generate Getter Setter
		
		//to String은 반환형이 String
		
		public String toString() {
			return " ";
		}
}
