import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Car> cars = Arrays.asList(new Car(300), new Car(80000), new Car(1900));
		List<Car> oldWayCars = ForWithoutLambda.findCarsOldWay(cars);
		for (Car car : oldWayCars) {
			System.out.println(car.getKilometers());
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

}

