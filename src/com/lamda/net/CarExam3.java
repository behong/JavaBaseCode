package com.lamda.net;

import java.util.ArrayList;
import java.util.List;

public class CarExam3 {
	
	  public static void main(String[] args){
		    List<Car> cars = new ArrayList<>();
		    cars.add( new Car("작은차",2,800,3) );
		    cars.add( new Car("봉고차",12,1500,8) );
		    cars.add( new Car("중간차",5,2200,0) );
		    cars.add( new Car("비싼차",5,3500,1) );
		    
		    printCar(cars,
		    		//인터페이스 CheckCar 를 구현하는 익명 클래스 
		    		new CheckCar() {
						
						@Override
						public boolean test(Car car) {
							boolean imsi = car.capacity >= 4 && car.price < 2500;
							System.out.println("main 에서 pr  " + imsi);
							
							return car.capacity >= 4 && car.price < 2500;
						}
		    		});
	  }

	  public static void printCar(List<Car> cars, CheckCar tester) {
		  
		  for (Car car : cars) {
			  System.out.println("여기는 print car 안");
			  System.out.println(tester.test(car));
			  if(tester.test(car)) {
				  //매칭 되는(조건이 맞는) car 객체만 출력
				  System.out.println("조건에 맞는 차  "+car);
			  }
		  }
		  
	  }
	  
	  interface CheckCar{
		  boolean test(Car car);
	  }
}
