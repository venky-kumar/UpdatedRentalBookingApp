package in.venkatesh;


import java.util.ArrayList;

public class LoginArray {
	public static long arraylogin() {
		ArrayList<Detail> userDetail = new ArrayList<Detail>();
		Detail user1 = new Detail();
		user1.userMobileNo = 9790430272L;
		user1.password = "ragul";

		Detail user2 = new Detail();
		user2.userMobileNo = 9865739455L;
		user2.password = "gunal";
		userDetail.add(user1);
		userDetail.add(user2);

		for (Detail user : userDetail) {
			System.out.println(user.userMobileNo + "-" + user.password);
		}
		return 0;
	}

}
