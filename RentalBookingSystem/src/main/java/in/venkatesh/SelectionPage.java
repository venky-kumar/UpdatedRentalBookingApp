package in.venkatesh;

import java.util.HashMap;
import java.util.Set;

public class SelectionPage {

	static HashMap<String, Integer> cyclePriceMap = new HashMap<String, Integer>();

	public static void displayCycleTypes() {
		cyclePriceMap.put("cycle", 50);
		cyclePriceMap.put("gear cycle", 100);
		cyclePriceMap.put("electric cycle", 150);
		System.out.println("--------------cycle types------------");
		Set<String> keySet = cyclePriceMap.keySet();
		for (String cycleType : keySet) {
			Integer value = cyclePriceMap.get(cycleType);
			System.out.println("The price for " + cycleType + " is " + value);
		}
	}

	public static void delCycleType(String cycleType) {
		cyclePriceMap.remove(cycleType);
	}

	public static void addCycleType(String cycleType, Integer priceValue) {
		cyclePriceMap.put(cycleType, priceValue);
	}

	public static boolean addCycleStatus(String cycleType) {
		boolean isExists = false;
		if (cyclePriceMap.containsKey(cycleType)) {
			isExists = true;
		}
		return isExists;
	}

	public static boolean deleteStatus(String cycleType) {
		boolean isExists = true;
		if (cyclePriceMap.containsKey(cycleType)) {
			isExists = false;
		}
		return isExists;

	}

	static HashMap<String, Integer> bikePriceMap = new HashMap<String, Integer>();

	public static void displaybikeTypes() {
		bikePriceMap.put("scooter", 50);
		bikePriceMap.put("gear bike", 100);
		bikePriceMap.put("sport bike", 150);
		System.out.println("----------bike types-----------");
		Set<String> keySet1 = bikePriceMap.keySet();
		for (String bikeType : keySet1) {
			Integer value1 = bikePriceMap.get(bikeType);
			System.out.println("The price for " + bikeType + " is " + value1);
		}
	}

	public static void delBikeType(String bikeType) {
		bikePriceMap.remove(bikeType);
	}

	public static void addbikeType(String bikeType, Integer priceValue) {
		bikePriceMap.put(bikeType, priceValue);
	}

	public static boolean addbikeStatus(String bikeType) {
		boolean isExists = false;
		if (bikePriceMap.containsKey(bikeType)) {
			isExists = true;
		}
		return isExists;
	}

	public static boolean deletebikeStatus(String bikeType) {
		boolean isExists = true;
		if (bikePriceMap.containsKey(bikeType)) {
			isExists = false;
		}
		return isExists;

	}

	static HashMap<String, Integer> carPriceMap = new HashMap<String, Integer>();

	public static void displayCarTypes() {
		carPriceMap.put("without A/C", 500);
		carPriceMap.put("with A/c", 1000);
		System.out.println("----------CAR DETAILS---------");
		Set<String> keySet2 = carPriceMap.keySet();
		for (String carType : keySet2) {
			Integer value2 = carPriceMap.get(carType);
			System.out.println("The price for " + carType + " is " + value2);
		}
	}

	public static void delcarType(String carType) {
		bikePriceMap.remove(carType);
	}

	public static void addcarType(String carType, Integer priceValue) {
		bikePriceMap.put(carType, priceValue);
	}

	public static boolean addCarStatus(String carType) {
		boolean isExists = false;
		if (carPriceMap.containsKey(carType)) {
			isExists = true;
		}
		return isExists;
	}

	public static boolean deleteCarStatus(String carType) {
		boolean isExists = true;
		if (carPriceMap.containsKey(carType)) {
			isExists = false;
		}
		return isExists;

	}

}
