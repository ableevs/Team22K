package rgr;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestBase {

	@Test
	public void testBase() {
		Base base = new Base();
		String in="name";
		base.setName(in);
		String out =base.getName();
		assertEquals(in, out);
	}
}
