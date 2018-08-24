package com.lamda.net;

import java.util.ArrayList;
import java.util.List;

public class CarExam {
	
	public static void main(String[] args) {
		
		List<Car> cars = new ArrayList<>();
		
		cars.add(new Car("작은차",2,800,3));
		cars.add(new Car("봉고차",12,1500,8));
	    cars.add( new Car("중간차",5,2200,0) );
	    cars.add( new Car("비싼차",5,3500,1) );
	    
	    printCarCheaperThan(cars, 2000);
	}
	
	public static void printCarCheaperThan(List<Car> cars, int price){
		
		for(Car car: cars) {
			if(car.price <price) {
				System.out.println("넘어온 price 객체 보다 작은 price 차 출력  " + car );
			}
		}
		
	}

}
