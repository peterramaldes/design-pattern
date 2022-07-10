import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		List<Car> cars = Arrays.asList(new Car(300), new Car(80000), new Car(1900));
		// List<Car> oldWayCars = LambdaWithoutMethodReference.findCarsOldWay(cars);
		// for (Car car : oldWayCars) {
		// 	System.out.println(car.getKilometers());
		// }
	
		List<String> oldWayCars = LambdaWithoutMethodReference.findCarsOldWay(cars);
		for (String car : oldWayCars) {
			System.out.println(car);
		}
	}

	public class ForWithoutLambda {
		public static List<Car> findCarsOldWay(List<Car> cars) {
			List<Car> selectedCars = new ArrayList<>();
			for (Car car : cars) {
				if (car.getKilometers() < 50000) {
					selectedCars.add(car);
				}
			}
			return selectedCars;
		}
	}

	public class LambdaExpressions {
		public static List<Car> findCarsOldWay(List<Car> cars) {
			return cars.stream()
				.filter(car -> car.getKilometers() < 5000)
				.collect(Collectors.toList());
		}
	}

	public class LambdaWithoutMethodReference {
		public static List<String> findCarsOldWay(List<Car> cars) {
			return cars.stream()
				.map(car -> car.toString())
				.collect(Collectors.toList());
		}
	}

	public class LambdaWithMethodReference {
		public static List<String> findCarsOldWay(List<Car> cars) {
			return cars.stream()
				.map(Car::toString)
				.collect(Collectors.toList());
		}
	}
}

