package sorting;

import classes.UserSex;
import classes.User;

public abstract class TestAbstract {
	
	public abstract void test();
	
	public static boolean test2(User user) {
		return UserSex.MALE.equals(user.getSex());
	}
}
