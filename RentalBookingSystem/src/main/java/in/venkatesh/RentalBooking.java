package in.venkatesh;

//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.util.ArrayList;
//import java.util.Scanner;

public class RentalBooking {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long mobNo = 9790430272l;
		String password = "ragul";

		if (LoginPage.loginValidation(mobNo, password) == true) {
			System.out.println("logged in successfully");

			LoginArray.arraylogin();

			SelectionPage.displayCycleTypes();

			SelectionPage.displaybikeTypes();

			SelectionPage.displayCarTypes();

			int vehicleType = 1;
			String type = "basic";
			int rentalHour = 8;
			double vehicleCost = 100;

			RentalCalculation.calculationOfCase(vehicleType, type, rentalHour, vehicleCost);

			VehicleDetails.noPlateDetails();
		}

		else {
			System.out.println("Invalid Credentials");
		}

	}

}