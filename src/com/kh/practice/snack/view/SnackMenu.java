package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	public void menu() {
	
	System.out.println("스낵류를 입력하세요.");
	
	System.out.println("종류 : ");
	String kind = sc.next();
	System.out.println("이름 : ");
	String name = sc.next();
	System.out.println("맛  : ");
	String flavor = sc.next();
	System.out.println("개수 : ");
	int numOf = sc.nextInt();
	System.out.println("가격 : ");
	int price = sc.nextInt();
	
	/* 세이브 데이터는 스택커트롤러 안에 있는애
	System.out.println(scr.saveData(kind,name,flavor,numOf,price));
	
	String result = sc.next();
	
	if(result.equals("y")) {
		System.out.println(scr,confirmData()); 
	} */
  }
}
