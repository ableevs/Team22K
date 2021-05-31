package rgr;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {
	static Clients user;

	@BeforeClass
	public static void beforeClass() {
		user = new Clients();
	}

	@Test
	public void test() {
		user.admin = "ableev";
		equals(user.admin);
		user.dev1 = "shaikhov";
		equals(user.dev1);
		user.dev2 = "ibatullina";
		equals(user.dev2);
		
	}

}
