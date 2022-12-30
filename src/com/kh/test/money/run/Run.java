package com.kh.test.money.run;

import com.kh.test.money.vo.Money;

public class Run {

	public static void main(String[] args) {
		
		Money v1 = new Money();
		//v1은 생성된 인스턴스의 참조주소를 가지고있는 지역변수
		
		v1.setMoney(10000);
		//v1이 참조하고있는 인스턴스의 setmoney메소드를 실행해라
		
		v1.print();
	}
}
