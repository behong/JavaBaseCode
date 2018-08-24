package com.lamda.net;

public class Car {
	
	public String name;
	public int capacity;
	public int price;
	public int age;
	
	//생성자
	public Car(String name, int capacity, int price, int age) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.price = price;
		this.age = age;
	}
	
	// car 객체를 문자열로 출력하면 이름을 출력
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		Car car = new Car("new model" , 4,4000,0);
	}

	

}
