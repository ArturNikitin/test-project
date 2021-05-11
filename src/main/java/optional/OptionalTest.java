package optional;

import classes.User;
import classes.UserSex;
import java.util.Optional;

public class OptionalTest {
	
	public Optional<User> getUser() {
		return getRandom() ?
			Optional.of(new User("Ivan", 25, UserSex.MALE))
			: Optional.empty();
	}
	
	private Boolean getRandom() {
		return Math.random() > 0.5;
	}
}
