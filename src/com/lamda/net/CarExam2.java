package com.lamda.net;

import java.util.ArrayList;
import java.util.List;

public class CarExam2 {

	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();

		cars.add(new Car("작은차", 2, 800, 3));
		cars.add(new Car("봉고차", 12, 1500, 8));
		cars.add(new Car("중간차", 5, 2200, 0));
		cars.add(new Car("비싼차", 5, 3500, 1));

		printCar(cars, new CheckCarForBigAndNotExpensie());
	}

	public static void printCar(List<Car> cars, CheckCar tester) {

		for (Car car : cars) {
			if (tester.test(car)) {
				System.out.println(car);
			}
		}

	}

	interface CheckCar {
		boolean test(Car car);
	}

	// 내부클래스를 만들어서 사용합니다.
	static class CheckCarForBigAndNotExpensie implements CheckCar {

		@Override
		public boolean test(Car car) {
			boolean rtnData = false;
			// 수용인원이 4개 보다 작거나 같고 차량 가격도 2500 보다 작은것
			rtnData = car.capacity >= 4 && car.price < 2500;
			return rtnData;
		}

	}

}
