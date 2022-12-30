package com.kh.test.money.vo;

public class Money {
	
	public static final String UNIT = "원";
	//final값은 수정하면 안됨
	private int money;
	
	public Money() {
	// 밑에 매개변수 생성자가 있어서 자동으로 생성되지 않아서 임의로 생성
	}
	
	public Money(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public static String getUnit() {
		return UNIT;
	}

	public void print() {
		System.out.println(money + UNIT);
	}
}
