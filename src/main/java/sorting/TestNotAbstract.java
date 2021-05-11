package sorting;

import classes.User;
import classes.UserSex;
import java.util.stream.Stream;

public class TestNotAbstract extends TestAbstract {
	@Override
	public void test() {
		System.out.println("OKKAY");
	}
	
	public static void main(String[] args) {
		TestAbstract test = new TestNotAbstract();
		
		getUserStream().filter(TestAbstract::test2)
			.forEach(x -> System.out.println(x.getName()));
	}
	
	private static Stream<classes.User> getUserStream() {
		final classes.User first = new classes.User("Яща", 15, UserSex.MALE);
		final classes.User second = new classes.User("Маша", 22, UserSex.FEMALE);
		final classes.User third = new classes.User("Альберт", 54, UserSex.MALE);
		final classes.User F = new classes.User("Милана", 2, UserSex.FEMALE);
		final classes.User Fi = new classes.User("Татьяна", 73, UserSex.FEMALE);
		final classes.User S = new classes.User("Айгул", 37, UserSex.MALE);
		final classes.User Se = new User("Роман", 48, UserSex.MALE);
		return Stream.of(first, second, third, F, Fi, S, Se);
	}
}
