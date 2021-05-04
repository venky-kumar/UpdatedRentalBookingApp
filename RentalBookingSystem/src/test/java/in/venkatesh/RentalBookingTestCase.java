package in.venkatesh;

import static org.junit.Assert.*;

import org.junit.Test;

public class RentalBookingTestCase {

	@Test
	public void test() {
		long mobno = 9790430272l;
		String password = "ragul";
		boolean output = LoginPage.loginValidation(mobno, password);
		assertTrue(output);
	}

	@Test

	public void test1() {
		long mobno = 9600900509L;
		String password = "gunal";
		boolean output = LoginPage.loginValidation(mobno, password);
		assertFalse(output);
	}

}
