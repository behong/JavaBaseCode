package com.lamda.net;

import java.util.ArrayList;
import java.util.List;

public class CarExam3 {
	
	  public static void main(String[] args){
		    List<Car> cars = new ArrayList<>();
		    cars.add( new Car("������",2,800,3) );
		    cars.add( new Car("������",12,1500,8) );
		    cars.add( new Car("�߰���",5,2200,0) );
		    cars.add( new Car("�����",5,3500,1) );
		    
		    printCar(cars,
		    		//�������̽� CheckCar �� �����ϴ� �͸� Ŭ���� 
		    		new CheckCar() {
						
						@Override
						public boolean test(Car car) {
							boolean imsi = car.capacity >= 4 && car.price < 2500;
							System.out.println("main ���� pr  " + imsi);
							
							return car.capacity >= 4 && car.price < 2500;
						}
		    		});
	  }

	  public static void printCar(List<Car> cars, CheckCar tester) {
		  
		  for (Car car : cars) {
			  System.out.println("����� print car ��");
			  System.out.println(tester.test(car));
			  if(tester.test(car)) {
				  //��Ī �Ǵ�(������ �´�) car ��ü�� ���
				  System.out.println("���ǿ� �´� ��  "+car);
			  }
		  }
		  
	  }
	  
	  interface CheckCar{
		  boolean test(Car car);
	  }
}
