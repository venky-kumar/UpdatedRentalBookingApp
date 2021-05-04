package in.venkatesh;

public class RentalCalculation {

	public static double calculationOfCase(int vehicleType, String type, int rentalHour, double vehicleCost) {
		System.out.println("---------------------");
		System.out.println("   COST ESTIMATION   ");
		System.out.println("---------------------");
		System.out.println("you have selected " + type);
		double calculate = vehicleCost * rentalHour;
		System.out.println("the cost for  " + type + " is =" + calculate);
		double gst1 = (calculate * 8 / 100);
		double withGst1 = (calculate + gst1);
		System.out.println("the cost for " + type + " with gst is =" + withGst1);
		PeakCheck.peak(withGst1);
		return withGst1;

	}

}
