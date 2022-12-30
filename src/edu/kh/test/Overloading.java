package edu.kh.test;

public class Overloading {
	//public void test( ) {}
	//public void test(String str ) {}
	//public void test(int i ) {}
	//public void test(String s) {}
	public void test(char ch) {}
	public void test(String str, int i ) {}
	public void test(int i, String str ) {}
	//private void test(int i) {}
	//public int test( ) {return 0;}
	
	// 4,12번은 매개변수가 없어서 오버로딩 적용 불가,반환타입은 오버로딩 조건과 무관
	// 5,7번은 매개변수의 개수와 타입이 일치하여 오버로딩 적용 불가
	// 6,11번은 매개변수의 개수와 타입이 일치하여 오버로딩 적용 불가, 접근제한자는 오버로딩 조건과 무관
}
