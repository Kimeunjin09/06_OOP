package edu.kh.oop.practice.model.vo;

public class Book { 
	
	private String title;
	private int price;
	private double discountRate;
	private String author;

	
		public Book() {
		
		}
		public Book(String title, int price, double discountRate, String author) {
			
		this.title = "자바의 정석";
		this.price = 30000;
		this.discountRate = 0.2;
		this.author = "남궁성";
		}
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public double getDiscountRate() {
			return discountRate;
		}
		public void setDiscountRate(double discountRate) {
			this.discountRate = discountRate;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		
		@Override
		public String toString() {
			return title + " /" + price + " / " + discountRate + " / " + author;
		}
		///답안
		
	/*	public class Book { 
			
			//1.필드안에 인스턴스 변수 4개 써라
			private String title; // 도서명
			private int price; // 가격
			private double discountRate; // 할인율
			private String author; // 저자명
			
			// 생성자 만들기
			public Book() {} // 기본생성자
			
			//매개변수 생성자
			alt+shift+s-> 콘스트럭터유징필드?
			public Book(String title, int price, double discountRate, String author) {
			
			this.title = title;
			this.price = price;
			this.discountRate = discountRate;
			this.author = author;
			
			// getter setter
			
			public String getTitle() {
			return title;
			}
			public void setTitle(String title) {
			this.title = title;
			}
			public int getPrice() {
			return price;
			}
			public void setPrice(int price) {
				this.price = price;
			}
			public double getDiscountRate() {
				return discountRate;
			}
			public void setDiscountRate(double discountRate) {
				this.discountRate = discountRate;
			}
			public String getAuthor() {
				return author;
			}
			public void setAuthor(String author) {
				this.author = author;
			}
			
		
		//어노테이션 toString() 오버라이딩
		@Override
		public String toString() {
			return title + " / " + price + " / " + discountRate + " / " + author;
		} // 문자열을 리턴, 프린트구문을 리턴하는게 아님
		}
			} */
}
