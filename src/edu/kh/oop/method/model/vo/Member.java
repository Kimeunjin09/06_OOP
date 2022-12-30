package edu.kh.oop.method.model.vo;

public class Member {
	
	//클래스에 있어야할 3가지 : 필드/생성자/메소드(생성자도 메소드)
	
	//필드
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	
	//생성자
	// 기본 생성자 규칙: 반환형이 없고, 클래스와 이름이 같아야한다.
	public Member() {}
	
	// 매개변수 생성자
	//alt+shift+s constructor using field에서 한번에 만들 수 있음
	
	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}

	//메서드
	// get은 부른애한테 값을return
	// set은 매개변수로 받아온값을 필드로 초기화
	
	public String getMemberId() {
		        // get + 필드명(카멜케이스 적용)
		return memberId;
	}
	// 매개변수로 전달받은 값을 MemberId 필드에 대입
	// (매개변수 == 전달 받은 값을 지니고 있는 변수)
	public void setMemberId(String memberId) {
				// set + 필드명(카멜케이스 적용)
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
}
