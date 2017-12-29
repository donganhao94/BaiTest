import static org.junit.Assert.*;

public class Test {
	RegularPrice rp = new RegularPrice();
	NewReleasePrice n = new NewReleasePrice();
	ChildrensPrice c = new ChildrensPrice();

	@org.junit.Test
	public void testCharge1() {
		assertEquals(0, rp.getCharge(0), 0.1);
		assertEquals(0, c.getCharge(0), 0.1);
	}

	@org.junit.Test
	public void testCharge2() {
		assertEquals(0, rp.getCharge(-1), 0.1);
		assertEquals(0, c.getCharge(-1), 0.1);
	}

	@org.junit.Test
	public void testCharge3() {
		assertEquals(3000, rp.getCharge(2), 0.1);
		assertEquals(2500, c.getCharge(3), 0.1);
	}

	@org.junit.Test
	public void testCharge4() {
		assertEquals(4000, rp.getCharge(3), 0.1);
		assertEquals(4000, c.getCharge(4), 0.1);
	}

	@org.junit.Test
	public void testPoint1() {
		assertEquals(0, rp.getFrequentRenterPoints(0), 0.1);
		assertEquals(0, c.getFrequentRenterPoints(0), 0.1);
	}

	@org.junit.Test
	public void testPoint2() {
		assertEquals(1, rp.getFrequentRenterPoints(1), 0.1);
		assertEquals(1, c.getFrequentRenterPoints(1), 0.1);
	}

	@org.junit.Test
	public void testPoint3() {
		assertEquals(1, rp.getFrequentRenterPoints(10), 0.1);
		assertEquals(1, c.getFrequentRenterPoints(1), 0.1);
	}

	@org.junit.Test
	public void testNCharge1() {
		assertEquals(0, n.getCharge(0), 0.1);
	}

	@org.junit.Test
	public void testNCharge2() {
		assertEquals(0, n.getCharge(-1), 0.1);
	}

	@org.junit.Test
	public void testNCharge4() {
		assertEquals(8000, n.getCharge(2), 0.1);
	}

	@org.junit.Test
	public void testNPoint1() {
		assertEquals(0, n.getFrequentRenterPoints(0), 0.1);
	}

	@org.junit.Test
	public void testNPoint2() {
		assertEquals(1, n.getFrequentRenterPoints(1), 0.1);
	}

	@org.junit.Test
	public void testNPoint3() {
		assertEquals(2, n.getFrequentRenterPoints(2), 0.1);
	}
}
